package com.chawuzhi.novel.mapper;

import com.chawuzhi.novel.domain.TChapter;
import com.chawuzhi.novel.domain.TChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int countByExample(TChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int deleteByExample(TChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer chapterno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int insert(TChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int insertSelective(TChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    List<TChapter> selectByExample(TChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    TChapter selectByPrimaryKey(Integer chapterno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") TChapter record, @Param("example") TChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int updateByExample(@Param("record") TChapter record, @Param("example") TChapterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(TChapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_chapter
     *
     * @mbggenerated Mon Oct 16 17:40:37 GMT+08:00 2017
     */
    int updateByPrimaryKey(TChapter record);
}