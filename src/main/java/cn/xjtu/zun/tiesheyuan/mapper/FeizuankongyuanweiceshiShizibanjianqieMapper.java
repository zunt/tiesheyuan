package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.FeizuankongyuanweiceshiShizibanjianqie;
import cn.xjtu.zun.tiesheyuan.pojo.FeizuankongyuanweiceshiShizibanjianqieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeizuankongyuanweiceshiShizibanjianqieMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(FeizuankongyuanweiceshiShizibanjianqieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(FeizuankongyuanweiceshiShizibanjianqieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long fzkywcsSzbjqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(FeizuankongyuanweiceshiShizibanjianqie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(FeizuankongyuanweiceshiShizibanjianqie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<FeizuankongyuanweiceshiShizibanjianqie> selectByExample(FeizuankongyuanweiceshiShizibanjianqieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    FeizuankongyuanweiceshiShizibanjianqie selectByPrimaryKey(Long fzkywcsSzbjqid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") FeizuankongyuanweiceshiShizibanjianqie record, @Param("example") FeizuankongyuanweiceshiShizibanjianqieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") FeizuankongyuanweiceshiShizibanjianqie record, @Param("example") FeizuankongyuanweiceshiShizibanjianqieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(FeizuankongyuanweiceshiShizibanjianqie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_shizibanjianqie
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(FeizuankongyuanweiceshiShizibanjianqie record);
}