package com.chawuzhi.novel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public UserLoginInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNull() {
            addCriterion("login_date is null");
            return (Criteria) this;
        }

        public Criteria andLoginDateIsNotNull() {
            addCriterion("login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoginDateEqualTo(Date value) {
            addCriterion("login_date =", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotEqualTo(Date value) {
            addCriterion("login_date <>", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThan(Date value) {
            addCriterion("login_date >", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("login_date >=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThan(Date value) {
            addCriterion("login_date <", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("login_date <=", value, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateIn(List<Date> values) {
            addCriterion("login_date in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotIn(List<Date> values) {
            addCriterion("login_date not in", values, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateBetween(Date value1, Date value2) {
            addCriterion("login_date between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("login_date not between", value1, value2, "loginDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateIsNull() {
            addCriterion("logout_date is null");
            return (Criteria) this;
        }

        public Criteria andLogoutDateIsNotNull() {
            addCriterion("logout_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutDateEqualTo(Date value) {
            addCriterion("logout_date =", value, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateNotEqualTo(Date value) {
            addCriterion("logout_date <>", value, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateGreaterThan(Date value) {
            addCriterion("logout_date >", value, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("logout_date >=", value, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateLessThan(Date value) {
            addCriterion("logout_date <", value, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateLessThanOrEqualTo(Date value) {
            addCriterion("logout_date <=", value, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateIn(List<Date> values) {
            addCriterion("logout_date in", values, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateNotIn(List<Date> values) {
            addCriterion("logout_date not in", values, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateBetween(Date value1, Date value2) {
            addCriterion("logout_date between", value1, value2, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andLogoutDateNotBetween(Date value1, Date value2) {
            addCriterion("logout_date not between", value1, value2, "logoutDate");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumIsNull() {
            addCriterion("error_input_num is null");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumIsNotNull() {
            addCriterion("error_input_num is not null");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumEqualTo(Integer value) {
            addCriterion("error_input_num =", value, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumNotEqualTo(Integer value) {
            addCriterion("error_input_num <>", value, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumGreaterThan(Integer value) {
            addCriterion("error_input_num >", value, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("error_input_num >=", value, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumLessThan(Integer value) {
            addCriterion("error_input_num <", value, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumLessThanOrEqualTo(Integer value) {
            addCriterion("error_input_num <=", value, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumIn(List<Integer> values) {
            addCriterion("error_input_num in", values, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumNotIn(List<Integer> values) {
            addCriterion("error_input_num not in", values, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumBetween(Integer value1, Integer value2) {
            addCriterion("error_input_num between", value1, value2, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andErrorInputNumNotBetween(Integer value1, Integer value2) {
            addCriterion("error_input_num not between", value1, value2, "errorInputNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_info
     *
     * @mbggenerated do_not_delete_during_merge Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_login_info
     *
     * @mbggenerated Thu Oct 26 15:59:23 GMT+08:00 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}