package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.ZhuantichengguoZhuantibaogao;
import cn.xjtu.zun.tiesheyuan.pojo.ZhuantichengguoZhuantibaogaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhuantichengguoZhuantibaogaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZhuantichengguoZhuantibaogaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZhuantichengguoZhuantibaogaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZhuantichengguoZhuantibaogao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZhuantichengguoZhuantibaogao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZhuantichengguoZhuantibaogao> selectByExample(ZhuantichengguoZhuantibaogaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZhuantichengguoZhuantibaogao selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZhuantichengguoZhuantibaogao record, @Param("example") ZhuantichengguoZhuantibaogaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZhuantichengguoZhuantibaogao record, @Param("example") ZhuantichengguoZhuantibaogaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZhuantichengguoZhuantibaogao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zhuantichengguo_zhuantibaogao
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZhuantichengguoZhuantibaogao record);
}