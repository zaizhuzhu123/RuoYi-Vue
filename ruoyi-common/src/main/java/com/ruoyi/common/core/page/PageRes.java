package com.ruoyi.common.core.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 表格分页数据对象
 *
 * @author ruoyi
 */
@ApiModel(value = "分页结果", description = "分页结果")
@Data
public class PageRes<T> implements Serializable {
    private static final long serialVersionUID = 1L;

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


//    /** 消息状态码 */
//    private int code;
//
//    /** 消息内容 */
//    private String msg;

    /**
     * 表格数据对象
     */
    public PageRes() {
    }

    public PageRes(long pageNum, long pageSize, long total, long pages, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.pages = pages;
        this.list = list;
    }

    /**
     * 分页
     *
     * @param list  列表数据
     * @param total 总记录数
     */
    public PageRes(List<T> list, int total) {
        this.list = list;
        this.total = total;
    }
}
