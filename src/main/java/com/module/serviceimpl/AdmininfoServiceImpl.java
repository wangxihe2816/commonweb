package com.module.serviceimpl;

import com.module.mapper.AdmininfoMapper;
import com.module.pojo.Admininfo;
import com.module.service.AdmininfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdmininfoServiceImpl implements AdmininfoService {

    @Autowired
    AdmininfoMapper admininfeMapper;

    @Override
    public Admininfo selectAdmininfoById(Integer id) {
        return admininfeMapper.selectAdmininfoById(id);
    }

    @Override
    public List<Admininfo> selectAdmininfoList(Admininfo admininfo) {
        return admininfeMapper.selectAdmininfoList(admininfo);
    }

    @Override
    public List<Admininfo> selectAll(Map map) {
        return admininfeMapper.selectAll(map);
    }

    @Override
    public int insertAdmininfo(Admininfo admininfo) {
        return admininfeMapper.insertAdmininfo(admininfo);
    }

    @Override
    public int updateAdmininfo(Admininfo admininfo) {
        return admininfeMapper.updateAdmininfo(admininfo);
    }

    @Override
    public int batchUpdate(List<Admininfo> list) {
        return admininfeMapper.batchUpdate(list);
    }

    @Override
    public int deleteAdmininfoById(Integer id) {
        return admininfeMapper.deleteAdmininfoById(id);
    }

    @Override
    public int batchDeleteAdmininfo(Integer[] ids) {
        return admininfeMapper.batchDeleteAdmininfo(ids);
    }

    @Override
    public int batchAdd(List<Admininfo> list) {
        return admininfeMapper.batchAdd(list);
    }
}
