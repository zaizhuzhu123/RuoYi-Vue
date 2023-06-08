package com.laien.demo.entity;

import com.laien.demo.entity.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 文件md5校验
 * </p>
 *
 * @author qmf
 * @since 2023-03-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
//@Accessors(chain = true)
@ApiModel(value="AiFileMd5对象", description="文件md5校验")
public class FileMd5 extends BaseModel {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "文件md5值")
    private String md5;

    @ApiModelProperty(value = "firebase 地址")
    private String firebaseUrl;


}
