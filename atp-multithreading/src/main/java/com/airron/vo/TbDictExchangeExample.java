package com.airron.vo;

import java.util.ArrayList;
import java.util.List;

public class TbDictExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDictExchangeExample() {
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

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNull() {
            addCriterion("sys_name is null");
            return (Criteria) this;
        }

        public Criteria andSysNameIsNotNull() {
            addCriterion("sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysNameEqualTo(String value) {
            addCriterion("sys_name =", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotEqualTo(String value) {
            addCriterion("sys_name <>", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThan(String value) {
            addCriterion("sys_name >", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_name >=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThan(String value) {
            addCriterion("sys_name <", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLessThanOrEqualTo(String value) {
            addCriterion("sys_name <=", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameLike(String value) {
            addCriterion("sys_name like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotLike(String value) {
            addCriterion("sys_name not like", value, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameIn(List<String> values) {
            addCriterion("sys_name in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotIn(List<String> values) {
            addCriterion("sys_name not in", values, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameBetween(String value1, String value2) {
            addCriterion("sys_name between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andSysNameNotBetween(String value1, String value2) {
            addCriterion("sys_name not between", value1, value2, "sysName");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeIsNull() {
            addCriterion("other_nanme is null");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeIsNotNull() {
            addCriterion("other_nanme is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeEqualTo(String value) {
            addCriterion("other_nanme =", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeNotEqualTo(String value) {
            addCriterion("other_nanme <>", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeGreaterThan(String value) {
            addCriterion("other_nanme >", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeGreaterThanOrEqualTo(String value) {
            addCriterion("other_nanme >=", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeLessThan(String value) {
            addCriterion("other_nanme <", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeLessThanOrEqualTo(String value) {
            addCriterion("other_nanme <=", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeLike(String value) {
            addCriterion("other_nanme like", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeNotLike(String value) {
            addCriterion("other_nanme not like", value, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeIn(List<String> values) {
            addCriterion("other_nanme in", values, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeNotIn(List<String> values) {
            addCriterion("other_nanme not in", values, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeBetween(String value1, String value2) {
            addCriterion("other_nanme between", value1, value2, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andOtherNanmeNotBetween(String value1, String value2) {
            addCriterion("other_nanme not between", value1, value2, "otherNanme");
            return (Criteria) this;
        }

        public Criteria andTbNameIsNull() {
            addCriterion("tb_name is null");
            return (Criteria) this;
        }

        public Criteria andTbNameIsNotNull() {
            addCriterion("tb_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbNameEqualTo(String value) {
            addCriterion("tb_name =", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotEqualTo(String value) {
            addCriterion("tb_name <>", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameGreaterThan(String value) {
            addCriterion("tb_name >", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameGreaterThanOrEqualTo(String value) {
            addCriterion("tb_name >=", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameLessThan(String value) {
            addCriterion("tb_name <", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameLessThanOrEqualTo(String value) {
            addCriterion("tb_name <=", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameLike(String value) {
            addCriterion("tb_name like", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotLike(String value) {
            addCriterion("tb_name not like", value, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameIn(List<String> values) {
            addCriterion("tb_name in", values, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotIn(List<String> values) {
            addCriterion("tb_name not in", values, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameBetween(String value1, String value2) {
            addCriterion("tb_name between", value1, value2, "tbName");
            return (Criteria) this;
        }

        public Criteria andTbNameNotBetween(String value1, String value2) {
            addCriterion("tb_name not between", value1, value2, "tbName");
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