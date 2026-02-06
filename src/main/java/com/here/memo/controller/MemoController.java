package com.here.memo.controller;

import com.here.memo.service.MemoService;
import com.here.memo.dto.MemoDto;
import com.here.memo.dto.MemoCsvDto;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/memo")
public class MemoController {

    private final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @GetMapping("/selectMemoList")
    public List<MemoDto> selectMemoList(MemoDto param) {
        return memoService.selectMemoList(param);
    }

    @PostMapping("/saveMemo")
    public int saveMemo(@RequestBody MemoDto param) {
        return memoService.saveMemo(param);
    }

    @PostMapping("/uploadMemos")
    public int uploadMemos(@RequestPart("file") MultipartFile file) throws Exception{

        String csv = new String(file.getBytes(), StandardCharsets.UTF_8);
        Reader reader = new StringReader(csv);

        List<MemoCsvDto> memos = new CsvToBeanBuilder<MemoCsvDto>(reader)
                .withType(MemoCsvDto.class)
                .withIgnoreLeadingWhiteSpace(true)
                .build()
                .parse();
        List<MemoDto> memoList = new ArrayList<MemoDto>();
        for(MemoCsvDto memo : memos){
            MemoDto memoData = new MemoDto();
            memoData.setMemoId(memo.getMemoId());
            memoData.setTitle(memo.getTitle());
            memoData.setMemoContent(memo.getMemoContent());
            memoData.setRegDate(memo.getRegDate());
            memoData.setUserId(memo.getUserId());
            memoList.add(memoData);
        }
        return memoService.saveMemos(memoList);
    }

    @PostMapping("/deleteMemo")
    public int deleteMemo(@RequestBody MemoDto param) {
        return memoService.deleteMemo(param);
    }
}
