package com.bibiboy.bean.equip;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EquipDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipDetailExample() {
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

        public Criteria andNPidIsNull() {
            addCriterion("n_Pid is null");
            return (Criteria) this;
        }

        public Criteria andNPidIsNotNull() {
            addCriterion("n_Pid is not null");
            return (Criteria) this;
        }

        public Criteria andNPidEqualTo(Integer value) {
            addCriterion("n_Pid =", value, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidNotEqualTo(Integer value) {
            addCriterion("n_Pid <>", value, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidGreaterThan(Integer value) {
            addCriterion("n_Pid >", value, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Pid >=", value, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidLessThan(Integer value) {
            addCriterion("n_Pid <", value, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidLessThanOrEqualTo(Integer value) {
            addCriterion("n_Pid <=", value, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidIn(List<Integer> values) {
            addCriterion("n_Pid in", values, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidNotIn(List<Integer> values) {
            addCriterion("n_Pid not in", values, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidBetween(Integer value1, Integer value2) {
            addCriterion("n_Pid between", value1, value2, "nPid");
            return (Criteria) this;
        }

        public Criteria andNPidNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Pid not between", value1, value2, "nPid");
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

        public Criteria andDPriceIsNull() {
            addCriterion("d_Price is null");
            return (Criteria) this;
        }

        public Criteria andDPriceIsNotNull() {
            addCriterion("d_Price is not null");
            return (Criteria) this;
        }

        public Criteria andDPriceEqualTo(BigDecimal value) {
            addCriterion("d_Price =", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotEqualTo(BigDecimal value) {
            addCriterion("d_Price <>", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThan(BigDecimal value) {
            addCriterion("d_Price >", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("d_Price >=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThan(BigDecimal value) {
            addCriterion("d_Price <", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("d_Price <=", value, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceIn(List<BigDecimal> values) {
            addCriterion("d_Price in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotIn(List<BigDecimal> values) {
            addCriterion("d_Price not in", values, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d_Price between", value1, value2, "dPrice");
            return (Criteria) this;
        }

        public Criteria andDPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("d_Price not between", value1, value2, "dPrice");
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