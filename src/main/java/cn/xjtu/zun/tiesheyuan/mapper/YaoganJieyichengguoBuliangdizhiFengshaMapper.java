package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoBuliangdizhiFengsha;
import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoBuliangdizhiFengshaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoganJieyichengguoBuliangdizhiFengshaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(YaoganJieyichengguoBuliangdizhiFengshaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(YaoganJieyichengguoBuliangdizhiFengshaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long ygJycgBldzFsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(YaoganJieyichengguoBuliangdizhiFengsha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(YaoganJieyichengguoBuliangdizhiFengsha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<YaoganJieyichengguoBuliangdizhiFengsha> selectByExample(YaoganJieyichengguoBuliangdizhiFengshaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    YaoganJieyichengguoBuliangdizhiFengsha selectByPrimaryKey(Long ygJycgBldzFsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") YaoganJieyichengguoBuliangdizhiFengsha record, @Param("example") YaoganJieyichengguoBuliangdizhiFengshaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") YaoganJieyichengguoBuliangdizhiFengsha record, @Param("example") YaoganJieyichengguoBuliangdizhiFengshaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(YaoganJieyichengguoBuliangdizhiFengsha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_fengsha
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(YaoganJieyichengguoBuliangdizhiFengsha record);
}