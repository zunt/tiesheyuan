package cn.xjtu.zun.tiesheyuan.mapperImpl;

import cn.xjtu.zun.tiesheyuan.pojo.JingtanKongyaxiaosanshiyanshuju;
import cn.xjtu.zun.tiesheyuan.pojo.JingtanKongyaxiaosanshiyanshujuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JingtanKongyaxiaosanshiyanshujuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    long countByExample(JingtanKongyaxiaosanshiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByExample(JingtanKongyaxiaosanshiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int deleteByPrimaryKey(Long jtKyxssysjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insert(JingtanKongyaxiaosanshiyanshuju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int insertSelective(JingtanKongyaxiaosanshiyanshuju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    List<JingtanKongyaxiaosanshiyanshuju> selectByExample(JingtanKongyaxiaosanshiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    JingtanKongyaxiaosanshiyanshuju selectByPrimaryKey(Long jtKyxssysjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") JingtanKongyaxiaosanshiyanshuju record, @Param("example") JingtanKongyaxiaosanshiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByExample(@Param("record") JingtanKongyaxiaosanshiyanshuju record, @Param("example") JingtanKongyaxiaosanshiyanshujuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKeySelective(JingtanKongyaxiaosanshiyanshuju record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingtan_kongyaxiaosanshiyanshuju
     *
     * @mbg.generated Wed Aug 02 15:45:26 CST 2023
     */
    int updateByPrimaryKey(JingtanKongyaxiaosanshiyanshuju record);
}