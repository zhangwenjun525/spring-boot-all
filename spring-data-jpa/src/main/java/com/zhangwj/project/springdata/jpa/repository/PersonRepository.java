package com.zhangwj.project.springdata.jpa.repository;

import com.zhangwj.project.springdata.jpa.domain.Address;
import com.zhangwj.project.springdata.jpa.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/16
 * Time: 15:23
 */
public interface PersonRepository extends JpaRepository<Person, Integer>, JpaSpecificationExecutor<Person>{

    List<Person> findByName(String name);

    List<Person> findByIdIn(Integer ... ids);

    List<Person> findByIdBetween(Integer left, Integer right);

    List<Person> findByIdInOrderByIdDesc(Integer ... ids);

    @Query("SELECT p FROM Person p")
    List<Person> list();

/*    @Query("SELECT p FROM Person p where p.name = ?1")
    List<Person> takeByName(String name);*/

    @Query("SELECT p FROM Person p where p.name = :name order by p.id")
    List<Person> takeByName(@Param(value = "name") String name);

    @Query("UPDATE Person p set p.name = :name where p.id = :id")
    @Modifying
    Integer updatePerson(@Param(value = "id") Integer id, @Param(value = "name")String name);

    @Query(name = "byName")
    List<Person> byName(@Param(value = "name")String name);

    @Query(name = "byNameNative", nativeQuery = true)
    List<Person> byNameNative(@Param(value = "name")String name);

    @Query(name = "byNameNative2", nativeQuery = true)
    List<Person> byNameNative2(@Param(value = "name")String name);

    @Query(name = "findAddress", nativeQuery = true)
    List<Address> findAddress();

}
