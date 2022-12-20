package com.xunle.dao;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
    int deleteByPrimaryKey(String id);
    int insert(Account record);
    Account selectByPrimaryKey(String id);
    int updateByPrimaryKey(Account record);
}
