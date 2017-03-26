package me.buhuan.service.impl;

import me.buhuan.dao.ElasticsearchDao;
import me.buhuan.service.ElsService;
import org.elasticsearch.bootstrap.Elasticsearch;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hbh
 * @version 2017/3/22下午7:31
 */
@Service
public class ElsServiceImpl implements ElsService{
//    @Autowired
//    private ElasticsearchDao elasticsearchDao;
//
//    @Override
//    public Client findClient(String id) {
//        return elasticsearchDao.findOne(id);
//    }
}
