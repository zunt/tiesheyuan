package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.GaomidudianfaChengguowenjian;
import cn.xjtu.zun.tiesheyuan.pojo.GaomidudianfaChengguowenjianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GaomidudianfaChengguowenjianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(GaomidudianfaChengguowenjianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(GaomidudianfaChengguowenjianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(GaomidudianfaChengguowenjian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(GaomidudianfaChengguowenjian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<GaomidudianfaChengguowenjian> selectByExample(GaomidudianfaChengguowenjianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    GaomidudianfaChengguowenjian selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") GaomidudianfaChengguowenjian record, @Param("example") GaomidudianfaChengguowenjianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") GaomidudianfaChengguowenjian record, @Param("example") GaomidudianfaChengguowenjianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(GaomidudianfaChengguowenjian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa_chengguowenjian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(GaomidudianfaChengguowenjian record);
}