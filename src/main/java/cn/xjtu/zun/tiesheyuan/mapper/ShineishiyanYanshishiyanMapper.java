package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ShineishiyanYanshishiyan;
import cn.xjtu.zun.tiesheyuan.pojo.ShineishiyanYanshishiyanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShineishiyanYanshishiyanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ShineishiyanYanshishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ShineishiyanYanshishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long snsyYssyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ShineishiyanYanshishiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ShineishiyanYanshishiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ShineishiyanYanshishiyan> selectByExample(ShineishiyanYanshishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ShineishiyanYanshishiyan selectByPrimaryKey(Long snsyYssyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ShineishiyanYanshishiyan record, @Param("example") ShineishiyanYanshishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ShineishiyanYanshishiyan record, @Param("example") ShineishiyanYanshishiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ShineishiyanYanshishiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yanshishiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ShineishiyanYanshishiyan record);
}