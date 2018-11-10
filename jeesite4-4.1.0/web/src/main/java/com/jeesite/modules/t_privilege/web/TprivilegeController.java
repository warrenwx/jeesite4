/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.t_privilege.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.t_privilege.entity.Tprivilege;
import com.jeesite.modules.t_privilege.service.TprivilegeService;

/**
 * t_privilegeController
 * @author tt
 * @version 2018-11-10
 */
@Controller
@RequestMapping(value = "${adminPath}/t_privilege/tprivilege")
public class TprivilegeController extends BaseController {

	@Autowired
	private TprivilegeService tprivilegeService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public Tprivilege get(String userid, String dbname, String tbname, String fieldname, boolean isNewRecord) {
		return tprivilegeService.get(new Class<?>[]{String.class, String.class, String.class, String.class},
				new Object[]{userid, dbname, tbname, fieldname}, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("t_privilege:tprivilege:view")
	@RequestMapping(value = {"list", ""})
	public String list(Tprivilege tprivilege, Model model) {
		model.addAttribute("tprivilege", tprivilege);
		return "modules/t_privilege/tprivilegeList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("t_privilege:tprivilege:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<Tprivilege> listData(Tprivilege tprivilege, HttpServletRequest request, HttpServletResponse response) {
		tprivilege.setPage(new Page<>(request, response));
		Page<Tprivilege> page = tprivilegeService.findPage(tprivilege); 
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("t_privilege:tprivilege:view")
	@RequestMapping(value = "form")
	public String form(Tprivilege tprivilege, Model model) {
		model.addAttribute("tprivilege", tprivilege);
		return "modules/t_privilege/tprivilegeForm";
	}

	/**
	 * 保存t_privilege
	 */
	@RequiresPermissions("t_privilege:tprivilege:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated Tprivilege tprivilege) {
		tprivilegeService.save(tprivilege);
		return renderResult(Global.TRUE, text("保存t_privilege成功！"));
	}
	
	/**
	 * 删除t_privilege
	 */
	@RequiresPermissions("t_privilege:tprivilege:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(Tprivilege tprivilege) {
		tprivilegeService.delete(tprivilege);
		return renderResult(Global.TRUE, text("删除t_privilege成功！"));
	}
	
}