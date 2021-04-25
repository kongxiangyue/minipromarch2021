package com.yidaoyun.user.service;


import com.yidaoyun.user.bean.dto.SchoolEsotericaDTO;
import com.yidaoyun.user.domain.SchoolEsoterica;

import java.util.List;

/**
 * 择校秘籍表(SchoolEsoterica)表服务接口
 *
 * @author makejava
 * @since 2020-07-08 14:03:58
 */
public interface SchoolEsotericaService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SchoolEsoterica queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SchoolEsoterica> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param schoolEsoterica 实例对象
     * @return 实例对象
     */
    SchoolEsoterica insert(SchoolEsoterica schoolEsoterica);

    /**
     * 修改数据
     *
     * @param schoolEsoterica 实例对象
     * @return 实例对象
     */
    SchoolEsoterica update(SchoolEsoterica schoolEsoterica);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    long selectSchoolEsotericaCount(SchoolEsotericaDTO schoolEsotericaDTO);

    List<SchoolEsoterica> selectSchoolEsotericaList(SchoolEsotericaDTO schoolEsotericaDTO);
}