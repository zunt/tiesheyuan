package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.JingtanYinglichan;
import cn.xjtu.zun.tiesheyuan.pojo.JingtanYinglichanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JingtanYinglichanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(JingtanYinglichanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(JingtanYinglichanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long jtYlcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(JingtanYinglichan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(JingtanYinglichan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<JingtanYinglichan> selectByExample(JingtanYinglichanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    JingtanYinglichan selectByPrimaryKey(Long jtYlcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") JingtanYinglichan record, @Param("example") JingtanYinglichanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") JingtanYinglichan record, @Param("example") JingtanYinglichanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(JingtanYinglichan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_yinglichan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(JingtanYinglichan record);
}