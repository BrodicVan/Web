package Mapper;

import Web.PostLog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostLogMapper {
    // 根据postLog的成员变量添加用户
    int insertPostLog(PostLog postLog);

    // 根据postLog的成员变量删除用户
    int deletePostLog(PostLog postLog);

    // 根据postLog的postLogID修改剩余的成员变量，postLogID标识要修改的数据库元组，其余为新的数据
    // 字符串为null、int为-1，对应数据不更新
    int updatePostLog(PostLog postLog);

    // 查找所有用户
    @Select("select  * from PostLog;")
    List<PostLog> selectAll();

    // 根据postLog的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<PostLog> selectByCondition(PostLog postLog);

}
