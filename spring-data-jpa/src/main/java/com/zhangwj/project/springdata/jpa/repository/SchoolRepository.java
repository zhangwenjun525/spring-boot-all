package com.zhangwj.project.springdata.jpa.repository;

import com.zhangwj.project.springdata.jpa.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/19
 * Time: 14:35
 */
public interface SchoolRepository extends JpaRepository<School, Integer> {
}
