package cn.xjtu.zun.tiesheyuan.mapper;

import cn.xjtu.zun.tiesheyuan.pojo.User;
import cn.xjtu.zun.tiesheyuan.pojo.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int deleteByPrimaryKey(Long userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    User selectByPrimaryKey(Long userid);

    User selectByEmail(String email);

    User selectByAccount(String account);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Fri Aug 04 15:36:56 CST 2023
     */
    int updateByPrimaryKey(User record);
}