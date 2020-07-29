package cn.lucky.mapper;

import cn.lucky.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User doLogin(@Param("username")String username,@Param("password")String password);
    public int ins(User user);
}
