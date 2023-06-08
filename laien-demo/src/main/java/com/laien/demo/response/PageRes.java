package com.laien.demo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 分页结果
 *
 * @author qmf
 */
@ApiModel(value="分页结果", description="分页结果")
@Data
public class PageRes<T> {

    @ApiModelProperty(value = "第几页", required = true)
    private long pageNum;
    @ApiModelProperty(value = "每页条数", required = true)
    private long pageSize;
    @ApiModelProperty(value = "总条数", required = true)
    private long total;
    @ApiModelProperty(value = "总页数", required = true)
    private long pages;
    @ApiModelProperty(value = "数据列表", required = true)
    private List<T> list;

    public PageRes() {}

    public PageRes(long pageNum, long pageSize, long total, long pages, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.pages = pages;
        this.list = list;
    }

}
