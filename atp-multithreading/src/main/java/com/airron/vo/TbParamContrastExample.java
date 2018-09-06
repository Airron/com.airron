package com.airron.vo;

import java.util.ArrayList;
import java.util.List;

public class TbParamContrastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbParamContrastExample() {
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

        public Criteria andTbNoIsNull() {
            addCriterion("tb_no is null");
            return (Criteria) this;
        }

        public Criteria andTbNoIsNotNull() {
            addCriterion("tb_no is not null");
            return (Criteria) this;
        }

        public Criteria andTbNoEqualTo(Integer value) {
            addCriterion("tb_no =", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoNotEqualTo(Integer value) {
            addCriterion("tb_no <>", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoGreaterThan(Integer value) {
            addCriterion("tb_no >", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_no >=", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoLessThan(Integer value) {
            addCriterion("tb_no <", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoLessThanOrEqualTo(Integer value) {
            addCriterion("tb_no <=", value, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoIn(List<Integer> values) {
            addCriterion("tb_no in", values, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoNotIn(List<Integer> values) {
            addCriterion("tb_no not in", values, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoBetween(Integer value1, Integer value2) {
            addCriterion("tb_no between", value1, value2, "tbNo");
            return (Criteria) this;
        }

        public Criteria andTbNoNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_no not between", value1, value2, "tbNo");
            return (Criteria) this;
        }

        public Criteria andWesunNameIsNull() {
            addCriterion("wesun_name is null");
            return (Criteria) this;
        }

        public Criteria andWesunNameIsNotNull() {
            addCriterion("wesun_name is not null");
            return (Criteria) this;
        }

        public Criteria andWesunNameEqualTo(String value) {
            addCriterion("wesun_name =", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameNotEqualTo(String value) {
            addCriterion("wesun_name <>", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameGreaterThan(String value) {
            addCriterion("wesun_name >", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameGreaterThanOrEqualTo(String value) {
            addCriterion("wesun_name >=", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameLessThan(String value) {
            addCriterion("wesun_name <", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameLessThanOrEqualTo(String value) {
            addCriterion("wesun_name <=", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameLike(String value) {
            addCriterion("wesun_name like", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameNotLike(String value) {
            addCriterion("wesun_name not like", value, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameIn(List<String> values) {
            addCriterion("wesun_name in", values, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameNotIn(List<String> values) {
            addCriterion("wesun_name not in", values, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameBetween(String value1, String value2) {
            addCriterion("wesun_name between", value1, value2, "wesunName");
            return (Criteria) this;
        }

        public Criteria andWesunNameNotBetween(String value1, String value2) {
            addCriterion("wesun_name not between", value1, value2, "wesunName");
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

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataSizeIsNull() {
            addCriterion("data_size is null");
            return (Criteria) this;
        }

        public Criteria andDataSizeIsNotNull() {
            addCriterion("data_size is not null");
            return (Criteria) this;
        }

        public Criteria andDataSizeEqualTo(Integer value) {
            addCriterion("data_size =", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeNotEqualTo(Integer value) {
            addCriterion("data_size <>", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeGreaterThan(Integer value) {
            addCriterion("data_size >", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_size >=", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeLessThan(Integer value) {
            addCriterion("data_size <", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeLessThanOrEqualTo(Integer value) {
            addCriterion("data_size <=", value, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeIn(List<Integer> values) {
            addCriterion("data_size in", values, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeNotIn(List<Integer> values) {
            addCriterion("data_size not in", values, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeBetween(Integer value1, Integer value2) {
            addCriterion("data_size between", value1, value2, "dataSize");
            return (Criteria) this;
        }

        public Criteria andDataSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("data_size not between", value1, value2, "dataSize");
            return (Criteria) this;
        }

        public Criteria andExampleIsNull() {
            addCriterion("example is null");
            return (Criteria) this;
        }

        public Criteria andExampleIsNotNull() {
            addCriterion("example is not null");
            return (Criteria) this;
        }

        public Criteria andExampleEqualTo(String value) {
            addCriterion("example =", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotEqualTo(String value) {
            addCriterion("example <>", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleGreaterThan(String value) {
            addCriterion("example >", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleGreaterThanOrEqualTo(String value) {
            addCriterion("example >=", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLessThan(String value) {
            addCriterion("example <", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLessThanOrEqualTo(String value) {
            addCriterion("example <=", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleLike(String value) {
            addCriterion("example like", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotLike(String value) {
            addCriterion("example not like", value, "example");
            return (Criteria) this;
        }

        public Criteria andExampleIn(List<String> values) {
            addCriterion("example in", values, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotIn(List<String> values) {
            addCriterion("example not in", values, "example");
            return (Criteria) this;
        }

        public Criteria andExampleBetween(String value1, String value2) {
            addCriterion("example between", value1, value2, "example");
            return (Criteria) this;
        }

        public Criteria andExampleNotBetween(String value1, String value2) {
            addCriterion("example not between", value1, value2, "example");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeIsNull() {
            addCriterion("default_type is null");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeIsNotNull() {
            addCriterion("default_type is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeEqualTo(String value) {
            addCriterion("default_type =", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeNotEqualTo(String value) {
            addCriterion("default_type <>", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeGreaterThan(String value) {
            addCriterion("default_type >", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeGreaterThanOrEqualTo(String value) {
            addCriterion("default_type >=", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeLessThan(String value) {
            addCriterion("default_type <", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeLessThanOrEqualTo(String value) {
            addCriterion("default_type <=", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeLike(String value) {
            addCriterion("default_type like", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeNotLike(String value) {
            addCriterion("default_type not like", value, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeIn(List<String> values) {
            addCriterion("default_type in", values, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeNotIn(List<String> values) {
            addCriterion("default_type not in", values, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeBetween(String value1, String value2) {
            addCriterion("default_type between", value1, value2, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultTypeNotBetween(String value1, String value2) {
            addCriterion("default_type not between", value1, value2, "defaultType");
            return (Criteria) this;
        }

        public Criteria andDefaultNameIsNull() {
            addCriterion("default_name is null");
            return (Criteria) this;
        }

        public Criteria andDefaultNameIsNotNull() {
            addCriterion("default_name is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultNameEqualTo(String value) {
            addCriterion("default_name =", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameNotEqualTo(String value) {
            addCriterion("default_name <>", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameGreaterThan(String value) {
            addCriterion("default_name >", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameGreaterThanOrEqualTo(String value) {
            addCriterion("default_name >=", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameLessThan(String value) {
            addCriterion("default_name <", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameLessThanOrEqualTo(String value) {
            addCriterion("default_name <=", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameLike(String value) {
            addCriterion("default_name like", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameNotLike(String value) {
            addCriterion("default_name not like", value, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameIn(List<String> values) {
            addCriterion("default_name in", values, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameNotIn(List<String> values) {
            addCriterion("default_name not in", values, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameBetween(String value1, String value2) {
            addCriterion("default_name between", value1, value2, "defaultName");
            return (Criteria) this;
        }

        public Criteria andDefaultNameNotBetween(String value1, String value2) {
            addCriterion("default_name not between", value1, value2, "defaultName");
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