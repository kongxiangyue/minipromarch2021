package com.yidaoyun.user.service;

import com.yidaoyun.user.bean.dto.SchoolScoreDTO;
import com.yidaoyun.user.bean.dto.SchoolScoreYearDTO;
import com.yidaoyun.user.domain.SchoolScore;

import java.util.List;

/**
 * 学校专业往年分数表(SchoolScore)表服务接口
 *
 * @author makejava
 * @since 2020-07-08 14:30:20
 */
public interface SchoolScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SchoolScore queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SchoolScore> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param schoolScore 实例对象
     * @return 实例对象
     */
    SchoolScore insert(SchoolScore schoolScore);

    /**
     * 修改数据
     *
     * @param schoolScore 实例对象
     * @return 实例对象
     */
    SchoolScore update(SchoolScore schoolScore);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<SchoolScore> selectScoreBySchoolCodeAndYear(SchoolScoreYearDTO schoolScoreYearDTO);

    SchoolScore selectOneByParams(SchoolScoreDTO schoolScoreParams);

    long selectSchoolScoreStatisticCount(SchoolScoreDTO schoolScore);

    List<SchoolScore> selectSchoolScoreStatisticList(SchoolScoreDTO schoolScore);

    List<SchoolScore> selectYearGroupBySchoolCode(SchoolScoreDTO schoolScoreDTO);

    List<SchoolScore> selectThreeYearCodeBySchoolAndProfession(String professionCode, String schoolCode, int year);

    long schoolScoreProfessionCount(SchoolScoreDTO schoolScoreDTO);

    List<SchoolScore> schoolScoreProfessionList(SchoolScoreDTO schoolScoreDTO);

    void deleteBySchoolAndProfession(String schoolCode, String professionCode);
}