package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiBengta;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiBengtaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiBuliangdizhiBengtaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    long countByExample(DizhidiaohuiBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByExample(DizhidiaohuiBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhBldzBtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insert(DizhidiaohuiBuliangdizhiBengta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insertSelective(DizhidiaohuiBuliangdizhiBengta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    List<DizhidiaohuiBuliangdizhiBengta> selectByExample(DizhidiaohuiBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    DizhidiaohuiBuliangdizhiBengta selectByPrimaryKey(Long dzdhBldzBtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiBuliangdizhiBengta record, @Param("example") DizhidiaohuiBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiBuliangdizhiBengta record, @Param("example") DizhidiaohuiBuliangdizhiBengtaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiBuliangdizhiBengta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_bengta
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiBuliangdizhiBengta record);
}