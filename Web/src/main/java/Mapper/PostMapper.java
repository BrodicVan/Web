package Mapper;

import Web.Post;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostMapper {
    // 根据post的成员变量添加用户,postID在该方法中无关紧要
    int insertPost(Post post);

    // 根据user的成员变量删除用户
    int deletePost(Post post);

    // 根据post的postID修改剩余的成员变量，postID标识要修改的数据库元组，其余为新的数据
    // 字符串为null、*int为-1，对应数据不更新
    int updatePost(Post post);

    // 查找所有用户
    @Select("select  * from Post;")
    List<Post> selectAll();

    // 根据post的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<Post> selectByCondition(Post post);
}
