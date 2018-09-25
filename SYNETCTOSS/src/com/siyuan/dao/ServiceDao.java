package com.siyuan.dao;

import java.util.List;
import java.util.Map;

import com.siyuan.annotation.MyBatisRepository;
import com.siyuan.entity.Service;
import com.siyuan.entity.page.Page;

@MyBatisRepository
public interface ServiceDao {

	List<Map<String, Object>> findByPage(Page page);

	int findRows(Page page);
	
	void updateStatus(Service service);
	
	void pauseByAccount(int accountId);
	
	void deleteByAccount(int accountId);
	
	Service findById(int id);
	
	void save(Service service);
	
	void update(Service service);

}
