package com.module.controller;

import com.github.pagehelper.Page;
import com.module.mapper.StudentinfoMapper;
import com.module.pojo.Studentinfo;
import com.module.service.StudentinfoService;
import com.module.util.ResultUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 页面请求控制  考生信息管理
 */
@Controller
public class StudentinfoController {
    @Autowired
    StudentinfoService studentinfoService;


    /**
     * 跳转到列表页面
     *
     * @return
     */
    @RequestMapping("manage/studentinfoList")
    public String studentinfoList() {
        return "manage/studentinfo/studentinfoList";
    }

    /**
     * 跳转到添加页面
     *
     * @return
     */
    @RequestMapping("manage/addStudentinfo")
    public String addStudentinfo(Model model) {
        return "manage/studentinfo/saveStudentinfo";
    }

    /**
     * 跳转到修改页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("manage/editStudentinfo")
    public String editStudentinfo(Integer id, Model model) {
        Studentinfo studentinfo = studentinfoService.selectStudentinfoById(id);
        model.addAttribute("studentinfo", studentinfo);
        return "manage/studentinfo/saveStudentinfo";
    }

    /**
     * 查看详情页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("manage/studentinfoInfo")
    public String studentinfoInfo(Integer id, Model model) {
        Studentinfo studentinfo = studentinfoService.selectStudentinfoById(id);
        model.addAttribute("studentinfo", studentinfo);
        return "manage/studentinfo/studentinfoInfo";
    }


    /**
     * 分页查询
     *
     * @param page  默认第一页
     * @param limit 默认每页显示10条
     * @return
     */
    @RequestMapping("manage/queryStudentinfoList")
    @ResponseBody
    public ResultUtil getCarouseList(Integer page, Integer limit, String keyword) {
        if (null == page) { //默认第一页
            page = 1;
        }
        if (null == limit) { //默认每页10条
            limit = 10;
        }
        Map map = new HashMap();
        if (StringUtils.isNotEmpty(keyword)) {
            map.put("keyword", keyword);
        }
        Page pageHelper = PageHelper.startPage(page, limit, true);
        pageHelper.setOrderBy(" id desc ");
        List<Studentinfo> list = studentinfoService.selectAll(map);
        PageInfo<Studentinfo> pageInfo = new PageInfo<Studentinfo>(list);  //使用mybatis分页插件
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);  //设置返回状态0为成功
        resultUtil.setCount(pageInfo.getTotal());  //获取总记录数目 类似count(*)
        resultUtil.setData(pageInfo.getList());    //获取当前查询出来的集合
        return resultUtil;
    }

    /**
     * 插入记录
     */
    @RequestMapping("manage/saveStudentinfo")
    @ResponseBody
    public ResultUtil saveStudentinfo(Studentinfo studentinfo, HttpSession session) {
        Date nowTime = new Date();
        studentinfo.setCreatetime(nowTime);
        try {
            studentinfoService.insertStudentinfo(studentinfo);
            return ResultUtil.ok("添加考生信息成功");
        } catch (Exception e) {
            return ResultUtil.error("添加考生信息出错,稍后再试！");
        }
    }

    /**
     * 更新记录
     */
    @RequestMapping("manage/updateStudentinfo")
    @ResponseBody
    public ResultUtil updateStudentinfo(Studentinfo studentinfo, HttpSession session) {
        Date nowTime = new Date();
        studentinfo.setCreatetime(nowTime);
        try {
            studentinfoService.updateStudentinfo(studentinfo);
            return ResultUtil.ok("修改考生信息成功");
        } catch (Exception e) {
            return ResultUtil.error("修改考生信息出错,稍后再试！");
        }
    }


    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    @RequestMapping("manage/deleteStudentinfo")
    @ResponseBody
    public ResultUtil deleteStudentinfoById(Integer id) {
        try {
            studentinfoService.deleteStudentinfoById(id);
            return ResultUtil.ok("删除考生信息成功");
        } catch (Exception e) {
            return ResultUtil.error("删除考生信息出错,稍后再试！");
        }
    }

    /**
     * 根据ID批量删除
     *
     * @param idsStr
     * @return
     */
    @RequestMapping("manage/deletesStudentinfo")
    @ResponseBody
    public ResultUtil deletesStudentinfo(String idsStr) {
        try {
            if (!StringUtils.isBlank(idsStr)) {
                String[] ids = idsStr.split(",");
                for (String id : ids) {
                    studentinfoService.deleteStudentinfoById(Integer.parseInt(id));
                }
            }
            return ResultUtil.ok("批量删除考生信息成功");
        } catch (Exception e) {
            return ResultUtil.error("删除考生信息出错,稍后再试！");
        }
    }


}
