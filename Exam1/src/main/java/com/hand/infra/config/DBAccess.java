package com.hand.infra.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 访问数据库类
 */
public class DBAccess {
    public SqlSession getSqlSession() throws IOException {
        Reader reader = Resources.getResourceAsReader("applicationContext-mybatis.xml");
        // 通过配置信息构建一个SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 打开一个数据库会话
        SqlSession sqlSession = sqlSessionFactory.openSession() ;

        return sqlSession;
    }
}
