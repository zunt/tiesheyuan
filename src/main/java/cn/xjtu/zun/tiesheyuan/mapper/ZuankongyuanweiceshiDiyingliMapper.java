package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiDiyingli;
import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiDiyingliExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuankongyuanweiceshiDiyingliMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZuankongyuanweiceshiDiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZuankongyuanweiceshiDiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long zkywcsDylid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZuankongyuanweiceshiDiyingli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZuankongyuanweiceshiDiyingli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZuankongyuanweiceshiDiyingli> selectByExample(ZuankongyuanweiceshiDiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZuankongyuanweiceshiDiyingli selectByPrimaryKey(Long zkywcsDylid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZuankongyuanweiceshiDiyingli record, @Param("example") ZuankongyuanweiceshiDiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZuankongyuanweiceshiDiyingli record, @Param("example") ZuankongyuanweiceshiDiyingliExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZuankongyuanweiceshiDiyingli record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_diyingli
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZuankongyuanweiceshiDiyingli record);
}