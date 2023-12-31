package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.JingtanLuoxuanbanzaihe;
import cn.xjtu.zun.tiesheyuan.pojo.JingtanLuoxuanbanzaiheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JingtanLuoxuanbanzaiheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(JingtanLuoxuanbanzaiheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(JingtanLuoxuanbanzaiheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long jtLxbzhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(JingtanLuoxuanbanzaihe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(JingtanLuoxuanbanzaihe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<JingtanLuoxuanbanzaihe> selectByExample(JingtanLuoxuanbanzaiheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    JingtanLuoxuanbanzaihe selectByPrimaryKey(Long jtLxbzhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") JingtanLuoxuanbanzaihe record, @Param("example") JingtanLuoxuanbanzaiheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") JingtanLuoxuanbanzaihe record, @Param("example") JingtanLuoxuanbanzaiheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(JingtanLuoxuanbanzaihe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_luoxuanbanzaihe
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(JingtanLuoxuanbanzaihe record);
}