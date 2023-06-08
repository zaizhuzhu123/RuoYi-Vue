package com.laien.demo.entity;

import com.laien.demo.entity.base.BaseModel;
import com.ruoyi.common.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 主题对象 demo_theme
 *
 * @author qmf
 * @date 2023-06-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="主题", description="主题")
public class DemoTheme extends BaseModel
{
    private static final long serialVersionUID = 1L;

    /** 主题名称 */
    @ApiModelProperty(value = "主题名称")
    @Excel(name = "主题名称")
    private String name;

    /** 排序编号 */
    @ApiModelProperty(value = "排序编号")
    @Excel(name = "排序编号")
    private Long sort;

}