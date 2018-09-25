package com.siyuan.dao;

import java.util.List;
import java.util.Map;

import com.siyuan.annotation.MyBatisRepository;
import com.siyuan.entity.Module;
import com.siyuan.entity.Role;
import com.siyuan.entity.page.Page;

@MyBatisRepository
public interface RoleDao {

	List<Role> findByPage(Page page);

	int findRows(Page page);
	
	List<Module> findAllModules();
	
	Role findById(int id);
	
	void saveRole(Role role);
	
	void saveRoleModules(Map<String,Object> roleModules);
	
	void updateRole(Role role);
	
	void deleteRoleModules(int roleId);
	
	void deleteRole(int roleId);
	
	Role findByName(String name);
	
}
