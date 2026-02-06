package com.here.memo.dao;

import com.here.memo.dto.MemoDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemoMapper {

    List<MemoDto> selectMemoList(MemoDto Memo);

    int saveMemos(@Param("list") List<MemoDto> list);
    int saveMemo(MemoDto Memo);
    int insertMemo(MemoDto Memo);

    int updateMemo(MemoDto Memo);
    int deleteMemo(MemoDto Memo);
}