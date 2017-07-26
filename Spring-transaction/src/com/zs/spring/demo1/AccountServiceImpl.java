package com.zs.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl extends AccountService {
	
	private AccountDao accountDao;
	
	private TransactionDefinition txDefinition;
    @Autowired
	private PlatformTransactionManager txManager;
	@SuppressWarnings("deprecation")
	@Override
	public void transfer(final String out, final String in, final Double money) {
		  AccountDao a =new AccountDaoImpl();
					a.inMoney(in, money);
	}
}
