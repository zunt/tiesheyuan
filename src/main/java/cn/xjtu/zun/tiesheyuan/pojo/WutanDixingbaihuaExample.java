package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WutanDixingbaihuaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public WutanDixingbaihuaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
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
     * This method corresponds to the database table wutan_dixingbaihua
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
     * This method corresponds to the database table wutan_dixingbaihua
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua
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
     * This class corresponds to the database table wutan_dixingbaihua
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

        public Criteria andWtDxbhidIsNull() {
            addCriterion("WT_DXBHID is null");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidIsNotNull() {
            addCriterion("WT_DXBHID is not null");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidEqualTo(Long value) {
            addCriterion("WT_DXBHID =", value, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidNotEqualTo(Long value) {
            addCriterion("WT_DXBHID <>", value, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidGreaterThan(Long value) {
            addCriterion("WT_DXBHID >", value, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidGreaterThanOrEqualTo(Long value) {
            addCriterion("WT_DXBHID >=", value, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidLessThan(Long value) {
            addCriterion("WT_DXBHID <", value, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidLessThanOrEqualTo(Long value) {
            addCriterion("WT_DXBHID <=", value, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidIn(List<Long> values) {
            addCriterion("WT_DXBHID in", values, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidNotIn(List<Long> values) {
            addCriterion("WT_DXBHID not in", values, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidBetween(Long value1, Long value2) {
            addCriterion("WT_DXBHID between", value1, value2, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtDxbhidNotBetween(Long value1, Long value2) {
            addCriterion("WT_DXBHID not between", value1, value2, "wtDxbhid");
            return (Criteria) this;
        }

        public Criteria andWtidIsNull() {
            addCriterion("WTID is null");
            return (Criteria) this;
        }

        public Criteria andWtidIsNotNull() {
            addCriterion("WTID is not null");
            return (Criteria) this;
        }

        public Criteria andWtidEqualTo(Long value) {
            addCriterion("WTID =", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidNotEqualTo(Long value) {
            addCriterion("WTID <>", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidGreaterThan(Long value) {
            addCriterion("WTID >", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidGreaterThanOrEqualTo(Long value) {
            addCriterion("WTID >=", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidLessThan(Long value) {
            addCriterion("WTID <", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidLessThanOrEqualTo(Long value) {
            addCriterion("WTID <=", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidIn(List<Long> values) {
            addCriterion("WTID in", values, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidNotIn(List<Long> values) {
            addCriterion("WTID not in", values, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidBetween(Long value1, Long value2) {
            addCriterion("WTID between", value1, value2, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidNotBetween(Long value1, Long value2) {
            addCriterion("WTID not between", value1, value2, "wtid");
            return (Criteria) this;
        }

        public Criteria andHzbIsNull() {
            addCriterion("HZB is null");
            return (Criteria) this;
        }

        public Criteria andHzbIsNotNull() {
            addCriterion("HZB is not null");
            return (Criteria) this;
        }

        public Criteria andHzbEqualTo(BigDecimal value) {
            addCriterion("HZB =", value, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbNotEqualTo(BigDecimal value) {
            addCriterion("HZB <>", value, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbGreaterThan(BigDecimal value) {
            addCriterion("HZB >", value, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HZB >=", value, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbLessThan(BigDecimal value) {
            addCriterion("HZB <", value, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HZB <=", value, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbIn(List<BigDecimal> values) {
            addCriterion("HZB in", values, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbNotIn(List<BigDecimal> values) {
            addCriterion("HZB not in", values, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HZB between", value1, value2, "hzb");
            return (Criteria) this;
        }

        public Criteria andHzbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HZB not between", value1, value2, "hzb");
            return (Criteria) this;
        }

        public Criteria andGcIsNull() {
            addCriterion("GC is null");
            return (Criteria) this;
        }

        public Criteria andGcIsNotNull() {
            addCriterion("GC is not null");
            return (Criteria) this;
        }

        public Criteria andGcEqualTo(BigDecimal value) {
            addCriterion("GC =", value, "gc");
            return (Criteria) this;
        }

        public Criteria andGcNotEqualTo(BigDecimal value) {
            addCriterion("GC <>", value, "gc");
            return (Criteria) this;
        }

        public Criteria andGcGreaterThan(BigDecimal value) {
            addCriterion("GC >", value, "gc");
            return (Criteria) this;
        }

        public Criteria andGcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GC >=", value, "gc");
            return (Criteria) this;
        }

        public Criteria andGcLessThan(BigDecimal value) {
            addCriterion("GC <", value, "gc");
            return (Criteria) this;
        }

        public Criteria andGcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GC <=", value, "gc");
            return (Criteria) this;
        }

        public Criteria andGcIn(List<BigDecimal> values) {
            addCriterion("GC in", values, "gc");
            return (Criteria) this;
        }

        public Criteria andGcNotIn(List<BigDecimal> values) {
            addCriterion("GC not in", values, "gc");
            return (Criteria) this;
        }

        public Criteria andGcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GC between", value1, value2, "gc");
            return (Criteria) this;
        }

        public Criteria andGcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GC not between", value1, value2, "gc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wutan_dixingbaihua
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
     * This class corresponds to the database table wutan_dixingbaihua
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