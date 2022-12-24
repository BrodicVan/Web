package Mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PubPostMapper
{
    // 根据user的成员变量添加用户
    int insertPubPost(@Param("pubPostID") int postID);

    // 根据user的成员变量删除用户
    int deletePubPost(@Param("pubPostID")int postID);

    int updatePubPost(@Param("oldPubPostID")int oldPostID,@Param("newPubPostID")int newPostID);

    // 查找所有用户
    @Select("select  * from PubPost;")
    List<Integer> selectAll();

}
