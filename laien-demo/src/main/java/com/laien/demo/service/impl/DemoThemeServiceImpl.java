package com.laien.demo.service.impl;


import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.laien.demo.constant.GlobalConstant;
import com.laien.demo.entity.DemoTheme;
import com.laien.demo.mapper.DemoThemeMapper;
import com.laien.demo.service.IDemoThemeService;
import com.ruoyi.common.core.page.PageDomain;
import com.ruoyi.common.core.page.PageRes;
import com.ruoyi.common.core.page.TableSupport;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.sql.SqlUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 主题Service业务层处理
 *
 * @author qmf
 * @date 2023-06-07
 */
@Service
public class DemoThemeServiceImpl extends ServiceImpl<DemoThemeMapper, DemoTheme> implements IDemoThemeService {
    @Resource
    private DemoThemeMapper demoThemeMapper;

    /**
     * 查询主题
     *
     * @param id 主题主键
     * @return 主题
     */
    @Override
    public DemoTheme selectDemoThemeById(Long id) {
        return getById(id);
    }

    /**
     * 查询主题列表
     *
     * @param demoTheme 主题
     * @return 主题
     */
    @Override
    public PageRes<DemoTheme> selectDemoThemeList(Integer pageNum, Integer pageSize, DemoTheme demoTheme) {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
        Boolean reasonable = pageDomain.getReasonable();
        Page<Object> page = PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(reasonable);
        JSONObject jsonObject = JSONObject.parseObject(JSONObject.toJSONString(demoTheme));
        Set<Map.Entry<String, Object>> entries = jsonObject.entrySet();
        QueryWrapper<DemoTheme> queryWrapper = new QueryWrapper<>();
        entries.stream().forEach(entry -> {
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String) {
                    if (StringUtils.isNotBlank((CharSequence) value)) {
                        queryWrapper.like(com.baomidou.mybatisplus.core.toolkit.StringUtils.camelToUnderline(entry.getKey()), value);
                    }
                } else {
                    queryWrapper.eq(com.baomidou.mybatisplus.core.toolkit.StringUtils.camelToUnderline(entry.getKey()), value);
                }
            }
        });
        List<DemoTheme> demoThemes = list(queryWrapper);
        return new PageRes<>(pageNum, pageSize, page.getTotal(), page.getPages(), demoThemes);
    }

    /**
     * 新增主题
     *
     * @param demoTheme 主题
     * @return 结果
     */
    @Override
    public int insertDemoTheme(DemoTheme demoTheme) {
        return save(demoTheme) ? GlobalConstant.YES : GlobalConstant.NO;
    }

    /**
     * 修改主题
     *
     * @param demoTheme 主题
     * @return 结果
     */
    @Override
    public int updateDemoTheme(DemoTheme demoTheme) {
        LambdaUpdateWrapper<DemoTheme> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(DemoTheme::getId, demoTheme.getId());
        return update(demoTheme, updateWrapper) ? GlobalConstant.YES : GlobalConstant.NO;
    }

    /**
     * 批量删除主题
     *
     * @param ids 需要删除的主题主键
     * @return 结果
     */

    @Override
    public int deleteDemoThemeByIds(String ids) {
        boolean b = removeByIds(Lists.newArrayList(Convert.toStrArray(ids)));
        return b ? GlobalConstant.YES : GlobalConstant.NO;
    }

    /**
     * 删除主题信息
     *
     * @param id 主题主键
     * @return 结果
     */
    @Override
    public int deleteDemoThemeById(Long id) {
        boolean b = removeById(id);
        return b ? GlobalConstant.YES : GlobalConstant.NO;
    }
}