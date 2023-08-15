package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.TongmaiInsarJiance;
import cn.xjtu.zun.tiesheyuan.pojo.TongmaiInsarJianceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TongmaiInsarJianceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(TongmaiInsarJianceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(TongmaiInsarJianceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(TongmaiInsarJiance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(TongmaiInsarJiance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<TongmaiInsarJiance> selectByExample(TongmaiInsarJianceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    TongmaiInsarJiance selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") TongmaiInsarJiance record, @Param("example") TongmaiInsarJianceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") TongmaiInsarJiance record, @Param("example") TongmaiInsarJianceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(TongmaiInsarJiance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tongmai_insar_jiance
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(TongmaiInsarJiance record);
}