package com.laien.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.laien.demo.entity.DemoTheme;
import com.ruoyi.common.core.page.PageRes;

/**
 * 主题Service接口
 *
 * @author qmf
 * @date 2023-06-07
 */
public interface IDemoThemeService extends IService<DemoTheme> {
    /**
     * 查询主题
     *
     * @param id 主题主键
     * @return 主题
     */
    public DemoTheme selectDemoThemeById(Long id);

    /**
     * 查询主题列表
     *
     * @param demoTheme 主题
     * @return 主题集合
     */
    public PageRes<DemoTheme> selectDemoThemeList(Integer pageNum, Integer pageSize, DemoTheme demoTheme);

    /**
     * 新增主题
     *
     * @param demoTheme 主题
     * @return 结果
     */
    public int insertDemoTheme(DemoTheme demoTheme);

    /**
     * 修改主题
     *
     * @param demoTheme 主题
     * @return 结果
     */
    public int updateDemoTheme(DemoTheme demoTheme);

    /**
     * 批量删除主题
     *
     * @param ids 需要删除的主题主键集合
     * @return 结果
     */
    public int deleteDemoThemeByIds(String ids);

    /**
     * 删除主题信息
     *
     * @param id 主题主键
     * @return 结果
     */
    public int deleteDemoThemeById(Long id);
}
