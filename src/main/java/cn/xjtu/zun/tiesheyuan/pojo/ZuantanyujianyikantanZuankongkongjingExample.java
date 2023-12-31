package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZuantanyujianyikantanZuankongkongjingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public ZuantanyujianyikantanZuankongkongjingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
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
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
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

        public Criteria andZtyjyktZkkjidIsNull() {
            addCriterion("ZTYJYKT_ZKKJID is null");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidIsNotNull() {
            addCriterion("ZTYJYKT_ZKKJID is not null");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKKJID =", value, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidNotEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKKJID <>", value, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidGreaterThan(Long value) {
            addCriterion("ZTYJYKT_ZKKJID >", value, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidGreaterThanOrEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKKJID >=", value, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidLessThan(Long value) {
            addCriterion("ZTYJYKT_ZKKJID <", value, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidLessThanOrEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKKJID <=", value, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidIn(List<Long> values) {
            addCriterion("ZTYJYKT_ZKKJID in", values, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidNotIn(List<Long> values) {
            addCriterion("ZTYJYKT_ZKKJID not in", values, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidBetween(Long value1, Long value2) {
            addCriterion("ZTYJYKT_ZKKJID between", value1, value2, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkkjidNotBetween(Long value1, Long value2) {
            addCriterion("ZTYJYKT_ZKKJID not between", value1, value2, "ztyjyktZkkjid");
            return (Criteria) this;
        }

        public Criteria andZkidIsNull() {
            addCriterion("ZKID is null");
            return (Criteria) this;
        }

        public Criteria andZkidIsNotNull() {
            addCriterion("ZKID is not null");
            return (Criteria) this;
        }

        public Criteria andZkidEqualTo(Long value) {
            addCriterion("ZKID =", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidNotEqualTo(Long value) {
            addCriterion("ZKID <>", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidGreaterThan(Long value) {
            addCriterion("ZKID >", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidGreaterThanOrEqualTo(Long value) {
            addCriterion("ZKID >=", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidLessThan(Long value) {
            addCriterion("ZKID <", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidLessThanOrEqualTo(Long value) {
            addCriterion("ZKID <=", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidIn(List<Long> values) {
            addCriterion("ZKID in", values, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidNotIn(List<Long> values) {
            addCriterion("ZKID not in", values, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidBetween(Long value1, Long value2) {
            addCriterion("ZKID between", value1, value2, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidNotBetween(Long value1, Long value2) {
            addCriterion("ZKID not between", value1, value2, "zkid");
            return (Criteria) this;
        }

        public Criteria andQsksIsNull() {
            addCriterion("QSKS is null");
            return (Criteria) this;
        }

        public Criteria andQsksIsNotNull() {
            addCriterion("QSKS is not null");
            return (Criteria) this;
        }

        public Criteria andQsksEqualTo(BigDecimal value) {
            addCriterion("QSKS =", value, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksNotEqualTo(BigDecimal value) {
            addCriterion("QSKS <>", value, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksGreaterThan(BigDecimal value) {
            addCriterion("QSKS >", value, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QSKS >=", value, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksLessThan(BigDecimal value) {
            addCriterion("QSKS <", value, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QSKS <=", value, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksIn(List<BigDecimal> values) {
            addCriterion("QSKS in", values, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksNotIn(List<BigDecimal> values) {
            addCriterion("QSKS not in", values, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QSKS between", value1, value2, "qsks");
            return (Criteria) this;
        }

        public Criteria andQsksNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QSKS not between", value1, value2, "qsks");
            return (Criteria) this;
        }

        public Criteria andZkkjIsNull() {
            addCriterion("ZKKJ is null");
            return (Criteria) this;
        }

        public Criteria andZkkjIsNotNull() {
            addCriterion("ZKKJ is not null");
            return (Criteria) this;
        }

        public Criteria andZkkjEqualTo(BigDecimal value) {
            addCriterion("ZKKJ =", value, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjNotEqualTo(BigDecimal value) {
            addCriterion("ZKKJ <>", value, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjGreaterThan(BigDecimal value) {
            addCriterion("ZKKJ >", value, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZKKJ >=", value, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjLessThan(BigDecimal value) {
            addCriterion("ZKKJ <", value, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZKKJ <=", value, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjIn(List<BigDecimal> values) {
            addCriterion("ZKKJ in", values, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjNotIn(List<BigDecimal> values) {
            addCriterion("ZKKJ not in", values, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZKKJ between", value1, value2, "zkkj");
            return (Criteria) this;
        }

        public Criteria andZkkjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZKKJ not between", value1, value2, "zkkj");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 02 15:45:26 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zuantanyujianyikantan_zuankongkongjing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
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