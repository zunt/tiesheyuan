package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoBuliangdizhiNishiliu;
import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoBuliangdizhiNishiliuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoganJieyichengguoBuliangdizhiNishiliuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(YaoganJieyichengguoBuliangdizhiNishiliuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(YaoganJieyichengguoBuliangdizhiNishiliuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long ygJycgBldzNslid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(YaoganJieyichengguoBuliangdizhiNishiliu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(YaoganJieyichengguoBuliangdizhiNishiliu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<YaoganJieyichengguoBuliangdizhiNishiliu> selectByExample(YaoganJieyichengguoBuliangdizhiNishiliuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    YaoganJieyichengguoBuliangdizhiNishiliu selectByPrimaryKey(Long ygJycgBldzNslid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") YaoganJieyichengguoBuliangdizhiNishiliu record, @Param("example") YaoganJieyichengguoBuliangdizhiNishiliuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") YaoganJieyichengguoBuliangdizhiNishiliu record, @Param("example") YaoganJieyichengguoBuliangdizhiNishiliuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(YaoganJieyichengguoBuliangdizhiNishiliu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_nishiliu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(YaoganJieyichengguoBuliangdizhiNishiliu record);
}