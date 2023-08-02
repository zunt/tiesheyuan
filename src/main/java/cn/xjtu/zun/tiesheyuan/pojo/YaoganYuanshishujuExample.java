package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YaoganYuanshishujuExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public YaoganYuanshishujuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
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
     * This method corresponds to the database table yaogan_yuanshishuju
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
     * This method corresponds to the database table yaogan_yuanshishuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_yuanshishuju
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
     * This class corresponds to the database table yaogan_yuanshishuju
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

        public Criteria andYgYssjidIsNull() {
            addCriterion("YG_YSSJID is null");
            return (Criteria) this;
        }

        public Criteria andYgYssjidIsNotNull() {
            addCriterion("YG_YSSJID is not null");
            return (Criteria) this;
        }

        public Criteria andYgYssjidEqualTo(Long value) {
            addCriterion("YG_YSSJID =", value, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidNotEqualTo(Long value) {
            addCriterion("YG_YSSJID <>", value, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidGreaterThan(Long value) {
            addCriterion("YG_YSSJID >", value, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidGreaterThanOrEqualTo(Long value) {
            addCriterion("YG_YSSJID >=", value, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidLessThan(Long value) {
            addCriterion("YG_YSSJID <", value, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidLessThanOrEqualTo(Long value) {
            addCriterion("YG_YSSJID <=", value, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidIn(List<Long> values) {
            addCriterion("YG_YSSJID in", values, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidNotIn(List<Long> values) {
            addCriterion("YG_YSSJID not in", values, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidBetween(Long value1, Long value2) {
            addCriterion("YG_YSSJID between", value1, value2, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgYssjidNotBetween(Long value1, Long value2) {
            addCriterion("YG_YSSJID not between", value1, value2, "ygYssjid");
            return (Criteria) this;
        }

        public Criteria andYgffIsNull() {
            addCriterion("YGFF is null");
            return (Criteria) this;
        }

        public Criteria andYgffIsNotNull() {
            addCriterion("YGFF is not null");
            return (Criteria) this;
        }

        public Criteria andYgffEqualTo(String value) {
            addCriterion("YGFF =", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffNotEqualTo(String value) {
            addCriterion("YGFF <>", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffGreaterThan(String value) {
            addCriterion("YGFF >", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffGreaterThanOrEqualTo(String value) {
            addCriterion("YGFF >=", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffLessThan(String value) {
            addCriterion("YGFF <", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffLessThanOrEqualTo(String value) {
            addCriterion("YGFF <=", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffLike(String value) {
            addCriterion("YGFF like", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffNotLike(String value) {
            addCriterion("YGFF not like", value, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffIn(List<String> values) {
            addCriterion("YGFF in", values, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffNotIn(List<String> values) {
            addCriterion("YGFF not in", values, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffBetween(String value1, String value2) {
            addCriterion("YGFF between", value1, value2, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgffNotBetween(String value1, String value2) {
            addCriterion("YGFF not between", value1, value2, "ygff");
            return (Criteria) this;
        }

        public Criteria andYgfwIsNull() {
            addCriterion("YGFW is null");
            return (Criteria) this;
        }

        public Criteria andYgfwIsNotNull() {
            addCriterion("YGFW is not null");
            return (Criteria) this;
        }

        public Criteria andYgfwEqualTo(String value) {
            addCriterion("YGFW =", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwNotEqualTo(String value) {
            addCriterion("YGFW <>", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwGreaterThan(String value) {
            addCriterion("YGFW >", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwGreaterThanOrEqualTo(String value) {
            addCriterion("YGFW >=", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwLessThan(String value) {
            addCriterion("YGFW <", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwLessThanOrEqualTo(String value) {
            addCriterion("YGFW <=", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwLike(String value) {
            addCriterion("YGFW like", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwNotLike(String value) {
            addCriterion("YGFW not like", value, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwIn(List<String> values) {
            addCriterion("YGFW in", values, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwNotIn(List<String> values) {
            addCriterion("YGFW not in", values, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwBetween(String value1, String value2) {
            addCriterion("YGFW between", value1, value2, "ygfw");
            return (Criteria) this;
        }

        public Criteria andYgfwNotBetween(String value1, String value2) {
            addCriterion("YGFW not between", value1, value2, "ygfw");
            return (Criteria) this;
        }

        public Criteria andXmmcidIsNull() {
            addCriterion("XMMCID is null");
            return (Criteria) this;
        }

        public Criteria andXmmcidIsNotNull() {
            addCriterion("XMMCID is not null");
            return (Criteria) this;
        }

        public Criteria andXmmcidEqualTo(String value) {
            addCriterion("XMMCID =", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidNotEqualTo(String value) {
            addCriterion("XMMCID <>", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidGreaterThan(String value) {
            addCriterion("XMMCID >", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidGreaterThanOrEqualTo(String value) {
            addCriterion("XMMCID >=", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidLessThan(String value) {
            addCriterion("XMMCID <", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidLessThanOrEqualTo(String value) {
            addCriterion("XMMCID <=", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidLike(String value) {
            addCriterion("XMMCID like", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidNotLike(String value) {
            addCriterion("XMMCID not like", value, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidIn(List<String> values) {
            addCriterion("XMMCID in", values, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidNotIn(List<String> values) {
            addCriterion("XMMCID not in", values, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidBetween(String value1, String value2) {
            addCriterion("XMMCID between", value1, value2, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcidNotBetween(String value1, String value2) {
            addCriterion("XMMCID not between", value1, value2, "xmmcid");
            return (Criteria) this;
        }

        public Criteria andXmjdidIsNull() {
            addCriterion("XMJDID is null");
            return (Criteria) this;
        }

        public Criteria andXmjdidIsNotNull() {
            addCriterion("XMJDID is not null");
            return (Criteria) this;
        }

        public Criteria andXmjdidEqualTo(String value) {
            addCriterion("XMJDID =", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidNotEqualTo(String value) {
            addCriterion("XMJDID <>", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidGreaterThan(String value) {
            addCriterion("XMJDID >", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidGreaterThanOrEqualTo(String value) {
            addCriterion("XMJDID >=", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidLessThan(String value) {
            addCriterion("XMJDID <", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidLessThanOrEqualTo(String value) {
            addCriterion("XMJDID <=", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidLike(String value) {
            addCriterion("XMJDID like", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidNotLike(String value) {
            addCriterion("XMJDID not like", value, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidIn(List<String> values) {
            addCriterion("XMJDID in", values, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidNotIn(List<String> values) {
            addCriterion("XMJDID not in", values, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidBetween(String value1, String value2) {
            addCriterion("XMJDID between", value1, value2, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmjdidNotBetween(String value1, String value2) {
            addCriterion("XMJDID not between", value1, value2, "xmjdid");
            return (Criteria) this;
        }

        public Criteria andXmdlidIsNull() {
            addCriterion("XMDLID is null");
            return (Criteria) this;
        }

        public Criteria andXmdlidIsNotNull() {
            addCriterion("XMDLID is not null");
            return (Criteria) this;
        }

        public Criteria andXmdlidEqualTo(String value) {
            addCriterion("XMDLID =", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidNotEqualTo(String value) {
            addCriterion("XMDLID <>", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidGreaterThan(String value) {
            addCriterion("XMDLID >", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidGreaterThanOrEqualTo(String value) {
            addCriterion("XMDLID >=", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidLessThan(String value) {
            addCriterion("XMDLID <", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidLessThanOrEqualTo(String value) {
            addCriterion("XMDLID <=", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidLike(String value) {
            addCriterion("XMDLID like", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidNotLike(String value) {
            addCriterion("XMDLID not like", value, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidIn(List<String> values) {
            addCriterion("XMDLID in", values, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidNotIn(List<String> values) {
            addCriterion("XMDLID not in", values, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidBetween(String value1, String value2) {
            addCriterion("XMDLID between", value1, value2, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andXmdlidNotBetween(String value1, String value2) {
            addCriterion("XMDLID not between", value1, value2, "xmdlid");
            return (Criteria) this;
        }

        public Criteria andGcxxidIsNull() {
            addCriterion("GCXXID is null");
            return (Criteria) this;
        }

        public Criteria andGcxxidIsNotNull() {
            addCriterion("GCXXID is not null");
            return (Criteria) this;
        }

        public Criteria andGcxxidEqualTo(Long value) {
            addCriterion("GCXXID =", value, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidNotEqualTo(Long value) {
            addCriterion("GCXXID <>", value, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidGreaterThan(Long value) {
            addCriterion("GCXXID >", value, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidGreaterThanOrEqualTo(Long value) {
            addCriterion("GCXXID >=", value, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidLessThan(Long value) {
            addCriterion("GCXXID <", value, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidLessThanOrEqualTo(Long value) {
            addCriterion("GCXXID <=", value, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidIn(List<Long> values) {
            addCriterion("GCXXID in", values, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidNotIn(List<Long> values) {
            addCriterion("GCXXID not in", values, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidBetween(Long value1, Long value2) {
            addCriterion("GCXXID between", value1, value2, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGcxxidNotBetween(Long value1, Long value2) {
            addCriterion("GCXXID not between", value1, value2, "gcxxid");
            return (Criteria) this;
        }

        public Criteria andGdxxIsNull() {
            addCriterion("GDXX is null");
            return (Criteria) this;
        }

        public Criteria andGdxxIsNotNull() {
            addCriterion("GDXX is not null");
            return (Criteria) this;
        }

        public Criteria andGdxxEqualTo(String value) {
            addCriterion("GDXX =", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxNotEqualTo(String value) {
            addCriterion("GDXX <>", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxGreaterThan(String value) {
            addCriterion("GDXX >", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxGreaterThanOrEqualTo(String value) {
            addCriterion("GDXX >=", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxLessThan(String value) {
            addCriterion("GDXX <", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxLessThanOrEqualTo(String value) {
            addCriterion("GDXX <=", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxLike(String value) {
            addCriterion("GDXX like", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxNotLike(String value) {
            addCriterion("GDXX not like", value, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxIn(List<String> values) {
            addCriterion("GDXX in", values, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxNotIn(List<String> values) {
            addCriterion("GDXX not in", values, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxBetween(String value1, String value2) {
            addCriterion("GDXX between", value1, value2, "gdxx");
            return (Criteria) this;
        }

        public Criteria andGdxxNotBetween(String value1, String value2) {
            addCriterion("GDXX not between", value1, value2, "gdxx");
            return (Criteria) this;
        }

        public Criteria andSssjIsNull() {
            addCriterion("SSSJ is null");
            return (Criteria) this;
        }

        public Criteria andSssjIsNotNull() {
            addCriterion("SSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSssjEqualTo(Date value) {
            addCriterionForJDBCDate("SSSJ =", value, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjNotEqualTo(Date value) {
            addCriterionForJDBCDate("SSSJ <>", value, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjGreaterThan(Date value) {
            addCriterionForJDBCDate("SSSJ >", value, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SSSJ >=", value, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjLessThan(Date value) {
            addCriterionForJDBCDate("SSSJ <", value, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SSSJ <=", value, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjIn(List<Date> values) {
            addCriterionForJDBCDate("SSSJ in", values, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjNotIn(List<Date> values) {
            addCriterionForJDBCDate("SSSJ not in", values, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SSSJ between", value1, value2, "sssj");
            return (Criteria) this;
        }

        public Criteria andSssjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SSSJ not between", value1, value2, "sssj");
            return (Criteria) this;
        }

        public Criteria andCgwjIsNull() {
            addCriterion("CGWJ is null");
            return (Criteria) this;
        }

        public Criteria andCgwjIsNotNull() {
            addCriterion("CGWJ is not null");
            return (Criteria) this;
        }

        public Criteria andCgwjEqualTo(String value) {
            addCriterion("CGWJ =", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjNotEqualTo(String value) {
            addCriterion("CGWJ <>", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjGreaterThan(String value) {
            addCriterion("CGWJ >", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjGreaterThanOrEqualTo(String value) {
            addCriterion("CGWJ >=", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjLessThan(String value) {
            addCriterion("CGWJ <", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjLessThanOrEqualTo(String value) {
            addCriterion("CGWJ <=", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjLike(String value) {
            addCriterion("CGWJ like", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjNotLike(String value) {
            addCriterion("CGWJ not like", value, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjIn(List<String> values) {
            addCriterion("CGWJ in", values, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjNotIn(List<String> values) {
            addCriterion("CGWJ not in", values, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjBetween(String value1, String value2) {
            addCriterion("CGWJ between", value1, value2, "cgwj");
            return (Criteria) this;
        }

        public Criteria andCgwjNotBetween(String value1, String value2) {
            addCriterion("CGWJ not between", value1, value2, "cgwj");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yaogan_yuanshishuju
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
     * This class corresponds to the database table yaogan_yuanshishuju
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