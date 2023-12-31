package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuZuantan;
import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuZuantanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KantanshujuZuantanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(KantanshujuZuantanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(KantanshujuZuantanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(KantanshujuZuantan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(KantanshujuZuantan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<KantanshujuZuantan> selectByExample(KantanshujuZuantanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    KantanshujuZuantan selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") KantanshujuZuantan record, @Param("example") KantanshujuZuantanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") KantanshujuZuantan record, @Param("example") KantanshujuZuantanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(KantanshujuZuantan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_zuantan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(KantanshujuZuantan record);
}