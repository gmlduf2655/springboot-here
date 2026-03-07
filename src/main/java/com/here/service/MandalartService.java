package com.here.service;

import com.here.dao.MandalartMapper;
import com.here.dto.MandalartDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MandalartService {

    private final MandalartMapper mandalartMapper;

    public MandalartService(MandalartMapper mandalartMapper) {
        this.mandalartMapper = mandalartMapper;
    }

    public List<MandalartDto> selectMandalartList(MandalartDto param) {
        return mandalartMapper.selectMandalartList(param);
    }

    public List<MandalartDto> selectMandalartNodeList(MandalartDto param) {
        return mandalartMapper.selectMandalartNodeList(param);
    }

    public MandalartDto selectMandalartNode(MandalartDto param) {
        return mandalartMapper.selectMandalartNode(param);
    }

    public int saveMandalartNode(MandalartDto param) {
        if (param.getCellId() == null || param.getCellId().isEmpty()) {
            param.setCellId(UUID.randomUUID().toString());
        }
        if (param.getMandalartId() == null || param.getMandalartId().isEmpty()) {
            param.setMandalartId(UUID.randomUUID().toString());
        }
        return mandalartMapper.saveMandalartNode(param);
    }

    public int saveMandalartNodes(List<MandalartDto> list) {
        for (MandalartDto param : list) {
            if (param.getCellId() == null || param.getCellId().isEmpty()) {
                param.setCellId(UUID.randomUUID().toString());
            }
            if (param.getMandalartId() == null || param.getMandalartId().isEmpty()) {
                param.setMandalartId(UUID.randomUUID().toString());
            }
        }
        return mandalartMapper.saveMandalartNodes(list);
    }

    public int updateMandalartNode(MandalartDto param) {
        return mandalartMapper.updateMandalartNode(param);
    }

    public int deleteMandalartNode(MandalartDto param) {
        return mandalartMapper.deleteMandalartNode(param);
    }

    public int deleteMandalartNodes(MandalartDto param) {
        return mandalartMapper.deleteMandalartNodes(param);
    }
}
