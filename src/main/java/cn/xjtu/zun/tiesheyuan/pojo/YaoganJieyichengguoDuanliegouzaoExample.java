package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class YaoganJieyichengguoDuanliegouzaoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public YaoganJieyichengguoDuanliegouzaoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
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
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
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
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_duanliegouzao
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
     * This class corresponds to the database table yaogan_jieyichengguo_duanliegouzao
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

        public Criteria andYgJycgDlgzidIsNull() {
            addCriterion("YG_JYCG_DLGZID is null");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidIsNotNull() {
            addCriterion("YG_JYCG_DLGZID is not null");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidEqualTo(Long value) {
            addCriterion("YG_JYCG_DLGZID =", value, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidNotEqualTo(Long value) {
            addCriterion("YG_JYCG_DLGZID <>", value, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidGreaterThan(Long value) {
            addCriterion("YG_JYCG_DLGZID >", value, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidGreaterThanOrEqualTo(Long value) {
            addCriterion("YG_JYCG_DLGZID >=", value, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidLessThan(Long value) {
            addCriterion("YG_JYCG_DLGZID <", value, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidLessThanOrEqualTo(Long value) {
            addCriterion("YG_JYCG_DLGZID <=", value, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidIn(List<Long> values) {
            addCriterion("YG_JYCG_DLGZID in", values, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidNotIn(List<Long> values) {
            addCriterion("YG_JYCG_DLGZID not in", values, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidBetween(Long value1, Long value2) {
            addCriterion("YG_JYCG_DLGZID between", value1, value2, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgDlgzidNotBetween(Long value1, Long value2) {
            addCriterion("YG_JYCG_DLGZID not between", value1, value2, "ygJycgDlgzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidIsNull() {
            addCriterion("YG_JYCGID is null");
            return (Criteria) this;
        }

        public Criteria andYgJycgidIsNotNull() {
            addCriterion("YG_JYCGID is not null");
            return (Criteria) this;
        }

        public Criteria andYgJycgidEqualTo(Long value) {
            addCriterion("YG_JYCGID =", value, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidNotEqualTo(Long value) {
            addCriterion("YG_JYCGID <>", value, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidGreaterThan(Long value) {
            addCriterion("YG_JYCGID >", value, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidGreaterThanOrEqualTo(Long value) {
            addCriterion("YG_JYCGID >=", value, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidLessThan(Long value) {
            addCriterion("YG_JYCGID <", value, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidLessThanOrEqualTo(Long value) {
            addCriterion("YG_JYCGID <=", value, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidIn(List<Long> values) {
            addCriterion("YG_JYCGID in", values, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidNotIn(List<Long> values) {
            addCriterion("YG_JYCGID not in", values, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidBetween(Long value1, Long value2) {
            addCriterion("YG_JYCGID between", value1, value2, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andYgJycgidNotBetween(Long value1, Long value2) {
            addCriterion("YG_JYCGID not between", value1, value2, "ygJycgid");
            return (Criteria) this;
        }

        public Criteria andLxIsNull() {
            addCriterion("LX is null");
            return (Criteria) this;
        }

        public Criteria andLxIsNotNull() {
            addCriterion("LX is not null");
            return (Criteria) this;
        }

        public Criteria andLxEqualTo(String value) {
            addCriterion("LX =", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotEqualTo(String value) {
            addCriterion("LX <>", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThan(String value) {
            addCriterion("LX >", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxGreaterThanOrEqualTo(String value) {
            addCriterion("LX >=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThan(String value) {
            addCriterion("LX <", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLessThanOrEqualTo(String value) {
            addCriterion("LX <=", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxLike(String value) {
            addCriterion("LX like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotLike(String value) {
            addCriterion("LX not like", value, "lx");
            return (Criteria) this;
        }

        public Criteria andLxIn(List<String> values) {
            addCriterion("LX in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotIn(List<String> values) {
            addCriterion("LX not in", values, "lx");
            return (Criteria) this;
        }

        public Criteria andLxBetween(String value1, String value2) {
            addCriterion("LX between", value1, value2, "lx");
            return (Criteria) this;
        }

        public Criteria andLxNotBetween(String value1, String value2) {
            addCriterion("LX not between", value1, value2, "lx");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yaogan_jieyichengguo_duanliegouzao
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
     * This class corresponds to the database table yaogan_jieyichengguo_duanliegouzao
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