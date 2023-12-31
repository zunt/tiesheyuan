package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.WutanBosuceshiBck;
import cn.xjtu.zun.tiesheyuan.pojo.WutanBosuceshiBckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WutanBosuceshiBckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(WutanBosuceshiBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(WutanBosuceshiBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long wtBscsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(WutanBosuceshiBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(WutanBosuceshiBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<WutanBosuceshiBck> selectByExample(WutanBosuceshiBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    WutanBosuceshiBck selectByPrimaryKey(Long wtBscsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") WutanBosuceshiBck record, @Param("example") WutanBosuceshiBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") WutanBosuceshiBck record, @Param("example") WutanBosuceshiBckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(WutanBosuceshiBck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wutan_bosuceshi_bck
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(WutanBosuceshiBck record);
}