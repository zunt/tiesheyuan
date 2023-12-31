package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class FanganxiantiaoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public FanganxiantiaoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
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
     * This method corresponds to the database table fanganxiantiao
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
     * This method corresponds to the database table fanganxiantiao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fanganxiantiao
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
     * This class corresponds to the database table fanganxiantiao
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

        public Criteria andFaxtidIsNull() {
            addCriterion("FAXTID is null");
            return (Criteria) this;
        }

        public Criteria andFaxtidIsNotNull() {
            addCriterion("FAXTID is not null");
            return (Criteria) this;
        }

        public Criteria andFaxtidEqualTo(Long value) {
            addCriterion("FAXTID =", value, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidNotEqualTo(Long value) {
            addCriterion("FAXTID <>", value, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidGreaterThan(Long value) {
            addCriterion("FAXTID >", value, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidGreaterThanOrEqualTo(Long value) {
            addCriterion("FAXTID >=", value, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidLessThan(Long value) {
            addCriterion("FAXTID <", value, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidLessThanOrEqualTo(Long value) {
            addCriterion("FAXTID <=", value, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidIn(List<Long> values) {
            addCriterion("FAXTID in", values, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidNotIn(List<Long> values) {
            addCriterion("FAXTID not in", values, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidBetween(Long value1, Long value2) {
            addCriterion("FAXTID between", value1, value2, "faxtid");
            return (Criteria) this;
        }

        public Criteria andFaxtidNotBetween(Long value1, Long value2) {
            addCriterion("FAXTID not between", value1, value2, "faxtid");
            return (Criteria) this;
        }

        public Criteria andXmfaidIsNull() {
            addCriterion("XMFAID is null");
            return (Criteria) this;
        }

        public Criteria andXmfaidIsNotNull() {
            addCriterion("XMFAID is not null");
            return (Criteria) this;
        }

        public Criteria andXmfaidEqualTo(String value) {
            addCriterion("XMFAID =", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidNotEqualTo(String value) {
            addCriterion("XMFAID <>", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidGreaterThan(String value) {
            addCriterion("XMFAID >", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidGreaterThanOrEqualTo(String value) {
            addCriterion("XMFAID >=", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidLessThan(String value) {
            addCriterion("XMFAID <", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidLessThanOrEqualTo(String value) {
            addCriterion("XMFAID <=", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidLike(String value) {
            addCriterion("XMFAID like", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidNotLike(String value) {
            addCriterion("XMFAID not like", value, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidIn(List<String> values) {
            addCriterion("XMFAID in", values, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidNotIn(List<String> values) {
            addCriterion("XMFAID not in", values, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidBetween(String value1, String value2) {
            addCriterion("XMFAID between", value1, value2, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andXmfaidNotBetween(String value1, String value2) {
            addCriterion("XMFAID not between", value1, value2, "xmfaid");
            return (Criteria) this;
        }

        public Criteria andQxysIsNull() {
            addCriterion("QXYS is null");
            return (Criteria) this;
        }

        public Criteria andQxysIsNotNull() {
            addCriterion("QXYS is not null");
            return (Criteria) this;
        }

        public Criteria andQxysEqualTo(String value) {
            addCriterion("QXYS =", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysNotEqualTo(String value) {
            addCriterion("QXYS <>", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysGreaterThan(String value) {
            addCriterion("QXYS >", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysGreaterThanOrEqualTo(String value) {
            addCriterion("QXYS >=", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysLessThan(String value) {
            addCriterion("QXYS <", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysLessThanOrEqualTo(String value) {
            addCriterion("QXYS <=", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysLike(String value) {
            addCriterion("QXYS like", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysNotLike(String value) {
            addCriterion("QXYS not like", value, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysIn(List<String> values) {
            addCriterion("QXYS in", values, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysNotIn(List<String> values) {
            addCriterion("QXYS not in", values, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysBetween(String value1, String value2) {
            addCriterion("QXYS between", value1, value2, "qxys");
            return (Criteria) this;
        }

        public Criteria andQxysNotBetween(String value1, String value2) {
            addCriterion("QXYS not between", value1, value2, "qxys");
            return (Criteria) this;
        }

        public Criteria andDlbIsNull() {
            addCriterion("DLB is null");
            return (Criteria) this;
        }

        public Criteria andDlbIsNotNull() {
            addCriterion("DLB is not null");
            return (Criteria) this;
        }

        public Criteria andDlbEqualTo(String value) {
            addCriterion("DLB =", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbNotEqualTo(String value) {
            addCriterion("DLB <>", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbGreaterThan(String value) {
            addCriterion("DLB >", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbGreaterThanOrEqualTo(String value) {
            addCriterion("DLB >=", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbLessThan(String value) {
            addCriterion("DLB <", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbLessThanOrEqualTo(String value) {
            addCriterion("DLB <=", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbLike(String value) {
            addCriterion("DLB like", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbNotLike(String value) {
            addCriterion("DLB not like", value, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbIn(List<String> values) {
            addCriterion("DLB in", values, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbNotIn(List<String> values) {
            addCriterion("DLB not in", values, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbBetween(String value1, String value2) {
            addCriterion("DLB between", value1, value2, "dlb");
            return (Criteria) this;
        }

        public Criteria andDlbNotBetween(String value1, String value2) {
            addCriterion("DLB not between", value1, value2, "dlb");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fanganxiantiao
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
     * This class corresponds to the database table fanganxiantiao
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