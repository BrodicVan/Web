package Mapper;

import Web.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    // 根据user的成员变量添加用户
    int insertUser(User user);

    // 根据user的成员变量删除用户
    int deleteUser(User user);

    // 根据user的userID修改剩余的成员变量，userID标识要修改的数据库元组，其余为新的数据
    // 字符串为null、int为-1，对应数据不更新
    int updateUser(User user);

    // 查找所有用户
    @Select("select  * from User;")
    List<User> selectAll();

    // 根据user的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<User> selectByCondition(User user);
}
