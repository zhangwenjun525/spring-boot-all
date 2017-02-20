package com.zhangwj.project.springdata.jpa.repository;

import com.zhangwj.project.springdata.jpa.domain.Human;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/19
 * Time: 11:01
 */
public interface HumanRepository extends JpaRepository<Human, Integer> {
}
