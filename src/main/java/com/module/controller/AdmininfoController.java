package com.module.controller;

import com.github.pagehelper.Page;
import com.module.pojo.Admininfo;
import com.module.service.AdmininfoService;
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
 * 页面请求控制  管理员管理
 */
@Controller
public class AdmininfoController {
    @Autowired
    AdmininfoService admininfoService;


    /**
     * 跳转到列表页面
     *
     * @return
     */
    @RequestMapping("manage/admininfoList")
    public String admininfoList() {
        return "manage/admininfo/admininfoList";
    }

    /**
     * 跳转到添加页面
     *
     * @return
     */
    @RequestMapping("manage/addAdmininfo")
    public String addAdmininfo(Model model) {
        return "manage/admininfo/saveAdmininfo";
    }

    /**
     * 跳转到修改页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("manage/editAdmininfo")
    public String editAdmininfo(Integer id, Model model) {
        Admininfo admininfo = admininfoService.selectAdmininfoById(id);
        model.addAttribute("admininfo", admininfo);
        return "manage/admininfo/saveAdmininfo";
    }

    /**
     * 查看详情页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("manage/admininfoInfo")
    public Admininfo admininfoInfo(Integer id, Model model) {
        Admininfo admininfo = admininfoService.selectAdmininfoById(id);
        model.addAttribute("admininfo", admininfo);
        return admininfo;
    }


    /**
     * 分页查询
     *
     * @param page  默认第一页
     * @param limit 默认每页显示10条
     * @return
     */
    @RequestMapping("manage/queryAdmininfoList")
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
        List<Admininfo> list = admininfoService.selectAll(map);
        PageInfo<Admininfo> pageInfo = new PageInfo<Admininfo>(list);  //使用mybatis分页插件
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);  //设置返回状态0为成功
        resultUtil.setCount(pageInfo.getTotal());  //获取总记录数目 类似count(*)
        resultUtil.setData(pageInfo.getList());    //获取当前查询出来的集合
        return resultUtil;
    }

    /**
     * 插入记录
     */
    @RequestMapping("manage/saveAdmininfo")
    @ResponseBody
    public ResultUtil saveAdmininfo(Admininfo admininfo, HttpSession session) {
        Date nowTime = new Date();
        admininfo.setCreatetime(nowTime);
        try {
            admininfoService.insertAdmininfo(admininfo);
            return ResultUtil.ok("添加管理员成功");
        } catch (Exception e) {
            return ResultUtil.error("添加管理员出错,稍后再试！");
        }
    }

    /**
     * 更新记录
     */
    @RequestMapping("manage/updateAdmininfo")
    @ResponseBody
    public ResultUtil updateAdmininfo(Admininfo admininfo, HttpSession session) {
        Date nowTime = new Date();
        admininfo.setCreatetime(nowTime);
        try {
            admininfoService.updateAdmininfo(admininfo);
            return ResultUtil.ok("修改管理员成功");
        } catch (Exception e) {
            return ResultUtil.error("修改管理员出错,稍后再试！");
        }
    }


    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    @RequestMapping("manage/deleteAdmininfo")
    @ResponseBody
    public ResultUtil deleteAdmininfoById(Integer id) {
        try {
            admininfoService.deleteAdmininfoById(id);
            return ResultUtil.ok("删除管理员成功");
        } catch (Exception e) {
            return ResultUtil.error("删除管理员出错,稍后再试！");
        }
    }

    /**
     * 根据ID批量删除
     *
     * @param idsStr
     * @return
     */
    @RequestMapping("manage/deletesAdmininfo")
    @ResponseBody
    public ResultUtil deletesAdmininfo(String idsStr) {
        try {
            if (!StringUtils.isBlank(idsStr)) {
                String[] ids = idsStr.split(",");
                for (String id : ids) {
                    admininfoService.deleteAdmininfoById(Integer.parseInt(id));
                }
            }
            return ResultUtil.ok("批量删除管理员成功");
        } catch (Exception e) {
            return ResultUtil.error("删除管理员出错,稍后再试！");
        }
    }


}
