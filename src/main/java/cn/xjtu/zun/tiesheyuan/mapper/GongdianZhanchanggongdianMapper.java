package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.GongdianZhanchanggongdian;
import cn.xjtu.zun.tiesheyuan.pojo.GongdianZhanchanggongdianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongdianZhanchanggongdianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(GongdianZhanchanggongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(GongdianZhanchanggongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(GongdianZhanchanggongdian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(GongdianZhanchanggongdian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<GongdianZhanchanggongdian> selectByExample(GongdianZhanchanggongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    GongdianZhanchanggongdian selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") GongdianZhanchanggongdian record, @Param("example") GongdianZhanchanggongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") GongdianZhanchanggongdian record, @Param("example") GongdianZhanchanggongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(GongdianZhanchanggongdian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_zhanchanggongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(GongdianZhanchanggongdian record);
}