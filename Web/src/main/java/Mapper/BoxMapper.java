package Mapper;

import Web.Box;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BoxMapper {
    // 根据box的成员变量添加消息
    int insertBox(Box box);

    // 根据box的成员变量删除消息
    int deleteBox(Box box);

    // 根据oldBox的成员变量锁定目标元组，然后根据newBox进行修改
    // 字符串为null、int为-1，对应数据不更新
    int updateBox(@Param("oldBox")Box oldBox,@Param("newBox")Box newBox);

    // 查找所有消息
    @Select("select  * from Box;")
    List<Box> selectAll();

    // 根据box的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<Box> selectByCondition(Box box);

}
