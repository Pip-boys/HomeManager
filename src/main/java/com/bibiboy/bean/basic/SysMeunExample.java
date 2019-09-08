package com.bibiboy.bean.basic;

import java.util.ArrayList;
import java.util.List;

public class SysMeunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMeunExample() {
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

        public Criteria andNLevelIsNull() {
            addCriterion("n_Level is null");
            return (Criteria) this;
        }

        public Criteria andNLevelIsNotNull() {
            addCriterion("n_Level is not null");
            return (Criteria) this;
        }

        public Criteria andNLevelEqualTo(Integer value) {
            addCriterion("n_Level =", value, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelNotEqualTo(Integer value) {
            addCriterion("n_Level <>", value, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelGreaterThan(Integer value) {
            addCriterion("n_Level >", value, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_Level >=", value, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelLessThan(Integer value) {
            addCriterion("n_Level <", value, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelLessThanOrEqualTo(Integer value) {
            addCriterion("n_Level <=", value, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelIn(List<Integer> values) {
            addCriterion("n_Level in", values, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelNotIn(List<Integer> values) {
            addCriterion("n_Level not in", values, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelBetween(Integer value1, Integer value2) {
            addCriterion("n_Level between", value1, value2, "nLevel");
            return (Criteria) this;
        }

        public Criteria andNLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("n_Level not between", value1, value2, "nLevel");
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

        public Criteria andVcMemoIsNull() {
            addCriterion("vc_Memo is null");
            return (Criteria) this;
        }

        public Criteria andVcMemoIsNotNull() {
            addCriterion("vc_Memo is not null");
            return (Criteria) this;
        }

        public Criteria andVcMemoEqualTo(String value) {
            addCriterion("vc_Memo =", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoNotEqualTo(String value) {
            addCriterion("vc_Memo <>", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoGreaterThan(String value) {
            addCriterion("vc_Memo >", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoGreaterThanOrEqualTo(String value) {
            addCriterion("vc_Memo >=", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoLessThan(String value) {
            addCriterion("vc_Memo <", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoLessThanOrEqualTo(String value) {
            addCriterion("vc_Memo <=", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoLike(String value) {
            addCriterion("vc_Memo like", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoNotLike(String value) {
            addCriterion("vc_Memo not like", value, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoIn(List<String> values) {
            addCriterion("vc_Memo in", values, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoNotIn(List<String> values) {
            addCriterion("vc_Memo not in", values, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoBetween(String value1, String value2) {
            addCriterion("vc_Memo between", value1, value2, "vcMemo");
            return (Criteria) this;
        }

        public Criteria andVcMemoNotBetween(String value1, String value2) {
            addCriterion("vc_Memo not between", value1, value2, "vcMemo");
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