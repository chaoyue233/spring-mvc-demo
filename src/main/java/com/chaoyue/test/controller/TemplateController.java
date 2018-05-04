package com.chaoyue.test.controller;

import com.chaoyue.test.dto.TemplateDto;
import com.chaoyue.test.response.FacadeResponse;
import com.chaoyue.test.util.JsonUtils;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/template")
@Api(value = "/template", tags = {"模板模块"}, description = "模板相关功能")
public class TemplateController {

    @ResponseBody
    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    @ApiOperation(value = "获取模板列表")
    public FacadeResponse<TemplateDto> get(@ApiParam(name = "templateId", value = "模板ID", required = true) @RequestParam Long templateId) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    @ApiOperation(value = "获取模板列表")
    public FacadeResponse<Page<TemplateDto>> list(@ApiParam(name = "templateType", value = "模板类型") String templateType,
                                                  @ApiParam(name = "composeType", value = "板式类型") String composeType,
                                                  @ApiParam(name = "adsFlag", value = "是否包含广告") Integer adsFlag,
                                                  Integer pageNo, Integer pageSize) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ApiOperation(value = "获取模板列表")
    public FacadeResponse<Long> save(TemplateDto templateDto) {
        System.out.println(JsonUtils.objectToJSON(templateDto));
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/copy", method = {RequestMethod.POST})
    @ApiOperation(value = "获取模板列表")
    public FacadeResponse<Long> copy(
            @ApiParam(name = "templateId", value = "模板ID", required = true) @RequestParam Long templateId) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/delete", method = {RequestMethod.POST})
    @ApiOperation(value = "获取模板列表")
    public FacadeResponse<Boolean> delete(
            @ApiParam(name = "templateId", value = "模板ID", required = true) @RequestParam Long templateId) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/deploy", method = {RequestMethod.POST})
    @ApiOperation(value = "获取模板列表")
    public FacadeResponse<Boolean> deploy(
            @ApiParam(name = "templateId", value = "模板ID", required = true) @RequestParam Long templateId) {
        return new FacadeResponse<>();
    }

    @ResponseBody
    @RequestMapping(value = "/activeList", method = {RequestMethod.GET})
    @ApiOperation(value = "获取模板列表")
    public FacadeResponse<Page<TemplateDto>> activeList(@ApiParam(name = "mallId", value = "商场ID") String mallId,
                                                        Integer pageNo, Integer pageSize) {
        return new FacadeResponse<>();
    }
}
