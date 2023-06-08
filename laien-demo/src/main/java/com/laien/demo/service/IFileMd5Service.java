package com.laien.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laien.demo.entity.FileMd5;

/**
 * <p>
 * 文件md5校验 服务类
 * </p>
 *
 * @author qmf
 * @since 2023-03-16
 */
public interface IFileMd5Service extends IService<FileMd5> {

    FileMd5 getOneByMd5(String md5);
}
