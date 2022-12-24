package Mapper;

import Web.UserDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDetailMapper {
    // 根据userDetail的成员变量添加用户
    int insertUserDetail(UserDetail userDetail);

    // 根据userDetail的userID删除数据，其余成员变量无用
    int deleteUserDetail(UserDetail userDetail);

    // 根据参数id确定目标数据项，userDetail为新数据
    // 字符串为null、int为-1，对应数据不更新
    int updateUserDetail(@Param("userID")int id,@Param("userDetail")UserDetail userDetail);

    // 查找所有用户资料
    @Select("select  * from UserDetail;")
    List<UserDetail> selectAll();

    // 根据user的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<UserDetail> selectByCondition(UserDetail userDetail);

}
