package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WutanDiyingliBckExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public WutanDiyingliBckExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
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
     * This method corresponds to the database table wutan_diyingli_bck
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
     * This method corresponds to the database table wutan_diyingli_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_diyingli_bck
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
     * This class corresponds to the database table wutan_diyingli_bck
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

        public Criteria andWtDylidIsNull() {
            addCriterion("WT_DYLID is null");
            return (Criteria) this;
        }

        public Criteria andWtDylidIsNotNull() {
            addCriterion("WT_DYLID is not null");
            return (Criteria) this;
        }

        public Criteria andWtDylidEqualTo(Long value) {
            addCriterion("WT_DYLID =", value, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidNotEqualTo(Long value) {
            addCriterion("WT_DYLID <>", value, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidGreaterThan(Long value) {
            addCriterion("WT_DYLID >", value, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidGreaterThanOrEqualTo(Long value) {
            addCriterion("WT_DYLID >=", value, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidLessThan(Long value) {
            addCriterion("WT_DYLID <", value, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidLessThanOrEqualTo(Long value) {
            addCriterion("WT_DYLID <=", value, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidIn(List<Long> values) {
            addCriterion("WT_DYLID in", values, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidNotIn(List<Long> values) {
            addCriterion("WT_DYLID not in", values, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidBetween(Long value1, Long value2) {
            addCriterion("WT_DYLID between", value1, value2, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andWtDylidNotBetween(Long value1, Long value2) {
            addCriterion("WT_DYLID not between", value1, value2, "wtDylid");
            return (Criteria) this;
        }

        public Criteria andCdqdsdIsNull() {
            addCriterion("CDQDSD is null");
            return (Criteria) this;
        }

        public Criteria andCdqdsdIsNotNull() {
            addCriterion("CDQDSD is not null");
            return (Criteria) this;
        }

        public Criteria andCdqdsdEqualTo(BigDecimal value) {
            addCriterion("CDQDSD =", value, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdNotEqualTo(BigDecimal value) {
            addCriterion("CDQDSD <>", value, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdGreaterThan(BigDecimal value) {
            addCriterion("CDQDSD >", value, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CDQDSD >=", value, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdLessThan(BigDecimal value) {
            addCriterion("CDQDSD <", value, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CDQDSD <=", value, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdIn(List<BigDecimal> values) {
            addCriterion("CDQDSD in", values, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdNotIn(List<BigDecimal> values) {
            addCriterion("CDQDSD not in", values, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CDQDSD between", value1, value2, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdqdsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CDQDSD not between", value1, value2, "cdqdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdIsNull() {
            addCriterion("CDZDSD is null");
            return (Criteria) this;
        }

        public Criteria andCdzdsdIsNotNull() {
            addCriterion("CDZDSD is not null");
            return (Criteria) this;
        }

        public Criteria andCdzdsdEqualTo(BigDecimal value) {
            addCriterion("CDZDSD =", value, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdNotEqualTo(BigDecimal value) {
            addCriterion("CDZDSD <>", value, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdGreaterThan(BigDecimal value) {
            addCriterion("CDZDSD >", value, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CDZDSD >=", value, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdLessThan(BigDecimal value) {
            addCriterion("CDZDSD <", value, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CDZDSD <=", value, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdIn(List<BigDecimal> values) {
            addCriterion("CDZDSD in", values, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdNotIn(List<BigDecimal> values) {
            addCriterion("CDZDSD not in", values, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CDZDSD between", value1, value2, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andCdzdsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CDZDSD not between", value1, value2, "cdzdsd");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylIsNull() {
            addCriterion("ZYLZ_SPZDZYL is null");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylIsNotNull() {
            addCriterion("ZYLZ_SPZDZYL is not null");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZDZYL =", value, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylNotEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZDZYL <>", value, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylGreaterThan(BigDecimal value) {
            addCriterion("ZYLZ_SPZDZYL >", value, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZDZYL >=", value, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylLessThan(BigDecimal value) {
            addCriterion("ZYLZ_SPZDZYL <", value, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZDZYL <=", value, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylIn(List<BigDecimal> values) {
            addCriterion("ZYLZ_SPZDZYL in", values, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylNotIn(List<BigDecimal> values) {
            addCriterion("ZYLZ_SPZDZYL not in", values, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYLZ_SPZDZYL between", value1, value2, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzdzylNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYLZ_SPZDZYL not between", value1, value2, "zylzSpzdzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylIsNull() {
            addCriterion("ZYLZ_SPZXZYL is null");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylIsNotNull() {
            addCriterion("ZYLZ_SPZXZYL is not null");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZXZYL =", value, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylNotEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZXZYL <>", value, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylGreaterThan(BigDecimal value) {
            addCriterion("ZYLZ_SPZXZYL >", value, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZXZYL >=", value, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylLessThan(BigDecimal value) {
            addCriterion("ZYLZ_SPZXZYL <", value, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_SPZXZYL <=", value, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylIn(List<BigDecimal> values) {
            addCriterion("ZYLZ_SPZXZYL in", values, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylNotIn(List<BigDecimal> values) {
            addCriterion("ZYLZ_SPZXZYL not in", values, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYLZ_SPZXZYL between", value1, value2, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzSpzxzylNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYLZ_SPZXZYL not between", value1, value2, "zylzSpzxzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylIsNull() {
            addCriterion("ZYLZ_CZZYL is null");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylIsNotNull() {
            addCriterion("ZYLZ_CZZYL is not null");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_CZZYL =", value, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylNotEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_CZZYL <>", value, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylGreaterThan(BigDecimal value) {
            addCriterion("ZYLZ_CZZYL >", value, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_CZZYL >=", value, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylLessThan(BigDecimal value) {
            addCriterion("ZYLZ_CZZYL <", value, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYLZ_CZZYL <=", value, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylIn(List<BigDecimal> values) {
            addCriterion("ZYLZ_CZZYL in", values, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylNotIn(List<BigDecimal> values) {
            addCriterion("ZYLZ_CZZYL not in", values, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYLZ_CZZYL between", value1, value2, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andZylzCzzylNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYLZ_CZZYL not between", value1, value2, "zylzCzzyl");
            return (Criteria) this;
        }

        public Criteria andPlfxIsNull() {
            addCriterion("PLFX is null");
            return (Criteria) this;
        }

        public Criteria andPlfxIsNotNull() {
            addCriterion("PLFX is not null");
            return (Criteria) this;
        }

        public Criteria andPlfxEqualTo(String value) {
            addCriterion("PLFX =", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxNotEqualTo(String value) {
            addCriterion("PLFX <>", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxGreaterThan(String value) {
            addCriterion("PLFX >", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxGreaterThanOrEqualTo(String value) {
            addCriterion("PLFX >=", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxLessThan(String value) {
            addCriterion("PLFX <", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxLessThanOrEqualTo(String value) {
            addCriterion("PLFX <=", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxLike(String value) {
            addCriterion("PLFX like", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxNotLike(String value) {
            addCriterion("PLFX not like", value, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxIn(List<String> values) {
            addCriterion("PLFX in", values, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxNotIn(List<String> values) {
            addCriterion("PLFX not in", values, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxBetween(String value1, String value2) {
            addCriterion("PLFX between", value1, value2, "plfx");
            return (Criteria) this;
        }

        public Criteria andPlfxNotBetween(String value1, String value2) {
            addCriterion("PLFX not between", value1, value2, "plfx");
            return (Criteria) this;
        }

        public Criteria andWtidIsNull() {
            addCriterion("WTID is null");
            return (Criteria) this;
        }

        public Criteria andWtidIsNotNull() {
            addCriterion("WTID is not null");
            return (Criteria) this;
        }

        public Criteria andWtidEqualTo(Long value) {
            addCriterion("WTID =", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidNotEqualTo(Long value) {
            addCriterion("WTID <>", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidGreaterThan(Long value) {
            addCriterion("WTID >", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidGreaterThanOrEqualTo(Long value) {
            addCriterion("WTID >=", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidLessThan(Long value) {
            addCriterion("WTID <", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidLessThanOrEqualTo(Long value) {
            addCriterion("WTID <=", value, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidIn(List<Long> values) {
            addCriterion("WTID in", values, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidNotIn(List<Long> values) {
            addCriterion("WTID not in", values, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidBetween(Long value1, Long value2) {
            addCriterion("WTID between", value1, value2, "wtid");
            return (Criteria) this;
        }

        public Criteria andWtidNotBetween(Long value1, Long value2) {
            addCriterion("WTID not between", value1, value2, "wtid");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table wutan_diyingli_bck
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
     * This class corresponds to the database table wutan_diyingli_bck
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