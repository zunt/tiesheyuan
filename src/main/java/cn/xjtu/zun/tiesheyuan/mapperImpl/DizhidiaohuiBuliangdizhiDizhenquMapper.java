package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiDizhenqu;
import cn.xjtu.zun.tiesheyuan.pojo.DizhidiaohuiBuliangdizhiDizhenquExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DizhidiaohuiBuliangdizhiDizhenquMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    long countByExample(DizhidiaohuiBuliangdizhiDizhenquExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByExample(DizhidiaohuiBuliangdizhiDizhenquExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int deleteByPrimaryKey(Long dzdhBldzDzqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insert(DizhidiaohuiBuliangdizhiDizhenqu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int insertSelective(DizhidiaohuiBuliangdizhiDizhenqu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    List<DizhidiaohuiBuliangdizhiDizhenqu> selectByExample(DizhidiaohuiBuliangdizhiDizhenquExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    DizhidiaohuiBuliangdizhiDizhenqu selectByPrimaryKey(Long dzdhBldzDzqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExampleSelective(@Param("record") DizhidiaohuiBuliangdizhiDizhenqu record, @Param("example") DizhidiaohuiBuliangdizhiDizhenquExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByExample(@Param("record") DizhidiaohuiBuliangdizhiDizhenqu record, @Param("example") DizhidiaohuiBuliangdizhiDizhenquExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKeySelective(DizhidiaohuiBuliangdizhiDizhenqu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dizhidiaohui_buliangdizhi_dizhenqu
     *
     * @mbg.generated Wed Aug 02 15:45:25 CST 2023
     */
    int updateByPrimaryKey(DizhidiaohuiBuliangdizhiDizhenqu record);
}