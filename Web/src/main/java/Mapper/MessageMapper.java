package Mapper;

import Web.Message;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MessageMapper {
    // 根据message的成员变量添加消息
    int insertMessage(Message message);

    // 根据message的成员变量删除消息
    int deleteMessage(Message message);

    // 根据oldMessage的成员变量锁定目标元组，然后根据newMessage进行修改
    // 字符串为null、int为-1，对应数据不更新
    int updateMessage(@Param("oldMessage")Message oldMessage,@Param("newMessage")Message newMessage);

    // 查找所有消息
    @Select("select  * from Message;")
    List<Message> selectAll();

    // 根据message的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<Message> selectByCondition(Message message);

}
