package com.module.pojo;
import java.util.Date;



/**
 * 管理员表 admininfo
 * 
 * @author administrator
 * @date 2020-07-07 08:34:03
 */
public class Admininfo
{
	private static final long serialVersionUID = 1L;
	
	/** 管理员ID */
	private Integer id;
	/** 管理员用户名 */
	private String adminname;
	/** 管理员密码 */
	private String adminpassword;
	/** 创建时间 */
	private Date createtime;
	/**
	 * 设置：管理员ID
	 */
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	/**
	 * 获取：管理员ID
	 */
	public Integer getId() 
	{
		return id;
	}
	/**
	 * 设置：管理员用户名
	 */
	public void setAdminname(String adminname) 
	{
		this.adminname = adminname;
	}
	
	/**
	 * 获取：管理员用户名
	 */
	public String getAdminname() 
	{
		return adminname;
	}
	/**
	 * 设置：管理员密码
	 */
	public void setAdminpassword(String adminpassword) 
	{
		this.adminpassword = adminpassword;
	}
	
	/**
	 * 获取：管理员密码
	 */
	public String getAdminpassword() 
	{
		return adminpassword;
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
