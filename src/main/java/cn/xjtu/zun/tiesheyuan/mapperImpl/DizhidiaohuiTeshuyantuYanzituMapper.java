package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiTeshuyantuYanzitu;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiTeshuyantuYanzituExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiTeshuyantuYanzituMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DizhidiaohuiTeshuyantuYanzituExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DizhidiaohuiTeshuyantuYanzituExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhTsytYztid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DizhidiaohuiTeshuyantuYanzitu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DizhidiaohuiTeshuyantuYanzitu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DizhidiaohuiTeshuyantuYanzitu> selectByExample(DizhidiaohuiTeshuyantuYanzituExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DizhidiaohuiTeshuyantuYanzitu selectByPrimaryKey(Long dzdhTsytYztid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiTeshuyantuYanzitu record, @Param("example") DizhidiaohuiTeshuyantuYanzituExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiTeshuyantuYanzitu record, @Param("example") DizhidiaohuiTeshuyantuYanzituExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiTeshuyantuYanzitu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanzitu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiTeshuyantuYanzitu record);
}