package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.FeizuankongyuanweiceshiBianbancezhang;
import cn.xjtu.zun.tiesheyuan.pojo.FeizuankongyuanweiceshiBianbancezhangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeizuankongyuanweiceshiBianbancezhangMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(FeizuankongyuanweiceshiBianbancezhangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(FeizuankongyuanweiceshiBianbancezhangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long fzkywcsBbczid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(FeizuankongyuanweiceshiBianbancezhang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(FeizuankongyuanweiceshiBianbancezhang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<FeizuankongyuanweiceshiBianbancezhang> selectByExample(FeizuankongyuanweiceshiBianbancezhangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    FeizuankongyuanweiceshiBianbancezhang selectByPrimaryKey(Long fzkywcsBbczid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") FeizuankongyuanweiceshiBianbancezhang record, @Param("example") FeizuankongyuanweiceshiBianbancezhangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") FeizuankongyuanweiceshiBianbancezhang record, @Param("example") FeizuankongyuanweiceshiBianbancezhangExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(FeizuankongyuanweiceshiBianbancezhang record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_bianbancezhang
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(FeizuankongyuanweiceshiBianbancezhang record);
}