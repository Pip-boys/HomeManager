package com.bibiboy.bean.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeInfoExample() {
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

        public Criteria andVcCodeIsNull() {
            addCriterion("vc_Code is null");
            return (Criteria) this;
        }

        public Criteria andVcCodeIsNotNull() {
            addCriterion("vc_Code is not null");
            return (Criteria) this;
        }

        public Criteria andVcCodeEqualTo(String value) {
            addCriterion("vc_Code =", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotEqualTo(String value) {
            addCriterion("vc_Code <>", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeGreaterThan(String value) {
            addCriterion("vc_Code >", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Code >=", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeLessThan(String value) {
            addCriterion("vc_Code <", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeLessThanOrEqualTo(String value) {
            addCriterion("vc_Code <=", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeLike(String value) {
            addCriterion("vc_Code like", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotLike(String value) {
            addCriterion("vc_Code not like", value, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeIn(List<String> values) {
            addCriterion("vc_Code in", values, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotIn(List<String> values) {
            addCriterion("vc_Code not in", values, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeBetween(String value1, String value2) {
            addCriterion("vc_Code between", value1, value2, "vcCode");
            return (Criteria) this;
        }

        public Criteria andVcCodeNotBetween(String value1, String value2) {
            addCriterion("vc_Code not between", value1, value2, "vcCode");
            return (Criteria) this;
        }

        public Criteria andNUserIdIsNull() {
            addCriterion("n_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andNUserIdIsNotNull() {
            addCriterion("n_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNUserIdEqualTo(Integer value) {
            addCriterion("n_User_Id =", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotEqualTo(Integer value) {
            addCriterion("n_User_Id <>", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdGreaterThan(Integer value) {
            addCriterion("n_User_Id >", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_User_Id >=", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdLessThan(Integer value) {
            addCriterion("n_User_Id <", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_User_Id <=", value, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdIn(List<Integer> values) {
            addCriterion("n_User_Id in", values, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotIn(List<Integer> values) {
            addCriterion("n_User_Id not in", values, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdBetween(Integer value1, Integer value2) {
            addCriterion("n_User_Id between", value1, value2, "nUserId");
            return (Criteria) this;
        }

        public Criteria andNUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_User_Id not between", value1, value2, "nUserId");
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

        public Criteria andVcTypeNameIsNull() {
            addCriterion("vc_Type_Name is null");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameIsNotNull() {
            addCriterion("vc_Type_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameEqualTo(String value) {
            addCriterion("vc_Type_Name =", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameNotEqualTo(String value) {
            addCriterion("vc_Type_Name <>", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameGreaterThan(String value) {
            addCriterion("vc_Type_Name >", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Type_Name >=", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameLessThan(String value) {
            addCriterion("vc_Type_Name <", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameLessThanOrEqualTo(String value) {
            addCriterion("vc_Type_Name <=", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameLike(String value) {
            addCriterion("vc_Type_Name like", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameNotLike(String value) {
            addCriterion("vc_Type_Name not like", value, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameIn(List<String> values) {
            addCriterion("vc_Type_Name in", values, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameNotIn(List<String> values) {
            addCriterion("vc_Type_Name not in", values, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameBetween(String value1, String value2) {
            addCriterion("vc_Type_Name between", value1, value2, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcTypeNameNotBetween(String value1, String value2) {
            addCriterion("vc_Type_Name not between", value1, value2, "vcTypeName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameIsNull() {
            addCriterion("vc_Company_Name is null");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameIsNotNull() {
            addCriterion("vc_Company_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameEqualTo(String value) {
            addCriterion("vc_Company_Name =", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameNotEqualTo(String value) {
            addCriterion("vc_Company_Name <>", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameGreaterThan(String value) {
            addCriterion("vc_Company_Name >", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Company_Name >=", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameLessThan(String value) {
            addCriterion("vc_Company_Name <", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("vc_Company_Name <=", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameLike(String value) {
            addCriterion("vc_Company_Name like", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameNotLike(String value) {
            addCriterion("vc_Company_Name not like", value, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameIn(List<String> values) {
            addCriterion("vc_Company_Name in", values, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameNotIn(List<String> values) {
            addCriterion("vc_Company_Name not in", values, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameBetween(String value1, String value2) {
            addCriterion("vc_Company_Name between", value1, value2, "vcCompanyName");
            return (Criteria) this;
        }

        public Criteria andVcCompanyNameNotBetween(String value1, String value2) {
            addCriterion("vc_Company_Name not between", value1, value2, "vcCompanyName");
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

        public Criteria andVcItemIsNull() {
            addCriterion("vc_Item is null");
            return (Criteria) this;
        }

        public Criteria andVcItemIsNotNull() {
            addCriterion("vc_Item is not null");
            return (Criteria) this;
        }

        public Criteria andVcItemEqualTo(String value) {
            addCriterion("vc_Item =", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemNotEqualTo(String value) {
            addCriterion("vc_Item <>", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemGreaterThan(String value) {
            addCriterion("vc_Item >", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Item >=", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemLessThan(String value) {
            addCriterion("vc_Item <", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemLessThanOrEqualTo(String value) {
            addCriterion("vc_Item <=", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemLike(String value) {
            addCriterion("vc_Item like", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemNotLike(String value) {
            addCriterion("vc_Item not like", value, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemIn(List<String> values) {
            addCriterion("vc_Item in", values, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemNotIn(List<String> values) {
            addCriterion("vc_Item not in", values, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemBetween(String value1, String value2) {
            addCriterion("vc_Item between", value1, value2, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcItemNotBetween(String value1, String value2) {
            addCriterion("vc_Item not between", value1, value2, "vcItem");
            return (Criteria) this;
        }

        public Criteria andVcModelIsNull() {
            addCriterion("vc_Model is null");
            return (Criteria) this;
        }

        public Criteria andVcModelIsNotNull() {
            addCriterion("vc_Model is not null");
            return (Criteria) this;
        }

        public Criteria andVcModelEqualTo(String value) {
            addCriterion("vc_Model =", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelNotEqualTo(String value) {
            addCriterion("vc_Model <>", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelGreaterThan(String value) {
            addCriterion("vc_Model >", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Model >=", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelLessThan(String value) {
            addCriterion("vc_Model <", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelLessThanOrEqualTo(String value) {
            addCriterion("vc_Model <=", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelLike(String value) {
            addCriterion("vc_Model like", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelNotLike(String value) {
            addCriterion("vc_Model not like", value, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelIn(List<String> values) {
            addCriterion("vc_Model in", values, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelNotIn(List<String> values) {
            addCriterion("vc_Model not in", values, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelBetween(String value1, String value2) {
            addCriterion("vc_Model between", value1, value2, "vcModel");
            return (Criteria) this;
        }

        public Criteria andVcModelNotBetween(String value1, String value2) {
            addCriterion("vc_Model not between", value1, value2, "vcModel");
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