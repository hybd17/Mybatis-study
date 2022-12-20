package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
        private static SqlSessionFactory sqlSessionFactory;
        private static InputStream inputStream;
        static {
                try {
                        String resource = "mybatis-config.xml";
                        inputStream = Resources.getResourceAsStream(resource);
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }
        public static SqlSession getSqlSession(){
                SqlSession sqlSession = sqlSessionFactory.openSession();
                return sqlSession;
        }
}
