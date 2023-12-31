package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiTeshuyantuTiantu;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiTeshuyantuTiantuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiTeshuyantuTiantuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DizhidiaohuiTeshuyantuTiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DizhidiaohuiTeshuyantuTiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhTsytTtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DizhidiaohuiTeshuyantuTiantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DizhidiaohuiTeshuyantuTiantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DizhidiaohuiTeshuyantuTiantu> selectByExample(DizhidiaohuiTeshuyantuTiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DizhidiaohuiTeshuyantuTiantu selectByPrimaryKey(Long dzdhTsytTtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiTeshuyantuTiantu record, @Param("example") DizhidiaohuiTeshuyantuTiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiTeshuyantuTiantu record, @Param("example") DizhidiaohuiTeshuyantuTiantuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiTeshuyantuTiantu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_tiantu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiTeshuyantuTiantu record);
}