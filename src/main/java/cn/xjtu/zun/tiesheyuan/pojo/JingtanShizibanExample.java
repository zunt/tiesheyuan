package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JingtanShizibanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public JingtanShizibanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
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
     * This method corresponds to the database table jingtan_shiziban
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
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
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
     * This class corresponds to the database table jingtan_shiziban
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

        public Criteria andJtSzbidIsNull() {
            addCriterion("JT_SZBID is null");
            return (Criteria) this;
        }

        public Criteria andJtSzbidIsNotNull() {
            addCriterion("JT_SZBID is not null");
            return (Criteria) this;
        }

        public Criteria andJtSzbidEqualTo(Long value) {
            addCriterion("JT_SZBID =", value, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidNotEqualTo(Long value) {
            addCriterion("JT_SZBID <>", value, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidGreaterThan(Long value) {
            addCriterion("JT_SZBID >", value, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidGreaterThanOrEqualTo(Long value) {
            addCriterion("JT_SZBID >=", value, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidLessThan(Long value) {
            addCriterion("JT_SZBID <", value, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidLessThanOrEqualTo(Long value) {
            addCriterion("JT_SZBID <=", value, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidIn(List<Long> values) {
            addCriterion("JT_SZBID in", values, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidNotIn(List<Long> values) {
            addCriterion("JT_SZBID not in", values, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidBetween(Long value1, Long value2) {
            addCriterion("JT_SZBID between", value1, value2, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtSzbidNotBetween(Long value1, Long value2) {
            addCriterion("JT_SZBID not between", value1, value2, "jtSzbid");
            return (Criteria) this;
        }

        public Criteria andJtidIsNull() {
            addCriterion("JTID is null");
            return (Criteria) this;
        }

        public Criteria andJtidIsNotNull() {
            addCriterion("JTID is not null");
            return (Criteria) this;
        }

        public Criteria andJtidEqualTo(Long value) {
            addCriterion("JTID =", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidNotEqualTo(Long value) {
            addCriterion("JTID <>", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidGreaterThan(Long value) {
            addCriterion("JTID >", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidGreaterThanOrEqualTo(Long value) {
            addCriterion("JTID >=", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidLessThan(Long value) {
            addCriterion("JTID <", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidLessThanOrEqualTo(Long value) {
            addCriterion("JTID <=", value, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidIn(List<Long> values) {
            addCriterion("JTID in", values, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidNotIn(List<Long> values) {
            addCriterion("JTID not in", values, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidBetween(Long value1, Long value2) {
            addCriterion("JTID between", value1, value2, "jtid");
            return (Criteria) this;
        }

        public Criteria andJtidNotBetween(Long value1, Long value2) {
            addCriterion("JTID not between", value1, value2, "jtid");
            return (Criteria) this;
        }

        public Criteria andSydbsdIsNull() {
            addCriterion("SYDBSD is null");
            return (Criteria) this;
        }

        public Criteria andSydbsdIsNotNull() {
            addCriterion("SYDBSD is not null");
            return (Criteria) this;
        }

        public Criteria andSydbsdEqualTo(BigDecimal value) {
            addCriterion("SYDBSD =", value, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdNotEqualTo(BigDecimal value) {
            addCriterion("SYDBSD <>", value, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdGreaterThan(BigDecimal value) {
            addCriterion("SYDBSD >", value, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYDBSD >=", value, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdLessThan(BigDecimal value) {
            addCriterion("SYDBSD <", value, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYDBSD <=", value, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdIn(List<BigDecimal> values) {
            addCriterion("SYDBSD in", values, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdNotIn(List<BigDecimal> values) {
            addCriterion("SYDBSD not in", values, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYDBSD between", value1, value2, "sydbsd");
            return (Criteria) this;
        }

        public Criteria andSydbsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYDBSD not between", value1, value2, "sydbsd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jingtan_shiziban
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
     * This class corresponds to the database table jingtan_shiziban
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