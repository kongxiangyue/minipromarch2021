package com.yidaoyun.user.service;


import com.yidaoyun.user.bean.dto.SchoolProfessionDTO;
import com.yidaoyun.user.bean.vo.SchoolProfessionVO;
import com.yidaoyun.user.domain.SchoolProfession;

import java.util.List;

/**
 * 学校专业关系表(SchoolProfession)表服务接口
 *
 * @author makejava
 * @since 2020-07-08 14:58:37
 */
public interface SchoolProfessionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SchoolProfession queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SchoolProfession> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param schoolProfession 实例对象
     * @return 实例对象
     */
    SchoolProfession insert(SchoolProfession schoolProfession);

    /**
     * 修改数据
     *
     * @param schoolProfession 实例对象
     * @return 实例对象
     */
    SchoolProfession update(SchoolProfession schoolProfession);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    long selectSchoolAcademyCount(SchoolProfessionDTO schoolProfessionDTO);

    List<SchoolProfession> selectSchoolAcademyList(SchoolProfessionDTO schoolProfessionDTO);

    long selectSchoolProfessionCount(SchoolProfessionDTO schoolProfessionDTO);

    List<SchoolProfessionVO> selectSchoolProfessionList(SchoolProfessionDTO schoolProfessionDTO);

    int updateSchoolAcademy(SchoolProfessionDTO schoolProfession);

    void deleteSchoolAcademy(SchoolProfession schoolProfession);

    List<SchoolProfession> queryAll(SchoolProfession schoolProfession);

    SchoolProfession selectSchoolProfessionIsNull(SchoolProfession schoolProfession);
}