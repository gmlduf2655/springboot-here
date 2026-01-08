package com.here.memo.service;

import com.here.memo.dao.MemoMapper;
import com.here.memo.dto.MemoDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoService {

    private final MemoMapper memoMapper;

    public MemoService(MemoMapper memoMapper) {
        this.memoMapper = memoMapper;
    }

    public List<MemoDto> selectMemoList(MemoDto param) {
        return memoMapper.selectMemoList(param);
    }

    public int saveMemo(MemoDto param) {
        return memoMapper.saveMemo(param);
    }
}
