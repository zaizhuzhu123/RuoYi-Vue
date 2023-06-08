package com.laien.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laien.demo.entity.FileMd5;
import com.laien.demo.mapper.FileMd5Mapper;
import com.laien.demo.service.IFileMd5Service;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文件md5校验 服务实现类
 * </p>
 *
 * @author qmf
 * @since 2023-03-16
 */
@Service
public class FileMd5ServiceImpl extends ServiceImpl<FileMd5Mapper, FileMd5> implements IFileMd5Service {

    @Override
    public FileMd5 getOneByMd5(String md5) {
        LambdaQueryWrapper<FileMd5> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(FileMd5::getMd5, md5);
        queryWrapper.last("limit 1");
        return getOne(queryWrapper);
    }
}
