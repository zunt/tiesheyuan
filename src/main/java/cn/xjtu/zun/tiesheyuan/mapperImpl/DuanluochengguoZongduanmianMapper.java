package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.DuanluochengguoZongduanmian;
import cn.xjtu.zun.tiesheyuan.pojo.DuanluochengguoZongduanmianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DuanluochengguoZongduanmianMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(DuanluochengguoZongduanmianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(DuanluochengguoZongduanmianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(DuanluochengguoZongduanmian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(DuanluochengguoZongduanmian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<DuanluochengguoZongduanmian> selectByExample(DuanluochengguoZongduanmianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    DuanluochengguoZongduanmian selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") DuanluochengguoZongduanmian record, @Param("example") DuanluochengguoZongduanmianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") DuanluochengguoZongduanmian record, @Param("example") DuanluochengguoZongduanmianExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(DuanluochengguoZongduanmian record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table duanluochengguo_zongduanmian
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(DuanluochengguoZongduanmian record);
}