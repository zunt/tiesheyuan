package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.Diyingli;
import cn.xjtu.zun.tiesheyuan.pojo.DiyingliExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiyingliMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(Diyingli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(Diyingli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<Diyingli> selectByExample(DiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    Diyingli selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") Diyingli record, @Param("example") DiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") Diyingli record, @Param("example") DiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(Diyingli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(Diyingli record);
}