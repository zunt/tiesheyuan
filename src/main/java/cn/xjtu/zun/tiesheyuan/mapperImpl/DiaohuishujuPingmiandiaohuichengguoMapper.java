package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DiaohuishujuPingmiandiaohuichengguo;
import cn.xjtu.zun.tiesheyuan.pojo.DiaohuishujuPingmiandiaohuichengguoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiaohuishujuPingmiandiaohuichengguoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DiaohuishujuPingmiandiaohuichengguoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DiaohuishujuPingmiandiaohuichengguoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DiaohuishujuPingmiandiaohuichengguo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DiaohuishujuPingmiandiaohuichengguo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DiaohuishujuPingmiandiaohuichengguo> selectByExample(DiaohuishujuPingmiandiaohuichengguoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DiaohuishujuPingmiandiaohuichengguo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DiaohuishujuPingmiandiaohuichengguo record, @Param("example") DiaohuishujuPingmiandiaohuichengguoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DiaohuishujuPingmiandiaohuichengguo record, @Param("example") DiaohuishujuPingmiandiaohuichengguoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DiaohuishujuPingmiandiaohuichengguo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_pingmiandiaohuichengguo
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DiaohuishujuPingmiandiaohuichengguo record);
}