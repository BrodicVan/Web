package Mapper;

import Web.LikeOperation;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LikeOperationMapper {
    // 根据operation的成员变量添加消息
    int insertLikeOperation(LikeOperation operation);

    // 根据operation的成员变量删除消息
    int deleteLikeOperation(LikeOperation operation);

    // 根据oldLikeOperation的成员变量锁定目标元组，然后根据newLikeOperation进行修改
    // 字符串为null、int为-1，对应数据不更新
    int updateLikeOperation(@Param("oldLikeOperation")LikeOperation oldLikeOperation,@Param("newLikeOperation")LikeOperation newLikeOperation);

    // 查找所有消息
    @Select("select  * from LikeOperation;")
    List<LikeOperation> selectAll();

    // 根据operation的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<LikeOperation> selectByCondition(LikeOperation operation);

}
