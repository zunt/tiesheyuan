package cn.xjtu.zun.tiesheyuan.dao;

import cn.xjtu.zun.tiesheyuan.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(int id);

    int insertUser(User user);

    int updateUser(User user);

}
