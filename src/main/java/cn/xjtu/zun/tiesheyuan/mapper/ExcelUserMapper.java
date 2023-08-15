package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ExcelUser;
import cn.xjtu.zun.tiesheyuan.pojo.ExcelUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExcelUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    long countByExample(ExcelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int deleteByExample(ExcelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int insert(ExcelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int insertSelective(ExcelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    List<ExcelUser> selectByExample(ExcelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    ExcelUser selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByExampleSelective(@Param("record") ExcelUser record, @Param("example") ExcelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByExample(@Param("record") ExcelUser record, @Param("example") ExcelUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByPrimaryKeySelective(ExcelUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table excel_user
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByPrimaryKey(ExcelUser record);
}