package com.bibiboy.bean.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andNIdIsNull() {
            addCriterion("n_Id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Integer value) {
            addCriterion("n_Id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Integer value) {
            addCriterion("n_Id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Integer value) {
            addCriterion("n_Id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Integer value) {
            addCriterion("n_Id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_Id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Integer> values) {
            addCriterion("n_Id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Integer> values) {
            addCriterion("n_Id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Integer value1, Integer value2) {
            addCriterion("n_Id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andVcUserNameIsNull() {
            addCriterion("vc_User_Name is null");
            return (Criteria) this;
        }

        public Criteria andVcUserNameIsNotNull() {
            addCriterion("vc_User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVcUserNameEqualTo(String value) {
            addCriterion("vc_User_Name =", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameNotEqualTo(String value) {
            addCriterion("vc_User_Name <>", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameGreaterThan(String value) {
            addCriterion("vc_User_Name >", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_User_Name >=", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameLessThan(String value) {
            addCriterion("vc_User_Name <", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameLessThanOrEqualTo(String value) {
            addCriterion("vc_User_Name <=", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameLike(String value) {
            addCriterion("vc_User_Name like", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameNotLike(String value) {
            addCriterion("vc_User_Name not like", value, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameIn(List<String> values) {
            addCriterion("vc_User_Name in", values, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameNotIn(List<String> values) {
            addCriterion("vc_User_Name not in", values, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameBetween(String value1, String value2) {
            addCriterion("vc_User_Name between", value1, value2, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andVcUserNameNotBetween(String value1, String value2) {
            addCriterion("vc_User_Name not between", value1, value2, "vcUserName");
            return (Criteria) this;
        }

        public Criteria andNIntegralIsNull() {
            addCriterion("n_Integral is null");
            return (Criteria) this;
        }

        public Criteria andNIntegralIsNotNull() {
            addCriterion("n_Integral is not null");
            return (Criteria) this;
        }

        public Criteria andNIntegralEqualTo(Integer value) {
            addCriterion("n_Integral =", value, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralNotEqualTo(Integer value) {
            addCriterion("n_Integral <>", value, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralGreaterThan(Integer value) {
            addCriterion("n_Integral >", value, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Integral >=", value, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralLessThan(Integer value) {
            addCriterion("n_Integral <", value, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("n_Integral <=", value, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralIn(List<Integer> values) {
            addCriterion("n_Integral in", values, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralNotIn(List<Integer> values) {
            addCriterion("n_Integral not in", values, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralBetween(Integer value1, Integer value2) {
            addCriterion("n_Integral between", value1, value2, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andNIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Integral not between", value1, value2, "nIntegral");
            return (Criteria) this;
        }

        public Criteria andVcSexIsNull() {
            addCriterion("vc_Sex is null");
            return (Criteria) this;
        }

        public Criteria andVcSexIsNotNull() {
            addCriterion("vc_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andVcSexEqualTo(String value) {
            addCriterion("vc_Sex =", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexNotEqualTo(String value) {
            addCriterion("vc_Sex <>", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexGreaterThan(String value) {
            addCriterion("vc_Sex >", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Sex >=", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexLessThan(String value) {
            addCriterion("vc_Sex <", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexLessThanOrEqualTo(String value) {
            addCriterion("vc_Sex <=", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexLike(String value) {
            addCriterion("vc_Sex like", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexNotLike(String value) {
            addCriterion("vc_Sex not like", value, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexIn(List<String> values) {
            addCriterion("vc_Sex in", values, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexNotIn(List<String> values) {
            addCriterion("vc_Sex not in", values, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexBetween(String value1, String value2) {
            addCriterion("vc_Sex between", value1, value2, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcSexNotBetween(String value1, String value2) {
            addCriterion("vc_Sex not between", value1, value2, "vcSex");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameIsNull() {
            addCriterion("vc_Home_Name is null");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameIsNotNull() {
            addCriterion("vc_Home_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameEqualTo(String value) {
            addCriterion("vc_Home_Name =", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameNotEqualTo(String value) {
            addCriterion("vc_Home_Name <>", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameGreaterThan(String value) {
            addCriterion("vc_Home_Name >", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Home_Name >=", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameLessThan(String value) {
            addCriterion("vc_Home_Name <", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameLessThanOrEqualTo(String value) {
            addCriterion("vc_Home_Name <=", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameLike(String value) {
            addCriterion("vc_Home_Name like", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameNotLike(String value) {
            addCriterion("vc_Home_Name not like", value, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameIn(List<String> values) {
            addCriterion("vc_Home_Name in", values, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameNotIn(List<String> values) {
            addCriterion("vc_Home_Name not in", values, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameBetween(String value1, String value2) {
            addCriterion("vc_Home_Name between", value1, value2, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcHomeNameNotBetween(String value1, String value2) {
            addCriterion("vc_Home_Name not between", value1, value2, "vcHomeName");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNull() {
            addCriterion("vc_Name is null");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNotNull() {
            addCriterion("vc_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVcNameEqualTo(String value) {
            addCriterion("vc_Name =", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotEqualTo(String value) {
            addCriterion("vc_Name <>", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThan(String value) {
            addCriterion("vc_Name >", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Name >=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThan(String value) {
            addCriterion("vc_Name <", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThanOrEqualTo(String value) {
            addCriterion("vc_Name <=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLike(String value) {
            addCriterion("vc_Name like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotLike(String value) {
            addCriterion("vc_Name not like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameIn(List<String> values) {
            addCriterion("vc_Name in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotIn(List<String> values) {
            addCriterion("vc_Name not in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameBetween(String value1, String value2) {
            addCriterion("vc_Name between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotBetween(String value1, String value2) {
            addCriterion("vc_Name not between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcSignIsNull() {
            addCriterion("vc_Sign is null");
            return (Criteria) this;
        }

        public Criteria andVcSignIsNotNull() {
            addCriterion("vc_Sign is not null");
            return (Criteria) this;
        }

        public Criteria andVcSignEqualTo(String value) {
            addCriterion("vc_Sign =", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignNotEqualTo(String value) {
            addCriterion("vc_Sign <>", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignGreaterThan(String value) {
            addCriterion("vc_Sign >", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Sign >=", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignLessThan(String value) {
            addCriterion("vc_Sign <", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignLessThanOrEqualTo(String value) {
            addCriterion("vc_Sign <=", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignLike(String value) {
            addCriterion("vc_Sign like", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignNotLike(String value) {
            addCriterion("vc_Sign not like", value, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignIn(List<String> values) {
            addCriterion("vc_Sign in", values, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignNotIn(List<String> values) {
            addCriterion("vc_Sign not in", values, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignBetween(String value1, String value2) {
            addCriterion("vc_Sign between", value1, value2, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcSignNotBetween(String value1, String value2) {
            addCriterion("vc_Sign not between", value1, value2, "vcSign");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationIsNull() {
            addCriterion("vc_Identification is null");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationIsNotNull() {
            addCriterion("vc_Identification is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationEqualTo(String value) {
            addCriterion("vc_Identification =", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationNotEqualTo(String value) {
            addCriterion("vc_Identification <>", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationGreaterThan(String value) {
            addCriterion("vc_Identification >", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Identification >=", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationLessThan(String value) {
            addCriterion("vc_Identification <", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationLessThanOrEqualTo(String value) {
            addCriterion("vc_Identification <=", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationLike(String value) {
            addCriterion("vc_Identification like", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationNotLike(String value) {
            addCriterion("vc_Identification not like", value, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationIn(List<String> values) {
            addCriterion("vc_Identification in", values, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationNotIn(List<String> values) {
            addCriterion("vc_Identification not in", values, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationBetween(String value1, String value2) {
            addCriterion("vc_Identification between", value1, value2, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcIdentificationNotBetween(String value1, String value2) {
            addCriterion("vc_Identification not between", value1, value2, "vcIdentification");
            return (Criteria) this;
        }

        public Criteria andVcPlaceIsNull() {
            addCriterion("vc_Place is null");
            return (Criteria) this;
        }

        public Criteria andVcPlaceIsNotNull() {
            addCriterion("vc_Place is not null");
            return (Criteria) this;
        }

        public Criteria andVcPlaceEqualTo(String value) {
            addCriterion("vc_Place =", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceNotEqualTo(String value) {
            addCriterion("vc_Place <>", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceGreaterThan(String value) {
            addCriterion("vc_Place >", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Place >=", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceLessThan(String value) {
            addCriterion("vc_Place <", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceLessThanOrEqualTo(String value) {
            addCriterion("vc_Place <=", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceLike(String value) {
            addCriterion("vc_Place like", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceNotLike(String value) {
            addCriterion("vc_Place not like", value, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceIn(List<String> values) {
            addCriterion("vc_Place in", values, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceNotIn(List<String> values) {
            addCriterion("vc_Place not in", values, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceBetween(String value1, String value2) {
            addCriterion("vc_Place between", value1, value2, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPlaceNotBetween(String value1, String value2) {
            addCriterion("vc_Place not between", value1, value2, "vcPlace");
            return (Criteria) this;
        }

        public Criteria andVcPicIsNull() {
            addCriterion("vc_Pic is null");
            return (Criteria) this;
        }

        public Criteria andVcPicIsNotNull() {
            addCriterion("vc_Pic is not null");
            return (Criteria) this;
        }

        public Criteria andVcPicEqualTo(String value) {
            addCriterion("vc_Pic =", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicNotEqualTo(String value) {
            addCriterion("vc_Pic <>", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicGreaterThan(String value) {
            addCriterion("vc_Pic >", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Pic >=", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicLessThan(String value) {
            addCriterion("vc_Pic <", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicLessThanOrEqualTo(String value) {
            addCriterion("vc_Pic <=", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicLike(String value) {
            addCriterion("vc_Pic like", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicNotLike(String value) {
            addCriterion("vc_Pic not like", value, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicIn(List<String> values) {
            addCriterion("vc_Pic in", values, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicNotIn(List<String> values) {
            addCriterion("vc_Pic not in", values, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicBetween(String value1, String value2) {
            addCriterion("vc_Pic between", value1, value2, "vcPic");
            return (Criteria) this;
        }

        public Criteria andVcPicNotBetween(String value1, String value2) {
            addCriterion("vc_Pic not between", value1, value2, "vcPic");
            return (Criteria) this;
        }

        public Criteria andDtBirthIsNull() {
            addCriterion("dt_Birth is null");
            return (Criteria) this;
        }

        public Criteria andDtBirthIsNotNull() {
            addCriterion("dt_Birth is not null");
            return (Criteria) this;
        }

        public Criteria andDtBirthEqualTo(Date value) {
            addCriterion("dt_Birth =", value, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthNotEqualTo(Date value) {
            addCriterion("dt_Birth <>", value, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthGreaterThan(Date value) {
            addCriterion("dt_Birth >", value, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_Birth >=", value, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthLessThan(Date value) {
            addCriterion("dt_Birth <", value, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthLessThanOrEqualTo(Date value) {
            addCriterion("dt_Birth <=", value, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthIn(List<Date> values) {
            addCriterion("dt_Birth in", values, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthNotIn(List<Date> values) {
            addCriterion("dt_Birth not in", values, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthBetween(Date value1, Date value2) {
            addCriterion("dt_Birth between", value1, value2, "dtBirth");
            return (Criteria) this;
        }

        public Criteria andDtBirthNotBetween(Date value1, Date value2) {
            addCriterion("dt_Birth not between", value1, value2, "dtBirth");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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