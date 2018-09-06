package com.airron.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarnProPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarnProPlanExample() {
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

        public Criteria andWnProLockNoIsNull() {
            addCriterion("wn_pro_lock_no is null");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoIsNotNull() {
            addCriterion("wn_pro_lock_no is not null");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoEqualTo(String value) {
            addCriterion("wn_pro_lock_no =", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoNotEqualTo(String value) {
            addCriterion("wn_pro_lock_no <>", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoGreaterThan(String value) {
            addCriterion("wn_pro_lock_no >", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_lock_no >=", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoLessThan(String value) {
            addCriterion("wn_pro_lock_no <", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_lock_no <=", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoLike(String value) {
            addCriterion("wn_pro_lock_no like", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoNotLike(String value) {
            addCriterion("wn_pro_lock_no not like", value, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoIn(List<String> values) {
            addCriterion("wn_pro_lock_no in", values, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoNotIn(List<String> values) {
            addCriterion("wn_pro_lock_no not in", values, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoBetween(String value1, String value2) {
            addCriterion("wn_pro_lock_no between", value1, value2, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProLockNoNotBetween(String value1, String value2) {
            addCriterion("wn_pro_lock_no not between", value1, value2, "wnProLockNo");
            return (Criteria) this;
        }

        public Criteria andWnProStatusIsNull() {
            addCriterion("wn_pro_status is null");
            return (Criteria) this;
        }

        public Criteria andWnProStatusIsNotNull() {
            addCriterion("wn_pro_status is not null");
            return (Criteria) this;
        }

        public Criteria andWnProStatusEqualTo(String value) {
            addCriterion("wn_pro_status =", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusNotEqualTo(String value) {
            addCriterion("wn_pro_status <>", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusGreaterThan(String value) {
            addCriterion("wn_pro_status >", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_status >=", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusLessThan(String value) {
            addCriterion("wn_pro_status <", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_status <=", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusLike(String value) {
            addCriterion("wn_pro_status like", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusNotLike(String value) {
            addCriterion("wn_pro_status not like", value, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusIn(List<String> values) {
            addCriterion("wn_pro_status in", values, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusNotIn(List<String> values) {
            addCriterion("wn_pro_status not in", values, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusBetween(String value1, String value2) {
            addCriterion("wn_pro_status between", value1, value2, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProStatusNotBetween(String value1, String value2) {
            addCriterion("wn_pro_status not between", value1, value2, "wnProStatus");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanIsNull() {
            addCriterion("wn_pro_if_clean is null");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanIsNotNull() {
            addCriterion("wn_pro_if_clean is not null");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanEqualTo(String value) {
            addCriterion("wn_pro_if_clean =", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanNotEqualTo(String value) {
            addCriterion("wn_pro_if_clean <>", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanGreaterThan(String value) {
            addCriterion("wn_pro_if_clean >", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_if_clean >=", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanLessThan(String value) {
            addCriterion("wn_pro_if_clean <", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_if_clean <=", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanLike(String value) {
            addCriterion("wn_pro_if_clean like", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanNotLike(String value) {
            addCriterion("wn_pro_if_clean not like", value, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanIn(List<String> values) {
            addCriterion("wn_pro_if_clean in", values, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanNotIn(List<String> values) {
            addCriterion("wn_pro_if_clean not in", values, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanBetween(String value1, String value2) {
            addCriterion("wn_pro_if_clean between", value1, value2, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProIfCleanNotBetween(String value1, String value2) {
            addCriterion("wn_pro_if_clean not between", value1, value2, "wnProIfClean");
            return (Criteria) this;
        }

        public Criteria andWnProDeptIsNull() {
            addCriterion("wn_pro_dept is null");
            return (Criteria) this;
        }

        public Criteria andWnProDeptIsNotNull() {
            addCriterion("wn_pro_dept is not null");
            return (Criteria) this;
        }

        public Criteria andWnProDeptEqualTo(String value) {
            addCriterion("wn_pro_dept =", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptNotEqualTo(String value) {
            addCriterion("wn_pro_dept <>", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptGreaterThan(String value) {
            addCriterion("wn_pro_dept >", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_dept >=", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptLessThan(String value) {
            addCriterion("wn_pro_dept <", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_dept <=", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptLike(String value) {
            addCriterion("wn_pro_dept like", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptNotLike(String value) {
            addCriterion("wn_pro_dept not like", value, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptIn(List<String> values) {
            addCriterion("wn_pro_dept in", values, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptNotIn(List<String> values) {
            addCriterion("wn_pro_dept not in", values, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptBetween(String value1, String value2) {
            addCriterion("wn_pro_dept between", value1, value2, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProDeptNotBetween(String value1, String value2) {
            addCriterion("wn_pro_dept not between", value1, value2, "wnProDept");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateIsNull() {
            addCriterion("wn_pro_input_date is null");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateIsNotNull() {
            addCriterion("wn_pro_input_date is not null");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateEqualTo(Date value) {
            addCriterion("wn_pro_input_date =", value, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateNotEqualTo(Date value) {
            addCriterion("wn_pro_input_date <>", value, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateGreaterThan(Date value) {
            addCriterion("wn_pro_input_date >", value, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("wn_pro_input_date >=", value, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateLessThan(Date value) {
            addCriterion("wn_pro_input_date <", value, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateLessThanOrEqualTo(Date value) {
            addCriterion("wn_pro_input_date <=", value, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateIn(List<Date> values) {
            addCriterion("wn_pro_input_date in", values, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateNotIn(List<Date> values) {
            addCriterion("wn_pro_input_date not in", values, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateBetween(Date value1, Date value2) {
            addCriterion("wn_pro_input_date between", value1, value2, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProInputDateNotBetween(Date value1, Date value2) {
            addCriterion("wn_pro_input_date not between", value1, value2, "wnProInputDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateIsNull() {
            addCriterion("wn_pro_date is null");
            return (Criteria) this;
        }

        public Criteria andWnProDateIsNotNull() {
            addCriterion("wn_pro_date is not null");
            return (Criteria) this;
        }

        public Criteria andWnProDateEqualTo(Date value) {
            addCriterion("wn_pro_date =", value, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateNotEqualTo(Date value) {
            addCriterion("wn_pro_date <>", value, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateGreaterThan(Date value) {
            addCriterion("wn_pro_date >", value, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateGreaterThanOrEqualTo(Date value) {
            addCriterion("wn_pro_date >=", value, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateLessThan(Date value) {
            addCriterion("wn_pro_date <", value, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateLessThanOrEqualTo(Date value) {
            addCriterion("wn_pro_date <=", value, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateIn(List<Date> values) {
            addCriterion("wn_pro_date in", values, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateNotIn(List<Date> values) {
            addCriterion("wn_pro_date not in", values, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateBetween(Date value1, Date value2) {
            addCriterion("wn_pro_date between", value1, value2, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProDateNotBetween(Date value1, Date value2) {
            addCriterion("wn_pro_date not between", value1, value2, "wnProDate");
            return (Criteria) this;
        }

        public Criteria andWnProLineIsNull() {
            addCriterion("wn_pro_line is null");
            return (Criteria) this;
        }

        public Criteria andWnProLineIsNotNull() {
            addCriterion("wn_pro_line is not null");
            return (Criteria) this;
        }

        public Criteria andWnProLineEqualTo(String value) {
            addCriterion("wn_pro_line =", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineNotEqualTo(String value) {
            addCriterion("wn_pro_line <>", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineGreaterThan(String value) {
            addCriterion("wn_pro_line >", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_line >=", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineLessThan(String value) {
            addCriterion("wn_pro_line <", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_line <=", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineLike(String value) {
            addCriterion("wn_pro_line like", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineNotLike(String value) {
            addCriterion("wn_pro_line not like", value, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineIn(List<String> values) {
            addCriterion("wn_pro_line in", values, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineNotIn(List<String> values) {
            addCriterion("wn_pro_line not in", values, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineBetween(String value1, String value2) {
            addCriterion("wn_pro_line between", value1, value2, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProLineNotBetween(String value1, String value2) {
            addCriterion("wn_pro_line not between", value1, value2, "wnProLine");
            return (Criteria) this;
        }

        public Criteria andWnProCodeIsNull() {
            addCriterion("wn_pro_code is null");
            return (Criteria) this;
        }

        public Criteria andWnProCodeIsNotNull() {
            addCriterion("wn_pro_code is not null");
            return (Criteria) this;
        }

        public Criteria andWnProCodeEqualTo(String value) {
            addCriterion("wn_pro_code =", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeNotEqualTo(String value) {
            addCriterion("wn_pro_code <>", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeGreaterThan(String value) {
            addCriterion("wn_pro_code >", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_code >=", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeLessThan(String value) {
            addCriterion("wn_pro_code <", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_code <=", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeLike(String value) {
            addCriterion("wn_pro_code like", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeNotLike(String value) {
            addCriterion("wn_pro_code not like", value, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeIn(List<String> values) {
            addCriterion("wn_pro_code in", values, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeNotIn(List<String> values) {
            addCriterion("wn_pro_code not in", values, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeBetween(String value1, String value2) {
            addCriterion("wn_pro_code between", value1, value2, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProCodeNotBetween(String value1, String value2) {
            addCriterion("wn_pro_code not between", value1, value2, "wnProCode");
            return (Criteria) this;
        }

        public Criteria andWnProNameIsNull() {
            addCriterion("wn_pro_name is null");
            return (Criteria) this;
        }

        public Criteria andWnProNameIsNotNull() {
            addCriterion("wn_pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andWnProNameEqualTo(String value) {
            addCriterion("wn_pro_name =", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameNotEqualTo(String value) {
            addCriterion("wn_pro_name <>", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameGreaterThan(String value) {
            addCriterion("wn_pro_name >", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_name >=", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameLessThan(String value) {
            addCriterion("wn_pro_name <", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_name <=", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameLike(String value) {
            addCriterion("wn_pro_name like", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameNotLike(String value) {
            addCriterion("wn_pro_name not like", value, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameIn(List<String> values) {
            addCriterion("wn_pro_name in", values, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameNotIn(List<String> values) {
            addCriterion("wn_pro_name not in", values, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameBetween(String value1, String value2) {
            addCriterion("wn_pro_name between", value1, value2, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNameNotBetween(String value1, String value2) {
            addCriterion("wn_pro_name not between", value1, value2, "wnProName");
            return (Criteria) this;
        }

        public Criteria andWnProNumIsNull() {
            addCriterion("wn_pro_num is null");
            return (Criteria) this;
        }

        public Criteria andWnProNumIsNotNull() {
            addCriterion("wn_pro_num is not null");
            return (Criteria) this;
        }

        public Criteria andWnProNumEqualTo(Integer value) {
            addCriterion("wn_pro_num =", value, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumNotEqualTo(Integer value) {
            addCriterion("wn_pro_num <>", value, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumGreaterThan(Integer value) {
            addCriterion("wn_pro_num >", value, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wn_pro_num >=", value, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumLessThan(Integer value) {
            addCriterion("wn_pro_num <", value, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumLessThanOrEqualTo(Integer value) {
            addCriterion("wn_pro_num <=", value, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumIn(List<Integer> values) {
            addCriterion("wn_pro_num in", values, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumNotIn(List<Integer> values) {
            addCriterion("wn_pro_num not in", values, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumBetween(Integer value1, Integer value2) {
            addCriterion("wn_pro_num between", value1, value2, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wn_pro_num not between", value1, value2, "wnProNum");
            return (Criteria) this;
        }

        public Criteria andWnProUserIsNull() {
            addCriterion("wn_pro_user is null");
            return (Criteria) this;
        }

        public Criteria andWnProUserIsNotNull() {
            addCriterion("wn_pro_user is not null");
            return (Criteria) this;
        }

        public Criteria andWnProUserEqualTo(String value) {
            addCriterion("wn_pro_user =", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserNotEqualTo(String value) {
            addCriterion("wn_pro_user <>", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserGreaterThan(String value) {
            addCriterion("wn_pro_user >", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserGreaterThanOrEqualTo(String value) {
            addCriterion("wn_pro_user >=", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserLessThan(String value) {
            addCriterion("wn_pro_user <", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserLessThanOrEqualTo(String value) {
            addCriterion("wn_pro_user <=", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserLike(String value) {
            addCriterion("wn_pro_user like", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserNotLike(String value) {
            addCriterion("wn_pro_user not like", value, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserIn(List<String> values) {
            addCriterion("wn_pro_user in", values, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserNotIn(List<String> values) {
            addCriterion("wn_pro_user not in", values, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserBetween(String value1, String value2) {
            addCriterion("wn_pro_user between", value1, value2, "wnProUser");
            return (Criteria) this;
        }

        public Criteria andWnProUserNotBetween(String value1, String value2) {
            addCriterion("wn_pro_user not between", value1, value2, "wnProUser");
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