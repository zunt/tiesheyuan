package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.FeizuankongyuanweiceshiPingbanzaiheshiyan;
import cn.xjtu.zun.tiesheyuan.pojo.FeizuankongyuanweiceshiPingbanzaiheshiyanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeizuankongyuanweiceshiPingbanzaiheshiyanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(FeizuankongyuanweiceshiPingbanzaiheshiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(FeizuankongyuanweiceshiPingbanzaiheshiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long fzkywcsPbzhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(FeizuankongyuanweiceshiPingbanzaiheshiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(FeizuankongyuanweiceshiPingbanzaiheshiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<FeizuankongyuanweiceshiPingbanzaiheshiyan> selectByExample(FeizuankongyuanweiceshiPingbanzaiheshiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    FeizuankongyuanweiceshiPingbanzaiheshiyan selectByPrimaryKey(Long fzkywcsPbzhid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") FeizuankongyuanweiceshiPingbanzaiheshiyan record, @Param("example") FeizuankongyuanweiceshiPingbanzaiheshiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") FeizuankongyuanweiceshiPingbanzaiheshiyan record, @Param("example") FeizuankongyuanweiceshiPingbanzaiheshiyanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(FeizuankongyuanweiceshiPingbanzaiheshiyan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feizuankongyuanweiceshi_pingbanzaiheshiyan
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(FeizuankongyuanweiceshiPingbanzaiheshiyan record);
}