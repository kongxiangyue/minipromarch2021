package com.yidaoyun.user.service;

import com.yidaoyun.user.domain.SchoolEmployment;

import java.util.List;

/**
 * 学校就业率表(SchoolEmployment)表服务接口
 *
 * @author makejava
 * @since 2020-07-08 14:45:40
 */
public interface SchoolEmploymentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SchoolEmployment queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SchoolEmployment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param schoolEmployment 实例对象
     * @return 实例对象
     */
    SchoolEmployment insert(SchoolEmployment schoolEmployment);

    /**
     * 修改数据
     *
     * @param schoolEmployment 实例对象
     * @return 实例对象
     */
    SchoolEmployment update(SchoolEmployment schoolEmployment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    SchoolEmployment selectOneByParams(SchoolEmployment schoolEmploymentParams);
}