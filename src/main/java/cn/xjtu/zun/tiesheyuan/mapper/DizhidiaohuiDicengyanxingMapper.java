package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiDicengyanxing;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiDicengyanxingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiDicengyanxingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DizhidiaohuiDicengyanxingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DizhidiaohuiDicengyanxingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhDcyxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DizhidiaohuiDicengyanxing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DizhidiaohuiDicengyanxing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DizhidiaohuiDicengyanxing> selectByExample(DizhidiaohuiDicengyanxingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DizhidiaohuiDicengyanxing selectByPrimaryKey(Long dzdhDcyxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiDicengyanxing record, @Param("example") DizhidiaohuiDicengyanxingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiDicengyanxing record, @Param("example") DizhidiaohuiDicengyanxingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiDicengyanxing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_dicengyanxing
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiDicengyanxing record);
}