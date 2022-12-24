import Mapper.UserDetailMapper;
import Mapper.UserMapper;
import Web.User;
import Web.UserDetail;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDetailMapperTest
{
    // 增
    @Test
    public void testInsertUserDetail() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDetailMapper mapper = sqlSession.getMapper(UserDetailMapper.class);
        UserDetail userDetail = new UserDetail();
        userDetail.setUserID(1);
        userDetail.setPhone("13456987458");
        try
        {
            int i = mapper.insertUserDetail(userDetail);;
            System.out.println(i);
            sqlSession.commit();
        }
        catch (Exception e)
        {
            System.out.println(e.getCause());
        }


    }

    // 删
    @Test
    public void testDeleteUserDetail() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserDetailMapper mapper = sqlSession.getMapper(UserDetailMapper.class);
        UserDetail userDetail = new UserDetail();
        userDetail.setUserID(-1);

        int i = mapper.deleteUserDetail(userDetail);
        System.out.println(i);

    }

    // 改
    @Test
    public void testUpdateUserDetail() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDetailMapper mapper = sqlSession.getMapper(UserDetailMapper.class);
        UserDetail detail = new UserDetail(1,"2002-5-21","13425877954","819402765",null,null);
        int result = mapper.updateUserDetail(1,detail);

        System.out.println(result);
//        sqlSession.commit();
    }

    // 查
    @Test
    public void testSelectByCondition() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDetailMapper mapper = sqlSession.getMapper(UserDetailMapper.class);
        UserDetail condition_userDetail = new UserDetail();
        condition_userDetail.setQQ("819402765");
        List<UserDetail> users = mapper.selectByCondition(condition_userDetail);

        System.out.println(users);
    }

    @Test
    public void testSelectAll() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDetailMapper mapper = sqlSession.getMapper(UserDetailMapper.class);
        List<UserDetail> users = mapper.selectAll();

        System.out.println(users);
    }
}
