package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiYouhaiqiti;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiYouhaiqitiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiBuliangdizhiYouhaiqitiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DizhidiaohuiBuliangdizhiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DizhidiaohuiBuliangdizhiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhBldzYhqtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DizhidiaohuiBuliangdizhiYouhaiqiti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DizhidiaohuiBuliangdizhiYouhaiqiti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DizhidiaohuiBuliangdizhiYouhaiqiti> selectByExample(DizhidiaohuiBuliangdizhiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DizhidiaohuiBuliangdizhiYouhaiqiti selectByPrimaryKey(Long dzdhBldzYhqtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiBuliangdizhiYouhaiqiti record, @Param("example") DizhidiaohuiBuliangdizhiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiBuliangdizhiYouhaiqiti record, @Param("example") DizhidiaohuiBuliangdizhiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiBuliangdizhiYouhaiqiti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiBuliangdizhiYouhaiqiti record);
}