package com.qcrrm.mybatissqlitedemo.util;

import com.qcrrm.mybatissqlitedemo.HelloController;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author qcrrm
 * @date 2024-05-16 12:21
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final String MYBATIS_CONFIG_FILE = "mybatis-config.xml";

    static {
        try {
            Resources.setDefaultClassLoader(HelloController.class.getClassLoader());
            InputStream resourceAsStream = Resources.getResourceAsStream(MYBATIS_CONFIG_FILE);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
