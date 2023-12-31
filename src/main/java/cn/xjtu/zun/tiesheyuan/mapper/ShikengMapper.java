package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.Shikeng;
import cn.xjtu.zun.tiesheyuan.pojo.ShikengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShikengMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long skid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(Shikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(Shikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<Shikeng> selectByExample(ShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    Shikeng selectByPrimaryKey(Long skid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") Shikeng record, @Param("example") ShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") Shikeng record, @Param("example") ShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(Shikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shikeng
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(Shikeng record);
}