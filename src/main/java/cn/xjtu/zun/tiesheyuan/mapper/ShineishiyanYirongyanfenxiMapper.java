package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ShineishiyanYirongyanfenxi;
import cn.xjtu.zun.tiesheyuan.pojo.ShineishiyanYirongyanfenxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShineishiyanYirongyanfenxiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ShineishiyanYirongyanfenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ShineishiyanYirongyanfenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long snsyYryfxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ShineishiyanYirongyanfenxi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ShineishiyanYirongyanfenxi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ShineishiyanYirongyanfenxi> selectByExample(ShineishiyanYirongyanfenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ShineishiyanYirongyanfenxi selectByPrimaryKey(Long snsyYryfxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ShineishiyanYirongyanfenxi record, @Param("example") ShineishiyanYirongyanfenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ShineishiyanYirongyanfenxi record, @Param("example") ShineishiyanYirongyanfenxiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ShineishiyanYirongyanfenxi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shineishiyan_yirongyanfenxi
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ShineishiyanYirongyanfenxi record);
}