package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.GongdianSuidaogongdian;
import cn.xjtu.zun.tiesheyuan.pojo.GongdianSuidaogongdianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongdianSuidaogongdianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(GongdianSuidaogongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(GongdianSuidaogongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(GongdianSuidaogongdian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(GongdianSuidaogongdian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<GongdianSuidaogongdian> selectByExample(GongdianSuidaogongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    GongdianSuidaogongdian selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") GongdianSuidaogongdian record, @Param("example") GongdianSuidaogongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") GongdianSuidaogongdian record, @Param("example") GongdianSuidaogongdianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(GongdianSuidaogongdian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gongdian_suidaogongdian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(GongdianSuidaogongdian record);
}