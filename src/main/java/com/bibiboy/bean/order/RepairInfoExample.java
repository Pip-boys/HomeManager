package com.bibiboy.bean.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairInfoExample() {
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

        public Criteria andNRepairerIdIsNull() {
            addCriterion("n_Repairer_Id is null");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdIsNotNull() {
            addCriterion("n_Repairer_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdEqualTo(Integer value) {
            addCriterion("n_Repairer_Id =", value, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdNotEqualTo(Integer value) {
            addCriterion("n_Repairer_Id <>", value, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdGreaterThan(Integer value) {
            addCriterion("n_Repairer_Id >", value, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Repairer_Id >=", value, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdLessThan(Integer value) {
            addCriterion("n_Repairer_Id <", value, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_Repairer_Id <=", value, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdIn(List<Integer> values) {
            addCriterion("n_Repairer_Id in", values, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdNotIn(List<Integer> values) {
            addCriterion("n_Repairer_Id not in", values, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdBetween(Integer value1, Integer value2) {
            addCriterion("n_Repairer_Id between", value1, value2, "nRepairerId");
            return (Criteria) this;
        }

        public Criteria andNRepairerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Repairer_Id not between", value1, value2, "nRepairerId");
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

        public Criteria andVcTypeIsNull() {
            addCriterion("vc_Type is null");
            return (Criteria) this;
        }

        public Criteria andVcTypeIsNotNull() {
            addCriterion("vc_Type is not null");
            return (Criteria) this;
        }

        public Criteria andVcTypeEqualTo(String value) {
            addCriterion("vc_Type =", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotEqualTo(String value) {
            addCriterion("vc_Type <>", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeGreaterThan(String value) {
            addCriterion("vc_Type >", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Type >=", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLessThan(String value) {
            addCriterion("vc_Type <", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLessThanOrEqualTo(String value) {
            addCriterion("vc_Type <=", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeLike(String value) {
            addCriterion("vc_Type like", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotLike(String value) {
            addCriterion("vc_Type not like", value, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeIn(List<String> values) {
            addCriterion("vc_Type in", values, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotIn(List<String> values) {
            addCriterion("vc_Type not in", values, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeBetween(String value1, String value2) {
            addCriterion("vc_Type between", value1, value2, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcTypeNotBetween(String value1, String value2) {
            addCriterion("vc_Type not between", value1, value2, "vcType");
            return (Criteria) this;
        }

        public Criteria andVcReasonIsNull() {
            addCriterion("vc_Reason is null");
            return (Criteria) this;
        }

        public Criteria andVcReasonIsNotNull() {
            addCriterion("vc_Reason is not null");
            return (Criteria) this;
        }

        public Criteria andVcReasonEqualTo(String value) {
            addCriterion("vc_Reason =", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonNotEqualTo(String value) {
            addCriterion("vc_Reason <>", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonGreaterThan(String value) {
            addCriterion("vc_Reason >", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Reason >=", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonLessThan(String value) {
            addCriterion("vc_Reason <", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonLessThanOrEqualTo(String value) {
            addCriterion("vc_Reason <=", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonLike(String value) {
            addCriterion("vc_Reason like", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonNotLike(String value) {
            addCriterion("vc_Reason not like", value, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonIn(List<String> values) {
            addCriterion("vc_Reason in", values, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonNotIn(List<String> values) {
            addCriterion("vc_Reason not in", values, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonBetween(String value1, String value2) {
            addCriterion("vc_Reason between", value1, value2, "vcReason");
            return (Criteria) this;
        }

        public Criteria andVcReasonNotBetween(String value1, String value2) {
            addCriterion("vc_Reason not between", value1, value2, "vcReason");
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