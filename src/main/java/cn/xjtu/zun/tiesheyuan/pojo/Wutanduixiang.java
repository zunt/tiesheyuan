package cn.xjtu.zun.tiesheyuan.pojo;

import java.util.Date;

public class Wutanduixiang {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wutanduixiang.WTDXID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private Long wtdxid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wutanduixiang.CSRY
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private String csry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wutanduixiang.CSRQ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private Date csrq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wutanduixiang.GCXXID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private Long gcxxid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wutanduixiang.WTDXID
     *
     * @return the value of wutanduixiang.WTDXID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Long getWtdxid() {
        return wtdxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wutanduixiang.WTDXID
     *
     * @param wtdxid the value for wutanduixiang.WTDXID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setWtdxid(Long wtdxid) {
        this.wtdxid = wtdxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wutanduixiang.CSRY
     *
     * @return the value of wutanduixiang.CSRY
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public String getCsry() {
        return csry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wutanduixiang.CSRY
     *
     * @param csry the value for wutanduixiang.CSRY
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setCsry(String csry) {
        this.csry = csry == null ? null : csry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wutanduixiang.CSRQ
     *
     * @return the value of wutanduixiang.CSRQ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Date getCsrq() {
        return csrq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wutanduixiang.CSRQ
     *
     * @param csrq the value for wutanduixiang.CSRQ
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wutanduixiang.GCXXID
     *
     * @return the value of wutanduixiang.GCXXID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Long getGcxxid() {
        return gcxxid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wutanduixiang.GCXXID
     *
     * @param gcxxid the value for wutanduixiang.GCXXID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setGcxxid(Long gcxxid) {
        this.gcxxid = gcxxid;
    }
}