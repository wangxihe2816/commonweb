package com.module.pojo;
import java.util.Date;



/**
 * 题库信息表 questionbank
 * 
 * @author administrator
 * @date 2020-07-07 08:34:49
 */
public class Questionbank
{
	private static final long serialVersionUID = 1L;
	
	/** 题库ID */
	private Integer id;
	/** 题干 */
	private String title;
	/** 类型 */
	private String sorttype;
	/** 图片数量 */
	private String imgnums;
	/** 图片1 */
	private String img1;
	/** 图片2 */
	private String img2;
	/** 图片3 */
	private String img3;
	/** 图片4 */
	private String img4;
	/** 选项A */
	private String selecta;
	/** 选项B */
	private String selectb;
	/** 选项C */
	private String selectc;
	/** 选项D */
	private String selectd;
	/** 正确答案 */
	private String selectinfo;
	/** 题目分数 */
	private Integer scorenum;
	/** 创建时间 */
	private Date createtime;
	/**
	 * 设置：题库ID
	 */
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	/**
	 * 获取：题库ID
	 */
	public Integer getId() 
	{
		return id;
	}
	/**
	 * 设置：题干
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	/**
	 * 获取：题干
	 */
	public String getTitle() 
	{
		return title;
	}
	/**
	 * 设置：类型
	 */
	public void setSorttype(String sorttype) 
	{
		this.sorttype = sorttype;
	}
	
	/**
	 * 获取：类型
	 */
	public String getSorttype() 
	{
		return sorttype;
	}
	/**
	 * 设置：图片数量
	 */
	public void setImgnums(String imgnums) 
	{
		this.imgnums = imgnums;
	}
	
	/**
	 * 获取：图片数量
	 */
	public String getImgnums() 
	{
		return imgnums;
	}
	/**
	 * 设置：图片1
	 */
	public void setImg1(String img1) 
	{
		this.img1 = img1;
	}
	
	/**
	 * 获取：图片1
	 */
	public String getImg1() 
	{
		return img1;
	}
	/**
	 * 设置：图片2
	 */
	public void setImg2(String img2) 
	{
		this.img2 = img2;
	}
	
	/**
	 * 获取：图片2
	 */
	public String getImg2() 
	{
		return img2;
	}
	/**
	 * 设置：图片3
	 */
	public void setImg3(String img3) 
	{
		this.img3 = img3;
	}
	
	/**
	 * 获取：图片3
	 */
	public String getImg3() 
	{
		return img3;
	}
	/**
	 * 设置：图片4
	 */
	public void setImg4(String img4) 
	{
		this.img4 = img4;
	}
	
	/**
	 * 获取：图片4
	 */
	public String getImg4() 
	{
		return img4;
	}
	/**
	 * 设置：选项A
	 */
	public void setSelecta(String selecta) 
	{
		this.selecta = selecta;
	}
	
	/**
	 * 获取：选项A
	 */
	public String getSelecta() 
	{
		return selecta;
	}
	/**
	 * 设置：选项B
	 */
	public void setSelectb(String selectb) 
	{
		this.selectb = selectb;
	}
	
	/**
	 * 获取：选项B
	 */
	public String getSelectb() 
	{
		return selectb;
	}
	/**
	 * 设置：选项C
	 */
	public void setSelectc(String selectc) 
	{
		this.selectc = selectc;
	}
	
	/**
	 * 获取：选项C
	 */
	public String getSelectc() 
	{
		return selectc;
	}
	/**
	 * 设置：选项D
	 */
	public void setSelectd(String selectd) 
	{
		this.selectd = selectd;
	}
	
	/**
	 * 获取：选项D
	 */
	public String getSelectd() 
	{
		return selectd;
	}
	/**
	 * 设置：正确答案
	 */
	public void setSelectinfo(String selectinfo) 
	{
		this.selectinfo = selectinfo;
	}
	
	/**
	 * 获取：正确答案
	 */
	public String getSelectinfo() 
	{
		return selectinfo;
	}
	/**
	 * 设置：题目分数
	 */
	public void setScorenum(Integer scorenum) 
	{
		this.scorenum = scorenum;
	}
	
	/**
	 * 获取：题目分数
	 */
	public Integer getScorenum() 
	{
		return scorenum;
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
