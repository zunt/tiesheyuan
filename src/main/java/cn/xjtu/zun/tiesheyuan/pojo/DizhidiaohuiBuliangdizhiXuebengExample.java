package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DizhidiaohuiBuliangdizhiXuebengExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public DizhidiaohuiBuliangdizhiXuebengExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
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
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
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
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
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
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
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

        public Criteria andDzdhBldzXbidIsNull() {
            addCriterion("DZDH_BLDZ_XBID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidIsNotNull() {
            addCriterion("DZDH_BLDZ_XBID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_XBID =", value, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidNotEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_XBID <>", value, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidGreaterThan(Long value) {
            addCriterion("DZDH_BLDZ_XBID >", value, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_XBID >=", value, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidLessThan(Long value) {
            addCriterion("DZDH_BLDZ_XBID <", value, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_XBID <=", value, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidIn(List<Long> values) {
            addCriterion("DZDH_BLDZ_XBID in", values, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidNotIn(List<Long> values) {
            addCriterion("DZDH_BLDZ_XBID not in", values, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZ_XBID between", value1, value2, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzXbidNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZ_XBID not between", value1, value2, "dzdhBldzXbid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidIsNull() {
            addCriterion("DZDH_BLDZID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidIsNotNull() {
            addCriterion("DZDH_BLDZID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidEqualTo(Long value) {
            addCriterion("DZDH_BLDZID =", value, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidNotEqualTo(Long value) {
            addCriterion("DZDH_BLDZID <>", value, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidGreaterThan(Long value) {
            addCriterion("DZDH_BLDZID >", value, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZID >=", value, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidLessThan(Long value) {
            addCriterion("DZDH_BLDZID <", value, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZID <=", value, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidIn(List<Long> values) {
            addCriterion("DZDH_BLDZID in", values, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidNotIn(List<Long> values) {
            addCriterion("DZDH_BLDZID not in", values, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZID between", value1, value2, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzidNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZID not between", value1, value2, "dzdhBldzid");
            return (Criteria) this;
        }

        public Criteria andDjqmjIsNull() {
            addCriterion("DJQMJ is null");
            return (Criteria) this;
        }

        public Criteria andDjqmjIsNotNull() {
            addCriterion("DJQMJ is not null");
            return (Criteria) this;
        }

        public Criteria andDjqmjEqualTo(BigDecimal value) {
            addCriterion("DJQMJ =", value, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjNotEqualTo(BigDecimal value) {
            addCriterion("DJQMJ <>", value, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjGreaterThan(BigDecimal value) {
            addCriterion("DJQMJ >", value, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DJQMJ >=", value, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjLessThan(BigDecimal value) {
            addCriterion("DJQMJ <", value, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DJQMJ <=", value, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjIn(List<BigDecimal> values) {
            addCriterion("DJQMJ in", values, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjNotIn(List<BigDecimal> values) {
            addCriterion("DJQMJ not in", values, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DJQMJ between", value1, value2, "djqmj");
            return (Criteria) this;
        }

        public Criteria andDjqmjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DJQMJ not between", value1, value2, "djqmj");
            return (Criteria) this;
        }

        public Criteria andZgcdIsNull() {
            addCriterion("ZGCD is null");
            return (Criteria) this;
        }

        public Criteria andZgcdIsNotNull() {
            addCriterion("ZGCD is not null");
            return (Criteria) this;
        }

        public Criteria andZgcdEqualTo(BigDecimal value) {
            addCriterion("ZGCD =", value, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdNotEqualTo(BigDecimal value) {
            addCriterion("ZGCD <>", value, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdGreaterThan(BigDecimal value) {
            addCriterion("ZGCD >", value, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZGCD >=", value, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdLessThan(BigDecimal value) {
            addCriterion("ZGCD <", value, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZGCD <=", value, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdIn(List<BigDecimal> values) {
            addCriterion("ZGCD in", values, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdNotIn(List<BigDecimal> values) {
            addCriterion("ZGCD not in", values, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZGCD between", value1, value2, "zgcd");
            return (Criteria) this;
        }

        public Criteria andZgcdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZGCD not between", value1, value2, "zgcd");
            return (Criteria) this;
        }

        public Criteria andPjjpIsNull() {
            addCriterion("PJJP is null");
            return (Criteria) this;
        }

        public Criteria andPjjpIsNotNull() {
            addCriterion("PJJP is not null");
            return (Criteria) this;
        }

        public Criteria andPjjpEqualTo(BigDecimal value) {
            addCriterion("PJJP =", value, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpNotEqualTo(BigDecimal value) {
            addCriterion("PJJP <>", value, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpGreaterThan(BigDecimal value) {
            addCriterion("PJJP >", value, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PJJP >=", value, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpLessThan(BigDecimal value) {
            addCriterion("PJJP <", value, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PJJP <=", value, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpIn(List<BigDecimal> values) {
            addCriterion("PJJP in", values, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpNotIn(List<BigDecimal> values) {
            addCriterion("PJJP not in", values, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PJJP between", value1, value2, "pjjp");
            return (Criteria) this;
        }

        public Criteria andPjjpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PJJP not between", value1, value2, "pjjp");
            return (Criteria) this;
        }

        public Criteria andWhcdIsNull() {
            addCriterion("WHCD is null");
            return (Criteria) this;
        }

        public Criteria andWhcdIsNotNull() {
            addCriterion("WHCD is not null");
            return (Criteria) this;
        }

        public Criteria andWhcdEqualTo(String value) {
            addCriterion("WHCD =", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotEqualTo(String value) {
            addCriterion("WHCD <>", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdGreaterThan(String value) {
            addCriterion("WHCD >", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdGreaterThanOrEqualTo(String value) {
            addCriterion("WHCD >=", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLessThan(String value) {
            addCriterion("WHCD <", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLessThanOrEqualTo(String value) {
            addCriterion("WHCD <=", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLike(String value) {
            addCriterion("WHCD like", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotLike(String value) {
            addCriterion("WHCD not like", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdIn(List<String> values) {
            addCriterion("WHCD in", values, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotIn(List<String> values) {
            addCriterion("WHCD not in", values, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdBetween(String value1, String value2) {
            addCriterion("WHCD between", value1, value2, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotBetween(String value1, String value2) {
            addCriterion("WHCD not between", value1, value2, "whcd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
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
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_xuebeng
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