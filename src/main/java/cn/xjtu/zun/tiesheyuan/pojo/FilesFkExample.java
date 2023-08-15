package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.List;

public class FilesFkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public FilesFkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
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
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andXmjdIsNull() {
            addCriterion("XMJD is null");
            return (Criteria) this;
        }

        public Criteria andXmjdIsNotNull() {
            addCriterion("XMJD is not null");
            return (Criteria) this;
        }

        public Criteria andXmjdEqualTo(String value) {
            addCriterion("XMJD =", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdNotEqualTo(String value) {
            addCriterion("XMJD <>", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdGreaterThan(String value) {
            addCriterion("XMJD >", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdGreaterThanOrEqualTo(String value) {
            addCriterion("XMJD >=", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdLessThan(String value) {
            addCriterion("XMJD <", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdLessThanOrEqualTo(String value) {
            addCriterion("XMJD <=", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdLike(String value) {
            addCriterion("XMJD like", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdNotLike(String value) {
            addCriterion("XMJD not like", value, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdIn(List<String> values) {
            addCriterion("XMJD in", values, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdNotIn(List<String> values) {
            addCriterion("XMJD not in", values, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdBetween(String value1, String value2) {
            addCriterion("XMJD between", value1, value2, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmjdNotBetween(String value1, String value2) {
            addCriterion("XMJD not between", value1, value2, "xmjd");
            return (Criteria) this;
        }

        public Criteria andXmdlIsNull() {
            addCriterion("XMDL is null");
            return (Criteria) this;
        }

        public Criteria andXmdlIsNotNull() {
            addCriterion("XMDL is not null");
            return (Criteria) this;
        }

        public Criteria andXmdlEqualTo(String value) {
            addCriterion("XMDL =", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlNotEqualTo(String value) {
            addCriterion("XMDL <>", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlGreaterThan(String value) {
            addCriterion("XMDL >", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlGreaterThanOrEqualTo(String value) {
            addCriterion("XMDL >=", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlLessThan(String value) {
            addCriterion("XMDL <", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlLessThanOrEqualTo(String value) {
            addCriterion("XMDL <=", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlLike(String value) {
            addCriterion("XMDL like", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlNotLike(String value) {
            addCriterion("XMDL not like", value, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlIn(List<String> values) {
            addCriterion("XMDL in", values, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlNotIn(List<String> values) {
            addCriterion("XMDL not in", values, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlBetween(String value1, String value2) {
            addCriterion("XMDL between", value1, value2, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmdlNotBetween(String value1, String value2) {
            addCriterion("XMDL not between", value1, value2, "xmdl");
            return (Criteria) this;
        }

        public Criteria andXmfaIsNull() {
            addCriterion("XMFA is null");
            return (Criteria) this;
        }

        public Criteria andXmfaIsNotNull() {
            addCriterion("XMFA is not null");
            return (Criteria) this;
        }

        public Criteria andXmfaEqualTo(String value) {
            addCriterion("XMFA =", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaNotEqualTo(String value) {
            addCriterion("XMFA <>", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaGreaterThan(String value) {
            addCriterion("XMFA >", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaGreaterThanOrEqualTo(String value) {
            addCriterion("XMFA >=", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaLessThan(String value) {
            addCriterion("XMFA <", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaLessThanOrEqualTo(String value) {
            addCriterion("XMFA <=", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaLike(String value) {
            addCriterion("XMFA like", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaNotLike(String value) {
            addCriterion("XMFA not like", value, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaIn(List<String> values) {
            addCriterion("XMFA in", values, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaNotIn(List<String> values) {
            addCriterion("XMFA not in", values, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaBetween(String value1, String value2) {
            addCriterion("XMFA between", value1, value2, "xmfa");
            return (Criteria) this;
        }

        public Criteria andXmfaNotBetween(String value1, String value2) {
            addCriterion("XMFA not between", value1, value2, "xmfa");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table files_fk
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 02 17:09:49 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table files_fk
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
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