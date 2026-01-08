package com.here.memo.dao;

import com.here.memo.dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoMapper {

    List<MemoDto> selectMemoList(MemoDto Memo);

    int saveMemo(MemoDto Memo);
}