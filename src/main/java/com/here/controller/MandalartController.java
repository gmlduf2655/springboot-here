package com.here.controller;

import com.here.dto.MandalartDto;
import com.here.service.MandalartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mandalart")
public class MandalartController {

    private final MandalartService mandalartService;

    public MandalartController(MandalartService mandalartService) {
        this.mandalartService = mandalartService;
    }

    @GetMapping("/selectMandalartList")
    public List<MandalartDto> selectMandalartList(MandalartDto param) {
        return mandalartService.selectMandalartList(param);
    }

    @GetMapping("/selectMandalartNodeList")
    public List<MandalartDto> selectMandalartNodeList(MandalartDto param) {
        return mandalartService.selectMandalartNodeList(param);
    }

    @GetMapping("/selectMandalartNode")
    public MandalartDto selectMandalartNode(MandalartDto param) {
        return mandalartService.selectMandalartNode(param);
    }

    @PostMapping("/saveMandalartNode")
    public int saveMandalartNode(@RequestBody MandalartDto param) {
        return mandalartService.saveMandalartNode(param);
    }

    @PostMapping("/saveMandalartNodes")
    public int saveMandalartNodes(@RequestBody List<MandalartDto> list) {
        return mandalartService.saveMandalartNodes(list);
    }

    @PostMapping("/updateMandalartNode")
    public int updateMandalartNode(@RequestBody MandalartDto param) {
        return mandalartService.updateMandalartNode(param);
    }

    @PostMapping("/deleteMandalartNode")
    public int deleteMandalartNode(@RequestBody MandalartDto param) {
        return mandalartService.deleteMandalartNode(param);
    }

    @PostMapping("/deleteMandalartNodes")
    public int deleteMandalartNodes(@RequestBody MandalartDto param) {
        return mandalartService.deleteMandalartNodes(param);
    }
}
