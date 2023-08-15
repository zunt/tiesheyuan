package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShenheExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public ShenheExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMatchIsNull() {
            addCriterion("`match` is null");
            return (Criteria) this;
        }

        public Criteria andMatchIsNotNull() {
            addCriterion("`match` is not null");
            return (Criteria) this;
        }

        public Criteria andMatchEqualTo(Integer value) {
            addCriterion("`match` =", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotEqualTo(Integer value) {
            addCriterion("`match` <>", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThan(Integer value) {
            addCriterion("`match` >", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchGreaterThanOrEqualTo(Integer value) {
            addCriterion("`match` >=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThan(Integer value) {
            addCriterion("`match` <", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchLessThanOrEqualTo(Integer value) {
            addCriterion("`match` <=", value, "match");
            return (Criteria) this;
        }

        public Criteria andMatchIn(List<Integer> values) {
            addCriterion("`match` in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotIn(List<Integer> values) {
            addCriterion("`match` not in", values, "match");
            return (Criteria) this;
        }

        public Criteria andMatchBetween(Integer value1, Integer value2) {
            addCriterion("`match` between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andMatchNotBetween(Integer value1, Integer value2) {
            addCriterion("`match` not between", value1, value2, "match");
            return (Criteria) this;
        }

        public Criteria andFourIsNull() {
            addCriterion("four is null");
            return (Criteria) this;
        }

        public Criteria andFourIsNotNull() {
            addCriterion("four is not null");
            return (Criteria) this;
        }

        public Criteria andFourEqualTo(String value) {
            addCriterion("four =", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotEqualTo(String value) {
            addCriterion("four <>", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourGreaterThan(String value) {
            addCriterion("four >", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourGreaterThanOrEqualTo(String value) {
            addCriterion("four >=", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourLessThan(String value) {
            addCriterion("four <", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourLessThanOrEqualTo(String value) {
            addCriterion("four <=", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourLike(String value) {
            addCriterion("four like", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotLike(String value) {
            addCriterion("four not like", value, "four");
            return (Criteria) this;
        }

        public Criteria andFourIn(List<String> values) {
            addCriterion("four in", values, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotIn(List<String> values) {
            addCriterion("four not in", values, "four");
            return (Criteria) this;
        }

        public Criteria andFourBetween(String value1, String value2) {
            addCriterion("four between", value1, value2, "four");
            return (Criteria) this;
        }

        public Criteria andFourNotBetween(String value1, String value2) {
            addCriterion("four not between", value1, value2, "four");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("change_type like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("change_type not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andDiscribeIsNull() {
            addCriterion("discribe is null");
            return (Criteria) this;
        }

        public Criteria andDiscribeIsNotNull() {
            addCriterion("discribe is not null");
            return (Criteria) this;
        }

        public Criteria andDiscribeEqualTo(String value) {
            addCriterion("discribe =", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotEqualTo(String value) {
            addCriterion("discribe <>", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeGreaterThan(String value) {
            addCriterion("discribe >", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeGreaterThanOrEqualTo(String value) {
            addCriterion("discribe >=", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeLessThan(String value) {
            addCriterion("discribe <", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeLessThanOrEqualTo(String value) {
            addCriterion("discribe <=", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeLike(String value) {
            addCriterion("discribe like", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotLike(String value) {
            addCriterion("discribe not like", value, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeIn(List<String> values) {
            addCriterion("discribe in", values, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotIn(List<String> values) {
            addCriterion("discribe not in", values, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeBetween(String value1, String value2) {
            addCriterion("discribe between", value1, value2, "discribe");
            return (Criteria) this;
        }

        public Criteria andDiscribeNotBetween(String value1, String value2) {
            addCriterion("discribe not between", value1, value2, "discribe");
            return (Criteria) this;
        }

        public Criteria andPlanIsNull() {
            addCriterion("`plan` is null");
            return (Criteria) this;
        }

        public Criteria andPlanIsNotNull() {
            addCriterion("`plan` is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEqualTo(String value) {
            addCriterion("`plan` =", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotEqualTo(String value) {
            addCriterion("`plan` <>", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThan(String value) {
            addCriterion("`plan` >", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanGreaterThanOrEqualTo(String value) {
            addCriterion("`plan` >=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThan(String value) {
            addCriterion("`plan` <", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLessThanOrEqualTo(String value) {
            addCriterion("`plan` <=", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanLike(String value) {
            addCriterion("`plan` like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotLike(String value) {
            addCriterion("`plan` not like", value, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanIn(List<String> values) {
            addCriterion("`plan` in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotIn(List<String> values) {
            addCriterion("`plan` not in", values, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanBetween(String value1, String value2) {
            addCriterion("`plan` between", value1, value2, "plan");
            return (Criteria) this;
        }

        public Criteria andPlanNotBetween(String value1, String value2) {
            addCriterion("`plan` not between", value1, value2, "plan");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("`path` is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("`path` is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("`path` =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("`path` <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("`path` >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("`path` >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("`path` <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("`path` <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("`path` like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("`path` not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("`path` in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("`path` not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("`path` between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("`path` not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andXingchengIsNull() {
            addCriterion("xingcheng is null");
            return (Criteria) this;
        }

        public Criteria andXingchengIsNotNull() {
            addCriterion("xingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andXingchengEqualTo(String value) {
            addCriterion("xingcheng =", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengNotEqualTo(String value) {
            addCriterion("xingcheng <>", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengGreaterThan(String value) {
            addCriterion("xingcheng >", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengGreaterThanOrEqualTo(String value) {
            addCriterion("xingcheng >=", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengLessThan(String value) {
            addCriterion("xingcheng <", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengLessThanOrEqualTo(String value) {
            addCriterion("xingcheng <=", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengLike(String value) {
            addCriterion("xingcheng like", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengNotLike(String value) {
            addCriterion("xingcheng not like", value, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengIn(List<String> values) {
            addCriterion("xingcheng in", values, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengNotIn(List<String> values) {
            addCriterion("xingcheng not in", values, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengBetween(String value1, String value2) {
            addCriterion("xingcheng between", value1, value2, "xingcheng");
            return (Criteria) this;
        }

        public Criteria andXingchengNotBetween(String value1, String value2) {
            addCriterion("xingcheng not between", value1, value2, "xingcheng");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shenhe
     *
     * @mbg.generated do_not_delete_during_merge Thu Aug 03 17:47:06 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
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