package com.laien.demo.interceptor;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyDetaObjectHander implements MetaObjectHandler {

    private static final String DEL_FLAG = "delFlag";
    private static final String CREATE_USER = "createUser";
    private static final String UPDATE_USER = "updateUser";
    private static final String CREATE_TIME = "createTime";
    private static final String UPDATE_TIME = "updateTime";
    private static final String ADMIN = "admin";

    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasGetter(DEL_FLAG)) {
            // 当期操作人处理
            String username = ADMIN;
            // 当期操作人，操作时间处理
            LocalDateTime now = LocalDateTime.now();
            this.setFieldValByName(DEL_FLAG, 0, metaObject);
            this.setFieldValByName(CREATE_USER, username, metaObject);
            this.setFieldValByName(UPDATE_USER, username, metaObject);
            this.setFieldValByName(CREATE_TIME, now, metaObject);
            this.setFieldValByName(UPDATE_TIME, now, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasGetter(DEL_FLAG)) {
            // 当期操作人处理
            String username = ADMIN;
            this.setFieldValByName(UPDATE_USER, username, metaObject);
            this.setFieldValByName(UPDATE_TIME, LocalDateTime.now(), metaObject);
        }
    }

}