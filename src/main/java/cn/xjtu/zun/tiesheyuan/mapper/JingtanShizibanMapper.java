package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.JingtanShiziban;
import cn.xjtu.zun.tiesheyuan.pojo.JingtanShizibanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JingtanShizibanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(JingtanShizibanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(JingtanShizibanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long jtSzbid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(JingtanShiziban record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(JingtanShiziban record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<JingtanShiziban> selectByExample(JingtanShizibanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    JingtanShiziban selectByPrimaryKey(Long jtSzbid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") JingtanShiziban record, @Param("example") JingtanShizibanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") JingtanShiziban record, @Param("example") JingtanShizibanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(JingtanShiziban record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shiziban
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(JingtanShiziban record);
}