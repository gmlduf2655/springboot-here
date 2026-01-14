package com.here.memo.controller;

import com.here.memo.service.MemoService;
import com.here.memo.dto.MemoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public int save(@RequestBody MemoDto param) {
        return memoService.saveMemo(param);
    }
}
