package com.zhangwj.project.springdata.jpa.service.impl;

import com.zhangwj.project.springdata.jpa.domain.Account;
import com.zhangwj.project.springdata.jpa.repository.AccountRepository;
import com.zhangwj.project.springdata.jpa.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 16:41
 */
@Service("accountService")
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
