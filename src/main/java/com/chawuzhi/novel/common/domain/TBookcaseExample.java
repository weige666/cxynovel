package com.chawuzhi.novel.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBookcaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public TBookcaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
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
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
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

        public Criteria andBookcaseIdIsNull() {
            addCriterion("bookcase_id is null");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdIsNotNull() {
            addCriterion("bookcase_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdEqualTo(Integer value) {
            addCriterion("bookcase_id =", value, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdNotEqualTo(Integer value) {
            addCriterion("bookcase_id <>", value, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdGreaterThan(Integer value) {
            addCriterion("bookcase_id >", value, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookcase_id >=", value, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdLessThan(Integer value) {
            addCriterion("bookcase_id <", value, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("bookcase_id <=", value, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdIn(List<Integer> values) {
            addCriterion("bookcase_id in", values, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdNotIn(List<Integer> values) {
            addCriterion("bookcase_id not in", values, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdBetween(Integer value1, Integer value2) {
            addCriterion("bookcase_id between", value1, value2, "bookcaseId");
            return (Criteria) this;
        }

        public Criteria andBookcaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bookcase_id not between", value1, value2, "bookcaseId");
            return (Criteria) this;
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdIsNull() {
            addCriterion("last_category_id is null");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdIsNotNull() {
            addCriterion("last_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdEqualTo(Integer value) {
            addCriterion("last_category_id =", value, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdNotEqualTo(Integer value) {
            addCriterion("last_category_id <>", value, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdGreaterThan(Integer value) {
            addCriterion("last_category_id >", value, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_category_id >=", value, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdLessThan(Integer value) {
            addCriterion("last_category_id <", value, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("last_category_id <=", value, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdIn(List<Integer> values) {
            addCriterion("last_category_id in", values, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdNotIn(List<Integer> values) {
            addCriterion("last_category_id not in", values, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("last_category_id between", value1, value2, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andLastCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("last_category_id not between", value1, value2, "lastCategoryId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNull() {
            addCriterion("chapter_id is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("chapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(Integer value) {
            addCriterion("chapter_id =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(Integer value) {
            addCriterion("chapter_id <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(Integer value) {
            addCriterion("chapter_id >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_id >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(Integer value) {
            addCriterion("chapter_id <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_id <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<Integer> values) {
            addCriterion("chapter_id in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<Integer> values) {
            addCriterion("chapter_id not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id not between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNull() {
            addCriterion("chapter_name is null");
            return (Criteria) this;
        }

        public Criteria andChapterNameIsNotNull() {
            addCriterion("chapter_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapterNameEqualTo(String value) {
            addCriterion("chapter_name =", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotEqualTo(String value) {
            addCriterion("chapter_name <>", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThan(String value) {
            addCriterion("chapter_name >", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_name >=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThan(String value) {
            addCriterion("chapter_name <", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLessThanOrEqualTo(String value) {
            addCriterion("chapter_name <=", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameLike(String value) {
            addCriterion("chapter_name like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotLike(String value) {
            addCriterion("chapter_name not like", value, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameIn(List<String> values) {
            addCriterion("chapter_name in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotIn(List<String> values) {
            addCriterion("chapter_name not in", values, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameBetween(String value1, String value2) {
            addCriterion("chapter_name between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andChapterNameNotBetween(String value1, String value2) {
            addCriterion("chapter_name not between", value1, value2, "chapterName");
            return (Criteria) this;
        }

        public Criteria andLastVisitIsNull() {
            addCriterion("last_visit is null");
            return (Criteria) this;
        }

        public Criteria andLastVisitIsNotNull() {
            addCriterion("last_visit is not null");
            return (Criteria) this;
        }

        public Criteria andLastVisitEqualTo(Date value) {
            addCriterion("last_visit =", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitNotEqualTo(Date value) {
            addCriterion("last_visit <>", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitGreaterThan(Date value) {
            addCriterion("last_visit >", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitGreaterThanOrEqualTo(Date value) {
            addCriterion("last_visit >=", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitLessThan(Date value) {
            addCriterion("last_visit <", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitLessThanOrEqualTo(Date value) {
            addCriterion("last_visit <=", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitIn(List<Date> values) {
            addCriterion("last_visit in", values, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitNotIn(List<Date> values) {
            addCriterion("last_visit not in", values, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitBetween(Date value1, Date value2) {
            addCriterion("last_visit between", value1, value2, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitNotBetween(Date value1, Date value2) {
            addCriterion("last_visit not between", value1, value2, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andCreaterNoIsNull() {
            addCriterion("creater_no is null");
            return (Criteria) this;
        }

        public Criteria andCreaterNoIsNotNull() {
            addCriterion("creater_no is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterNoEqualTo(String value) {
            addCriterion("creater_no =", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoNotEqualTo(String value) {
            addCriterion("creater_no <>", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoGreaterThan(String value) {
            addCriterion("creater_no >", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoGreaterThanOrEqualTo(String value) {
            addCriterion("creater_no >=", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoLessThan(String value) {
            addCriterion("creater_no <", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoLessThanOrEqualTo(String value) {
            addCriterion("creater_no <=", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoLike(String value) {
            addCriterion("creater_no like", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoNotLike(String value) {
            addCriterion("creater_no not like", value, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoIn(List<String> values) {
            addCriterion("creater_no in", values, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoNotIn(List<String> values) {
            addCriterion("creater_no not in", values, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoBetween(String value1, String value2) {
            addCriterion("creater_no between", value1, value2, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreaterNoNotBetween(String value1, String value2) {
            addCriterion("creater_no not between", value1, value2, "createrNo");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeIsNull() {
            addCriterion("moidfiy_time is null");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeIsNotNull() {
            addCriterion("moidfiy_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeEqualTo(Date value) {
            addCriterion("moidfiy_time =", value, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeNotEqualTo(Date value) {
            addCriterion("moidfiy_time <>", value, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeGreaterThan(Date value) {
            addCriterion("moidfiy_time >", value, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("moidfiy_time >=", value, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeLessThan(Date value) {
            addCriterion("moidfiy_time <", value, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeLessThanOrEqualTo(Date value) {
            addCriterion("moidfiy_time <=", value, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeIn(List<Date> values) {
            addCriterion("moidfiy_time in", values, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeNotIn(List<Date> values) {
            addCriterion("moidfiy_time not in", values, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeBetween(Date value1, Date value2) {
            addCriterion("moidfiy_time between", value1, value2, "moidfiyTime");
            return (Criteria) this;
        }

        public Criteria andMoidfiyTimeNotBetween(Date value1, Date value2) {
            addCriterion("moidfiy_time not between", value1, value2, "moidfiyTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bookcase
     *
     * @mbggenerated do_not_delete_during_merge Thu Oct 26 19:04:52 GMT+08:00 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_bookcase
     *
     * @mbggenerated Thu Oct 26 19:04:52 GMT+08:00 2017
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