package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ZuankongyuanweiceshiShuiwenceshiYashuishiyanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public ZuankongyuanweiceshiShuiwenceshiYashuishiyanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
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
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
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
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
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
     * This class corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
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

        public Criteria andZkywcsSwcsYssyidIsNull() {
            addCriterion("ZKYWCS_SWCS_YSSYID is null");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidIsNotNull() {
            addCriterion("ZKYWCS_SWCS_YSSYID is not null");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCS_YSSYID =", value, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidNotEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCS_YSSYID <>", value, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidGreaterThan(Long value) {
            addCriterion("ZKYWCS_SWCS_YSSYID >", value, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidGreaterThanOrEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCS_YSSYID >=", value, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidLessThan(Long value) {
            addCriterion("ZKYWCS_SWCS_YSSYID <", value, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidLessThanOrEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCS_YSSYID <=", value, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidIn(List<Long> values) {
            addCriterion("ZKYWCS_SWCS_YSSYID in", values, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidNotIn(List<Long> values) {
            addCriterion("ZKYWCS_SWCS_YSSYID not in", values, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidBetween(Long value1, Long value2) {
            addCriterion("ZKYWCS_SWCS_YSSYID between", value1, value2, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsYssyidNotBetween(Long value1, Long value2) {
            addCriterion("ZKYWCS_SWCS_YSSYID not between", value1, value2, "zkywcsSwcsYssyid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidIsNull() {
            addCriterion("ZKYWCS_SWCSID is null");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidIsNotNull() {
            addCriterion("ZKYWCS_SWCSID is not null");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCSID =", value, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidNotEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCSID <>", value, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidGreaterThan(Long value) {
            addCriterion("ZKYWCS_SWCSID >", value, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidGreaterThanOrEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCSID >=", value, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidLessThan(Long value) {
            addCriterion("ZKYWCS_SWCSID <", value, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidLessThanOrEqualTo(Long value) {
            addCriterion("ZKYWCS_SWCSID <=", value, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidIn(List<Long> values) {
            addCriterion("ZKYWCS_SWCSID in", values, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidNotIn(List<Long> values) {
            addCriterion("ZKYWCS_SWCSID not in", values, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidBetween(Long value1, Long value2) {
            addCriterion("ZKYWCS_SWCSID between", value1, value2, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andZkywcsSwcsidNotBetween(Long value1, Long value2) {
            addCriterion("ZKYWCS_SWCSID not between", value1, value2, "zkywcsSwcsid");
            return (Criteria) this;
        }

        public Criteria andSybhIsNull() {
            addCriterion("SYBH is null");
            return (Criteria) this;
        }

        public Criteria andSybhIsNotNull() {
            addCriterion("SYBH is not null");
            return (Criteria) this;
        }

        public Criteria andSybhEqualTo(String value) {
            addCriterion("SYBH =", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhNotEqualTo(String value) {
            addCriterion("SYBH <>", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhGreaterThan(String value) {
            addCriterion("SYBH >", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhGreaterThanOrEqualTo(String value) {
            addCriterion("SYBH >=", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhLessThan(String value) {
            addCriterion("SYBH <", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhLessThanOrEqualTo(String value) {
            addCriterion("SYBH <=", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhLike(String value) {
            addCriterion("SYBH like", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhNotLike(String value) {
            addCriterion("SYBH not like", value, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhIn(List<String> values) {
            addCriterion("SYBH in", values, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhNotIn(List<String> values) {
            addCriterion("SYBH not in", values, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhBetween(String value1, String value2) {
            addCriterion("SYBH between", value1, value2, "sybh");
            return (Criteria) this;
        }

        public Criteria andSybhNotBetween(String value1, String value2) {
            addCriterion("SYBH not between", value1, value2, "sybh");
            return (Criteria) this;
        }

        public Criteria andSydtgcIsNull() {
            addCriterion("SYDTGC is null");
            return (Criteria) this;
        }

        public Criteria andSydtgcIsNotNull() {
            addCriterion("SYDTGC is not null");
            return (Criteria) this;
        }

        public Criteria andSydtgcEqualTo(BigDecimal value) {
            addCriterion("SYDTGC =", value, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcNotEqualTo(BigDecimal value) {
            addCriterion("SYDTGC <>", value, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcGreaterThan(BigDecimal value) {
            addCriterion("SYDTGC >", value, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYDTGC >=", value, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcLessThan(BigDecimal value) {
            addCriterion("SYDTGC <", value, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYDTGC <=", value, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcIn(List<BigDecimal> values) {
            addCriterion("SYDTGC in", values, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcNotIn(List<BigDecimal> values) {
            addCriterion("SYDTGC not in", values, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYDTGC between", value1, value2, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydtgcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYDTGC not between", value1, value2, "sydtgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcIsNull() {
            addCriterion("SYDBGC is null");
            return (Criteria) this;
        }

        public Criteria andSydbgcIsNotNull() {
            addCriterion("SYDBGC is not null");
            return (Criteria) this;
        }

        public Criteria andSydbgcEqualTo(BigDecimal value) {
            addCriterion("SYDBGC =", value, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcNotEqualTo(BigDecimal value) {
            addCriterion("SYDBGC <>", value, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcGreaterThan(BigDecimal value) {
            addCriterion("SYDBGC >", value, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYDBGC >=", value, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcLessThan(BigDecimal value) {
            addCriterion("SYDBGC <", value, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYDBGC <=", value, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcIn(List<BigDecimal> values) {
            addCriterion("SYDBGC in", values, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcNotIn(List<BigDecimal> values) {
            addCriterion("SYDBGC not in", values, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYDBGC between", value1, value2, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSydbgcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYDBGC not between", value1, value2, "sydbgc");
            return (Criteria) this;
        }

        public Criteria andSzylIsNull() {
            addCriterion("SZYL is null");
            return (Criteria) this;
        }

        public Criteria andSzylIsNotNull() {
            addCriterion("SZYL is not null");
            return (Criteria) this;
        }

        public Criteria andSzylEqualTo(BigDecimal value) {
            addCriterion("SZYL =", value, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylNotEqualTo(BigDecimal value) {
            addCriterion("SZYL <>", value, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylGreaterThan(BigDecimal value) {
            addCriterion("SZYL >", value, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SZYL >=", value, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylLessThan(BigDecimal value) {
            addCriterion("SZYL <", value, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SZYL <=", value, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylIn(List<BigDecimal> values) {
            addCriterion("SZYL in", values, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylNotIn(List<BigDecimal> values) {
            addCriterion("SZYL not in", values, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZYL between", value1, value2, "szyl");
            return (Criteria) this;
        }

        public Criteria andSzylNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SZYL not between", value1, value2, "szyl");
            return (Criteria) this;
        }

        public Criteria andStxsIsNull() {
            addCriterion("STXS is null");
            return (Criteria) this;
        }

        public Criteria andStxsIsNotNull() {
            addCriterion("STXS is not null");
            return (Criteria) this;
        }

        public Criteria andStxsEqualTo(BigDecimal value) {
            addCriterion("STXS =", value, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsNotEqualTo(BigDecimal value) {
            addCriterion("STXS <>", value, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsGreaterThan(BigDecimal value) {
            addCriterion("STXS >", value, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STXS >=", value, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsLessThan(BigDecimal value) {
            addCriterion("STXS <", value, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STXS <=", value, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsIn(List<BigDecimal> values) {
            addCriterion("STXS in", values, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsNotIn(List<BigDecimal> values) {
            addCriterion("STXS not in", values, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STXS between", value1, value2, "stxs");
            return (Criteria) this;
        }

        public Criteria andStxsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STXS not between", value1, value2, "stxs");
            return (Criteria) this;
        }

        public Criteria andTslIsNull() {
            addCriterion("TSL is null");
            return (Criteria) this;
        }

        public Criteria andTslIsNotNull() {
            addCriterion("TSL is not null");
            return (Criteria) this;
        }

        public Criteria andTslEqualTo(BigDecimal value) {
            addCriterion("TSL =", value, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslNotEqualTo(BigDecimal value) {
            addCriterion("TSL <>", value, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslGreaterThan(BigDecimal value) {
            addCriterion("TSL >", value, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TSL >=", value, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslLessThan(BigDecimal value) {
            addCriterion("TSL <", value, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TSL <=", value, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslIn(List<BigDecimal> values) {
            addCriterion("TSL in", values, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslNotIn(List<BigDecimal> values) {
            addCriterion("TSL not in", values, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TSL between", value1, value2, "tsl");
            return (Criteria) this;
        }

        public Criteria andTslNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TSL not between", value1, value2, "tsl");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andDwxslIsNull() {
            addCriterion("DWXSL is null");
            return (Criteria) this;
        }

        public Criteria andDwxslIsNotNull() {
            addCriterion("DWXSL is not null");
            return (Criteria) this;
        }

        public Criteria andDwxslEqualTo(BigDecimal value) {
            addCriterion("DWXSL =", value, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslNotEqualTo(BigDecimal value) {
            addCriterion("DWXSL <>", value, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslGreaterThan(BigDecimal value) {
            addCriterion("DWXSL >", value, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DWXSL >=", value, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslLessThan(BigDecimal value) {
            addCriterion("DWXSL <", value, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DWXSL <=", value, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslIn(List<BigDecimal> values) {
            addCriterion("DWXSL in", values, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslNotIn(List<BigDecimal> values) {
            addCriterion("DWXSL not in", values, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DWXSL between", value1, value2, "dwxsl");
            return (Criteria) this;
        }

        public Criteria andDwxslNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DWXSL not between", value1, value2, "dwxsl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
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
     * This class corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyan
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