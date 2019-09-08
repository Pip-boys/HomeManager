package com.bibiboy.bean.equip;

import java.util.ArrayList;
import java.util.List;

public class EquipDataTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipDataTypeExample() {
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

        public Criteria andVcUnitIsNull() {
            addCriterion("vc_Unit is null");
            return (Criteria) this;
        }

        public Criteria andVcUnitIsNotNull() {
            addCriterion("vc_Unit is not null");
            return (Criteria) this;
        }

        public Criteria andVcUnitEqualTo(String value) {
            addCriterion("vc_Unit =", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitNotEqualTo(String value) {
            addCriterion("vc_Unit <>", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitGreaterThan(String value) {
            addCriterion("vc_Unit >", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Unit >=", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitLessThan(String value) {
            addCriterion("vc_Unit <", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitLessThanOrEqualTo(String value) {
            addCriterion("vc_Unit <=", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitLike(String value) {
            addCriterion("vc_Unit like", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitNotLike(String value) {
            addCriterion("vc_Unit not like", value, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitIn(List<String> values) {
            addCriterion("vc_Unit in", values, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitNotIn(List<String> values) {
            addCriterion("vc_Unit not in", values, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitBetween(String value1, String value2) {
            addCriterion("vc_Unit between", value1, value2, "vcUnit");
            return (Criteria) this;
        }

        public Criteria andVcUnitNotBetween(String value1, String value2) {
            addCriterion("vc_Unit not between", value1, value2, "vcUnit");
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