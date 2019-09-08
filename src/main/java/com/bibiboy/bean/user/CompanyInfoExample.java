package com.bibiboy.bean.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyInfoExample() {
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

        public Criteria andNVipIsNull() {
            addCriterion("n_Vip is null");
            return (Criteria) this;
        }

        public Criteria andNVipIsNotNull() {
            addCriterion("n_Vip is not null");
            return (Criteria) this;
        }

        public Criteria andNVipEqualTo(Integer value) {
            addCriterion("n_Vip =", value, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipNotEqualTo(Integer value) {
            addCriterion("n_Vip <>", value, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipGreaterThan(Integer value) {
            addCriterion("n_Vip >", value, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Vip >=", value, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipLessThan(Integer value) {
            addCriterion("n_Vip <", value, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipLessThanOrEqualTo(Integer value) {
            addCriterion("n_Vip <=", value, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipIn(List<Integer> values) {
            addCriterion("n_Vip in", values, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipNotIn(List<Integer> values) {
            addCriterion("n_Vip not in", values, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipBetween(Integer value1, Integer value2) {
            addCriterion("n_Vip between", value1, value2, "nVip");
            return (Criteria) this;
        }

        public Criteria andNVipNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Vip not between", value1, value2, "nVip");
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