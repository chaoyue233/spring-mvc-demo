package com.chaoyue.test.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "容易小程序信息")
public class CaseDto implements Serializable {
    private static final long serialVersionUID = 8087111799328634890L;
    @ApiModelProperty(value = "作品ID")
    private Long id;
    @ApiModelProperty(value = "模板ID")
    private Long templateId;
    @ApiModelProperty(value = "模板主题ID")
    private Long templateThemeId;
    @ApiModelProperty(value = "模板主题名称")
    private String templateThemeName;
    @ApiModelProperty(value = "商场ID")
    private String mallId;
    @ApiModelProperty(value = "作品名称")
    private String name;
    @ApiModelProperty(value = "作品类型")
    private String caseType;
    @ApiModelProperty(value = "作品板式")
    private String composeType;
    @ApiModelProperty(value = "作品封面图片")
    private String coverImgUrl;
    @ApiModelProperty(value = "作品状态")
    private String status;
    @ApiModelProperty(value = "作品配置信息")
    private String config;
}
