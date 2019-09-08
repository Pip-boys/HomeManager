package com.bibiboy.bean.basic;

import java.util.ArrayList;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andVcSecurityNameIsNull() {
            addCriterion("vc_Security_Name is null");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameIsNotNull() {
            addCriterion("vc_Security_Name is not null");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameEqualTo(String value) {
            addCriterion("vc_Security_Name =", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameNotEqualTo(String value) {
            addCriterion("vc_Security_Name <>", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameGreaterThan(String value) {
            addCriterion("vc_Security_Name >", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Security_Name >=", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameLessThan(String value) {
            addCriterion("vc_Security_Name <", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameLessThanOrEqualTo(String value) {
            addCriterion("vc_Security_Name <=", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameLike(String value) {
            addCriterion("vc_Security_Name like", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameNotLike(String value) {
            addCriterion("vc_Security_Name not like", value, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameIn(List<String> values) {
            addCriterion("vc_Security_Name in", values, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameNotIn(List<String> values) {
            addCriterion("vc_Security_Name not in", values, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameBetween(String value1, String value2) {
            addCriterion("vc_Security_Name between", value1, value2, "vcSecurityName");
            return (Criteria) this;
        }

        public Criteria andVcSecurityNameNotBetween(String value1, String value2) {
            addCriterion("vc_Security_Name not between", value1, value2, "vcSecurityName");
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