package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.Biaozhundiceng;
import cn.xjtu.zun.tiesheyuan.pojo.BiaozhundicengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiaozhundicengMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    long countByExample(BiaozhundicengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByExample(BiaozhundicengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByPrimaryKey(Long bzdcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insert(Biaozhundiceng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insertSelective(Biaozhundiceng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    List<Biaozhundiceng> selectByExample(BiaozhundicengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    Biaozhundiceng selectByPrimaryKey(Long bzdcid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExampleSelective(@Param("record") Biaozhundiceng record, @Param("example") BiaozhundicengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExample(@Param("record") Biaozhundiceng record, @Param("example") BiaozhundicengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKeySelective(Biaozhundiceng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table biaozhundiceng
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKey(Biaozhundiceng record);
}