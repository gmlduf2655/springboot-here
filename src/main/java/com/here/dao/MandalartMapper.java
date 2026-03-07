package com.here.dao;

import com.here.dto.MandalartDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MandalartMapper {

    List<MandalartDto> selectMandalartList(MandalartDto param);
    List<MandalartDto> selectMandalartNodeList(MandalartDto param);
    MandalartDto selectMandalartNode(MandalartDto param);

    int saveMandalartNode(MandalartDto param);
    int saveMandalartNodes(@Param("list") List<MandalartDto> list);
    int insertMandalartNode(MandalartDto param);

    int updateMandalartNode(MandalartDto param);
    int deleteMandalartNode(MandalartDto param);
    int deleteMandalartNodes(MandalartDto param);
}
