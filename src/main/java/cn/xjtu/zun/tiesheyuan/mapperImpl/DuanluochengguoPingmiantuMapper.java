package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DuanluochengguoPingmiantu;
import cn.xjtu.zun.tiesheyuan.pojo.DuanluochengguoPingmiantuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DuanluochengguoPingmiantuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DuanluochengguoPingmiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DuanluochengguoPingmiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DuanluochengguoPingmiantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DuanluochengguoPingmiantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DuanluochengguoPingmiantu> selectByExample(DuanluochengguoPingmiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DuanluochengguoPingmiantu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DuanluochengguoPingmiantu record, @Param("example") DuanluochengguoPingmiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DuanluochengguoPingmiantu record, @Param("example") DuanluochengguoPingmiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DuanluochengguoPingmiantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_pingmiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DuanluochengguoPingmiantu record);
}