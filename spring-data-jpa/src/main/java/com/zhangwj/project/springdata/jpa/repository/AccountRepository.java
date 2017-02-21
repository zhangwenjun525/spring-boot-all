package com.zhangwj.project.springdata.jpa.repository;

import com.zhangwj.project.springdata.jpa.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 16:39
 */
public interface AccountRepository extends JpaRepository<Account, Integer>{
}
