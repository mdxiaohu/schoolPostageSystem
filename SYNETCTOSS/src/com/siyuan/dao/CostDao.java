package com.siyuan.dao;

import java.util.List;

import com.siyuan.annotation.MyBatisRepository;
import com.siyuan.entity.Cost;
import com.siyuan.entity.page.Page;

@MyBatisRepository
public interface CostDao {

	List<Cost> findAll();

	void save(Cost cost);

	Cost findById(int id);

	void update(Cost cost);

	void delete(int id);
	
	List<Cost> findByPage(Page page);
	
	int findRows();

}
