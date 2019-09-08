package com.bibiboy.bean.equip;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipDataExample() {
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

        public Criteria andNShowIsNull() {
            addCriterion("n_Show is null");
            return (Criteria) this;
        }

        public Criteria andNShowIsNotNull() {
            addCriterion("n_Show is not null");
            return (Criteria) this;
        }

        public Criteria andNShowEqualTo(Integer value) {
            addCriterion("n_Show =", value, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowNotEqualTo(Integer value) {
            addCriterion("n_Show <>", value, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowGreaterThan(Integer value) {
            addCriterion("n_Show >", value, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Show >=", value, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowLessThan(Integer value) {
            addCriterion("n_Show <", value, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowLessThanOrEqualTo(Integer value) {
            addCriterion("n_Show <=", value, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowIn(List<Integer> values) {
            addCriterion("n_Show in", values, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowNotIn(List<Integer> values) {
            addCriterion("n_Show not in", values, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowBetween(Integer value1, Integer value2) {
            addCriterion("n_Show between", value1, value2, "nShow");
            return (Criteria) this;
        }

        public Criteria andNShowNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Show not between", value1, value2, "nShow");
            return (Criteria) this;
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

        public Criteria andVcDataNameIsNull() {
            addCriterion("vc_Data_Name is null");
            return (Criteria) this;
        }

        public Criteria andVcDataNameIsNotNull() {
            addCriterion("vc_Data_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVcDataNameEqualTo(String value) {
            addCriterion("vc_Data_Name =", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameNotEqualTo(String value) {
            addCriterion("vc_Data_Name <>", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameGreaterThan(String value) {
            addCriterion("vc_Data_Name >", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Data_Name >=", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameLessThan(String value) {
            addCriterion("vc_Data_Name <", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameLessThanOrEqualTo(String value) {
            addCriterion("vc_Data_Name <=", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameLike(String value) {
            addCriterion("vc_Data_Name like", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameNotLike(String value) {
            addCriterion("vc_Data_Name not like", value, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameIn(List<String> values) {
            addCriterion("vc_Data_Name in", values, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameNotIn(List<String> values) {
            addCriterion("vc_Data_Name not in", values, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameBetween(String value1, String value2) {
            addCriterion("vc_Data_Name between", value1, value2, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataNameNotBetween(String value1, String value2) {
            addCriterion("vc_Data_Name not between", value1, value2, "vcDataName");
            return (Criteria) this;
        }

        public Criteria andVcDataIsNull() {
            addCriterion("vc_Data is null");
            return (Criteria) this;
        }

        public Criteria andVcDataIsNotNull() {
            addCriterion("vc_Data is not null");
            return (Criteria) this;
        }

        public Criteria andVcDataEqualTo(String value) {
            addCriterion("vc_Data =", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataNotEqualTo(String value) {
            addCriterion("vc_Data <>", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataGreaterThan(String value) {
            addCriterion("vc_Data >", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Data >=", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataLessThan(String value) {
            addCriterion("vc_Data <", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataLessThanOrEqualTo(String value) {
            addCriterion("vc_Data <=", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataLike(String value) {
            addCriterion("vc_Data like", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataNotLike(String value) {
            addCriterion("vc_Data not like", value, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataIn(List<String> values) {
            addCriterion("vc_Data in", values, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataNotIn(List<String> values) {
            addCriterion("vc_Data not in", values, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataBetween(String value1, String value2) {
            addCriterion("vc_Data between", value1, value2, "vcData");
            return (Criteria) this;
        }

        public Criteria andVcDataNotBetween(String value1, String value2) {
            addCriterion("vc_Data not between", value1, value2, "vcData");
            return (Criteria) this;
        }

        public Criteria andDtCreIsNull() {
            addCriterion("dt_Cre is null");
            return (Criteria) this;
        }

        public Criteria andDtCreIsNotNull() {
            addCriterion("dt_Cre is not null");
            return (Criteria) this;
        }

        public Criteria andDtCreEqualTo(Date value) {
            addCriterion("dt_Cre =", value, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreNotEqualTo(Date value) {
            addCriterion("dt_Cre <>", value, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreGreaterThan(Date value) {
            addCriterion("dt_Cre >", value, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_Cre >=", value, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreLessThan(Date value) {
            addCriterion("dt_Cre <", value, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreLessThanOrEqualTo(Date value) {
            addCriterion("dt_Cre <=", value, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreIn(List<Date> values) {
            addCriterion("dt_Cre in", values, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreNotIn(List<Date> values) {
            addCriterion("dt_Cre not in", values, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreBetween(Date value1, Date value2) {
            addCriterion("dt_Cre between", value1, value2, "dtCre");
            return (Criteria) this;
        }

        public Criteria andDtCreNotBetween(Date value1, Date value2) {
            addCriterion("dt_Cre not between", value1, value2, "dtCre");
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