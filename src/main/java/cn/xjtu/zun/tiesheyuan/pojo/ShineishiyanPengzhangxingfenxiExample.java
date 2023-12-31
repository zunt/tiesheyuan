package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShineishiyanPengzhangxingfenxiExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public ShineishiyanPengzhangxingfenxiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
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
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
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
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_pengzhangxingfenxi
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
     * This class corresponds to the database table shineishiyan_pengzhangxingfenxi
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

        public Criteria andSnsyPzxfxidIsNull() {
            addCriterion("SNSY_PZXFXID is null");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidIsNotNull() {
            addCriterion("SNSY_PZXFXID is not null");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidEqualTo(Long value) {
            addCriterion("SNSY_PZXFXID =", value, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidNotEqualTo(Long value) {
            addCriterion("SNSY_PZXFXID <>", value, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidGreaterThan(Long value) {
            addCriterion("SNSY_PZXFXID >", value, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidGreaterThanOrEqualTo(Long value) {
            addCriterion("SNSY_PZXFXID >=", value, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidLessThan(Long value) {
            addCriterion("SNSY_PZXFXID <", value, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidLessThanOrEqualTo(Long value) {
            addCriterion("SNSY_PZXFXID <=", value, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidIn(List<Long> values) {
            addCriterion("SNSY_PZXFXID in", values, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidNotIn(List<Long> values) {
            addCriterion("SNSY_PZXFXID not in", values, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidBetween(Long value1, Long value2) {
            addCriterion("SNSY_PZXFXID between", value1, value2, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyPzxfxidNotBetween(Long value1, Long value2) {
            addCriterion("SNSY_PZXFXID not between", value1, value2, "snsyPzxfxid");
            return (Criteria) this;
        }

        public Criteria andSnsyidIsNull() {
            addCriterion("SNSYID is null");
            return (Criteria) this;
        }

        public Criteria andSnsyidIsNotNull() {
            addCriterion("SNSYID is not null");
            return (Criteria) this;
        }

        public Criteria andSnsyidEqualTo(Long value) {
            addCriterion("SNSYID =", value, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidNotEqualTo(Long value) {
            addCriterion("SNSYID <>", value, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidGreaterThan(Long value) {
            addCriterion("SNSYID >", value, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidGreaterThanOrEqualTo(Long value) {
            addCriterion("SNSYID >=", value, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidLessThan(Long value) {
            addCriterion("SNSYID <", value, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidLessThanOrEqualTo(Long value) {
            addCriterion("SNSYID <=", value, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidIn(List<Long> values) {
            addCriterion("SNSYID in", values, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidNotIn(List<Long> values) {
            addCriterion("SNSYID not in", values, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidBetween(Long value1, Long value2) {
            addCriterion("SNSYID between", value1, value2, "snsyid");
            return (Criteria) this;
        }

        public Criteria andSnsyidNotBetween(Long value1, Long value2) {
            addCriterion("SNSYID not between", value1, value2, "snsyid");
            return (Criteria) this;
        }

        public Criteria andQybhIsNull() {
            addCriterion("QYBH is null");
            return (Criteria) this;
        }

        public Criteria andQybhIsNotNull() {
            addCriterion("QYBH is not null");
            return (Criteria) this;
        }

        public Criteria andQybhEqualTo(String value) {
            addCriterion("QYBH =", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhNotEqualTo(String value) {
            addCriterion("QYBH <>", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhGreaterThan(String value) {
            addCriterion("QYBH >", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhGreaterThanOrEqualTo(String value) {
            addCriterion("QYBH >=", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhLessThan(String value) {
            addCriterion("QYBH <", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhLessThanOrEqualTo(String value) {
            addCriterion("QYBH <=", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhLike(String value) {
            addCriterion("QYBH like", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhNotLike(String value) {
            addCriterion("QYBH not like", value, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhIn(List<String> values) {
            addCriterion("QYBH in", values, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhNotIn(List<String> values) {
            addCriterion("QYBH not in", values, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhBetween(String value1, String value2) {
            addCriterion("QYBH between", value1, value2, "qybh");
            return (Criteria) this;
        }

        public Criteria andQybhNotBetween(String value1, String value2) {
            addCriterion("QYBH not between", value1, value2, "qybh");
            return (Criteria) this;
        }

        public Criteria andWtbhIsNull() {
            addCriterion("WTBH is null");
            return (Criteria) this;
        }

        public Criteria andWtbhIsNotNull() {
            addCriterion("WTBH is not null");
            return (Criteria) this;
        }

        public Criteria andWtbhEqualTo(String value) {
            addCriterion("WTBH =", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhNotEqualTo(String value) {
            addCriterion("WTBH <>", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhGreaterThan(String value) {
            addCriterion("WTBH >", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhGreaterThanOrEqualTo(String value) {
            addCriterion("WTBH >=", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhLessThan(String value) {
            addCriterion("WTBH <", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhLessThanOrEqualTo(String value) {
            addCriterion("WTBH <=", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhLike(String value) {
            addCriterion("WTBH like", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhNotLike(String value) {
            addCriterion("WTBH not like", value, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhIn(List<String> values) {
            addCriterion("WTBH in", values, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhNotIn(List<String> values) {
            addCriterion("WTBH not in", values, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhBetween(String value1, String value2) {
            addCriterion("WTBH between", value1, value2, "wtbh");
            return (Criteria) this;
        }

        public Criteria andWtbhNotBetween(String value1, String value2) {
            addCriterion("WTBH not between", value1, value2, "wtbh");
            return (Criteria) this;
        }

        public Criteria andQyddjlcIsNull() {
            addCriterion("QYDDJLC is null");
            return (Criteria) this;
        }

        public Criteria andQyddjlcIsNotNull() {
            addCriterion("QYDDJLC is not null");
            return (Criteria) this;
        }

        public Criteria andQyddjlcEqualTo(String value) {
            addCriterion("QYDDJLC =", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcNotEqualTo(String value) {
            addCriterion("QYDDJLC <>", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcGreaterThan(String value) {
            addCriterion("QYDDJLC >", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcGreaterThanOrEqualTo(String value) {
            addCriterion("QYDDJLC >=", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcLessThan(String value) {
            addCriterion("QYDDJLC <", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcLessThanOrEqualTo(String value) {
            addCriterion("QYDDJLC <=", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcLike(String value) {
            addCriterion("QYDDJLC like", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcNotLike(String value) {
            addCriterion("QYDDJLC not like", value, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcIn(List<String> values) {
            addCriterion("QYDDJLC in", values, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcNotIn(List<String> values) {
            addCriterion("QYDDJLC not in", values, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcBetween(String value1, String value2) {
            addCriterion("QYDDJLC between", value1, value2, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQyddjlcNotBetween(String value1, String value2) {
            addCriterion("QYDDJLC not between", value1, value2, "qyddjlc");
            return (Criteria) this;
        }

        public Criteria andQytsdIsNull() {
            addCriterion("QYTSD is null");
            return (Criteria) this;
        }

        public Criteria andQytsdIsNotNull() {
            addCriterion("QYTSD is not null");
            return (Criteria) this;
        }

        public Criteria andQytsdEqualTo(BigDecimal value) {
            addCriterion("QYTSD =", value, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdNotEqualTo(BigDecimal value) {
            addCriterion("QYTSD <>", value, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdGreaterThan(BigDecimal value) {
            addCriterion("QYTSD >", value, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QYTSD >=", value, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdLessThan(BigDecimal value) {
            addCriterion("QYTSD <", value, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QYTSD <=", value, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdIn(List<BigDecimal> values) {
            addCriterion("QYTSD in", values, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdNotIn(List<BigDecimal> values) {
            addCriterion("QYTSD not in", values, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QYTSD between", value1, value2, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQytsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QYTSD not between", value1, value2, "qytsd");
            return (Criteria) this;
        }

        public Criteria andQybsdIsNull() {
            addCriterion("QYBSD is null");
            return (Criteria) this;
        }

        public Criteria andQybsdIsNotNull() {
            addCriterion("QYBSD is not null");
            return (Criteria) this;
        }

        public Criteria andQybsdEqualTo(BigDecimal value) {
            addCriterion("QYBSD =", value, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdNotEqualTo(BigDecimal value) {
            addCriterion("QYBSD <>", value, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdGreaterThan(BigDecimal value) {
            addCriterion("QYBSD >", value, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QYBSD >=", value, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdLessThan(BigDecimal value) {
            addCriterion("QYBSD <", value, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QYBSD <=", value, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdIn(List<BigDecimal> values) {
            addCriterion("QYBSD in", values, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdNotIn(List<BigDecimal> values) {
            addCriterion("QYBSD not in", values, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QYBSD between", value1, value2, "qybsd");
            return (Criteria) this;
        }

        public Criteria andQybsdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QYBSD not between", value1, value2, "qybsd");
            return (Criteria) this;
        }

        public Criteria andZypzlFsIsNull() {
            addCriterion("ZYPZL_Fs is null");
            return (Criteria) this;
        }

        public Criteria andZypzlFsIsNotNull() {
            addCriterion("ZYPZL_Fs is not null");
            return (Criteria) this;
        }

        public Criteria andZypzlFsEqualTo(BigDecimal value) {
            addCriterion("ZYPZL_Fs =", value, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsNotEqualTo(BigDecimal value) {
            addCriterion("ZYPZL_Fs <>", value, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsGreaterThan(BigDecimal value) {
            addCriterion("ZYPZL_Fs >", value, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYPZL_Fs >=", value, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsLessThan(BigDecimal value) {
            addCriterion("ZYPZL_Fs <", value, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYPZL_Fs <=", value, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsIn(List<BigDecimal> values) {
            addCriterion("ZYPZL_Fs in", values, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsNotIn(List<BigDecimal> values) {
            addCriterion("ZYPZL_Fs not in", values, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYPZL_Fs between", value1, value2, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andZypzlFsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYPZL_Fs not between", value1, value2, "zypzlFs");
            return (Criteria) this;
        }

        public Criteria andYlzjhlIsNull() {
            addCriterion("YLZJHL is null");
            return (Criteria) this;
        }

        public Criteria andYlzjhlIsNotNull() {
            addCriterion("YLZJHL is not null");
            return (Criteria) this;
        }

        public Criteria andYlzjhlEqualTo(BigDecimal value) {
            addCriterion("YLZJHL =", value, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlNotEqualTo(BigDecimal value) {
            addCriterion("YLZJHL <>", value, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlGreaterThan(BigDecimal value) {
            addCriterion("YLZJHL >", value, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YLZJHL >=", value, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlLessThan(BigDecimal value) {
            addCriterion("YLZJHL <", value, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YLZJHL <=", value, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlIn(List<BigDecimal> values) {
            addCriterion("YLZJHL in", values, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlNotIn(List<BigDecimal> values) {
            addCriterion("YLZJHL not in", values, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLZJHL between", value1, value2, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andYlzjhlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLZJHL not between", value1, value2, "ylzjhl");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbIsNull() {
            addCriterion("MTSHLBFB is null");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbIsNotNull() {
            addCriterion("MTSHLBFB is not null");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbEqualTo(BigDecimal value) {
            addCriterion("MTSHLBFB =", value, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbNotEqualTo(BigDecimal value) {
            addCriterion("MTSHLBFB <>", value, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbGreaterThan(BigDecimal value) {
            addCriterion("MTSHLBFB >", value, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MTSHLBFB >=", value, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbLessThan(BigDecimal value) {
            addCriterion("MTSHLBFB <", value, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MTSHLBFB <=", value, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbIn(List<BigDecimal> values) {
            addCriterion("MTSHLBFB in", values, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbNotIn(List<BigDecimal> values) {
            addCriterion("MTSHLBFB not in", values, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MTSHLBFB between", value1, value2, "mtshlbfb");
            return (Criteria) this;
        }

        public Criteria andMtshlbfbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MTSHLBFB not between", value1, value2, "mtshlbfb");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table shineishiyan_pengzhangxingfenxi
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
     * This class corresponds to the database table shineishiyan_pengzhangxingfenxi
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