package com.module.mapper;

import com.module.pojo.Admininfo;
import java.util.List;
import java.util.Map;

/**
 * 管理员 数据层
 * 
 * @author administrator
 * @date 2020-07-07 08:34:03
 */
public interface AdmininfoMapper 
{

	/**
     * 查询管理员信息
     * 
     * @param id 管理员ID
     * @return 管理员信息
     */
	public Admininfo selectAdmininfoById(Integer id);
	
	/**
     * 查询管理员列表
     * 
     * @param admininfo 管理员信息
     * @return 管理员集合
     */
	public List<Admininfo> selectAdmininfoList(Admininfo admininfo);
	
	/**
     * 查询所有管理员
     * 
     * @return 管理员列表
     */
    public List<Admininfo> selectAll(Map map);
	/**
     * 新增管理员
     * 
     * @param admininfo 管理员信息
     * @return 结果
     */
	public int insertAdmininfo(Admininfo admininfo);
	
	/**
     * 修改管理员
     * 
     * @param admininfo 管理员信息
     * @return 结果
     */
	public int updateAdmininfo(Admininfo admininfo);
	 /**
     * 批量修改
     * @param list
     * @return
     */
   public int batchUpdate(List<Admininfo> list);
	/**
     * 删除管理员
     * 
     * @param id 管理员ID
     * @return 结果
     */
	public int deleteAdmininfoById(Integer id);
	
	/**
     * 批量删除管理员
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int batchDeleteAdmininfo(Integer[] ids);
	
    /**
     * 批量添加
     * @param list
     * @return
     */
   public int batchAdd(List<Admininfo> list);
   
}