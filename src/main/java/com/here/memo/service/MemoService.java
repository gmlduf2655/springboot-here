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
        if(param.getMemoId() != null && param.getMemoId() > 0){
            return memoMapper.updateMemo(param);
        }else{
            return memoMapper.insertMemo(param);
        }
    }

    public int deleteMemo(MemoDto param) {
        return memoMapper.deleteMemo(param);
    }
}
