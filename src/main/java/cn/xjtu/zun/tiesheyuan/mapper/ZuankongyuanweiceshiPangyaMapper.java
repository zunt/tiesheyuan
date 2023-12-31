package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiPangya;
import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiPangyaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuankongyuanweiceshiPangyaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZuankongyuanweiceshiPangyaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZuankongyuanweiceshiPangyaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long zkywcsPyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZuankongyuanweiceshiPangya record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZuankongyuanweiceshiPangya record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZuankongyuanweiceshiPangya> selectByExample(ZuankongyuanweiceshiPangyaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZuankongyuanweiceshiPangya selectByPrimaryKey(Long zkywcsPyid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZuankongyuanweiceshiPangya record, @Param("example") ZuankongyuanweiceshiPangyaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZuankongyuanweiceshiPangya record, @Param("example") ZuankongyuanweiceshiPangyaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZuankongyuanweiceshiPangya record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_pangya
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZuankongyuanweiceshiPangya record);
}