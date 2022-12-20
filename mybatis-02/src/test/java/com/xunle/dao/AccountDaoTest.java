package com.xunle.dao;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;

import java.util.List;

public class AccountDaoTest extends TestCase {

    public void testFindAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> all = mapper.findAll();
        for(Account account,all)
        {
            System.out.println(account);
        }
        
    }

    public void testDeleteByPrimaryKey() {
    }

    public void testInsert() {
    }

    public void testSelectByPrimaryKey() {
    }

    public void testUpdateByPrimaryKey() {
    }
}