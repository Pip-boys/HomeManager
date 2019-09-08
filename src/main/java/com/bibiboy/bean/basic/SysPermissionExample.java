package com.bibiboy.bean.basic;

import java.util.ArrayList;
import java.util.List;

public class SysPermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPermissionExample() {
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

        public Criteria andVcUrlIsNull() {
            addCriterion("vc_Url is null");
            return (Criteria) this;
        }

        public Criteria andVcUrlIsNotNull() {
            addCriterion("vc_Url is not null");
            return (Criteria) this;
        }

        public Criteria andVcUrlEqualTo(String value) {
            addCriterion("vc_Url =", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlNotEqualTo(String value) {
            addCriterion("vc_Url <>", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlGreaterThan(String value) {
            addCriterion("vc_Url >", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Url >=", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlLessThan(String value) {
            addCriterion("vc_Url <", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlLessThanOrEqualTo(String value) {
            addCriterion("vc_Url <=", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlLike(String value) {
            addCriterion("vc_Url like", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlNotLike(String value) {
            addCriterion("vc_Url not like", value, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlIn(List<String> values) {
            addCriterion("vc_Url in", values, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlNotIn(List<String> values) {
            addCriterion("vc_Url not in", values, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlBetween(String value1, String value2) {
            addCriterion("vc_Url between", value1, value2, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andVcUrlNotBetween(String value1, String value2) {
            addCriterion("vc_Url not between", value1, value2, "vcUrl");
            return (Criteria) this;
        }

        public Criteria andNRoleIdIsNull() {
            addCriterion("n_role_id is null");
            return (Criteria) this;
        }

        public Criteria andNRoleIdIsNotNull() {
            addCriterion("n_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andNRoleIdEqualTo(Integer value) {
            addCriterion("n_role_id =", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdNotEqualTo(Integer value) {
            addCriterion("n_role_id <>", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdGreaterThan(Integer value) {
            addCriterion("n_role_id >", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_role_id >=", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdLessThan(Integer value) {
            addCriterion("n_role_id <", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_role_id <=", value, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdIn(List<Integer> values) {
            addCriterion("n_role_id in", values, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdNotIn(List<Integer> values) {
            addCriterion("n_role_id not in", values, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("n_role_id between", value1, value2, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andNRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_role_id not between", value1, value2, "nRoleId");
            return (Criteria) this;
        }

        public Criteria andVcPermissionIsNull() {
            addCriterion("vc_permission is null");
            return (Criteria) this;
        }

        public Criteria andVcPermissionIsNotNull() {
            addCriterion("vc_permission is not null");
            return (Criteria) this;
        }

        public Criteria andVcPermissionEqualTo(String value) {
            addCriterion("vc_permission =", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionNotEqualTo(String value) {
            addCriterion("vc_permission <>", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionGreaterThan(String value) {
            addCriterion("vc_permission >", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("vc_permission >=", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionLessThan(String value) {
            addCriterion("vc_permission <", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionLessThanOrEqualTo(String value) {
            addCriterion("vc_permission <=", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionLike(String value) {
            addCriterion("vc_permission like", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionNotLike(String value) {
            addCriterion("vc_permission not like", value, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionIn(List<String> values) {
            addCriterion("vc_permission in", values, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionNotIn(List<String> values) {
            addCriterion("vc_permission not in", values, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionBetween(String value1, String value2) {
            addCriterion("vc_permission between", value1, value2, "vcPermission");
            return (Criteria) this;
        }

        public Criteria andVcPermissionNotBetween(String value1, String value2) {
            addCriterion("vc_permission not between", value1, value2, "vcPermission");
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