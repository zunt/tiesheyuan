package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiTeshuyantuYanyanjiyanziyan;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiTeshuyantuYanyanjiyanziyanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiTeshuyantuYanyanjiyanziyanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DizhidiaohuiTeshuyantuYanyanjiyanziyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DizhidiaohuiTeshuyantuYanyanjiyanziyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhTsytYyjyzyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DizhidiaohuiTeshuyantuYanyanjiyanziyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DizhidiaohuiTeshuyantuYanyanjiyanziyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DizhidiaohuiTeshuyantuYanyanjiyanziyan> selectByExample(DizhidiaohuiTeshuyantuYanyanjiyanziyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DizhidiaohuiTeshuyantuYanyanjiyanziyan selectByPrimaryKey(Long dzdhTsytYyjyzyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiTeshuyantuYanyanjiyanziyan record, @Param("example") DizhidiaohuiTeshuyantuYanyanjiyanziyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiTeshuyantuYanyanjiyanziyan record, @Param("example") DizhidiaohuiTeshuyantuYanyanjiyanziyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiTeshuyantuYanyanjiyanziyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_teshuyantu_yanyanjiyanziyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiTeshuyantuYanyanjiyanziyan record);
}