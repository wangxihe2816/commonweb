package com.module.mapper;

import com.module.pojo.Studentinfo;
import java.util.List;
import java.util.Map;

/**
 * 考生信息 数据层
 * 
 * @author administrator
 * @date 2020-07-07 08:35:05
 */
public interface StudentinfoMapper 
{

	/**
     * 查询考生信息信息
     * 
     * @param id 考生信息ID
     * @return 考生信息信息
     */
	public Studentinfo selectStudentinfoById(Integer id);
	
	/**
     * 查询考生信息列表
     * 
     * @param studentinfo 考生信息信息
     * @return 考生信息集合
     */
	public List<Studentinfo> selectStudentinfoList(Studentinfo studentinfo);
	
	/**
     * 查询所有考生信息
     * 
     * @return 考生信息列表
     */
    public List<Studentinfo> selectAll(Map map);
	/**
     * 新增考生信息
     * 
     * @param studentinfo 考生信息信息
     * @return 结果
     */
	public int insertStudentinfo(Studentinfo studentinfo);
	
	/**
     * 修改考生信息
     * 
     * @param studentinfo 考生信息信息
     * @return 结果
     */
	public int updateStudentinfo(Studentinfo studentinfo);
	 /**
     * 批量修改
     * @param list
     * @return
     */
   public int batchUpdate(List<Studentinfo> list);
	/**
     * 删除考生信息
     * 
     * @param id 考生信息ID
     * @return 结果
     */
	public int deleteStudentinfoById(Integer id);
	
	/**
     * 批量删除考生信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int batchDeleteStudentinfo(Integer[] ids);
	
    /**
     * 批量添加
     * @param list
     * @return
     */
   public int batchAdd(List<Studentinfo> list);
   
}