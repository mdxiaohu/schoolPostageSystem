package com.siyuan.dao;

import java.util.List;
import java.util.Map;

import com.siyuan.annotation.MyBatisRepository;
import com.siyuan.entity.Admin;
import com.siyuan.entity.Module;
import com.siyuan.entity.page.Page;

@MyBatisRepository
public interface AdminDao {

	List<Admin> findByPage(Page page);

	int findRows(Page page);

	void updatePassword(Map<String, Object> param);

	Admin findById(int id);

	void saveAdmin(Admin admin);

	void saveAdminRoles(Map<String, Object> adminRoles);

	void updateAdmin(Admin admin);

	void deleteAdminRoles(int adminId);

	void deleteAdmin(int id);
	
	Admin findByCode(String adminCode);
	
	List<Module> findModulesByAdmin(int adminId);

}
