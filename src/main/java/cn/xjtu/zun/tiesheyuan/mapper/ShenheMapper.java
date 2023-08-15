package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.Shenhe;
import cn.xjtu.zun.tiesheyuan.pojo.ShenheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShenheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    long countByExample(ShenheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int deleteByExample(ShenheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int insert(Shenhe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int insertSelective(Shenhe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    List<Shenhe> selectByExample(ShenheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    Shenhe selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByExampleSelective(@Param("record") Shenhe record, @Param("example") ShenheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByExample(@Param("record") Shenhe record, @Param("example") ShenheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByPrimaryKeySelective(Shenhe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shenhe
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByPrimaryKey(Shenhe record);
}