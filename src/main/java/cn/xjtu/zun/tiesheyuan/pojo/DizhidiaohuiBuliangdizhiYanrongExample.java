package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class DizhidiaohuiBuliangdizhiYanrongExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public DizhidiaohuiBuliangdizhiYanrongExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
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
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
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
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
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
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
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

        public Criteria andDzdhBldzYridIsNull() {
            addCriterion("DZDH_BLDZ_YRID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridIsNotNull() {
            addCriterion("DZDH_BLDZ_YRID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_YRID =", value, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridNotEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_YRID <>", value, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridGreaterThan(Long value) {
            addCriterion("DZDH_BLDZ_YRID >", value, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_YRID >=", value, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridLessThan(Long value) {
            addCriterion("DZDH_BLDZ_YRID <", value, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_BLDZ_YRID <=", value, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridIn(List<Long> values) {
            addCriterion("DZDH_BLDZ_YRID in", values, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridNotIn(List<Long> values) {
            addCriterion("DZDH_BLDZ_YRID not in", values, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZ_YRID between", value1, value2, "dzdhBldzYrid");
            return (Criteria) this;
        }

        public Criteria andDzdhBldzYridNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_BLDZ_YRID not between", value1, value2, "dzdhBldzYrid");
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

        public Criteria andYrfyqdIsNull() {
            addCriterion("YRFYQD is null");
            return (Criteria) this;
        }

        public Criteria andYrfyqdIsNotNull() {
            addCriterion("YRFYQD is not null");
            return (Criteria) this;
        }

        public Criteria andYrfyqdEqualTo(String value) {
            addCriterion("YRFYQD =", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdNotEqualTo(String value) {
            addCriterion("YRFYQD <>", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdGreaterThan(String value) {
            addCriterion("YRFYQD >", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdGreaterThanOrEqualTo(String value) {
            addCriterion("YRFYQD >=", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdLessThan(String value) {
            addCriterion("YRFYQD <", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdLessThanOrEqualTo(String value) {
            addCriterion("YRFYQD <=", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdLike(String value) {
            addCriterion("YRFYQD like", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdNotLike(String value) {
            addCriterion("YRFYQD not like", value, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdIn(List<String> values) {
            addCriterion("YRFYQD in", values, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdNotIn(List<String> values) {
            addCriterion("YRFYQD not in", values, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdBetween(String value1, String value2) {
            addCriterion("YRFYQD between", value1, value2, "yrfyqd");
            return (Criteria) this;
        }

        public Criteria andYrfyqdNotBetween(String value1, String value2) {
            addCriterion("YRFYQD not between", value1, value2, "yrfyqd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
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
     * This class corresponds to the database table dizhidiaohui_buliangdizhi_yanrong
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