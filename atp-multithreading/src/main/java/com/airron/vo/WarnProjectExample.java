package com.airron.vo;

import java.util.ArrayList;
import java.util.List;

public class WarnProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarnProjectExample() {
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

        public Criteria andWnFidIsNull() {
            addCriterion("wn_fid is null");
            return (Criteria) this;
        }

        public Criteria andWnFidIsNotNull() {
            addCriterion("wn_fid is not null");
            return (Criteria) this;
        }

        public Criteria andWnFidEqualTo(Integer value) {
            addCriterion("wn_fid =", value, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidNotEqualTo(Integer value) {
            addCriterion("wn_fid <>", value, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidGreaterThan(Integer value) {
            addCriterion("wn_fid >", value, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wn_fid >=", value, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidLessThan(Integer value) {
            addCriterion("wn_fid <", value, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidLessThanOrEqualTo(Integer value) {
            addCriterion("wn_fid <=", value, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidIn(List<Integer> values) {
            addCriterion("wn_fid in", values, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidNotIn(List<Integer> values) {
            addCriterion("wn_fid not in", values, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidBetween(Integer value1, Integer value2) {
            addCriterion("wn_fid between", value1, value2, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnFidNotBetween(Integer value1, Integer value2) {
            addCriterion("wn_fid not between", value1, value2, "wnFid");
            return (Criteria) this;
        }

        public Criteria andWnIdIsNull() {
            addCriterion("wn_id is null");
            return (Criteria) this;
        }

        public Criteria andWnIdIsNotNull() {
            addCriterion("wn_id is not null");
            return (Criteria) this;
        }

        public Criteria andWnIdEqualTo(Integer value) {
            addCriterion("wn_id =", value, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdNotEqualTo(Integer value) {
            addCriterion("wn_id <>", value, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdGreaterThan(Integer value) {
            addCriterion("wn_id >", value, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wn_id >=", value, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdLessThan(Integer value) {
            addCriterion("wn_id <", value, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdLessThanOrEqualTo(Integer value) {
            addCriterion("wn_id <=", value, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdIn(List<Integer> values) {
            addCriterion("wn_id in", values, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdNotIn(List<Integer> values) {
            addCriterion("wn_id not in", values, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdBetween(Integer value1, Integer value2) {
            addCriterion("wn_id between", value1, value2, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wn_id not between", value1, value2, "wnId");
            return (Criteria) this;
        }

        public Criteria andWnFnameIsNull() {
            addCriterion("wn_fname is null");
            return (Criteria) this;
        }

        public Criteria andWnFnameIsNotNull() {
            addCriterion("wn_fname is not null");
            return (Criteria) this;
        }

        public Criteria andWnFnameEqualTo(String value) {
            addCriterion("wn_fname =", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameNotEqualTo(String value) {
            addCriterion("wn_fname <>", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameGreaterThan(String value) {
            addCriterion("wn_fname >", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameGreaterThanOrEqualTo(String value) {
            addCriterion("wn_fname >=", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameLessThan(String value) {
            addCriterion("wn_fname <", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameLessThanOrEqualTo(String value) {
            addCriterion("wn_fname <=", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameLike(String value) {
            addCriterion("wn_fname like", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameNotLike(String value) {
            addCriterion("wn_fname not like", value, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameIn(List<String> values) {
            addCriterion("wn_fname in", values, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameNotIn(List<String> values) {
            addCriterion("wn_fname not in", values, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameBetween(String value1, String value2) {
            addCriterion("wn_fname between", value1, value2, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnFnameNotBetween(String value1, String value2) {
            addCriterion("wn_fname not between", value1, value2, "wnFname");
            return (Criteria) this;
        }

        public Criteria andWnNameIsNull() {
            addCriterion("wn_name is null");
            return (Criteria) this;
        }

        public Criteria andWnNameIsNotNull() {
            addCriterion("wn_name is not null");
            return (Criteria) this;
        }

        public Criteria andWnNameEqualTo(String value) {
            addCriterion("wn_name =", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameNotEqualTo(String value) {
            addCriterion("wn_name <>", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameGreaterThan(String value) {
            addCriterion("wn_name >", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameGreaterThanOrEqualTo(String value) {
            addCriterion("wn_name >=", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameLessThan(String value) {
            addCriterion("wn_name <", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameLessThanOrEqualTo(String value) {
            addCriterion("wn_name <=", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameLike(String value) {
            addCriterion("wn_name like", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameNotLike(String value) {
            addCriterion("wn_name not like", value, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameIn(List<String> values) {
            addCriterion("wn_name in", values, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameNotIn(List<String> values) {
            addCriterion("wn_name not in", values, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameBetween(String value1, String value2) {
            addCriterion("wn_name between", value1, value2, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnNameNotBetween(String value1, String value2) {
            addCriterion("wn_name not between", value1, value2, "wnName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameIsNull() {
            addCriterion("wn_file_name is null");
            return (Criteria) this;
        }

        public Criteria andWnFileNameIsNotNull() {
            addCriterion("wn_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andWnFileNameEqualTo(String value) {
            addCriterion("wn_file_name =", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameNotEqualTo(String value) {
            addCriterion("wn_file_name <>", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameGreaterThan(String value) {
            addCriterion("wn_file_name >", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("wn_file_name >=", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameLessThan(String value) {
            addCriterion("wn_file_name <", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameLessThanOrEqualTo(String value) {
            addCriterion("wn_file_name <=", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameLike(String value) {
            addCriterion("wn_file_name like", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameNotLike(String value) {
            addCriterion("wn_file_name not like", value, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameIn(List<String> values) {
            addCriterion("wn_file_name in", values, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameNotIn(List<String> values) {
            addCriterion("wn_file_name not in", values, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameBetween(String value1, String value2) {
            addCriterion("wn_file_name between", value1, value2, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnFileNameNotBetween(String value1, String value2) {
            addCriterion("wn_file_name not between", value1, value2, "wnFileName");
            return (Criteria) this;
        }

        public Criteria andWnStatusIsNull() {
            addCriterion("wn_status is null");
            return (Criteria) this;
        }

        public Criteria andWnStatusIsNotNull() {
            addCriterion("wn_status is not null");
            return (Criteria) this;
        }

        public Criteria andWnStatusEqualTo(String value) {
            addCriterion("wn_status =", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusNotEqualTo(String value) {
            addCriterion("wn_status <>", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusGreaterThan(String value) {
            addCriterion("wn_status >", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusGreaterThanOrEqualTo(String value) {
            addCriterion("wn_status >=", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusLessThan(String value) {
            addCriterion("wn_status <", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusLessThanOrEqualTo(String value) {
            addCriterion("wn_status <=", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusLike(String value) {
            addCriterion("wn_status like", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusNotLike(String value) {
            addCriterion("wn_status not like", value, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusIn(List<String> values) {
            addCriterion("wn_status in", values, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusNotIn(List<String> values) {
            addCriterion("wn_status not in", values, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusBetween(String value1, String value2) {
            addCriterion("wn_status between", value1, value2, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnStatusNotBetween(String value1, String value2) {
            addCriterion("wn_status not between", value1, value2, "wnStatus");
            return (Criteria) this;
        }

        public Criteria andWnForfeitIsNull() {
            addCriterion("wn_forfeit is null");
            return (Criteria) this;
        }

        public Criteria andWnForfeitIsNotNull() {
            addCriterion("wn_forfeit is not null");
            return (Criteria) this;
        }

        public Criteria andWnForfeitEqualTo(Integer value) {
            addCriterion("wn_forfeit =", value, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitNotEqualTo(Integer value) {
            addCriterion("wn_forfeit <>", value, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitGreaterThan(Integer value) {
            addCriterion("wn_forfeit >", value, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitGreaterThanOrEqualTo(Integer value) {
            addCriterion("wn_forfeit >=", value, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitLessThan(Integer value) {
            addCriterion("wn_forfeit <", value, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitLessThanOrEqualTo(Integer value) {
            addCriterion("wn_forfeit <=", value, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitIn(List<Integer> values) {
            addCriterion("wn_forfeit in", values, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitNotIn(List<Integer> values) {
            addCriterion("wn_forfeit not in", values, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitBetween(Integer value1, Integer value2) {
            addCriterion("wn_forfeit between", value1, value2, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnForfeitNotBetween(Integer value1, Integer value2) {
            addCriterion("wn_forfeit not between", value1, value2, "wnForfeit");
            return (Criteria) this;
        }

        public Criteria andWnCommentIsNull() {
            addCriterion("wn_comment is null");
            return (Criteria) this;
        }

        public Criteria andWnCommentIsNotNull() {
            addCriterion("wn_comment is not null");
            return (Criteria) this;
        }

        public Criteria andWnCommentEqualTo(String value) {
            addCriterion("wn_comment =", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentNotEqualTo(String value) {
            addCriterion("wn_comment <>", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentGreaterThan(String value) {
            addCriterion("wn_comment >", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentGreaterThanOrEqualTo(String value) {
            addCriterion("wn_comment >=", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentLessThan(String value) {
            addCriterion("wn_comment <", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentLessThanOrEqualTo(String value) {
            addCriterion("wn_comment <=", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentLike(String value) {
            addCriterion("wn_comment like", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentNotLike(String value) {
            addCriterion("wn_comment not like", value, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentIn(List<String> values) {
            addCriterion("wn_comment in", values, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentNotIn(List<String> values) {
            addCriterion("wn_comment not in", values, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentBetween(String value1, String value2) {
            addCriterion("wn_comment between", value1, value2, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnCommentNotBetween(String value1, String value2) {
            addCriterion("wn_comment not between", value1, value2, "wnComment");
            return (Criteria) this;
        }

        public Criteria andWnRulesIsNull() {
            addCriterion("wn_rules is null");
            return (Criteria) this;
        }

        public Criteria andWnRulesIsNotNull() {
            addCriterion("wn_rules is not null");
            return (Criteria) this;
        }

        public Criteria andWnRulesEqualTo(String value) {
            addCriterion("wn_rules =", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesNotEqualTo(String value) {
            addCriterion("wn_rules <>", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesGreaterThan(String value) {
            addCriterion("wn_rules >", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesGreaterThanOrEqualTo(String value) {
            addCriterion("wn_rules >=", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesLessThan(String value) {
            addCriterion("wn_rules <", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesLessThanOrEqualTo(String value) {
            addCriterion("wn_rules <=", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesLike(String value) {
            addCriterion("wn_rules like", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesNotLike(String value) {
            addCriterion("wn_rules not like", value, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesIn(List<String> values) {
            addCriterion("wn_rules in", values, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesNotIn(List<String> values) {
            addCriterion("wn_rules not in", values, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesBetween(String value1, String value2) {
            addCriterion("wn_rules between", value1, value2, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnRulesNotBetween(String value1, String value2) {
            addCriterion("wn_rules not between", value1, value2, "wnRules");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptIsNull() {
            addCriterion("wn_duty_dept is null");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptIsNotNull() {
            addCriterion("wn_duty_dept is not null");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptEqualTo(String value) {
            addCriterion("wn_duty_dept =", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptNotEqualTo(String value) {
            addCriterion("wn_duty_dept <>", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptGreaterThan(String value) {
            addCriterion("wn_duty_dept >", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("wn_duty_dept >=", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptLessThan(String value) {
            addCriterion("wn_duty_dept <", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptLessThanOrEqualTo(String value) {
            addCriterion("wn_duty_dept <=", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptLike(String value) {
            addCriterion("wn_duty_dept like", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptNotLike(String value) {
            addCriterion("wn_duty_dept not like", value, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptIn(List<String> values) {
            addCriterion("wn_duty_dept in", values, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptNotIn(List<String> values) {
            addCriterion("wn_duty_dept not in", values, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptBetween(String value1, String value2) {
            addCriterion("wn_duty_dept between", value1, value2, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnDutyDeptNotBetween(String value1, String value2) {
            addCriterion("wn_duty_dept not between", value1, value2, "wnDutyDept");
            return (Criteria) this;
        }

        public Criteria andWnTbNoIsNull() {
            addCriterion("wn_tb_no is null");
            return (Criteria) this;
        }

        public Criteria andWnTbNoIsNotNull() {
            addCriterion("wn_tb_no is not null");
            return (Criteria) this;
        }

        public Criteria andWnTbNoEqualTo(Integer value) {
            addCriterion("wn_tb_no =", value, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoNotEqualTo(Integer value) {
            addCriterion("wn_tb_no <>", value, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoGreaterThan(Integer value) {
            addCriterion("wn_tb_no >", value, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("wn_tb_no >=", value, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoLessThan(Integer value) {
            addCriterion("wn_tb_no <", value, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoLessThanOrEqualTo(Integer value) {
            addCriterion("wn_tb_no <=", value, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoIn(List<Integer> values) {
            addCriterion("wn_tb_no in", values, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoNotIn(List<Integer> values) {
            addCriterion("wn_tb_no not in", values, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoBetween(Integer value1, Integer value2) {
            addCriterion("wn_tb_no between", value1, value2, "wnTbNo");
            return (Criteria) this;
        }

        public Criteria andWnTbNoNotBetween(Integer value1, Integer value2) {
            addCriterion("wn_tb_no not between", value1, value2, "wnTbNo");
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