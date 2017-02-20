package com.zhangwj.project.springdata.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/20
 * Time: 16:31
 */
@Table(name = "goods")
@Entity
public class Goods implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "name", length = 30)
    private String name;

    @ManyToMany(mappedBy = "goodses")
    private List<Order> orders;


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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
/*                ", orders=" + orders +*/
                '}';
    }
}
