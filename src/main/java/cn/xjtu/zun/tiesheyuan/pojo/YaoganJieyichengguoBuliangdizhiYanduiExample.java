package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YaoganJieyichengguoBuliangdizhiYanduiExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public YaoganJieyichengguoBuliangdizhiYanduiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
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
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
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
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
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
     * This class corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
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

        public Criteria andYgJycgBldzYdidIsNull() {
            addCriterion("YG_JYCG_BLDZ_YDID is null");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidIsNotNull() {
            addCriterion("YG_JYCG_BLDZ_YDID is not null");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZ_YDID =", value, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidNotEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZ_YDID <>", value, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidGreaterThan(Long value) {
            addCriterion("YG_JYCG_BLDZ_YDID >", value, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidGreaterThanOrEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZ_YDID >=", value, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidLessThan(Long value) {
            addCriterion("YG_JYCG_BLDZ_YDID <", value, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidLessThanOrEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZ_YDID <=", value, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidIn(List<Long> values) {
            addCriterion("YG_JYCG_BLDZ_YDID in", values, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidNotIn(List<Long> values) {
            addCriterion("YG_JYCG_BLDZ_YDID not in", values, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidBetween(Long value1, Long value2) {
            addCriterion("YG_JYCG_BLDZ_YDID between", value1, value2, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzYdidNotBetween(Long value1, Long value2) {
            addCriterion("YG_JYCG_BLDZ_YDID not between", value1, value2, "ygJycgBldzYdid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidIsNull() {
            addCriterion("YG_JYCG_BLDZID is null");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidIsNotNull() {
            addCriterion("YG_JYCG_BLDZID is not null");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZID =", value, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidNotEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZID <>", value, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidGreaterThan(Long value) {
            addCriterion("YG_JYCG_BLDZID >", value, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidGreaterThanOrEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZID >=", value, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidLessThan(Long value) {
            addCriterion("YG_JYCG_BLDZID <", value, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidLessThanOrEqualTo(Long value) {
            addCriterion("YG_JYCG_BLDZID <=", value, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidIn(List<Long> values) {
            addCriterion("YG_JYCG_BLDZID in", values, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidNotIn(List<Long> values) {
            addCriterion("YG_JYCG_BLDZID not in", values, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidBetween(Long value1, Long value2) {
            addCriterion("YG_JYCG_BLDZID between", value1, value2, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andYgJycgBldzidNotBetween(Long value1, Long value2) {
            addCriterion("YG_JYCG_BLDZID not between", value1, value2, "ygJycgBldzid");
            return (Criteria) this;
        }

        public Criteria andZbNIsNull() {
            addCriterion("ZB_N is null");
            return (Criteria) this;
        }

        public Criteria andZbNIsNotNull() {
            addCriterion("ZB_N is not null");
            return (Criteria) this;
        }

        public Criteria andZbNEqualTo(BigDecimal value) {
            addCriterion("ZB_N =", value, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNNotEqualTo(BigDecimal value) {
            addCriterion("ZB_N <>", value, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNGreaterThan(BigDecimal value) {
            addCriterion("ZB_N >", value, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZB_N >=", value, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNLessThan(BigDecimal value) {
            addCriterion("ZB_N <", value, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZB_N <=", value, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNIn(List<BigDecimal> values) {
            addCriterion("ZB_N in", values, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNNotIn(List<BigDecimal> values) {
            addCriterion("ZB_N not in", values, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZB_N between", value1, value2, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbNNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZB_N not between", value1, value2, "zbN");
            return (Criteria) this;
        }

        public Criteria andZbEIsNull() {
            addCriterion("ZB_E is null");
            return (Criteria) this;
        }

        public Criteria andZbEIsNotNull() {
            addCriterion("ZB_E is not null");
            return (Criteria) this;
        }

        public Criteria andZbEEqualTo(BigDecimal value) {
            addCriterion("ZB_E =", value, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbENotEqualTo(BigDecimal value) {
            addCriterion("ZB_E <>", value, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbEGreaterThan(BigDecimal value) {
            addCriterion("ZB_E >", value, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbEGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZB_E >=", value, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbELessThan(BigDecimal value) {
            addCriterion("ZB_E <", value, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbELessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZB_E <=", value, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbEIn(List<BigDecimal> values) {
            addCriterion("ZB_E in", values, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbENotIn(List<BigDecimal> values) {
            addCriterion("ZB_E not in", values, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbEBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZB_E between", value1, value2, "zbE");
            return (Criteria) this;
        }

        public Criteria andZbENotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZB_E not between", value1, value2, "zbE");
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

        public Criteria andMjIsNull() {
            addCriterion("MJ is null");
            return (Criteria) this;
        }

        public Criteria andMjIsNotNull() {
            addCriterion("MJ is not null");
            return (Criteria) this;
        }

        public Criteria andMjEqualTo(BigDecimal value) {
            addCriterion("MJ =", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotEqualTo(BigDecimal value) {
            addCriterion("MJ <>", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThan(BigDecimal value) {
            addCriterion("MJ >", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MJ >=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThan(BigDecimal value) {
            addCriterion("MJ <", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MJ <=", value, "mj");
            return (Criteria) this;
        }

        public Criteria andMjIn(List<BigDecimal> values) {
            addCriterion("MJ in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotIn(List<BigDecimal> values) {
            addCriterion("MJ not in", values, "mj");
            return (Criteria) this;
        }

        public Criteria andMjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MJ between", value1, value2, "mj");
            return (Criteria) this;
        }

        public Criteria andMjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MJ not between", value1, value2, "mj");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
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
     * This class corresponds to the database table yaogan_jieyichengguo_buliangdizhi_yandui
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