package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DizhidiaohuiDizhigouzaoDuancengExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public DizhidiaohuiDizhigouzaoDuancengExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
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
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
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
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
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
     * This class corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
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

        public Criteria andDzdhDzgzDcidIsNull() {
            addCriterion("DZDH_DZGZ_DCID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidIsNotNull() {
            addCriterion("DZDH_DZGZ_DCID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidEqualTo(Long value) {
            addCriterion("DZDH_DZGZ_DCID =", value, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidNotEqualTo(Long value) {
            addCriterion("DZDH_DZGZ_DCID <>", value, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidGreaterThan(Long value) {
            addCriterion("DZDH_DZGZ_DCID >", value, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_DZGZ_DCID >=", value, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidLessThan(Long value) {
            addCriterion("DZDH_DZGZ_DCID <", value, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_DZGZ_DCID <=", value, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidIn(List<Long> values) {
            addCriterion("DZDH_DZGZ_DCID in", values, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidNotIn(List<Long> values) {
            addCriterion("DZDH_DZGZ_DCID not in", values, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidBetween(Long value1, Long value2) {
            addCriterion("DZDH_DZGZ_DCID between", value1, value2, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzDcidNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_DZGZ_DCID not between", value1, value2, "dzdhDzgzDcid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidIsNull() {
            addCriterion("DZDH_DZGZID is null");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidIsNotNull() {
            addCriterion("DZDH_DZGZID is not null");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidEqualTo(Long value) {
            addCriterion("DZDH_DZGZID =", value, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidNotEqualTo(Long value) {
            addCriterion("DZDH_DZGZID <>", value, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidGreaterThan(Long value) {
            addCriterion("DZDH_DZGZID >", value, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidGreaterThanOrEqualTo(Long value) {
            addCriterion("DZDH_DZGZID >=", value, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidLessThan(Long value) {
            addCriterion("DZDH_DZGZID <", value, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidLessThanOrEqualTo(Long value) {
            addCriterion("DZDH_DZGZID <=", value, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidIn(List<Long> values) {
            addCriterion("DZDH_DZGZID in", values, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidNotIn(List<Long> values) {
            addCriterion("DZDH_DZGZID not in", values, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidBetween(Long value1, Long value2) {
            addCriterion("DZDH_DZGZID between", value1, value2, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andDzdhDzgzidNotBetween(Long value1, Long value2) {
            addCriterion("DZDH_DZGZID not between", value1, value2, "dzdhDzgzid");
            return (Criteria) this;
        }

        public Criteria andHdxflIsNull() {
            addCriterion("HDXFL is null");
            return (Criteria) this;
        }

        public Criteria andHdxflIsNotNull() {
            addCriterion("HDXFL is not null");
            return (Criteria) this;
        }

        public Criteria andHdxflEqualTo(String value) {
            addCriterion("HDXFL =", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflNotEqualTo(String value) {
            addCriterion("HDXFL <>", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflGreaterThan(String value) {
            addCriterion("HDXFL >", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflGreaterThanOrEqualTo(String value) {
            addCriterion("HDXFL >=", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflLessThan(String value) {
            addCriterion("HDXFL <", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflLessThanOrEqualTo(String value) {
            addCriterion("HDXFL <=", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflLike(String value) {
            addCriterion("HDXFL like", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflNotLike(String value) {
            addCriterion("HDXFL not like", value, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflIn(List<String> values) {
            addCriterion("HDXFL in", values, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflNotIn(List<String> values) {
            addCriterion("HDXFL not in", values, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflBetween(String value1, String value2) {
            addCriterion("HDXFL between", value1, value2, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andHdxflNotBetween(String value1, String value2) {
            addCriterion("HDXFL not between", value1, value2, "hdxfl");
            return (Criteria) this;
        }

        public Criteria andDcxzIsNull() {
            addCriterion("DCXZ is null");
            return (Criteria) this;
        }

        public Criteria andDcxzIsNotNull() {
            addCriterion("DCXZ is not null");
            return (Criteria) this;
        }

        public Criteria andDcxzEqualTo(String value) {
            addCriterion("DCXZ =", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzNotEqualTo(String value) {
            addCriterion("DCXZ <>", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzGreaterThan(String value) {
            addCriterion("DCXZ >", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzGreaterThanOrEqualTo(String value) {
            addCriterion("DCXZ >=", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzLessThan(String value) {
            addCriterion("DCXZ <", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzLessThanOrEqualTo(String value) {
            addCriterion("DCXZ <=", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzLike(String value) {
            addCriterion("DCXZ like", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzNotLike(String value) {
            addCriterion("DCXZ not like", value, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzIn(List<String> values) {
            addCriterion("DCXZ in", values, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzNotIn(List<String> values) {
            addCriterion("DCXZ not in", values, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzBetween(String value1, String value2) {
            addCriterion("DCXZ between", value1, value2, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcxzNotBetween(String value1, String value2) {
            addCriterion("DCXZ not between", value1, value2, "dcxz");
            return (Criteria) this;
        }

        public Criteria andDcczIsNull() {
            addCriterion("DCCZ is null");
            return (Criteria) this;
        }

        public Criteria andDcczIsNotNull() {
            addCriterion("DCCZ is not null");
            return (Criteria) this;
        }

        public Criteria andDcczEqualTo(String value) {
            addCriterion("DCCZ =", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczNotEqualTo(String value) {
            addCriterion("DCCZ <>", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczGreaterThan(String value) {
            addCriterion("DCCZ >", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczGreaterThanOrEqualTo(String value) {
            addCriterion("DCCZ >=", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczLessThan(String value) {
            addCriterion("DCCZ <", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczLessThanOrEqualTo(String value) {
            addCriterion("DCCZ <=", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczLike(String value) {
            addCriterion("DCCZ like", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczNotLike(String value) {
            addCriterion("DCCZ not like", value, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczIn(List<String> values) {
            addCriterion("DCCZ in", values, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczNotIn(List<String> values) {
            addCriterion("DCCZ not in", values, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczBetween(String value1, String value2) {
            addCriterion("DCCZ between", value1, value2, "dccz");
            return (Criteria) this;
        }

        public Criteria andDcczNotBetween(String value1, String value2) {
            addCriterion("DCCZ not between", value1, value2, "dccz");
            return (Criteria) this;
        }

        public Criteria andDlkdIsNull() {
            addCriterion("DLKD is null");
            return (Criteria) this;
        }

        public Criteria andDlkdIsNotNull() {
            addCriterion("DLKD is not null");
            return (Criteria) this;
        }

        public Criteria andDlkdEqualTo(BigDecimal value) {
            addCriterion("DLKD =", value, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdNotEqualTo(BigDecimal value) {
            addCriterion("DLKD <>", value, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdGreaterThan(BigDecimal value) {
            addCriterion("DLKD >", value, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DLKD >=", value, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdLessThan(BigDecimal value) {
            addCriterion("DLKD <", value, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DLKD <=", value, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdIn(List<BigDecimal> values) {
            addCriterion("DLKD in", values, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdNotIn(List<BigDecimal> values) {
            addCriterion("DLKD not in", values, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DLKD between", value1, value2, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDlkdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DLKD not between", value1, value2, "dlkd");
            return (Criteria) this;
        }

        public Criteria andDccdIsNull() {
            addCriterion("DCCD is null");
            return (Criteria) this;
        }

        public Criteria andDccdIsNotNull() {
            addCriterion("DCCD is not null");
            return (Criteria) this;
        }

        public Criteria andDccdEqualTo(BigDecimal value) {
            addCriterion("DCCD =", value, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdNotEqualTo(BigDecimal value) {
            addCriterion("DCCD <>", value, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdGreaterThan(BigDecimal value) {
            addCriterion("DCCD >", value, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DCCD >=", value, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdLessThan(BigDecimal value) {
            addCriterion("DCCD <", value, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DCCD <=", value, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdIn(List<BigDecimal> values) {
            addCriterion("DCCD in", values, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdNotIn(List<BigDecimal> values) {
            addCriterion("DCCD not in", values, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DCCD between", value1, value2, "dccd");
            return (Criteria) this;
        }

        public Criteria andDccdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DCCD not between", value1, value2, "dccd");
            return (Criteria) this;
        }

        public Criteria andDdwzIsNull() {
            addCriterion("DDWZ is null");
            return (Criteria) this;
        }

        public Criteria andDdwzIsNotNull() {
            addCriterion("DDWZ is not null");
            return (Criteria) this;
        }

        public Criteria andDdwzEqualTo(String value) {
            addCriterion("DDWZ =", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzNotEqualTo(String value) {
            addCriterion("DDWZ <>", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzGreaterThan(String value) {
            addCriterion("DDWZ >", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzGreaterThanOrEqualTo(String value) {
            addCriterion("DDWZ >=", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzLessThan(String value) {
            addCriterion("DDWZ <", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzLessThanOrEqualTo(String value) {
            addCriterion("DDWZ <=", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzLike(String value) {
            addCriterion("DDWZ like", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzNotLike(String value) {
            addCriterion("DDWZ not like", value, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzIn(List<String> values) {
            addCriterion("DDWZ in", values, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzNotIn(List<String> values) {
            addCriterion("DDWZ not in", values, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzBetween(String value1, String value2) {
            addCriterion("DDWZ between", value1, value2, "ddwz");
            return (Criteria) this;
        }

        public Criteria andDdwzNotBetween(String value1, String value2) {
            addCriterion("DDWZ not between", value1, value2, "ddwz");
            return (Criteria) this;
        }

        public Criteria andHdsdIsNull() {
            addCriterion("HDSD is null");
            return (Criteria) this;
        }

        public Criteria andHdsdIsNotNull() {
            addCriterion("HDSD is not null");
            return (Criteria) this;
        }

        public Criteria andHdsdEqualTo(String value) {
            addCriterion("HDSD =", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdNotEqualTo(String value) {
            addCriterion("HDSD <>", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdGreaterThan(String value) {
            addCriterion("HDSD >", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdGreaterThanOrEqualTo(String value) {
            addCriterion("HDSD >=", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdLessThan(String value) {
            addCriterion("HDSD <", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdLessThanOrEqualTo(String value) {
            addCriterion("HDSD <=", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdLike(String value) {
            addCriterion("HDSD like", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdNotLike(String value) {
            addCriterion("HDSD not like", value, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdIn(List<String> values) {
            addCriterion("HDSD in", values, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdNotIn(List<String> values) {
            addCriterion("HDSD not in", values, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdBetween(String value1, String value2) {
            addCriterion("HDSD between", value1, value2, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdsdNotBetween(String value1, String value2) {
            addCriterion("HDSD not between", value1, value2, "hdsd");
            return (Criteria) this;
        }

        public Criteria andHdxzIsNull() {
            addCriterion("HDXZ is null");
            return (Criteria) this;
        }

        public Criteria andHdxzIsNotNull() {
            addCriterion("HDXZ is not null");
            return (Criteria) this;
        }

        public Criteria andHdxzEqualTo(String value) {
            addCriterion("HDXZ =", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzNotEqualTo(String value) {
            addCriterion("HDXZ <>", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzGreaterThan(String value) {
            addCriterion("HDXZ >", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzGreaterThanOrEqualTo(String value) {
            addCriterion("HDXZ >=", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzLessThan(String value) {
            addCriterion("HDXZ <", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzLessThanOrEqualTo(String value) {
            addCriterion("HDXZ <=", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzLike(String value) {
            addCriterion("HDXZ like", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzNotLike(String value) {
            addCriterion("HDXZ not like", value, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzIn(List<String> values) {
            addCriterion("HDXZ in", values, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzNotIn(List<String> values) {
            addCriterion("HDXZ not in", values, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzBetween(String value1, String value2) {
            addCriterion("HDXZ between", value1, value2, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdxzNotBetween(String value1, String value2) {
            addCriterion("HDXZ not between", value1, value2, "hdxz");
            return (Criteria) this;
        }

        public Criteria andHdslSpIsNull() {
            addCriterion("HDSL_SP is null");
            return (Criteria) this;
        }

        public Criteria andHdslSpIsNotNull() {
            addCriterion("HDSL_SP is not null");
            return (Criteria) this;
        }

        public Criteria andHdslSpEqualTo(BigDecimal value) {
            addCriterion("HDSL_SP =", value, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpNotEqualTo(BigDecimal value) {
            addCriterion("HDSL_SP <>", value, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpGreaterThan(BigDecimal value) {
            addCriterion("HDSL_SP >", value, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HDSL_SP >=", value, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpLessThan(BigDecimal value) {
            addCriterion("HDSL_SP <", value, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HDSL_SP <=", value, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpIn(List<BigDecimal> values) {
            addCriterion("HDSL_SP in", values, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpNotIn(List<BigDecimal> values) {
            addCriterion("HDSL_SP not in", values, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HDSL_SP between", value1, value2, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslSpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HDSL_SP not between", value1, value2, "hdslSp");
            return (Criteria) this;
        }

        public Criteria andHdslCzIsNull() {
            addCriterion("HDSL_CZ is null");
            return (Criteria) this;
        }

        public Criteria andHdslCzIsNotNull() {
            addCriterion("HDSL_CZ is not null");
            return (Criteria) this;
        }

        public Criteria andHdslCzEqualTo(BigDecimal value) {
            addCriterion("HDSL_CZ =", value, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzNotEqualTo(BigDecimal value) {
            addCriterion("HDSL_CZ <>", value, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzGreaterThan(BigDecimal value) {
            addCriterion("HDSL_CZ >", value, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HDSL_CZ >=", value, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzLessThan(BigDecimal value) {
            addCriterion("HDSL_CZ <", value, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HDSL_CZ <=", value, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzIn(List<BigDecimal> values) {
            addCriterion("HDSL_CZ in", values, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzNotIn(List<BigDecimal> values) {
            addCriterion("HDSL_CZ not in", values, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HDSL_CZ between", value1, value2, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andHdslCzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HDSL_CZ not between", value1, value2, "hdslCz");
            return (Criteria) this;
        }

        public Criteria andZdwclIsNull() {
            addCriterion("ZDWCL is null");
            return (Criteria) this;
        }

        public Criteria andZdwclIsNotNull() {
            addCriterion("ZDWCL is not null");
            return (Criteria) this;
        }

        public Criteria andZdwclEqualTo(BigDecimal value) {
            addCriterion("ZDWCL =", value, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclNotEqualTo(BigDecimal value) {
            addCriterion("ZDWCL <>", value, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclGreaterThan(BigDecimal value) {
            addCriterion("ZDWCL >", value, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDWCL >=", value, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclLessThan(BigDecimal value) {
            addCriterion("ZDWCL <", value, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDWCL <=", value, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclIn(List<BigDecimal> values) {
            addCriterion("ZDWCL in", values, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclNotIn(List<BigDecimal> values) {
            addCriterion("ZDWCL not in", values, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDWCL between", value1, value2, "zdwcl");
            return (Criteria) this;
        }

        public Criteria andZdwclNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDWCL not between", value1, value2, "zdwcl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
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
     * This class corresponds to the database table dizhidiaohui_dizhigouzao_duanceng
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