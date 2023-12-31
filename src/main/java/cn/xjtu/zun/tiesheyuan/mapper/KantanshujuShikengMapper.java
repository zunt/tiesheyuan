package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuShikeng;
import cn.xjtu.zun.tiesheyuan.pojo.KantanshujuShikengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KantanshujuShikengMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(KantanshujuShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(KantanshujuShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(KantanshujuShikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(KantanshujuShikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<KantanshujuShikeng> selectByExample(KantanshujuShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    KantanshujuShikeng selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") KantanshujuShikeng record, @Param("example") KantanshujuShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") KantanshujuShikeng record, @Param("example") KantanshujuShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(KantanshujuShikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table kantanshuju_shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(KantanshujuShikeng record);
}