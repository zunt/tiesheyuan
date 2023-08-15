package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.PdfShikeng;
import cn.xjtu.zun.tiesheyuan.pojo.PdfShikengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdfShikengMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    long countByExample(PdfShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int deleteByExample(PdfShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int insert(PdfShikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int insertSelective(PdfShikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    List<PdfShikeng> selectByExample(PdfShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    PdfShikeng selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int updateByExampleSelective(@Param("record") PdfShikeng record, @Param("example") PdfShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int updateByExample(@Param("record") PdfShikeng record, @Param("example") PdfShikengExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int updateByPrimaryKeySelective(PdfShikeng record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pdf_shikeng
     *
     * @mbg.generated Wed Aug 02 17:09:49 CST 2023
     */
    int updateByPrimaryKey(PdfShikeng record);
}