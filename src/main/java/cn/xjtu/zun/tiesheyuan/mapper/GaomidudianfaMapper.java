package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.Gaomidudianfa;
import cn.xjtu.zun.tiesheyuan.pojo.GaomidudianfaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GaomidudianfaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(GaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(GaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(Gaomidudianfa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(Gaomidudianfa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<Gaomidudianfa> selectByExample(GaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    Gaomidudianfa selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") Gaomidudianfa record, @Param("example") GaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") Gaomidudianfa record, @Param("example") GaomidudianfaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(Gaomidudianfa record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaomidudianfa
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(Gaomidudianfa record);
}