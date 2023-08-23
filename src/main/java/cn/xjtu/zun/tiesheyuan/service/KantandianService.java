package cn.xjtu.zun.tiesheyuan.service;

import cn.xjtu.zun.tiesheyuan.mapper.KantandianMapper;
import cn.xjtu.zun.tiesheyuan.pojo.Kantandian;
import cn.xjtu.zun.tiesheyuan.pojo.KantandianExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KantandianService {
    @Autowired
    KantandianMapper kantandianMapper;

    public List<Kantandian> selectKantandianLimit(long gcxxid, int offset, int limit){
        return kantandianMapper.selectByGcxxid(gcxxid, offset, limit);
    }

    public long getRowsByGcxxid(long gcxxid){
        KantandianExample kantandianExample = new KantandianExample();
        KantandianExample.Criteria criteria = kantandianExample.createCriteria();
        criteria.andGcxxidEqualTo(gcxxid);
        return kantandianMapper.countByExample(kantandianExample);
    }
}
