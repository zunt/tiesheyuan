package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.JingtanShuiwei;
import cn.xjtu.zun.tiesheyuan.pojo.JingtanShuiweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JingtanShuiweiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(JingtanShuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(JingtanShuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long jtSwid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(JingtanShuiwei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(JingtanShuiwei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<JingtanShuiwei> selectByExample(JingtanShuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    JingtanShuiwei selectByPrimaryKey(Long jtSwid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") JingtanShuiwei record, @Param("example") JingtanShuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") JingtanShuiwei record, @Param("example") JingtanShuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(JingtanShuiwei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_shuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(JingtanShuiwei record);
}