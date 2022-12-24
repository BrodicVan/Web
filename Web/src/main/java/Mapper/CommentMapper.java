package Mapper;

import Web.Comment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentMapper {
    // 根据comment的成员变量添加消息
    int insertComment(Comment comment);

    // 根据comment的成员变量删除消息
    int deleteComment(Comment comment);

    // 根据oldComment的成员变量锁定目标元组，然后根据newComment进行修改
    // 字符串为null、int为-1，对应数据不更新
    int updateComment(@Param("oldComment")Comment oldComment,@Param("newComment")Comment newComment);

    // 查找所有消息
    @Select("select  * from Comment;")
    List<Comment> selectAll();

    // 根据comment的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<Comment> selectByCondition(Comment comment);

}
