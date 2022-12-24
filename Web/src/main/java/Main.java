import Web.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

//        User condition_user = new User();
//        condition_user.setUserID(1);
//        System.out.println(condition_user);
//        List<User> users = sqlSession.selectList("Mapper.UserMapper.selectByConditionUsers",condition_user);
//
//        System.out.println(users);

//        User new_user = new User();
//        new_user.setUserName("无猜");
//        new_user.setPassword("123");
//        new_user.setStatus(1);
//        new_user.setUserType(1);
//        int i = sqlSession.insert("Mapper.UserMapper.insertUser",new_user);
//        System.out.println(i);
//        sqlSession.commit();
         List<Integer> pubs = Arrays.asList(1,2,3);
         System.out.println(pubs);
    }
}
