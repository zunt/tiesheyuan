package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuJingtan;
import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuJingtanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KantanshujuJingtanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(KantanshujuJingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(KantanshujuJingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(KantanshujuJingtan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(KantanshujuJingtan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<KantanshujuJingtan> selectByExample(KantanshujuJingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    KantanshujuJingtan selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") KantanshujuJingtan record, @Param("example") KantanshujuJingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") KantanshujuJingtan record, @Param("example") KantanshujuJingtanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(KantanshujuJingtan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_jingtan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(KantanshujuJingtan record);
}