package Mapper;

import Web.Tag;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface TagMapper {
    // 根据tag的成员变量添加消息
    int insertTag(Tag tag);

    // 根据tag的成员变量删除消息
    int deleteTag(Tag tag);

    // 根据oldTag的成员变量锁定目标元组，然后根据newTag进行修改
    // 字符串为null、int为-1，对应数据不更新
    int updateTag(@Param("oldTag")Tag oldTag,@Param("newTag")Tag newTag);

    // 查找所有消息
    @Select("select  * from Tag;")
    List<Tag> selectAll();

    // 根据tag的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<Tag> selectByCondition(Tag tag);

}
