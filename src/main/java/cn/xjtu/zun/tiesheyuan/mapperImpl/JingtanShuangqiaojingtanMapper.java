package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.JingtanShuangqiaojingtan;
import cn.xjtu.zun.tiesheyuan.pojo.JingtanShuangqiaojingtanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JingtanShuangqiaojingtanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(JingtanShuangqiaojingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(JingtanShuangqiaojingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long jtSqjtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(JingtanShuangqiaojingtan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(JingtanShuangqiaojingtan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<JingtanShuangqiaojingtan> selectByExample(JingtanShuangqiaojingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    JingtanShuangqiaojingtan selectByPrimaryKey(Long jtSqjtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") JingtanShuangqiaojingtan record, @Param("example") JingtanShuangqiaojingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") JingtanShuangqiaojingtan record, @Param("example") JingtanShuangqiaojingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(JingtanShuangqiaojingtan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuangqiaojingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(JingtanShuangqiaojingtan record);
}