package com.chawuzhi.novel.common.mapper;

import com.chawuzhi.novel.common.domain.TUserDetail;
import com.chawuzhi.novel.common.domain.TUserDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int countByExample(TUserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int deleteByExample(TUserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int insert(TUserDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int insertSelective(TUserDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    List<TUserDetail> selectByExample(TUserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    TUserDetail selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") TUserDetail record, @Param("example") TUserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int updateByExample(@Param("record") TUserDetail record, @Param("example") TUserDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(TUserDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_detail
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    int updateByPrimaryKey(TUserDetail record);
}