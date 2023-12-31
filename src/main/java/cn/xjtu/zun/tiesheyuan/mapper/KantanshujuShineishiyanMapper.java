package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuShineishiyan;
import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuShineishiyanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KantanshujuShineishiyanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(KantanshujuShineishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(KantanshujuShineishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(KantanshujuShineishiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(KantanshujuShineishiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<KantanshujuShineishiyan> selectByExample(KantanshujuShineishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    KantanshujuShineishiyan selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") KantanshujuShineishiyan record, @Param("example") KantanshujuShineishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") KantanshujuShineishiyan record, @Param("example") KantanshujuShineishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(KantanshujuShineishiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shineishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(KantanshujuShineishiyan record);
}