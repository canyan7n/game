package com.macheng.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :SqlSessionUtil
 * @date ：2023/4/16 11:52
 * @description：TODO
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        //获取核心配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //自动提交事务
        SqlSession sqlSession= sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
