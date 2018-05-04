package com.chaoyue.test.controller;

import com.chaoyue.test.dto.CaseDto;
import com.chaoyue.test.response.FacadeResponse;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/case")
@Api(value = "/case", tags = {"作品模块"}, description = "作品相关功能")
public class CaseController {

    @ResponseBody
    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    @ApiOperation(value = "获取作品列表")
    public FacadeResponse<CaseDto> get(
            @ApiParam(name = "caseId", value = "作品ID", required = true) @RequestParam Long caseId) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ApiOperation(value = "获取作品列表")
    public FacadeResponse<Page<CaseDto>> list(@ApiParam(name = "caseType", value = "作品类型") String caseType,
                                              @ApiParam(name = "composeType", value = "板式类型") String composeTypeg,
                                              Integer pageNo, Integer pageSize) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ApiOperation(value = "获取作品列表")
    public FacadeResponse<Long> save(CaseDto caseDto) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.POST})
    @ApiOperation(value = "获取作品列表")
    public FacadeResponse<Boolean> update(CaseDto caseDto) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/copy", method = {RequestMethod.POST})
    @ApiOperation(value = "获取作品列表")
    public FacadeResponse<Long> copy(
            @ApiParam(name = "caseId", value = "作品ID", required = true) @RequestParam Long caseId) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.POST})
    @ApiOperation(value = "获取作品列表")
    public FacadeResponse<Boolean> delete(
            @ApiParam(name = "caseId", value = "作品ID", required = true) @RequestParam Long caseId) {
        return new FacadeResponse<>();
    }

}
