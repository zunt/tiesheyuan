package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class DizhidiaohuiTeshuyantuYanzituExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public DizhidiaohuiTeshuyantuYanzituExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
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
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
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
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
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
     * This class corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
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

        public Criteria andDzdhTsytYztidIsNull() {
            addCriterion("DZDH_TSYT_YZTID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidIsNotNull() {
            addCriterion("DZDH_TSYT_YZTID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidEqualTo(Long value) {
            addCriterion("DZDH_TSYT_YZTID =", value, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidNotEqualTo(Long value) {
            addCriterion("DZDH_TSYT_YZTID <>", value, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidGreaterThan(Long value) {
            addCriterion("DZDH_TSYT_YZTID >", value, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_TSYT_YZTID >=", value, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidLessThan(Long value) {
            addCriterion("DZDH_TSYT_YZTID <", value, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_TSYT_YZTID <=", value, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidIn(List<Long> values) {
            addCriterion("DZDH_TSYT_YZTID in", values, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidNotIn(List<Long> values) {
            addCriterion("DZDH_TSYT_YZTID not in", values, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidBetween(Long value1, Long value2) {
            addCriterion("DZDH_TSYT_YZTID between", value1, value2, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytYztidNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_TSYT_YZTID not between", value1, value2, "dzdhTsytYztid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidIsNull() {
            addCriterion("DZDH_TSYTID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidIsNotNull() {
            addCriterion("DZDH_TSYTID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidEqualTo(Long value) {
            addCriterion("DZDH_TSYTID =", value, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidNotEqualTo(Long value) {
            addCriterion("DZDH_TSYTID <>", value, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidGreaterThan(Long value) {
            addCriterion("DZDH_TSYTID >", value, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_TSYTID >=", value, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidLessThan(Long value) {
            addCriterion("DZDH_TSYTID <", value, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_TSYTID <=", value, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidIn(List<Long> values) {
            addCriterion("DZDH_TSYTID in", values, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidNotIn(List<Long> values) {
            addCriterion("DZDH_TSYTID not in", values, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidBetween(Long value1, Long value2) {
            addCriterion("DZDH_TSYTID between", value1, value2, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andDzdhTsytidNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_TSYTID not between", value1, value2, "dzdhTsytid");
            return (Criteria) this;
        }

        public Criteria andYztflIsNull() {
            addCriterion("YZTFL is null");
            return (Criteria) this;
        }

        public Criteria andYztflIsNotNull() {
            addCriterion("YZTFL is not null");
            return (Criteria) this;
        }

        public Criteria andYztflEqualTo(String value) {
            addCriterion("YZTFL =", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflNotEqualTo(String value) {
            addCriterion("YZTFL <>", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflGreaterThan(String value) {
            addCriterion("YZTFL >", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflGreaterThanOrEqualTo(String value) {
            addCriterion("YZTFL >=", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflLessThan(String value) {
            addCriterion("YZTFL <", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflLessThanOrEqualTo(String value) {
            addCriterion("YZTFL <=", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflLike(String value) {
            addCriterion("YZTFL like", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflNotLike(String value) {
            addCriterion("YZTFL not like", value, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflIn(List<String> values) {
            addCriterion("YZTFL in", values, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflNotIn(List<String> values) {
            addCriterion("YZTFL not in", values, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflBetween(String value1, String value2) {
            addCriterion("YZTFL between", value1, value2, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYztflNotBetween(String value1, String value2) {
            addCriterion("YZTFL not between", value1, value2, "yztfl");
            return (Criteria) this;
        }

        public Criteria andYzhcdIsNull() {
            addCriterion("YZHCD is null");
            return (Criteria) this;
        }

        public Criteria andYzhcdIsNotNull() {
            addCriterion("YZHCD is not null");
            return (Criteria) this;
        }

        public Criteria andYzhcdEqualTo(String value) {
            addCriterion("YZHCD =", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdNotEqualTo(String value) {
            addCriterion("YZHCD <>", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdGreaterThan(String value) {
            addCriterion("YZHCD >", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdGreaterThanOrEqualTo(String value) {
            addCriterion("YZHCD >=", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdLessThan(String value) {
            addCriterion("YZHCD <", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdLessThanOrEqualTo(String value) {
            addCriterion("YZHCD <=", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdLike(String value) {
            addCriterion("YZHCD like", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdNotLike(String value) {
            addCriterion("YZHCD not like", value, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdIn(List<String> values) {
            addCriterion("YZHCD in", values, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdNotIn(List<String> values) {
            addCriterion("YZHCD not in", values, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdBetween(String value1, String value2) {
            addCriterion("YZHCD between", value1, value2, "yzhcd");
            return (Criteria) this;
        }

        public Criteria andYzhcdNotBetween(String value1, String value2) {
            addCriterion("YZHCD not between", value1, value2, "yzhcd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
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
     * This class corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
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