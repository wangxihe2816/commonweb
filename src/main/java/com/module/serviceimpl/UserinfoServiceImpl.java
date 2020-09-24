package com.module.serviceimpl;

import com.module.mapper.UserinfoMapper;
import com.module.pojo.Userinfo;
import com.module.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    UserinfoMapper userinfoMapper;


    @Override
    public Userinfo selectUserinfoById(Integer id) {
        return userinfoMapper.selectUserinfoById(id);
    }

    @Override
    public List<Userinfo> selectUserinfoList(Userinfo userinfo) {
        return userinfoMapper.selectUserinfoList(userinfo);
    }

    @Override
    public List<Userinfo> selectAll(Map map) {
        return userinfoMapper.selectAll(map);
    }

    @Override
    public int insertUserinfo(Userinfo userinfo) {
        return userinfoMapper.insertUserinfo(userinfo);
    }

    @Override
    public int updateUserinfo(Userinfo userinfo) {
        return userinfoMapper.updateUserinfo(userinfo);
    }

    @Override
    public int batchUpdate(List<Userinfo> list) {
        return userinfoMapper.batchUpdate(list);
    }

    @Override
    public int deleteUserinfoById(Integer id) {
        return userinfoMapper.deleteUserinfoById(id);
    }

    @Override
    public int batchDeleteUserinfo(Integer[] ids) {
        return userinfoMapper.batchDeleteUserinfo(ids);
    }

    @Override
    public int batchAdd(List<Userinfo> list) {
        return userinfoMapper.batchAdd(list);
    }
}
