package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZuantanyujianyikantanZuankongshikengshuiweiExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public ZuantanyujianyikantanZuankongshikengshuiweiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
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
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
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
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
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
     * This class corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andZtyjyktZkskswidIsNull() {
            addCriterion("ZTYJYKT_ZKSKSWID is null");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidIsNotNull() {
            addCriterion("ZTYJYKT_ZKSKSWID is not null");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKSKSWID =", value, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidNotEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKSKSWID <>", value, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidGreaterThan(Long value) {
            addCriterion("ZTYJYKT_ZKSKSWID >", value, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidGreaterThanOrEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKSKSWID >=", value, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidLessThan(Long value) {
            addCriterion("ZTYJYKT_ZKSKSWID <", value, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidLessThanOrEqualTo(Long value) {
            addCriterion("ZTYJYKT_ZKSKSWID <=", value, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidIn(List<Long> values) {
            addCriterion("ZTYJYKT_ZKSKSWID in", values, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidNotIn(List<Long> values) {
            addCriterion("ZTYJYKT_ZKSKSWID not in", values, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidBetween(Long value1, Long value2) {
            addCriterion("ZTYJYKT_ZKSKSWID between", value1, value2, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZtyjyktZkskswidNotBetween(Long value1, Long value2) {
            addCriterion("ZTYJYKT_ZKSKSWID not between", value1, value2, "ztyjyktZkskswid");
            return (Criteria) this;
        }

        public Criteria andZkidIsNull() {
            addCriterion("ZKID is null");
            return (Criteria) this;
        }

        public Criteria andZkidIsNotNull() {
            addCriterion("ZKID is not null");
            return (Criteria) this;
        }

        public Criteria andZkidEqualTo(Long value) {
            addCriterion("ZKID =", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidNotEqualTo(Long value) {
            addCriterion("ZKID <>", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidGreaterThan(Long value) {
            addCriterion("ZKID >", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidGreaterThanOrEqualTo(Long value) {
            addCriterion("ZKID >=", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidLessThan(Long value) {
            addCriterion("ZKID <", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidLessThanOrEqualTo(Long value) {
            addCriterion("ZKID <=", value, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidIn(List<Long> values) {
            addCriterion("ZKID in", values, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidNotIn(List<Long> values) {
            addCriterion("ZKID not in", values, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidBetween(Long value1, Long value2) {
            addCriterion("ZKID between", value1, value2, "zkid");
            return (Criteria) this;
        }

        public Criteria andZkidNotBetween(Long value1, Long value2) {
            addCriterion("ZKID not between", value1, value2, "zkid");
            return (Criteria) this;
        }

        public Criteria andSkidIsNull() {
            addCriterion("SKID is null");
            return (Criteria) this;
        }

        public Criteria andSkidIsNotNull() {
            addCriterion("SKID is not null");
            return (Criteria) this;
        }

        public Criteria andSkidEqualTo(Long value) {
            addCriterion("SKID =", value, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidNotEqualTo(Long value) {
            addCriterion("SKID <>", value, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidGreaterThan(Long value) {
            addCriterion("SKID >", value, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidGreaterThanOrEqualTo(Long value) {
            addCriterion("SKID >=", value, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidLessThan(Long value) {
            addCriterion("SKID <", value, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidLessThanOrEqualTo(Long value) {
            addCriterion("SKID <=", value, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidIn(List<Long> values) {
            addCriterion("SKID in", values, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidNotIn(List<Long> values) {
            addCriterion("SKID not in", values, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidBetween(Long value1, Long value2) {
            addCriterion("SKID between", value1, value2, "skid");
            return (Criteria) this;
        }

        public Criteria andSkidNotBetween(Long value1, Long value2) {
            addCriterion("SKID not between", value1, value2, "skid");
            return (Criteria) this;
        }

        public Criteria andChIsNull() {
            addCriterion("CH is null");
            return (Criteria) this;
        }

        public Criteria andChIsNotNull() {
            addCriterion("CH is not null");
            return (Criteria) this;
        }

        public Criteria andChEqualTo(String value) {
            addCriterion("CH =", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotEqualTo(String value) {
            addCriterion("CH <>", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThan(String value) {
            addCriterion("CH >", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChGreaterThanOrEqualTo(String value) {
            addCriterion("CH >=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThan(String value) {
            addCriterion("CH <", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLessThanOrEqualTo(String value) {
            addCriterion("CH <=", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChLike(String value) {
            addCriterion("CH like", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotLike(String value) {
            addCriterion("CH not like", value, "ch");
            return (Criteria) this;
        }

        public Criteria andChIn(List<String> values) {
            addCriterion("CH in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotIn(List<String> values) {
            addCriterion("CH not in", values, "ch");
            return (Criteria) this;
        }

        public Criteria andChBetween(String value1, String value2) {
            addCriterion("CH between", value1, value2, "ch");
            return (Criteria) this;
        }

        public Criteria andChNotBetween(String value1, String value2) {
            addCriterion("CH not between", value1, value2, "ch");
            return (Criteria) this;
        }

        public Criteria andSwsdIsNull() {
            addCriterion("SWSD is null");
            return (Criteria) this;
        }

        public Criteria andSwsdIsNotNull() {
            addCriterion("SWSD is not null");
            return (Criteria) this;
        }

        public Criteria andSwsdEqualTo(BigDecimal value) {
            addCriterion("SWSD =", value, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdNotEqualTo(BigDecimal value) {
            addCriterion("SWSD <>", value, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdGreaterThan(BigDecimal value) {
            addCriterion("SWSD >", value, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SWSD >=", value, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdLessThan(BigDecimal value) {
            addCriterion("SWSD <", value, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SWSD <=", value, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdIn(List<BigDecimal> values) {
            addCriterion("SWSD in", values, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdNotIn(List<BigDecimal> values) {
            addCriterion("SWSD not in", values, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWSD between", value1, value2, "swsd");
            return (Criteria) this;
        }

        public Criteria andSwsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWSD not between", value1, value2, "swsd");
            return (Criteria) this;
        }

        public Criteria andDxslxIsNull() {
            addCriterion("DXSLX is null");
            return (Criteria) this;
        }

        public Criteria andDxslxIsNotNull() {
            addCriterion("DXSLX is not null");
            return (Criteria) this;
        }

        public Criteria andDxslxEqualTo(String value) {
            addCriterion("DXSLX =", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxNotEqualTo(String value) {
            addCriterion("DXSLX <>", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxGreaterThan(String value) {
            addCriterion("DXSLX >", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxGreaterThanOrEqualTo(String value) {
            addCriterion("DXSLX >=", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxLessThan(String value) {
            addCriterion("DXSLX <", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxLessThanOrEqualTo(String value) {
            addCriterion("DXSLX <=", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxLike(String value) {
            addCriterion("DXSLX like", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxNotLike(String value) {
            addCriterion("DXSLX not like", value, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxIn(List<String> values) {
            addCriterion("DXSLX in", values, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxNotIn(List<String> values) {
            addCriterion("DXSLX not in", values, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxBetween(String value1, String value2) {
            addCriterion("DXSLX between", value1, value2, "dxslx");
            return (Criteria) this;
        }

        public Criteria andDxslxNotBetween(String value1, String value2) {
            addCriterion("DXSLX not between", value1, value2, "dxslx");
            return (Criteria) this;
        }

        public Criteria andSfwdswIsNull() {
            addCriterion("SFWDSW is null");
            return (Criteria) this;
        }

        public Criteria andSfwdswIsNotNull() {
            addCriterion("SFWDSW is not null");
            return (Criteria) this;
        }

        public Criteria andSfwdswEqualTo(String value) {
            addCriterion("SFWDSW =", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswNotEqualTo(String value) {
            addCriterion("SFWDSW <>", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswGreaterThan(String value) {
            addCriterion("SFWDSW >", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswGreaterThanOrEqualTo(String value) {
            addCriterion("SFWDSW >=", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswLessThan(String value) {
            addCriterion("SFWDSW <", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswLessThanOrEqualTo(String value) {
            addCriterion("SFWDSW <=", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswLike(String value) {
            addCriterion("SFWDSW like", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswNotLike(String value) {
            addCriterion("SFWDSW not like", value, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswIn(List<String> values) {
            addCriterion("SFWDSW in", values, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswNotIn(List<String> values) {
            addCriterion("SFWDSW not in", values, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswBetween(String value1, String value2) {
            addCriterion("SFWDSW between", value1, value2, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andSfwdswNotBetween(String value1, String value2) {
            addCriterion("SFWDSW not between", value1, value2, "sfwdsw");
            return (Criteria) this;
        }

        public Criteria andGcrqIsNull() {
            addCriterion("GCRQ is null");
            return (Criteria) this;
        }

        public Criteria andGcrqIsNotNull() {
            addCriterion("GCRQ is not null");
            return (Criteria) this;
        }

        public Criteria andGcrqEqualTo(Date value) {
            addCriterionForJDBCDate("GCRQ =", value, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqNotEqualTo(Date value) {
            addCriterionForJDBCDate("GCRQ <>", value, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqGreaterThan(Date value) {
            addCriterionForJDBCDate("GCRQ >", value, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GCRQ >=", value, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqLessThan(Date value) {
            addCriterionForJDBCDate("GCRQ <", value, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GCRQ <=", value, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqIn(List<Date> values) {
            addCriterionForJDBCDate("GCRQ in", values, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqNotIn(List<Date> values) {
            addCriterionForJDBCDate("GCRQ not in", values, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GCRQ between", value1, value2, "gcrq");
            return (Criteria) this;
        }

        public Criteria andGcrqNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GCRQ not between", value1, value2, "gcrq");
            return (Criteria) this;
        }

        public Criteria andCjswIsNull() {
            addCriterion("CJSW is null");
            return (Criteria) this;
        }

        public Criteria andCjswIsNotNull() {
            addCriterion("CJSW is not null");
            return (Criteria) this;
        }

        public Criteria andCjswEqualTo(String value) {
            addCriterion("CJSW =", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswNotEqualTo(String value) {
            addCriterion("CJSW <>", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswGreaterThan(String value) {
            addCriterion("CJSW >", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswGreaterThanOrEqualTo(String value) {
            addCriterion("CJSW >=", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswLessThan(String value) {
            addCriterion("CJSW <", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswLessThanOrEqualTo(String value) {
            addCriterion("CJSW <=", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswLike(String value) {
            addCriterion("CJSW like", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswNotLike(String value) {
            addCriterion("CJSW not like", value, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswIn(List<String> values) {
            addCriterion("CJSW in", values, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswNotIn(List<String> values) {
            addCriterion("CJSW not in", values, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswBetween(String value1, String value2) {
            addCriterion("CJSW between", value1, value2, "cjsw");
            return (Criteria) this;
        }

        public Criteria andCjswNotBetween(String value1, String value2) {
            addCriterion("CJSW not between", value1, value2, "cjsw");
            return (Criteria) this;
        }

        public Criteria andWdswIsNull() {
            addCriterion("WDSW is null");
            return (Criteria) this;
        }

        public Criteria andWdswIsNotNull() {
            addCriterion("WDSW is not null");
            return (Criteria) this;
        }

        public Criteria andWdswEqualTo(String value) {
            addCriterion("WDSW =", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswNotEqualTo(String value) {
            addCriterion("WDSW <>", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswGreaterThan(String value) {
            addCriterion("WDSW >", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswGreaterThanOrEqualTo(String value) {
            addCriterion("WDSW >=", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswLessThan(String value) {
            addCriterion("WDSW <", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswLessThanOrEqualTo(String value) {
            addCriterion("WDSW <=", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswLike(String value) {
            addCriterion("WDSW like", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswNotLike(String value) {
            addCriterion("WDSW not like", value, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswIn(List<String> values) {
            addCriterion("WDSW in", values, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswNotIn(List<String> values) {
            addCriterion("WDSW not in", values, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswBetween(String value1, String value2) {
            addCriterion("WDSW between", value1, value2, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdswNotBetween(String value1, String value2) {
            addCriterion("WDSW not between", value1, value2, "wdsw");
            return (Criteria) this;
        }

        public Criteria andWdsjIsNull() {
            addCriterion("WDSJ is null");
            return (Criteria) this;
        }

        public Criteria andWdsjIsNotNull() {
            addCriterion("WDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andWdsjEqualTo(String value) {
            addCriterion("WDSJ =", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjNotEqualTo(String value) {
            addCriterion("WDSJ <>", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjGreaterThan(String value) {
            addCriterion("WDSJ >", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjGreaterThanOrEqualTo(String value) {
            addCriterion("WDSJ >=", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjLessThan(String value) {
            addCriterion("WDSJ <", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjLessThanOrEqualTo(String value) {
            addCriterion("WDSJ <=", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjLike(String value) {
            addCriterion("WDSJ like", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjNotLike(String value) {
            addCriterion("WDSJ not like", value, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjIn(List<String> values) {
            addCriterion("WDSJ in", values, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjNotIn(List<String> values) {
            addCriterion("WDSJ not in", values, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjBetween(String value1, String value2) {
            addCriterion("WDSJ between", value1, value2, "wdsj");
            return (Criteria) this;
        }

        public Criteria andWdsjNotBetween(String value1, String value2) {
            addCriterion("WDSJ not between", value1, value2, "wdsj");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
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
     * This class corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
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