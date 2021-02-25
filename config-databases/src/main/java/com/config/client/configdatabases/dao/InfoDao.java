package com.config.client.configdatabases.dao;

import com.config.client.configdatabases.entity.info;

import java.util.List;

public interface InfoDao {

    //查询所有表中信息
    List<info> selAll();

}
