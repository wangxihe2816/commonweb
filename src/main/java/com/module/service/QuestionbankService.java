package com.module.service;

import com.module.pojo.Questionbank;

import java.util.List;
import java.util.Map;

/**
 * 题库信息 数据层
 * 
 * @author administrator
 * @date 2020-07-07 08:34:49
 */
public interface QuestionbankService
{

	/**
     * 查询题库信息信息
     * 
     * @param id 题库信息ID
     * @return 题库信息信息
     */
	public Questionbank selectQuestionbankById(Integer id);
	
	/**
     * 查询题库信息列表
     * 
     * @param questionbank 题库信息信息
     * @return 题库信息集合
     */
	public List<Questionbank> selectQuestionbankList(Questionbank questionbank);
	
	/**
     * 查询所有题库信息
     * 
     * @return 题库信息列表
     */
    public List<Questionbank> selectAll(Map map);
	/**
     * 新增题库信息
     * 
     * @param questionbank 题库信息信息
     * @return 结果
     */
	public int insertQuestionbank(Questionbank questionbank);
	
	/**
     * 修改题库信息
     * 
     * @param questionbank 题库信息信息
     * @return 结果
     */
	public int updateQuestionbank(Questionbank questionbank);
	 /**
     * 批量修改
     * @param list
     * @return
     */
   public int batchUpdate(List<Questionbank> list);
	/**
     * 删除题库信息
     * 
     * @param id 题库信息ID
     * @return 结果
     */
	public int deleteQuestionbankById(Integer id);
	
	/**
     * 批量删除题库信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int batchDeleteQuestionbank(Integer[] ids);
	
    /**
     * 批量添加
     * @param list
     * @return
     */
   public int batchAdd(List<Questionbank> list);
   
}