package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.ZuantanyujianyikantanZuankongshikengdicengmiaoshu;
import cn.xjtu.zun.tiesheyuan.pojo.ZuantanyujianyikantanZuankongshikengdicengmiaoshuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuantanyujianyikantanZuankongshikengdicengmiaoshuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZuantanyujianyikantanZuankongshikengdicengmiaoshuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZuantanyujianyikantanZuankongshikengdicengmiaoshuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long ztyjyktZkskdcmsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZuantanyujianyikantanZuankongshikengdicengmiaoshu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZuantanyujianyikantanZuankongshikengdicengmiaoshu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZuantanyujianyikantanZuankongshikengdicengmiaoshu> selectByExample(ZuantanyujianyikantanZuankongshikengdicengmiaoshuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZuantanyujianyikantanZuankongshikengdicengmiaoshu selectByPrimaryKey(Long ztyjyktZkskdcmsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZuantanyujianyikantanZuankongshikengdicengmiaoshu record, @Param("example") ZuantanyujianyikantanZuankongshikengdicengmiaoshuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZuantanyujianyikantanZuankongshikengdicengmiaoshu record, @Param("example") ZuantanyujianyikantanZuankongshikengdicengmiaoshuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZuantanyujianyikantanZuankongshikengdicengmiaoshu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengdicengmiaoshu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZuantanyujianyikantanZuankongshikengdicengmiaoshu record);
}