package com.yidaoyun.user.service;


import com.yidaoyun.user.bean.dto.FindSchoolExtendDTO;
import com.yidaoyun.user.bean.dto.SchoolAddDTO;
import com.yidaoyun.user.bean.dto.SchoolExtendDTO;
import com.yidaoyun.user.bean.vo.FindSchoolExtendVO;
import com.yidaoyun.user.bean.vo.SchoolCityVO;
import com.yidaoyun.user.bean.vo.SchoolDeatilVO;
import com.yidaoyun.user.bean.vo.SchoolFocusRankingVO;
import com.yidaoyun.user.domain.SchoolExtend;

import java.util.List;

/**
 * 入驻单位-学校信息扩展表(SchoolExtend)表服务接口
 *
 * @author makejava
 * @since 2020-07-08 13:21:59
 */
public interface SchoolExtendService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SchoolExtend queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SchoolExtend> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param schoolExtend 实例对象
     * @return 实例对象
     */
    SchoolExtend insert(SchoolExtend schoolExtend);

    /**
     * 修改数据
     *
     * @param schoolExtend 实例对象
     * @return 实例对象
     */
    SchoolExtend update(SchoolExtend schoolExtend);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<FindSchoolExtendVO> selectSchoolForScore(FindSchoolExtendDTO findSchoolExtendDTO);

    long selectSchoolForScoreCount(FindSchoolExtendDTO findSchoolExtendDTO);

    SchoolDeatilVO selectSchoolDetail(Integer id);

    List<SchoolFocusRankingVO> selectSchoolFocusRanking();

    List<SchoolCityVO> selectSchoolCityList(String city);

    void updateSchool(SchoolAddDTO schoolAddDTO);

    long selectSchoolExtendCount(SchoolExtendDTO schoolExtendDTO);

    List<SchoolDeatilVO> selectSchoolExtendList(SchoolExtendDTO schoolExtendDTO);

    SchoolExtend selectBySchoolCode(String schoolCode);
}