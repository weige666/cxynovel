package com.chawuzhi.novel.common.domain;

import com.chawuzhi.novel.common.base.BaseDomain;
import java.util.Date;

public class SysDict extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.dict_code
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private String dictCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.dict_name
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private String dictName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.dict_category
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private String dictCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.dict_value
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private Integer dictValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.status
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.creater_no
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private Integer createrNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.create_time
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.modifier_no
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private Integer modifierNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.modify_time
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.remark
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    private Integer remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.dict_code
     *
     * @return the value of sys_dict.dict_code
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.dict_code
     *
     * @param dictCode the value for sys_dict.dict_code
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.dict_name
     *
     * @return the value of sys_dict.dict_name
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.dict_name
     *
     * @param dictName the value for sys_dict.dict_name
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.dict_category
     *
     * @return the value of sys_dict.dict_category
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public String getDictCategory() {
        return dictCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.dict_category
     *
     * @param dictCategory the value for sys_dict.dict_category
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setDictCategory(String dictCategory) {
        this.dictCategory = dictCategory == null ? null : dictCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.dict_value
     *
     * @return the value of sys_dict.dict_value
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public Integer getDictValue() {
        return dictValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.dict_value
     *
     * @param dictValue the value for sys_dict.dict_value
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setDictValue(Integer dictValue) {
        this.dictValue = dictValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.status
     *
     * @return the value of sys_dict.status
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.status
     *
     * @param status the value for sys_dict.status
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.creater_no
     *
     * @return the value of sys_dict.creater_no
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public Integer getCreaterNo() {
        return createrNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.creater_no
     *
     * @param createrNo the value for sys_dict.creater_no
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setCreaterNo(Integer createrNo) {
        this.createrNo = createrNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.create_time
     *
     * @return the value of sys_dict.create_time
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.create_time
     *
     * @param createTime the value for sys_dict.create_time
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.modifier_no
     *
     * @return the value of sys_dict.modifier_no
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public Integer getModifierNo() {
        return modifierNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.modifier_no
     *
     * @param modifierNo the value for sys_dict.modifier_no
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setModifierNo(Integer modifierNo) {
        this.modifierNo = modifierNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.modify_time
     *
     * @return the value of sys_dict.modify_time
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.modify_time
     *
     * @param modifyTime the value for sys_dict.modify_time
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.remark
     *
     * @return the value of sys_dict.remark
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public Integer getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.remark
     *
     * @param remark the value for sys_dict.remark
     *
     * @mbggenerated Mon Oct 30 19:35:27 GMT+08:00 2017
     */
    public void setRemark(Integer remark) {
        this.remark = remark;
    }
}