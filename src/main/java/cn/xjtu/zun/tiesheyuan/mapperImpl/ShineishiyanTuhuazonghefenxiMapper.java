package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.ShineishiyanTuhuazonghefenxi;
import cn.xjtu.zun.tiesheyuan.pojo.ShineishiyanTuhuazonghefenxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShineishiyanTuhuazonghefenxiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ShineishiyanTuhuazonghefenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ShineishiyanTuhuazonghefenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long snsyThzhfxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ShineishiyanTuhuazonghefenxi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ShineishiyanTuhuazonghefenxi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ShineishiyanTuhuazonghefenxi> selectByExample(ShineishiyanTuhuazonghefenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ShineishiyanTuhuazonghefenxi selectByPrimaryKey(Long snsyThzhfxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ShineishiyanTuhuazonghefenxi record, @Param("example") ShineishiyanTuhuazonghefenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ShineishiyanTuhuazonghefenxi record, @Param("example") ShineishiyanTuhuazonghefenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ShineishiyanTuhuazonghefenxi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_tuhuazonghefenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ShineishiyanTuhuazonghefenxi record);
}