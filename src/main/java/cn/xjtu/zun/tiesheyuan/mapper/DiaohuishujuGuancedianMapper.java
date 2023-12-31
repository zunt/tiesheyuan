package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.DiaohuishujuGuancedian;
import cn.xjtu.zun.tiesheyuan.pojo.DiaohuishujuGuancedianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiaohuishujuGuancedianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DiaohuishujuGuancedianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DiaohuishujuGuancedianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DiaohuishujuGuancedian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DiaohuishujuGuancedian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DiaohuishujuGuancedian> selectByExample(DiaohuishujuGuancedianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DiaohuishujuGuancedian selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DiaohuishujuGuancedian record, @Param("example") DiaohuishujuGuancedianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DiaohuishujuGuancedian record, @Param("example") DiaohuishujuGuancedianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DiaohuishujuGuancedian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table diaohuishuju_guancedian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DiaohuishujuGuancedian record);
}