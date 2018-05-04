package com.chaoyue.test.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "模板信息")
public class TemplateDto implements Serializable {
    private static final long serialVersionUID = 248213860734446164L;
    @ApiModelProperty(value = "模板ID")
    private Long id;
    @ApiModelProperty(value = "模板名称")
    private String name;
    @ApiModelProperty(value = "模板类型")
    private String templateType;
    @ApiModelProperty(value = "模板板式")
    private String composeType;
    @ApiModelProperty(value = "是否包含广告")
    private Integer adsFlag;
    @ApiModelProperty(value = "是否发布")
    private Integer releaseFlag;
    @ApiModelProperty(value = "封面图片链接")
    private String coverImgUrl;
    @ApiModelProperty(value = "模板配置")
    private String config;
}
