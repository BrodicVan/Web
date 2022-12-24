package Mapper;

import Web.Identity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IdentityMapper {
    // 根据user的成员变量添加用户
    int insertIdentity(Identity identity);

    // 根据user的成员变量删除用户
    int deleteIdentity(Identity identity);

    // 根据id修改剩余的成员变量，userID标识要修改的数据库元组，其余为新的数据
    // 字符串为null、int为-1，对应数据不更新
    int updateIdentity(@Param("userID")int id,@Param("identity")  Identity identity);

    // 查找所有用户
    @Select("select  * from Identity;")
    List<Identity> selectAll();

    // 根据identity的成员变量查找符合条件的用户，均为*等值匹配*
    // 字符串为null、int为-1不参与条件筛选
    List<Identity> selectByCondition(Identity identity);

}
