package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiYouhaiqiti;
import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiYouhaiqitiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuankongyuanweiceshiYouhaiqitiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZuankongyuanweiceshiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZuankongyuanweiceshiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long zkywcsYhqtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZuankongyuanweiceshiYouhaiqiti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZuankongyuanweiceshiYouhaiqiti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZuankongyuanweiceshiYouhaiqiti> selectByExample(ZuankongyuanweiceshiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZuankongyuanweiceshiYouhaiqiti selectByPrimaryKey(Long zkywcsYhqtid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZuankongyuanweiceshiYouhaiqiti record, @Param("example") ZuankongyuanweiceshiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZuankongyuanweiceshiYouhaiqiti record, @Param("example") ZuankongyuanweiceshiYouhaiqitiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZuankongyuanweiceshiYouhaiqiti record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_youhaiqiti
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZuankongyuanweiceshiYouhaiqiti record);
}