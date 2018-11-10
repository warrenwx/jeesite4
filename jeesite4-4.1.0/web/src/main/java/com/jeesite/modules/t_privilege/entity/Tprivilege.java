/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.t_privilege.entity;


import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * t_privilegeEntity
 * @author tt
 * @version 2018-11-10
 */
@Table(name="t_privilege", alias="a", columns={
		@Column(name="userid", attrName="userid", label="userid", isPK=true),
		@Column(name="dbname", attrName="dbname", label="dbname", isPK=true),
		@Column(name="tbname", attrName="tbname", label="tbname", isPK=true),
		@Column(name="fieldname", attrName="fieldname", label="fieldname", isPK=true),
	}, orderBy="a.userid DESC, a.dbname DESC, a.tbname DESC, a.fieldname DESC"
)
public class Tprivilege extends DataEntity<Tprivilege> {
	
	private static final long serialVersionUID = 1L;
	private String userid;		// userid
	private String dbname;		// dbname
	private String tbname;		// tbname
	private String fieldname;		// fieldname
	
	public Tprivilege() {
		this(null);
	}

	public Tprivilege(String userid, String dbname, String tbname, String fieldname){
		this.userid = userid;
		this.dbname = dbname;
		this.tbname = tbname;
		this.fieldname = fieldname;
	}
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	
	public String getTbname() {
		return tbname;
	}

	public void setTbname(String tbname) {
		this.tbname = tbname;
	}
	
	public String getFieldname() {
		return fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	
}