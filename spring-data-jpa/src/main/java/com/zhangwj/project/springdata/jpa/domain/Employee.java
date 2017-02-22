package com.zhangwj.project.springdata.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/21
 * Time: 22:18
 */
@Cacheable
@Table(name = "employee")
@Entity
public class Employee implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "salary", precision = 10, scale = 2)
    private Double salary;

    @Version
    @Column(name = "version")
    private Integer version;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", version=" + version +
                '}';
    }
}
