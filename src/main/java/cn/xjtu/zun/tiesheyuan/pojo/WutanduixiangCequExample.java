package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WutanduixiangCequExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public WutanduixiangCequExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
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
     * This method corresponds to the database table wutanduixiang_cequ
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
     * This method corresponds to the database table wutanduixiang_cequ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cequ
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
     * This class corresponds to the database table wutanduixiang_cequ
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

        public Criteria andWtdxCqidIsNull() {
            addCriterion("WTDX_CQID is null");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidIsNotNull() {
            addCriterion("WTDX_CQID is not null");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidEqualTo(Long value) {
            addCriterion("WTDX_CQID =", value, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidNotEqualTo(Long value) {
            addCriterion("WTDX_CQID <>", value, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidGreaterThan(Long value) {
            addCriterion("WTDX_CQID >", value, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidGreaterThanOrEqualTo(Long value) {
            addCriterion("WTDX_CQID >=", value, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidLessThan(Long value) {
            addCriterion("WTDX_CQID <", value, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidLessThanOrEqualTo(Long value) {
            addCriterion("WTDX_CQID <=", value, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidIn(List<Long> values) {
            addCriterion("WTDX_CQID in", values, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidNotIn(List<Long> values) {
            addCriterion("WTDX_CQID not in", values, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidBetween(Long value1, Long value2) {
            addCriterion("WTDX_CQID between", value1, value2, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxCqidNotBetween(Long value1, Long value2) {
            addCriterion("WTDX_CQID not between", value1, value2, "wtdxCqid");
            return (Criteria) this;
        }

        public Criteria andWtdxidIsNull() {
            addCriterion("WTDXID is null");
            return (Criteria) this;
        }

        public Criteria andWtdxidIsNotNull() {
            addCriterion("WTDXID is not null");
            return (Criteria) this;
        }

        public Criteria andWtdxidEqualTo(Long value) {
            addCriterion("WTDXID =", value, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidNotEqualTo(Long value) {
            addCriterion("WTDXID <>", value, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidGreaterThan(Long value) {
            addCriterion("WTDXID >", value, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidGreaterThanOrEqualTo(Long value) {
            addCriterion("WTDXID >=", value, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidLessThan(Long value) {
            addCriterion("WTDXID <", value, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidLessThanOrEqualTo(Long value) {
            addCriterion("WTDXID <=", value, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidIn(List<Long> values) {
            addCriterion("WTDXID in", values, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidNotIn(List<Long> values) {
            addCriterion("WTDXID not in", values, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidBetween(Long value1, Long value2) {
            addCriterion("WTDXID between", value1, value2, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andWtdxidNotBetween(Long value1, Long value2) {
            addCriterion("WTDXID not between", value1, value2, "wtdxid");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("X is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("X is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(BigDecimal value) {
            addCriterion("X =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(BigDecimal value) {
            addCriterion("X <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(BigDecimal value) {
            addCriterion("X >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("X >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(BigDecimal value) {
            addCriterion("X <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("X <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<BigDecimal> values) {
            addCriterion("X in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<BigDecimal> values) {
            addCriterion("X not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("X between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("X not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("Y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("Y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(BigDecimal value) {
            addCriterion("Y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(BigDecimal value) {
            addCriterion("Y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(BigDecimal value) {
            addCriterion("Y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(BigDecimal value) {
            addCriterion("Y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<BigDecimal> values) {
            addCriterion("Y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<BigDecimal> values) {
            addCriterion("Y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andZIsNull() {
            addCriterion("Z is null");
            return (Criteria) this;
        }

        public Criteria andZIsNotNull() {
            addCriterion("Z is not null");
            return (Criteria) this;
        }

        public Criteria andZEqualTo(BigDecimal value) {
            addCriterion("Z =", value, "z");
            return (Criteria) this;
        }

        public Criteria andZNotEqualTo(BigDecimal value) {
            addCriterion("Z <>", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThan(BigDecimal value) {
            addCriterion("Z >", value, "z");
            return (Criteria) this;
        }

        public Criteria andZGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Z >=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThan(BigDecimal value) {
            addCriterion("Z <", value, "z");
            return (Criteria) this;
        }

        public Criteria andZLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Z <=", value, "z");
            return (Criteria) this;
        }

        public Criteria andZIn(List<BigDecimal> values) {
            addCriterion("Z in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZNotIn(List<BigDecimal> values) {
            addCriterion("Z not in", values, "z");
            return (Criteria) this;
        }

        public Criteria andZBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Z between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andZNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Z not between", value1, value2, "z");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("`data` is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("`data` is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(String value) {
            addCriterion("`data` =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(String value) {
            addCriterion("`data` <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(String value) {
            addCriterion("`data` >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(String value) {
            addCriterion("`data` >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(String value) {
            addCriterion("`data` <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(String value) {
            addCriterion("`data` <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLike(String value) {
            addCriterion("`data` like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotLike(String value) {
            addCriterion("`data` not like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<String> values) {
            addCriterion("`data` in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<String> values) {
            addCriterion("`data` not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(String value1, String value2) {
            addCriterion("`data` between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(String value1, String value2) {
            addCriterion("`data` not between", value1, value2, "data");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wutanduixiang_cequ
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
     * This class corresponds to the database table wutanduixiang_cequ
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