package com.chawuzhi.novel.domain;

import java.util.Date;

public class SysUser extends BaseDomain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_id
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.login_date
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    private Date loginDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.logout_date
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    private Date logoutDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.error_input_num
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    private Integer errorInputNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.remark
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_id
     *
     * @return the value of sys_user.user_id
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_id
     *
     * @param userId the value for sys_user.user_id
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.login_date
     *
     * @return the value of sys_user.login_date
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.login_date
     *
     * @param loginDate the value for sys_user.login_date
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.logout_date
     *
     * @return the value of sys_user.logout_date
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public Date getLogoutDate() {
        return logoutDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.logout_date
     *
     * @param logoutDate the value for sys_user.logout_date
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.error_input_num
     *
     * @return the value of sys_user.error_input_num
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public Integer getErrorInputNum() {
        return errorInputNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.error_input_num
     *
     * @param errorInputNum the value for sys_user.error_input_num
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setErrorInputNum(Integer errorInputNum) {
        this.errorInputNum = errorInputNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.remark
     *
     * @return the value of sys_user.remark
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.remark
     *
     * @param remark the value for sys_user.remark
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}