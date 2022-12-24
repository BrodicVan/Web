package Mapper;

import Web.PostTag;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostTagMapper {
    // 根据postTag的成员变量添加消息
    int insertPostTag(PostTag postTag);

    // 根据postTag的成员变量删除消息
    int deletePostTag(PostTag postTag);

    // 根据oldPostTag的成员变量锁定目标元组，然后根据newPostTag进行修改
    // 字符串为null、int为-1，对应数据不更新
    int updatePostTag(@Param("oldPostTag")PostTag oldPostTag,@Param("newPostTag")PostTag newPostTag);

    // 查找所有消息
    @Select("select  * from PostTag;")
    List<PostTag> selectAll();

    // 根据postTag的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<PostTag> selectByCondition(PostTag postTag);

}
