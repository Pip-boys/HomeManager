package com.bibiboy.bean.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andNEquipIdIsNull() {
            addCriterion("n_Equip_Id is null");
            return (Criteria) this;
        }

        public Criteria andNEquipIdIsNotNull() {
            addCriterion("n_Equip_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNEquipIdEqualTo(Integer value) {
            addCriterion("n_Equip_Id =", value, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdNotEqualTo(Integer value) {
            addCriterion("n_Equip_Id <>", value, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdGreaterThan(Integer value) {
            addCriterion("n_Equip_Id >", value, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Equip_Id >=", value, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdLessThan(Integer value) {
            addCriterion("n_Equip_Id <", value, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_Equip_Id <=", value, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdIn(List<Integer> values) {
            addCriterion("n_Equip_Id in", values, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdNotIn(List<Integer> values) {
            addCriterion("n_Equip_Id not in", values, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdBetween(Integer value1, Integer value2) {
            addCriterion("n_Equip_Id between", value1, value2, "nEquipId");
            return (Criteria) this;
        }

        public Criteria andNEquipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Equip_Id not between", value1, value2, "nEquipId");
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

        public Criteria andDtOrderIsNull() {
            addCriterion("dt_Order is null");
            return (Criteria) this;
        }

        public Criteria andDtOrderIsNotNull() {
            addCriterion("dt_Order is not null");
            return (Criteria) this;
        }

        public Criteria andDtOrderEqualTo(Date value) {
            addCriterion("dt_Order =", value, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderNotEqualTo(Date value) {
            addCriterion("dt_Order <>", value, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderGreaterThan(Date value) {
            addCriterion("dt_Order >", value, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderGreaterThanOrEqualTo(Date value) {
            addCriterion("dt_Order >=", value, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderLessThan(Date value) {
            addCriterion("dt_Order <", value, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderLessThanOrEqualTo(Date value) {
            addCriterion("dt_Order <=", value, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderIn(List<Date> values) {
            addCriterion("dt_Order in", values, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderNotIn(List<Date> values) {
            addCriterion("dt_Order not in", values, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderBetween(Date value1, Date value2) {
            addCriterion("dt_Order between", value1, value2, "dtOrder");
            return (Criteria) this;
        }

        public Criteria andDtOrderNotBetween(Date value1, Date value2) {
            addCriterion("dt_Order not between", value1, value2, "dtOrder");
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