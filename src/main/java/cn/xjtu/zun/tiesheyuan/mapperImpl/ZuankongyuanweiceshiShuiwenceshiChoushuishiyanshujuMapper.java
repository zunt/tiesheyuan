package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju;
import cn.xjtu.zun.tiesheyuan.pojo.ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshujuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshujuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long zkywcsSwcsCssysjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju> selectByExample(ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju selectByPrimaryKey(Long zkywcsSwcsCssysjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju record, @Param("example") ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju record, @Param("example") ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zuankongyuanweiceshi_shuiwenceshi_choushuishiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(ZuankongyuanweiceshiShuiwenceshiChoushuishiyanshuju record);
}