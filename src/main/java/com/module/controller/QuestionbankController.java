package com.module.controller;

import com.github.pagehelper.Page;
import com.module.mapper.QuestionbankMapper;
import com.module.pojo.Questionbank;
import com.module.service.QuestionbankService;
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
 * 页面请求控制  题库信息管理
 */
@Controller
public class QuestionbankController {
    @Autowired
    QuestionbankService questionbankService;


    /**
     * 跳转到列表页面
     *
     * @return
     */
    @RequestMapping("manage/questionbankList")
    public String questionbankList() {
        return "manage/questionbank/questionbankList";
    }

    /**
     * 跳转到添加页面
     *
     * @return
     */
    @RequestMapping("manage/addQuestionbank")
    public String addQuestionbank(Model model) {
        return "manage/questionbank/saveQuestionbank";
    }

    /**
     * 跳转到修改页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("manage/editQuestionbank")
    public String editQuestionbank(Integer id, Model model) {
        Questionbank questionbank = questionbankService.selectQuestionbankById(id);
        model.addAttribute("questionbank", questionbank);
        return "manage/questionbank/saveQuestionbank";
    }

    /**
     * 查看详情页面
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("manage/questionbankInfo")
    public String questionbankInfo(Integer id, Model model) {
        Questionbank questionbank = questionbankService.selectQuestionbankById(id);
        model.addAttribute("questionbank", questionbank);
        return "manage/questionbank/questionbankInfo";
    }


    /**
     * 分页查询
     *
     * @param page  默认第一页
     * @param limit 默认每页显示10条
     * @return
     */
    @RequestMapping("manage/queryQuestionbankList")
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
        List<Questionbank> list = questionbankService.selectAll(map);
        PageInfo<Questionbank> pageInfo = new PageInfo<Questionbank>(list);  //使用mybatis分页插件
        ResultUtil resultUtil = new ResultUtil();
        resultUtil.setCode(0);  //设置返回状态0为成功
        resultUtil.setCount(pageInfo.getTotal());  //获取总记录数目 类似count(*)
        resultUtil.setData(pageInfo.getList());    //获取当前查询出来的集合
        return resultUtil;
    }

    /**
     * 插入记录
     */
    @RequestMapping("manage/saveQuestionbank")
    @ResponseBody
    public ResultUtil saveQuestionbank(Questionbank questionbank, HttpSession session) {
        Date nowTime = new Date();
        questionbank.setCreatetime(nowTime);
        try {
            questionbankService.insertQuestionbank(questionbank);
            return ResultUtil.ok("添加题库信息成功");
        } catch (Exception e) {
            return ResultUtil.error("添加题库信息出错,稍后再试！");
        }
    }

    /**
     * 更新记录
     */
    @RequestMapping("manage/updateQuestionbank")
    @ResponseBody
    public ResultUtil updateQuestionbank(Questionbank questionbank, HttpSession session) {
        Date nowTime = new Date();
        questionbank.setCreatetime(nowTime);
        try {
            questionbankService.updateQuestionbank(questionbank);
            return ResultUtil.ok("修改题库信息成功");
        } catch (Exception e) {
            return ResultUtil.error("修改题库信息出错,稍后再试！");
        }
    }


    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    @RequestMapping("manage/deleteQuestionbank")
    @ResponseBody
    public ResultUtil deleteQuestionbankById(Integer id) {
        try {
            questionbankService.deleteQuestionbankById(id);
            return ResultUtil.ok("删除题库信息成功");
        } catch (Exception e) {
            return ResultUtil.error("删除题库信息出错,稍后再试！");
        }
    }

    /**
     * 根据ID批量删除
     *
     * @param idsStr
     * @return
     */
    @RequestMapping("manage/deletesQuestionbank")
    @ResponseBody
    public ResultUtil deletesQuestionbank(String idsStr) {
        try {
            if (!StringUtils.isBlank(idsStr)) {
                String[] ids = idsStr.split(",");
                for (String id : ids) {
                    questionbankService.deleteQuestionbankById(Integer.parseInt(id));
                }
            }
            return ResultUtil.ok("批量删除题库信息成功");
        } catch (Exception e) {
            return ResultUtil.error("删除题库信息出错,稍后再试！");
        }
    }


}
