package org.jietou.api.m;

import java.util.Date;

/**
 * 类AdministratorManage.java的实现描述： 管理账户实体类
 * 
 */
public class BwUser implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3779352632697210408L;

	// ROW_ID
	private Integer ROW_ID;

	// 账号
	private String ACCOUNT;

	// 姓名
	private String USER_NAME;

	// 邮箱
	private String e_MAIL;

	// 员工号
	private String USER_ID;

	// 手机
	private String PHONE;

	// 密码
	private String PASSWORD;

	// 运营经理
	private String OPERATION_MANAGER;

	// 0超级管理员:1 客服管理员
	private String IDENTITY;

	// 删除标志:1 删除
	private String DEL_FLAG;

	// 创建时间
	private Date CREATED_DATE;

	// 创建人
	private String CREATED_BY;

	public Integer getROW_ID() {
		return ROW_ID;
	}

	public void setROW_ID(Integer ROW_ID) {
		this.ROW_ID = ROW_ID;
	}

	public String getACCOUNT() {
		return ACCOUNT;
	}

	public void setACCOUNT(String ACCOUNT) {
		this.ACCOUNT = ACCOUNT == null ? null : ACCOUNT.trim();
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String USER_NAME) {
		this.USER_NAME = USER_NAME == null ? null : USER_NAME.trim();
	}

	public String getE_MAIL() {
		return e_MAIL;
	}

	public void setE_MAIL(String e_MAIL) {
		this.e_MAIL = e_MAIL == null ? null : e_MAIL.trim();
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID == null ? null : USER_ID.trim();
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String PHONE) {
		this.PHONE = PHONE == null ? null : PHONE.trim();
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String PASSWORD) {
		this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
	}

	public String getOPERATION_MANAGER() {
		return OPERATION_MANAGER;
	}

	public void setOPERATION_MANAGER(String operation_Manager) {
		this.OPERATION_MANAGER = operation_Manager == null ? null : operation_Manager.trim();
	}

	public String getIDENTITY() {
		return IDENTITY;
	}

	public void setIDENTITY(String identity) {
		this.IDENTITY = identity == null ? null : identity.trim();
	}

	public String getDEL_FLAG() {
		return DEL_FLAG;
	}

	public void setDEL_FLAG(String DEL_FLAG) {
		this.DEL_FLAG = DEL_FLAG == null ? null : DEL_FLAG.trim();
	}

	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}

	public void setCREATED_DATE(Date CREATED_DATE) {
		this.CREATED_DATE = CREATED_DATE;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String CREATED_BY) {
		this.CREATED_BY = CREATED_BY;
	}
}