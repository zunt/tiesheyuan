package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoTeshuyantu;
import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoTeshuyantuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoganJieyichengguoTeshuyantuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(YaoganJieyichengguoTeshuyantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(YaoganJieyichengguoTeshuyantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long ygJycgTsytid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(YaoganJieyichengguoTeshuyantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(YaoganJieyichengguoTeshuyantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<YaoganJieyichengguoTeshuyantu> selectByExample(YaoganJieyichengguoTeshuyantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    YaoganJieyichengguoTeshuyantu selectByPrimaryKey(Long ygJycgTsytid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") YaoganJieyichengguoTeshuyantu record, @Param("example") YaoganJieyichengguoTeshuyantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") YaoganJieyichengguoTeshuyantu record, @Param("example") YaoganJieyichengguoTeshuyantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(YaoganJieyichengguoTeshuyantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_teshuyantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(YaoganJieyichengguoTeshuyantu record);
}