package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ZuantanyujianyikantanZuankongshikengshuiwei;
import cn.xjtu.zun.tiesheyuan.pojo.ZuantanyujianyikantanZuankongshikengshuiweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuantanyujianyikantanZuankongshikengshuiweiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZuantanyujianyikantanZuankongshikengshuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZuantanyujianyikantanZuankongshikengshuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long ztyjyktZkskswid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZuantanyujianyikantanZuankongshikengshuiwei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZuantanyujianyikantanZuankongshikengshuiwei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZuantanyujianyikantanZuankongshikengshuiwei> selectByExample(ZuantanyujianyikantanZuankongshikengshuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZuantanyujianyikantanZuankongshikengshuiwei selectByPrimaryKey(Long ztyjyktZkskswid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZuantanyujianyikantanZuankongshikengshuiwei record, @Param("example") ZuantanyujianyikantanZuankongshikengshuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZuantanyujianyikantanZuankongshikengshuiwei record, @Param("example") ZuantanyujianyikantanZuankongshikengshuiweiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZuantanyujianyikantanZuankongshikengshuiwei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuantanyujianyikantan_zuankongshikengshuiwei
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZuantanyujianyikantanZuankongshikengshuiwei record);
}