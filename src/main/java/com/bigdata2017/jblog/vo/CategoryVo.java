package com.bigdata2017.jblog.vo;

public class CategoryVo {
	private String no;
	private String name;
	private String description;
	private String regDate;
	private String id;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CateogryVo [no=" + no + ", name=" + name + ", description=" + description + ", regDate=" + regDate
				+ ", id=" + id + "]";
	}
	
}
