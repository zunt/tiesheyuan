package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class GuancedianExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public GuancedianExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
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
     * This method corresponds to the database table guancedian
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
     * This method corresponds to the database table guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guancedian
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
     * This class corresponds to the database table guancedian
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

        public Criteria andGcdidIsNull() {
            addCriterion("GCDID is null");
            return (Criteria) this;
        }

        public Criteria andGcdidIsNotNull() {
            addCriterion("GCDID is not null");
            return (Criteria) this;
        }

        public Criteria andGcdidEqualTo(Long value) {
            addCriterion("GCDID =", value, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidNotEqualTo(Long value) {
            addCriterion("GCDID <>", value, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidGreaterThan(Long value) {
            addCriterion("GCDID >", value, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidGreaterThanOrEqualTo(Long value) {
            addCriterion("GCDID >=", value, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidLessThan(Long value) {
            addCriterion("GCDID <", value, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidLessThanOrEqualTo(Long value) {
            addCriterion("GCDID <=", value, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidIn(List<Long> values) {
            addCriterion("GCDID in", values, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidNotIn(List<Long> values) {
            addCriterion("GCDID not in", values, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidBetween(Long value1, Long value2) {
            addCriterion("GCDID between", value1, value2, "gcdid");
            return (Criteria) this;
        }

        public Criteria andGcdidNotBetween(Long value1, Long value2) {
            addCriterion("GCDID not between", value1, value2, "gcdid");
            return (Criteria) this;
        }

        public Criteria andKtdidIsNull() {
            addCriterion("KTDID is null");
            return (Criteria) this;
        }

        public Criteria andKtdidIsNotNull() {
            addCriterion("KTDID is not null");
            return (Criteria) this;
        }

        public Criteria andKtdidEqualTo(Long value) {
            addCriterion("KTDID =", value, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidNotEqualTo(Long value) {
            addCriterion("KTDID <>", value, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidGreaterThan(Long value) {
            addCriterion("KTDID >", value, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidGreaterThanOrEqualTo(Long value) {
            addCriterion("KTDID >=", value, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidLessThan(Long value) {
            addCriterion("KTDID <", value, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidLessThanOrEqualTo(Long value) {
            addCriterion("KTDID <=", value, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidIn(List<Long> values) {
            addCriterion("KTDID in", values, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidNotIn(List<Long> values) {
            addCriterion("KTDID not in", values, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidBetween(Long value1, Long value2) {
            addCriterion("KTDID between", value1, value2, "ktdid");
            return (Criteria) this;
        }

        public Criteria andKtdidNotBetween(Long value1, Long value2) {
            addCriterion("KTDID not between", value1, value2, "ktdid");
            return (Criteria) this;
        }

        public Criteria andGcdlxIsNull() {
            addCriterion("GCDLX is null");
            return (Criteria) this;
        }

        public Criteria andGcdlxIsNotNull() {
            addCriterion("GCDLX is not null");
            return (Criteria) this;
        }

        public Criteria andGcdlxEqualTo(String value) {
            addCriterion("GCDLX =", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxNotEqualTo(String value) {
            addCriterion("GCDLX <>", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxGreaterThan(String value) {
            addCriterion("GCDLX >", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxGreaterThanOrEqualTo(String value) {
            addCriterion("GCDLX >=", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxLessThan(String value) {
            addCriterion("GCDLX <", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxLessThanOrEqualTo(String value) {
            addCriterion("GCDLX <=", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxLike(String value) {
            addCriterion("GCDLX like", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxNotLike(String value) {
            addCriterion("GCDLX not like", value, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxIn(List<String> values) {
            addCriterion("GCDLX in", values, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxNotIn(List<String> values) {
            addCriterion("GCDLX not in", values, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxBetween(String value1, String value2) {
            addCriterion("GCDLX between", value1, value2, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andGcdlxNotBetween(String value1, String value2) {
            addCriterion("GCDLX not between", value1, value2, "gcdlx");
            return (Criteria) this;
        }

        public Criteria andSmIsNull() {
            addCriterion("SM is null");
            return (Criteria) this;
        }

        public Criteria andSmIsNotNull() {
            addCriterion("SM is not null");
            return (Criteria) this;
        }

        public Criteria andSmEqualTo(String value) {
            addCriterion("SM =", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotEqualTo(String value) {
            addCriterion("SM <>", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmGreaterThan(String value) {
            addCriterion("SM >", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmGreaterThanOrEqualTo(String value) {
            addCriterion("SM >=", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLessThan(String value) {
            addCriterion("SM <", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLessThanOrEqualTo(String value) {
            addCriterion("SM <=", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmLike(String value) {
            addCriterion("SM like", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotLike(String value) {
            addCriterion("SM not like", value, "sm");
            return (Criteria) this;
        }

        public Criteria andSmIn(List<String> values) {
            addCriterion("SM in", values, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotIn(List<String> values) {
            addCriterion("SM not in", values, "sm");
            return (Criteria) this;
        }

        public Criteria andSmBetween(String value1, String value2) {
            addCriterion("SM between", value1, value2, "sm");
            return (Criteria) this;
        }

        public Criteria andSmNotBetween(String value1, String value2) {
            addCriterion("SM not between", value1, value2, "sm");
            return (Criteria) this;
        }

        public Criteria andDcdwIsNull() {
            addCriterion("DCDW is null");
            return (Criteria) this;
        }

        public Criteria andDcdwIsNotNull() {
            addCriterion("DCDW is not null");
            return (Criteria) this;
        }

        public Criteria andDcdwEqualTo(String value) {
            addCriterion("DCDW =", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwNotEqualTo(String value) {
            addCriterion("DCDW <>", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwGreaterThan(String value) {
            addCriterion("DCDW >", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwGreaterThanOrEqualTo(String value) {
            addCriterion("DCDW >=", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwLessThan(String value) {
            addCriterion("DCDW <", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwLessThanOrEqualTo(String value) {
            addCriterion("DCDW <=", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwLike(String value) {
            addCriterion("DCDW like", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwNotLike(String value) {
            addCriterion("DCDW not like", value, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwIn(List<String> values) {
            addCriterion("DCDW in", values, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwNotIn(List<String> values) {
            addCriterion("DCDW not in", values, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwBetween(String value1, String value2) {
            addCriterion("DCDW between", value1, value2, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDcdwNotBetween(String value1, String value2) {
            addCriterion("DCDW not between", value1, value2, "dcdw");
            return (Criteria) this;
        }

        public Criteria andDhrIsNull() {
            addCriterion("DHR is null");
            return (Criteria) this;
        }

        public Criteria andDhrIsNotNull() {
            addCriterion("DHR is not null");
            return (Criteria) this;
        }

        public Criteria andDhrEqualTo(String value) {
            addCriterion("DHR =", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrNotEqualTo(String value) {
            addCriterion("DHR <>", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrGreaterThan(String value) {
            addCriterion("DHR >", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrGreaterThanOrEqualTo(String value) {
            addCriterion("DHR >=", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrLessThan(String value) {
            addCriterion("DHR <", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrLessThanOrEqualTo(String value) {
            addCriterion("DHR <=", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrLike(String value) {
            addCriterion("DHR like", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrNotLike(String value) {
            addCriterion("DHR not like", value, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrIn(List<String> values) {
            addCriterion("DHR in", values, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrNotIn(List<String> values) {
            addCriterion("DHR not in", values, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrBetween(String value1, String value2) {
            addCriterion("DHR between", value1, value2, "dhr");
            return (Criteria) this;
        }

        public Criteria andDhrNotBetween(String value1, String value2) {
            addCriterion("DHR not between", value1, value2, "dhr");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table guancedian
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
     * This class corresponds to the database table guancedian
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