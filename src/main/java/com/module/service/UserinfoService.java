package com.module.service;

import com.module.pojo.Userinfo;

import java.util.List;
import java.util.Map;

/**
 * 面试官 数据层
 * 
 * @author administrator
 * @date 2020-07-07 08:35:17
 */
public interface UserinfoService
{

	/**
     * 查询面试官信息
     * 
     * @param id 面试官ID
     * @return 面试官信息
     */
	public Userinfo selectUserinfoById(Integer id);
	
	/**
     * 查询面试官列表
     * 
     * @param userinfo 面试官信息
     * @return 面试官集合
     */
	public List<Userinfo> selectUserinfoList(Userinfo userinfo);
	
	/**
     * 查询所有面试官
     * 
     * @return 面试官列表
     */
    public List<Userinfo> selectAll(Map map);
	/**
     * 新增面试官
     * 
     * @param userinfo 面试官信息
     * @return 结果
     */
	public int insertUserinfo(Userinfo userinfo);
	
	/**
     * 修改面试官
     * 
     * @param userinfo 面试官信息
     * @return 结果
     */
	public int updateUserinfo(Userinfo userinfo);
	 /**
     * 批量修改
     * @param list
     * @return
     */
   public int batchUpdate(List<Userinfo> list);
	/**
     * 删除面试官
     * 
     * @param id 面试官ID
     * @return 结果
     */
	public int deleteUserinfoById(Integer id);
	
	/**
     * 批量删除面试官
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int batchDeleteUserinfo(Integer[] ids);
	
    /**
     * 批量添加
     * @param list
     * @return
     */
   public int batchAdd(List<Userinfo> list);
   
}