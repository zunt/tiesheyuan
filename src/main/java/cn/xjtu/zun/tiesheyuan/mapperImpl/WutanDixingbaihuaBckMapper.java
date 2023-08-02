package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.WutanDixingbaihuaBck;
import cn.xjtu.zun.tiesheyuan.pojo.WutanDixingbaihuaBckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WutanDixingbaihuaBckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(WutanDixingbaihuaBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(WutanDixingbaihuaBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long wtDxbhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(WutanDixingbaihuaBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(WutanDixingbaihuaBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<WutanDixingbaihuaBck> selectByExample(WutanDixingbaihuaBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    WutanDixingbaihuaBck selectByPrimaryKey(Long wtDxbhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") WutanDixingbaihuaBck record, @Param("example") WutanDixingbaihuaBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") WutanDixingbaihuaBck record, @Param("example") WutanDixingbaihuaBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(WutanDixingbaihuaBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_dixingbaihua_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(WutanDixingbaihuaBck record);
}