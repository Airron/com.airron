package com.airron.vo;

import java.util.ArrayList;
import java.util.List;

public class FileConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileConfigExample() {
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

        public Criteria andPfIdIsNull() {
            addCriterion("pf_id is null");
            return (Criteria) this;
        }

        public Criteria andPfIdIsNotNull() {
            addCriterion("pf_id is not null");
            return (Criteria) this;
        }

        public Criteria andPfIdEqualTo(Integer value) {
            addCriterion("pf_id =", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdNotEqualTo(Integer value) {
            addCriterion("pf_id <>", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdGreaterThan(Integer value) {
            addCriterion("pf_id >", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pf_id >=", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdLessThan(Integer value) {
            addCriterion("pf_id <", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdLessThanOrEqualTo(Integer value) {
            addCriterion("pf_id <=", value, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdIn(List<Integer> values) {
            addCriterion("pf_id in", values, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdNotIn(List<Integer> values) {
            addCriterion("pf_id not in", values, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdBetween(Integer value1, Integer value2) {
            addCriterion("pf_id between", value1, value2, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pf_id not between", value1, value2, "pfId");
            return (Criteria) this;
        }

        public Criteria andPfTypeIsNull() {
            addCriterion("pf_type is null");
            return (Criteria) this;
        }

        public Criteria andPfTypeIsNotNull() {
            addCriterion("pf_type is not null");
            return (Criteria) this;
        }

        public Criteria andPfTypeEqualTo(String value) {
            addCriterion("pf_type =", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotEqualTo(String value) {
            addCriterion("pf_type <>", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeGreaterThan(String value) {
            addCriterion("pf_type >", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pf_type >=", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeLessThan(String value) {
            addCriterion("pf_type <", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeLessThanOrEqualTo(String value) {
            addCriterion("pf_type <=", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeLike(String value) {
            addCriterion("pf_type like", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotLike(String value) {
            addCriterion("pf_type not like", value, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeIn(List<String> values) {
            addCriterion("pf_type in", values, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotIn(List<String> values) {
            addCriterion("pf_type not in", values, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeBetween(String value1, String value2) {
            addCriterion("pf_type between", value1, value2, "pfType");
            return (Criteria) this;
        }

        public Criteria andPfTypeNotBetween(String value1, String value2) {
            addCriterion("pf_type not between", value1, value2, "pfType");
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