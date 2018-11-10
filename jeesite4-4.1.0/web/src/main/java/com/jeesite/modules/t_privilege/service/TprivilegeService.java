/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.t_privilege.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.t_privilege.entity.Tprivilege;
import com.jeesite.modules.t_privilege.dao.TprivilegeDao;

/**
 * t_privilegeService
 * @author tt
 * @version 2018-11-10
 */
@Service
@Transactional(readOnly=true)
public class TprivilegeService extends CrudService<TprivilegeDao, Tprivilege> {
	
	/**
	 * 获取单条数据
	 * @param tprivilege
	 * @return
	 */
	@Override
	public Tprivilege get(Tprivilege tprivilege) {
		return super.get(tprivilege);
	}
	
	/**
	 * 查询分页数据
	 * @param tprivilege 查询条件
	 * @param tprivilege.page 分页对象
	 * @return
	 */
	@Override
	public Page<Tprivilege> findPage(Tprivilege tprivilege) {
		return super.findPage(tprivilege);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tprivilege
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(Tprivilege tprivilege) {
		super.save(tprivilege);
	}
	
	/**
	 * 更新状态
	 * @param tprivilege
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(Tprivilege tprivilege) {
		super.updateStatus(tprivilege);
	}
	
	/**
	 * 删除数据
	 * @param tprivilege
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(Tprivilege tprivilege) {
		super.delete(tprivilege);
	}
	
}