package com.module.pojo;
import java.util.Date;



/**
 * 考生信息表 studentinfo
 * 
 * @author administrator
 * @date 2020-07-07 08:35:05
 */
public class Studentinfo
{
	private static final long serialVersionUID = 1L;
	
	/** ID */
	private Integer id;
	/** 考生姓名 */
	private String stuname;
	/** 考生性别 */
	private String stusex;
	/** 身份证号 */
	private String stuidcard;
	/** 创建时间 */
	private Date createtime;
	/**
	 * 设置：ID
	 */
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	/**
	 * 获取：ID
	 */
	public Integer getId() 
	{
		return id;
	}
	/**
	 * 设置：考生姓名
	 */
	public void setStuname(String stuname) 
	{
		this.stuname = stuname;
	}
	
	/**
	 * 获取：考生姓名
	 */
	public String getStuname() 
	{
		return stuname;
	}
	/**
	 * 设置：考生性别
	 */
	public void setStusex(String stusex) 
	{
		this.stusex = stusex;
	}
	
	/**
	 * 获取：考生性别
	 */
	public String getStusex() 
	{
		return stusex;
	}
	/**
	 * 设置：身份证号
	 */
	public void setStuidcard(String stuidcard) 
	{
		this.stuidcard = stuidcard;
	}
	
	/**
	 * 获取：身份证号
	 */
	public String getStuidcard() 
	{
		return stuidcard;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatetime(Date createtime) 
	{
		this.createtime = createtime;
	}
	
	/**
	 * 获取：创建时间
	 */
	public Date getCreatetime() 
	{
		return createtime;
	}
}
