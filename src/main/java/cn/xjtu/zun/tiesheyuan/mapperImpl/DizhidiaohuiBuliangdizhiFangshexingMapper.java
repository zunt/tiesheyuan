package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiFangshexing;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiFangshexingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiBuliangdizhiFangshexingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    long countByExample(DizhidiaohuiBuliangdizhiFangshexingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByExample(DizhidiaohuiBuliangdizhiFangshexingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhBldzFsxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insert(DizhidiaohuiBuliangdizhiFangshexing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insertSelective(DizhidiaohuiBuliangdizhiFangshexing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    List<DizhidiaohuiBuliangdizhiFangshexing> selectByExample(DizhidiaohuiBuliangdizhiFangshexingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    DizhidiaohuiBuliangdizhiFangshexing selectByPrimaryKey(Long dzdhBldzFsxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiBuliangdizhiFangshexing record, @Param("example") DizhidiaohuiBuliangdizhiFangshexingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiBuliangdizhiFangshexing record, @Param("example") DizhidiaohuiBuliangdizhiFangshexingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiBuliangdizhiFangshexing record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_fangshexing
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiBuliangdizhiFangshexing record);
}