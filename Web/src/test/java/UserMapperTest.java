import Mapper.UserMapper;
import Web.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperTest
{
    // 增
    @Test
    public void testInsertUser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User new_user = new User();
        new_user.setUserName("寒砺");
        new_user.setPassword("123");
        new_user.setStatus(1);
        new_user.setUserType(1);
        try
        {
            int i = userMapper.insertUser(new_user);;
            System.out.println(i);
        }
        catch (Exception e)
        {
            System.out.println(e.getCause());
        }

//        sqlSession.commit();
    }

    // 删
    @Test
    public void testDeleteUser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User new_user = new User();
        new_user.setUserName("无猜");

        int i = sqlSession.delete("Mapper.UserMapper.deleteUser",new_user);
        System.out.println(i);

    }

    // 改
    @Test
    public void testUpdateUser() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User condition_user = new User();
        condition_user.setUserName("不羡仙");

        condition_user.setUserID(1);
        int result = userMapper.updateUser(condition_user);

        System.out.println(result);
        sqlSession.commit();
    }

    // 查
    @Test
    public void testSelectByConditionUsers() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User condition_user = new User();
        condition_user.setUserName("'无猜'");
        System.out.println(condition_user);
        List<User> users = userMapper.selectByCondition(condition_user);

        System.out.println(users);
    }

    @Test
    public void testSelectAll() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.selectAll();

        System.out.println(users);
    }
}
