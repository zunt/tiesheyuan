package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.WutanduixiangCexianGaomidudianfa;
import cn.xjtu.zun.tiesheyuan.pojo.WutanduixiangCexianGaomidudianfaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WutanduixiangCexianGaomidudianfaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(WutanduixiangCexianGaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(WutanduixiangCexianGaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long wtdxCxGmddfid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(WutanduixiangCexianGaomidudianfa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(WutanduixiangCexianGaomidudianfa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<WutanduixiangCexianGaomidudianfa> selectByExample(WutanduixiangCexianGaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    WutanduixiangCexianGaomidudianfa selectByPrimaryKey(Long wtdxCxGmddfid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") WutanduixiangCexianGaomidudianfa record, @Param("example") WutanduixiangCexianGaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") WutanduixiangCexianGaomidudianfa record, @Param("example") WutanduixiangCexianGaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(WutanduixiangCexianGaomidudianfa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutanduixiang_cexian_gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(WutanduixiangCexianGaomidudianfa record);
}