package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.WutanDadidianciBck;
import cn.xjtu.zun.tiesheyuan.pojo.WutanDadidianciBckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WutanDadidianciBckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(WutanDadidianciBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(WutanDadidianciBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long wtDddcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(WutanDadidianciBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(WutanDadidianciBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<WutanDadidianciBck> selectByExample(WutanDadidianciBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    WutanDadidianciBck selectByPrimaryKey(Long wtDddcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") WutanDadidianciBck record, @Param("example") WutanDadidianciBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") WutanDadidianciBck record, @Param("example") WutanDadidianciBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(WutanDadidianciBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dadidianci_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(WutanDadidianciBck record);
}