package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu;
import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejiluExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejiluMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejiluExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejiluExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long zkywcsSwcsYssyswgcjlid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu> selectByExample(ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejiluExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu selectByPrimaryKey(Long zkywcsSwcsYssyswgcjlid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu record, @Param("example") ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejiluExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu record, @Param("example") ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejiluExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_yashuishiyanshuiweiguancejilu
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZuankongyuanweiceshiShuiwenceshiYashuishiyanshuiweiguancejilu record);
}