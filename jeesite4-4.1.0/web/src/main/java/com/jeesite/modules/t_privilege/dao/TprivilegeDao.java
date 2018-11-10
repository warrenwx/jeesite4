/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.t_privilege.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.t_privilege.entity.Tprivilege;

/**
 * t_privilegeDAO接口
 * @author tt
 * @version 2018-11-10
 */
@MyBatisDao
public interface TprivilegeDao extends CrudDao<Tprivilege> {
	
}