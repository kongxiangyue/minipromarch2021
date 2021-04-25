package com.yidaoyun.user.service;

import com.yidaoyun.user.bean.dto.*;
import com.yidaoyun.user.bean.vo.*;
import com.yidaoyun.user.domain.ProfessionCatalogue;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 高校专业表(ProfessionCatalogue)表服务接口
 *
 * @author makejava
 * @since 2020-07-08 14:12:18
 */
public interface ProfessionCatalogueService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProfessionCatalogue queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ProfessionCatalogue> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param professionCatalogue 实例对象
     * @return 实例对象
     */
    ProfessionCatalogue insert(ProfessionCatalogue professionCatalogue);

    /**
     * 修改数据
     *
     * @param professionCatalogue 实例对象
     * @return 实例对象
     */
    ProfessionCatalogue update(ProfessionCatalogue professionCatalogue);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    List<OneKindGroupVO> selectOneKindGroup(ProfessionDirectoryDTO professionDirectoryDTO);

    long selectOneKindGroupCount(ProfessionDirectoryDTO professionDirectoryDTO);

    List<ProfessionDirectoryVO> selectProfessionDirectoryList(ProfessionDirectoryDTO professionDirectoryParams);

    List<ProfessionInstItutionsVO> selectProfessionInstitutionsList(ProfessionInstItutionsDTO professionInstItutionsDTO);

    long selectProfessionInstitutionsCount(ProfessionInstItutionsDTO professionInstItutionsDTO);

    long selectFindProfessionScoreCount(FindProfessionScoreDTO findProfessionScoreDTO);

    List<FindProfessionScoreVO> selectFindProfessionScoreList(FindProfessionScoreDTO findProfessionScoreDTO);

    Integer selectOneKindFocusRanking(String oneKindName, String professionCode);

    ProfessionDetailVO selectProfessionDetail(String professionCode, String schoolCode);

    String exportProfessionDetail(ExportProfessionDetailDTO exportProfessionDetailDTO);

    ProfessionDetailVO professionDetail(String professionCode, String schoolCode);

    long selectTwoKindGroupCount(ProfessionDirectoryDTO professionDirectoryDTO);

    List<OneKindGroupVO> selectTwoKindGroup(ProfessionDirectoryDTO professionDirectoryDTO);

    long selectProfessionCatalogueCount(ProfessionCatalogueDTO professionCatalogueDTO);

    List<ProfessionCatalogue> selectProfessionCatalogueList(ProfessionCatalogueDTO professionCatalogueDTO);

    String importAcademy(MultipartFile file, String schoolCode);

    ProfessionCatalogue selectOneByProfessionCode(String profession);

    String importScore(MultipartFile file, String schoolCode);
}