package cn.xjtu.zun.tiesheyuan.pojo;

import java.math.BigDecimal;

public class JingtanYinglichan {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jingtan_yinglichan.JT_YLCID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private Long jtYlcid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jingtan_yinglichan.JTID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private Long jtid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jingtan_yinglichan.SD
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    private BigDecimal sd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jingtan_yinglichan.JT_YLCID
     *
     * @return the value of jingtan_yinglichan.JT_YLCID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Long getJtYlcid() {
        return jtYlcid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jingtan_yinglichan.JT_YLCID
     *
     * @param jtYlcid the value for jingtan_yinglichan.JT_YLCID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setJtYlcid(Long jtYlcid) {
        this.jtYlcid = jtYlcid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jingtan_yinglichan.JTID
     *
     * @return the value of jingtan_yinglichan.JTID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public Long getJtid() {
        return jtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jingtan_yinglichan.JTID
     *
     * @param jtid the value for jingtan_yinglichan.JTID
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setJtid(Long jtid) {
        this.jtid = jtid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jingtan_yinglichan.SD
     *
     * @return the value of jingtan_yinglichan.SD
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public BigDecimal getSd() {
        return sd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jingtan_yinglichan.SD
     *
     * @param sd the value for jingtan_yinglichan.SD
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    public void setSd(BigDecimal sd) {
        this.sd = sd;
    }
}