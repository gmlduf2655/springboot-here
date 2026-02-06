package com.here.memo.service;

import com.here.memo.dao.MemoMapper;
import com.here.memo.dto.MemoDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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
        if(param.getMemoId() != null && param.getMemoId().isEmpty()){
            String uuid = UUID.randomUUID().toString();
            param.setMemoId(uuid);
        }
        return memoMapper.saveMemo(param);
    }

    public int saveMemos(List<MemoDto> list) {
        for(MemoDto param : list){
            if(param.getMemoId() != null && param.getMemoId().isEmpty()){
                String uuid = UUID.randomUUID().toString();
                param.setMemoId(uuid);
            }
        }
        return memoMapper.saveMemos(list);
    }

    public int deleteMemo(MemoDto param) {
        return memoMapper.deleteMemo(param);
    }
}
