package com.laien.demo.controller.app;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.laien.demo.entity.FileMd5;
import com.laien.demo.service.IFileMd5Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@Slf4j
@Api(tags = "App")
@RestController
@RequestMapping("/app")
public class AppController extends BaseController {

    @Resource
    private IFileMd5Service fileMd5Service;

    @ApiOperation(value = "测试查询")
    @GetMapping("/testQuery")
    public ResponseResult<Void> testQuery() throws Exception {
        FileMd5 asdasd = fileMd5Service.getOneByMd5("asdasd");
        return succ();
    }

    @ApiOperation(value = "测试新增")
    @PostMapping("/testAdd")
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult<Void> testAdd() throws Exception {
        FileMd5 fileMd5 = new FileMd5();
        fileMd5.setMd5("tt");
        fileMd5.setFirebaseUrl("yyy");
        fileMd5Service.save(fileMd5);
        return succ();
    }

    @ApiOperation(value = "测试删除")
    @PostMapping("/testDel")
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult<Void> testDel() throws Exception {
        LambdaQueryWrapper<FileMd5> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.gt(FileMd5::getId, 1);
        fileMd5Service.remove(queryWrapper);
        return succ();
    }

    @ApiOperation(value = "测试修改")
    @PostMapping("/testUpdate")
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult<Void> testUpdate() throws Exception {
        LambdaUpdateWrapper<FileMd5> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(FileMd5::getId, 1);
        updateWrapper.set(FileMd5::getMd5, "tt3");
        fileMd5Service.update(new FileMd5(), updateWrapper);
        return succ();
    }

}
