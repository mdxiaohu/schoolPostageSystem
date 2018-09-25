package com.siyuan.dao;

import java.util.List;

import com.siyuan.annotation.MyBatisRepository;
import com.siyuan.entity.Account;
import com.siyuan.entity.page.Page;

@MyBatisRepository
public interface AccountDao {

	List<Account> findByPage(Page page);

	int findRows(Page page);
	
	void updateStatus(Account account);
	
	Account findById(int id);

	void update(Account account);

	void save(Account account);
	
	Account findByIdcardNo(String idcardNo);
	
}
