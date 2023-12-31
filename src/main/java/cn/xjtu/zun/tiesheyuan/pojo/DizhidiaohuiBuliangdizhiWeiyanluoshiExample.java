package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DizhidiaohuiBuliangdizhiWeiyanluoshiExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public DizhidiaohuiBuliangdizhiWeiyanluoshiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
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
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
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

        public Criteria andDzdhBldzWylsidIsNull() {
            addCriterion("DZDH_BLDZ_WYLSID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidIsNotNull() {
            addCriterion("DZDH_BLDZ_WYLSID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_WYLSID =", value, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidNotEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_WYLSID <>", value, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidGreaterThan(Long value) {
            addCriterion("DZDH_BLDZ_WYLSID >", value, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_WYLSID >=", value, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidLessThan(Long value) {
            addCriterion("DZDH_BLDZ_WYLSID <", value, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_WYLSID <=", value, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidIn(List<Long> values) {
            addCriterion("DZDH_BLDZ_WYLSID in", values, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidNotIn(List<Long> values) {
            addCriterion("DZDH_BLDZ_WYLSID not in", values, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZ_WYLSID between", value1, value2, "dzdhBldzWylsid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzWylsidNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZ_WYLSID not between", value1, value2, "dzdhBldzWylsid");
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

        public Criteria andYxIsNull() {
            addCriterion("YX is null");
            return (Criteria) this;
        }

        public Criteria andYxIsNotNull() {
            addCriterion("YX is not null");
            return (Criteria) this;
        }

        public Criteria andYxEqualTo(String value) {
            addCriterion("YX =", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotEqualTo(String value) {
            addCriterion("YX <>", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxGreaterThan(String value) {
            addCriterion("YX >", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxGreaterThanOrEqualTo(String value) {
            addCriterion("YX >=", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxLessThan(String value) {
            addCriterion("YX <", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxLessThanOrEqualTo(String value) {
            addCriterion("YX <=", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxLike(String value) {
            addCriterion("YX like", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotLike(String value) {
            addCriterion("YX not like", value, "yx");
            return (Criteria) this;
        }

        public Criteria andYxIn(List<String> values) {
            addCriterion("YX in", values, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotIn(List<String> values) {
            addCriterion("YX not in", values, "yx");
            return (Criteria) this;
        }

        public Criteria andYxBetween(String value1, String value2) {
            addCriterion("YX between", value1, value2, "yx");
            return (Criteria) this;
        }

        public Criteria andYxNotBetween(String value1, String value2) {
            addCriterion("YX not between", value1, value2, "yx");
            return (Criteria) this;
        }

        public Criteria andYtjgIsNull() {
            addCriterion("YTJG is null");
            return (Criteria) this;
        }

        public Criteria andYtjgIsNotNull() {
            addCriterion("YTJG is not null");
            return (Criteria) this;
        }

        public Criteria andYtjgEqualTo(String value) {
            addCriterion("YTJG =", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgNotEqualTo(String value) {
            addCriterion("YTJG <>", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgGreaterThan(String value) {
            addCriterion("YTJG >", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgGreaterThanOrEqualTo(String value) {
            addCriterion("YTJG >=", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgLessThan(String value) {
            addCriterion("YTJG <", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgLessThanOrEqualTo(String value) {
            addCriterion("YTJG <=", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgLike(String value) {
            addCriterion("YTJG like", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgNotLike(String value) {
            addCriterion("YTJG not like", value, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgIn(List<String> values) {
            addCriterion("YTJG in", values, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgNotIn(List<String> values) {
            addCriterion("YTJG not in", values, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgBetween(String value1, String value2) {
            addCriterion("YTJG between", value1, value2, "ytjg");
            return (Criteria) this;
        }

        public Criteria andYtjgNotBetween(String value1, String value2) {
            addCriterion("YTJG not between", value1, value2, "ytjg");
            return (Criteria) this;
        }

        public Criteria andFhcdIsNull() {
            addCriterion("FHCD is null");
            return (Criteria) this;
        }

        public Criteria andFhcdIsNotNull() {
            addCriterion("FHCD is not null");
            return (Criteria) this;
        }

        public Criteria andFhcdEqualTo(String value) {
            addCriterion("FHCD =", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdNotEqualTo(String value) {
            addCriterion("FHCD <>", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdGreaterThan(String value) {
            addCriterion("FHCD >", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdGreaterThanOrEqualTo(String value) {
            addCriterion("FHCD >=", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdLessThan(String value) {
            addCriterion("FHCD <", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdLessThanOrEqualTo(String value) {
            addCriterion("FHCD <=", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdLike(String value) {
            addCriterion("FHCD like", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdNotLike(String value) {
            addCriterion("FHCD not like", value, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdIn(List<String> values) {
            addCriterion("FHCD in", values, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdNotIn(List<String> values) {
            addCriterion("FHCD not in", values, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdBetween(String value1, String value2) {
            addCriterion("FHCD between", value1, value2, "fhcd");
            return (Criteria) this;
        }

        public Criteria andFhcdNotBetween(String value1, String value2) {
            addCriterion("FHCD not between", value1, value2, "fhcd");
            return (Criteria) this;
        }

        public Criteria andYkzjIsNull() {
            addCriterion("YKZJ is null");
            return (Criteria) this;
        }

        public Criteria andYkzjIsNotNull() {
            addCriterion("YKZJ is not null");
            return (Criteria) this;
        }

        public Criteria andYkzjEqualTo(BigDecimal value) {
            addCriterion("YKZJ =", value, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjNotEqualTo(BigDecimal value) {
            addCriterion("YKZJ <>", value, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjGreaterThan(BigDecimal value) {
            addCriterion("YKZJ >", value, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YKZJ >=", value, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjLessThan(BigDecimal value) {
            addCriterion("YKZJ <", value, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YKZJ <=", value, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjIn(List<BigDecimal> values) {
            addCriterion("YKZJ in", values, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjNotIn(List<BigDecimal> values) {
            addCriterion("YKZJ not in", values, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKZJ between", value1, value2, "ykzj");
            return (Criteria) this;
        }

        public Criteria andYkzjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YKZJ not between", value1, value2, "ykzj");
            return (Criteria) this;
        }

        public Criteria andGlfxIsNull() {
            addCriterion("GLFX is null");
            return (Criteria) this;
        }

        public Criteria andGlfxIsNotNull() {
            addCriterion("GLFX is not null");
            return (Criteria) this;
        }

        public Criteria andGlfxEqualTo(String value) {
            addCriterion("GLFX =", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxNotEqualTo(String value) {
            addCriterion("GLFX <>", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxGreaterThan(String value) {
            addCriterion("GLFX >", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxGreaterThanOrEqualTo(String value) {
            addCriterion("GLFX >=", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxLessThan(String value) {
            addCriterion("GLFX <", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxLessThanOrEqualTo(String value) {
            addCriterion("GLFX <=", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxLike(String value) {
            addCriterion("GLFX like", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxNotLike(String value) {
            addCriterion("GLFX not like", value, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxIn(List<String> values) {
            addCriterion("GLFX in", values, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxNotIn(List<String> values) {
            addCriterion("GLFX not in", values, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxBetween(String value1, String value2) {
            addCriterion("GLFX between", value1, value2, "glfx");
            return (Criteria) this;
        }

        public Criteria andGlfxNotBetween(String value1, String value2) {
            addCriterion("GLFX not between", value1, value2, "glfx");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 02 15:45:25 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_weiyanluoshi
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
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