package com.bibiboy.bean.equip;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisementInfoExample() {
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

        public Criteria andNTopIsNull() {
            addCriterion("n_Top is null");
            return (Criteria) this;
        }

        public Criteria andNTopIsNotNull() {
            addCriterion("n_Top is not null");
            return (Criteria) this;
        }

        public Criteria andNTopEqualTo(Integer value) {
            addCriterion("n_Top =", value, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopNotEqualTo(Integer value) {
            addCriterion("n_Top <>", value, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopGreaterThan(Integer value) {
            addCriterion("n_Top >", value, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Top >=", value, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopLessThan(Integer value) {
            addCriterion("n_Top <", value, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopLessThanOrEqualTo(Integer value) {
            addCriterion("n_Top <=", value, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopIn(List<Integer> values) {
            addCriterion("n_Top in", values, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopNotIn(List<Integer> values) {
            addCriterion("n_Top not in", values, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopBetween(Integer value1, Integer value2) {
            addCriterion("n_Top between", value1, value2, "nTop");
            return (Criteria) this;
        }

        public Criteria andNTopNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Top not between", value1, value2, "nTop");
            return (Criteria) this;
        }

        public Criteria andNSortIsNull() {
            addCriterion("n_Sort is null");
            return (Criteria) this;
        }

        public Criteria andNSortIsNotNull() {
            addCriterion("n_Sort is not null");
            return (Criteria) this;
        }

        public Criteria andNSortEqualTo(Integer value) {
            addCriterion("n_Sort =", value, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortNotEqualTo(Integer value) {
            addCriterion("n_Sort <>", value, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortGreaterThan(Integer value) {
            addCriterion("n_Sort >", value, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Sort >=", value, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortLessThan(Integer value) {
            addCriterion("n_Sort <", value, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortLessThanOrEqualTo(Integer value) {
            addCriterion("n_Sort <=", value, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortIn(List<Integer> values) {
            addCriterion("n_Sort in", values, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortNotIn(List<Integer> values) {
            addCriterion("n_Sort not in", values, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortBetween(Integer value1, Integer value2) {
            addCriterion("n_Sort between", value1, value2, "nSort");
            return (Criteria) this;
        }

        public Criteria andNSortNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Sort not between", value1, value2, "nSort");
            return (Criteria) this;
        }

        public Criteria andNEquipIsNull() {
            addCriterion("n_Equip is null");
            return (Criteria) this;
        }

        public Criteria andNEquipIsNotNull() {
            addCriterion("n_Equip is not null");
            return (Criteria) this;
        }

        public Criteria andNEquipEqualTo(Integer value) {
            addCriterion("n_Equip =", value, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipNotEqualTo(Integer value) {
            addCriterion("n_Equip <>", value, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipGreaterThan(Integer value) {
            addCriterion("n_Equip >", value, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Equip >=", value, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipLessThan(Integer value) {
            addCriterion("n_Equip <", value, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipLessThanOrEqualTo(Integer value) {
            addCriterion("n_Equip <=", value, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipIn(List<Integer> values) {
            addCriterion("n_Equip in", values, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipNotIn(List<Integer> values) {
            addCriterion("n_Equip not in", values, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipBetween(Integer value1, Integer value2) {
            addCriterion("n_Equip between", value1, value2, "nEquip");
            return (Criteria) this;
        }

        public Criteria andNEquipNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Equip not between", value1, value2, "nEquip");
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