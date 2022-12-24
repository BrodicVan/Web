import Mapper.*;
import Web.Identity;
import Web.Message;
import Web.PostTag;
import Web.Tag;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class SimpleTest
{
    // 增
    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
//        PubPostMapper mapper = sqlSession.getMapper(PubPostMapper.class);
//        System.out.println(mapper.insertPubPost(1));
//        System.out.println(mapper.updatePubPost(1,1));
//        System.out.println(mapper.deletePubPost(1));
//        System.out.println(mapper.selectAll());
//        TagMapper mapper = sqlSession.getMapper(TagMapper.class);
//        mapper.insertTag(new Tag(1,"测试"));
        PostTagMapper mapper = sqlSession.getMapper(PostTagMapper.class);

        System.out.println(mapper.selectAll());
//        sqlSession.commit();
    }

    // 删
    @Test
    public void testDeleteIdentity() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        Identity new_identity = new Identity();


    }


    @Test
    public void testUpdateIdentity() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        IdentityMapper identityMapper = sqlSession.getMapper(IdentityMapper.class);
        Identity old_identity = new Identity(1,null,null);
        Identity new_identity = new Identity(1,"12345678",null);
        identityMapper.updateIdentity(1,new_identity);


//        sqlSession.commit();
    }

    @Test
    public void testUpdateMessage() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        MessageMapper messageMapper = sqlSession.getMapper(MessageMapper.class);
        Message old_message = new Message(1,1,-1);
        Message new_message = new Message(1,1,2);
        messageMapper.updateMessage(old_message,new_message);


//        sqlSession.commit();
    }

    @Test
    public void testSelectByConditionMessage() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);
        System.out.println(mapper.selectAll());
    }

    @Test
    public void testSelectAll() throws IOException
    {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

    }
}
