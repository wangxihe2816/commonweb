package com.module.pojo;
import java.util.Date;



/**
 * 面试官表 userinfo
 * 
 * @author administrator
 * @date 2020-07-07 08:35:17
 */
public class Userinfo
{
	private static final long serialVersionUID = 1L;
	
	/** id编号 */
	private Integer id;
	/** 姓名 */
	private String username;
	/** 密码 */
	private String password;
	/** 创建时间 */
	private Date createtime;
	/**
	 * 设置：id编号
	 */
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	/**
	 * 获取：id编号
	 */
	public Integer getId() 
	{
		return id;
	}
	/**
	 * 设置：姓名
	 */
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getUsername() 
	{
		return username;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	/**
	 * 获取：密码
	 */
	public String getPassword() 
	{
		return password;
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
