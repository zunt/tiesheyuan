package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiDimianchenjiang;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiDimianchenjiangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiBuliangdizhiDimianchenjiangMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    long countByExample(DizhidiaohuiBuliangdizhiDimianchenjiangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByExample(DizhidiaohuiBuliangdizhiDimianchenjiangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhBldzDmcjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insert(DizhidiaohuiBuliangdizhiDimianchenjiang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insertSelective(DizhidiaohuiBuliangdizhiDimianchenjiang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    List<DizhidiaohuiBuliangdizhiDimianchenjiang> selectByExample(DizhidiaohuiBuliangdizhiDimianchenjiangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    DizhidiaohuiBuliangdizhiDimianchenjiang selectByPrimaryKey(Long dzdhBldzDmcjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiBuliangdizhiDimianchenjiang record, @Param("example") DizhidiaohuiBuliangdizhiDimianchenjiangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiBuliangdizhiDimianchenjiang record, @Param("example") DizhidiaohuiBuliangdizhiDimianchenjiangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiBuliangdizhiDimianchenjiang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dimianchenjiang
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiBuliangdizhiDimianchenjiang record);
}