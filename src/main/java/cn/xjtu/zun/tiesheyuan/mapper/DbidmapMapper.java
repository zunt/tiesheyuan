package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.Dbidmap;
import cn.xjtu.zun.tiesheyuan.pojo.DbidmapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbidmapMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    long countByExample(DbidmapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int deleteByExample(DbidmapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int insert(Dbidmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int insertSelective(Dbidmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    List<Dbidmap> selectByExample(DbidmapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    Dbidmap selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByExampleSelective(@Param("record") Dbidmap record, @Param("example") DbidmapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByExample(@Param("record") Dbidmap record, @Param("example") DbidmapExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByPrimaryKeySelective(Dbidmap record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbidmap
     *
     * @mbg.generated Thu Aug 03 17:47:06 CST 2023
     */
    int updateByPrimaryKey(Dbidmap record);
}