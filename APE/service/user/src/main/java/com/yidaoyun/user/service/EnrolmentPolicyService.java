package com.yidaoyun.user.service;


import com.yidaoyun.user.bean.dto.EnrolmentPolicyDTO;
import com.yidaoyun.user.domain.EnrolmentPolicy;

import java.util.List;

/**
 * 招生政策表(EnrolmentPolicy)表服务接口
 *
 * @author makejava
 * @since 2020-07-08 13:49:24
 */
public interface EnrolmentPolicyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    EnrolmentPolicy queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<EnrolmentPolicy> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param enrolmentPolicy 实例对象
     * @return 实例对象
     */
    EnrolmentPolicy insert(EnrolmentPolicy enrolmentPolicy);

    /**
     * 修改数据
     *
     * @param enrolmentPolicy 实例对象
     * @return 实例对象
     */
    EnrolmentPolicy update(EnrolmentPolicy enrolmentPolicy);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<EnrolmentPolicy> selectEnrolmentPolicyList(EnrolmentPolicyDTO enrolmentPolicyDTO);

    long selectEnrolmentPolicyCount(EnrolmentPolicyDTO enrolmentPolicyDTO);

}