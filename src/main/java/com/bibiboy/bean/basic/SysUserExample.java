package com.bibiboy.bean.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andNStatusIsNull() {
            addCriterion("n_Status is null");
            return (Criteria) this;
        }

        public Criteria andNStatusIsNotNull() {
            addCriterion("n_Status is not null");
            return (Criteria) this;
        }

        public Criteria andNStatusEqualTo(Integer value) {
            addCriterion("n_Status =", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusNotEqualTo(Integer value) {
            addCriterion("n_Status <>", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusGreaterThan(Integer value) {
            addCriterion("n_Status >", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Status >=", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusLessThan(Integer value) {
            addCriterion("n_Status <", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusLessThanOrEqualTo(Integer value) {
            addCriterion("n_Status <=", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusIn(List<Integer> values) {
            addCriterion("n_Status in", values, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusNotIn(List<Integer> values) {
            addCriterion("n_Status not in", values, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusBetween(Integer value1, Integer value2) {
            addCriterion("n_Status between", value1, value2, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Status not between", value1, value2, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNull() {
            addCriterion("n_Type is null");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNotNull() {
            addCriterion("n_Type is not null");
            return (Criteria) this;
        }

        public Criteria andNTypeEqualTo(Integer value) {
            addCriterion("n_Type =", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotEqualTo(Integer value) {
            addCriterion("n_Type <>", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThan(Integer value) {
            addCriterion("n_Type >", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Type >=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThan(Integer value) {
            addCriterion("n_Type <", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThanOrEqualTo(Integer value) {
            addCriterion("n_Type <=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeIn(List<Integer> values) {
            addCriterion("n_Type in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotIn(List<Integer> values) {
            addCriterion("n_Type not in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeBetween(Integer value1, Integer value2) {
            addCriterion("n_Type between", value1, value2, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Type not between", value1, value2, "nType");
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

        public Criteria andVcPassWordIsNull() {
            addCriterion("vc_Pass_Word is null");
            return (Criteria) this;
        }

        public Criteria andVcPassWordIsNotNull() {
            addCriterion("vc_Pass_Word is not null");
            return (Criteria) this;
        }

        public Criteria andVcPassWordEqualTo(String value) {
            addCriterion("vc_Pass_Word =", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordNotEqualTo(String value) {
            addCriterion("vc_Pass_Word <>", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordGreaterThan(String value) {
            addCriterion("vc_Pass_Word >", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Pass_Word >=", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordLessThan(String value) {
            addCriterion("vc_Pass_Word <", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordLessThanOrEqualTo(String value) {
            addCriterion("vc_Pass_Word <=", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordLike(String value) {
            addCriterion("vc_Pass_Word like", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordNotLike(String value) {
            addCriterion("vc_Pass_Word not like", value, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordIn(List<String> values) {
            addCriterion("vc_Pass_Word in", values, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordNotIn(List<String> values) {
            addCriterion("vc_Pass_Word not in", values, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordBetween(String value1, String value2) {
            addCriterion("vc_Pass_Word between", value1, value2, "vcPassWord");
            return (Criteria) this;
        }

        public Criteria andVcPassWordNotBetween(String value1, String value2) {
            addCriterion("vc_Pass_Word not between", value1, value2, "vcPassWord");
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

        public Criteria andVcTelIsNull() {
            addCriterion("vc_Tel is null");
            return (Criteria) this;
        }

        public Criteria andVcTelIsNotNull() {
            addCriterion("vc_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andVcTelEqualTo(String value) {
            addCriterion("vc_Tel =", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelNotEqualTo(String value) {
            addCriterion("vc_Tel <>", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelGreaterThan(String value) {
            addCriterion("vc_Tel >", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Tel >=", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelLessThan(String value) {
            addCriterion("vc_Tel <", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelLessThanOrEqualTo(String value) {
            addCriterion("vc_Tel <=", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelLike(String value) {
            addCriterion("vc_Tel like", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelNotLike(String value) {
            addCriterion("vc_Tel not like", value, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelIn(List<String> values) {
            addCriterion("vc_Tel in", values, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelNotIn(List<String> values) {
            addCriterion("vc_Tel not in", values, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelBetween(String value1, String value2) {
            addCriterion("vc_Tel between", value1, value2, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcTelNotBetween(String value1, String value2) {
            addCriterion("vc_Tel not between", value1, value2, "vcTel");
            return (Criteria) this;
        }

        public Criteria andVcEmailIsNull() {
            addCriterion("vc_Email is null");
            return (Criteria) this;
        }

        public Criteria andVcEmailIsNotNull() {
            addCriterion("vc_Email is not null");
            return (Criteria) this;
        }

        public Criteria andVcEmailEqualTo(String value) {
            addCriterion("vc_Email =", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotEqualTo(String value) {
            addCriterion("vc_Email <>", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailGreaterThan(String value) {
            addCriterion("vc_Email >", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Email >=", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLessThan(String value) {
            addCriterion("vc_Email <", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLessThanOrEqualTo(String value) {
            addCriterion("vc_Email <=", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLike(String value) {
            addCriterion("vc_Email like", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotLike(String value) {
            addCriterion("vc_Email not like", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailIn(List<String> values) {
            addCriterion("vc_Email in", values, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotIn(List<String> values) {
            addCriterion("vc_Email not in", values, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailBetween(String value1, String value2) {
            addCriterion("vc_Email between", value1, value2, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotBetween(String value1, String value2) {
            addCriterion("vc_Email not between", value1, value2, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagIsNull() {
            addCriterion("n_Manager_Flag is null");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagIsNotNull() {
            addCriterion("n_Manager_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagEqualTo(Integer value) {
            addCriterion("n_Manager_Flag =", value, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagNotEqualTo(Integer value) {
            addCriterion("n_Manager_Flag <>", value, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagGreaterThan(Integer value) {
            addCriterion("n_Manager_Flag >", value, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Manager_Flag >=", value, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagLessThan(Integer value) {
            addCriterion("n_Manager_Flag <", value, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagLessThanOrEqualTo(Integer value) {
            addCriterion("n_Manager_Flag <=", value, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagIn(List<Integer> values) {
            addCriterion("n_Manager_Flag in", values, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagNotIn(List<Integer> values) {
            addCriterion("n_Manager_Flag not in", values, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagBetween(Integer value1, Integer value2) {
            addCriterion("n_Manager_Flag between", value1, value2, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNManagerFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Manager_Flag not between", value1, value2, "nManagerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagIsNull() {
            addCriterion("n_Seller_Flag is null");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagIsNotNull() {
            addCriterion("n_Seller_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagEqualTo(Integer value) {
            addCriterion("n_Seller_Flag =", value, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagNotEqualTo(Integer value) {
            addCriterion("n_Seller_Flag <>", value, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagGreaterThan(Integer value) {
            addCriterion("n_Seller_Flag >", value, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Seller_Flag >=", value, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagLessThan(Integer value) {
            addCriterion("n_Seller_Flag <", value, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagLessThanOrEqualTo(Integer value) {
            addCriterion("n_Seller_Flag <=", value, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagIn(List<Integer> values) {
            addCriterion("n_Seller_Flag in", values, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagNotIn(List<Integer> values) {
            addCriterion("n_Seller_Flag not in", values, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagBetween(Integer value1, Integer value2) {
            addCriterion("n_Seller_Flag between", value1, value2, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNSellerFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Seller_Flag not between", value1, value2, "nSellerFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagIsNull() {
            addCriterion("n_Repair_Flag is null");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagIsNotNull() {
            addCriterion("n_Repair_Flag is not null");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagEqualTo(Integer value) {
            addCriterion("n_Repair_Flag =", value, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagNotEqualTo(Integer value) {
            addCriterion("n_Repair_Flag <>", value, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagGreaterThan(Integer value) {
            addCriterion("n_Repair_Flag >", value, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Repair_Flag >=", value, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagLessThan(Integer value) {
            addCriterion("n_Repair_Flag <", value, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagLessThanOrEqualTo(Integer value) {
            addCriterion("n_Repair_Flag <=", value, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagIn(List<Integer> values) {
            addCriterion("n_Repair_Flag in", values, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagNotIn(List<Integer> values) {
            addCriterion("n_Repair_Flag not in", values, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagBetween(Integer value1, Integer value2) {
            addCriterion("n_Repair_Flag between", value1, value2, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andNRepairFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Repair_Flag not between", value1, value2, "nRepairFlag");
            return (Criteria) this;
        }

        public Criteria andDtRegIsNull() {
            addCriterion("dt_Reg is null");
            return (Criteria) this;
        }

        public Criteria andDtRegIsNotNull() {
            addCriterion("dt_Reg is not null");
            return (Criteria) this;
        }

        public Criteria andDtRegEqualTo(Date value) {
            addCriterion("dt_Reg =", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegNotEqualTo(Date value) {
            addCriterion("dt_Reg <>", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegGreaterThan(Date value) {
            addCriterion("dt_Reg >", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_Reg >=", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegLessThan(Date value) {
            addCriterion("dt_Reg <", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegLessThanOrEqualTo(Date value) {
            addCriterion("dt_Reg <=", value, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegIn(List<Date> values) {
            addCriterion("dt_Reg in", values, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegNotIn(List<Date> values) {
            addCriterion("dt_Reg not in", values, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegBetween(Date value1, Date value2) {
            addCriterion("dt_Reg between", value1, value2, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtRegNotBetween(Date value1, Date value2) {
            addCriterion("dt_Reg not between", value1, value2, "dtReg");
            return (Criteria) this;
        }

        public Criteria andDtUpdateIsNull() {
            addCriterion("dt_Update is null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateIsNotNull() {
            addCriterion("dt_Update is not null");
            return (Criteria) this;
        }

        public Criteria andDtUpdateEqualTo(Date value) {
            addCriterion("dt_Update =", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateNotEqualTo(Date value) {
            addCriterion("dt_Update <>", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateGreaterThan(Date value) {
            addCriterion("dt_Update >", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_Update >=", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateLessThan(Date value) {
            addCriterion("dt_Update <", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateLessThanOrEqualTo(Date value) {
            addCriterion("dt_Update <=", value, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateIn(List<Date> values) {
            addCriterion("dt_Update in", values, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateNotIn(List<Date> values) {
            addCriterion("dt_Update not in", values, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateBetween(Date value1, Date value2) {
            addCriterion("dt_Update between", value1, value2, "dtUpdate");
            return (Criteria) this;
        }

        public Criteria andDtUpdateNotBetween(Date value1, Date value2) {
            addCriterion("dt_Update not between", value1, value2, "dtUpdate");
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