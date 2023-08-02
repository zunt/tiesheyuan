package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DuanluochengguoBim;
import cn.xjtu.zun.tiesheyuan.pojo.DuanluochengguoBimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DuanluochengguoBimMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DuanluochengguoBimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DuanluochengguoBimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DuanluochengguoBim record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DuanluochengguoBim record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DuanluochengguoBim> selectByExample(DuanluochengguoBimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DuanluochengguoBim selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DuanluochengguoBim record, @Param("example") DuanluochengguoBimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DuanluochengguoBim record, @Param("example") DuanluochengguoBimExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DuanluochengguoBim record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_bim
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DuanluochengguoBim record);
}