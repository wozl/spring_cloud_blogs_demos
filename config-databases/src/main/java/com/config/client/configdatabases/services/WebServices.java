package com.config.client.configdatabases.services;

import com.config.client.configdatabases.dao.InfoDao;
import com.config.client.configdatabases.entity.info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebServices {

    @Autowired
   private InfoDao infoDao;


    public List<info> allinfos(){
        return infoDao.selAll();
    }

}
