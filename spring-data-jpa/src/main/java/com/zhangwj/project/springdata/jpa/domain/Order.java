package com.zhangwj.project.springdata.jpa.domain;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/20
 * Time: 16:42
 */
@Table(name = "orders")
@Entity
public class Order implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "goods_order",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "goodsId")
    )
    private List<Goods> goodses;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Goods> getGoodses() {
        return goodses;
    }

    public void setGoodses(List<Goods> goodses) {
        this.goodses = goodses;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", goodses=" + goodses +
                '}';
    }
}
