package com.module.serviceimpl;

import com.module.mapper.StudentinfoMapper;
import com.module.pojo.Studentinfo;
import com.module.service.StudentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentinfoServiceImpl implements StudentinfoService {

    @Autowired
    StudentinfoMapper studentinfoMapper;


    @Override
    public Studentinfo selectStudentinfoById(Integer id) {
        return studentinfoMapper.selectStudentinfoById(id);
    }

    @Override
    public List<Studentinfo> selectStudentinfoList(Studentinfo studentinfo) {
        return studentinfoMapper.selectStudentinfoList(studentinfo);
    }

    @Override
    public List<Studentinfo> selectAll(Map map) {
        return studentinfoMapper.selectAll(map);
    }

    @Override
    public int insertStudentinfo(Studentinfo studentinfo) {
        return studentinfoMapper.insertStudentinfo(studentinfo);
    }

    @Override
    public int updateStudentinfo(Studentinfo studentinfo) {
        return studentinfoMapper.updateStudentinfo(studentinfo);
    }

    @Override
    public int batchUpdate(List<Studentinfo> list) {
        return studentinfoMapper.batchUpdate(list);
    }

    @Override
    public int deleteStudentinfoById(Integer id) {
        return studentinfoMapper.deleteStudentinfoById(id);
    }

    @Override
    public int batchDeleteStudentinfo(Integer[] ids) {
        return studentinfoMapper.batchDeleteStudentinfo(ids);
    }

    @Override
    public int batchAdd(List<Studentinfo> list) {
        return studentinfoMapper.batchAdd(list);
    }
}
