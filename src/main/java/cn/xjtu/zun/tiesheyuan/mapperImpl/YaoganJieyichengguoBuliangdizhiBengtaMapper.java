package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoBuliangdizhiBengta;
import cn.xjtu.zun.tiesheyuan.pojo.YaoganJieyichengguoBuliangdizhiBengtaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YaoganJieyichengguoBuliangdizhiBengtaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(YaoganJieyichengguoBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(YaoganJieyichengguoBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long ygJycgBldzBtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(YaoganJieyichengguoBuliangdizhiBengta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(YaoganJieyichengguoBuliangdizhiBengta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<YaoganJieyichengguoBuliangdizhiBengta> selectByExample(YaoganJieyichengguoBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    YaoganJieyichengguoBuliangdizhiBengta selectByPrimaryKey(Long ygJycgBldzBtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") YaoganJieyichengguoBuliangdizhiBengta record, @Param("example") YaoganJieyichengguoBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") YaoganJieyichengguoBuliangdizhiBengta record, @Param("example") YaoganJieyichengguoBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(YaoganJieyichengguoBuliangdizhiBengta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yaogan_jieyichengguo_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(YaoganJieyichengguoBuliangdizhiBengta record);
}