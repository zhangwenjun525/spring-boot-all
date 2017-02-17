package com.zhangwj.project.springdata.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Create by IntelliJ IDEA
 * <p>
 * User: zhangwj
 * Date: 2017/2/16
 * Time: 14:59
 */
@NamedQueries({
        @NamedQuery(name = "byName", query = "SELECT p FROM Person p where p.name = :name")
})
@NamedNativeQueries({
        @NamedNativeQuery(name = "byNameNative", query = "SELECT * FROM person where name = :name", resultClass = Person.class),
        @NamedNativeQuery(name = "byNameNative2", query = "SELECT * FROM person where name = :name", resultSetMapping = "result"),
        @NamedNativeQuery(name = "findAddress", query = "SELECT id, address FROM person", resultSetMapping = "result2")
})
@SqlResultSetMappings({
        @SqlResultSetMapping(name = "result", entities = {
                @EntityResult(
                        entityClass = Person.class,
                        fields = {
                                @FieldResult(name = "id", column = "id"),
                                @FieldResult(name = "name",column = "name"),
                                @FieldResult(name = "age", column = "age"),
                                @FieldResult(name = "address", column = "address")
                        })
        }),
        @SqlResultSetMapping(name = "result2", classes = {
                @ConstructorResult(targetClass = Address.class,
                        columns = {
                                @ColumnResult(name = "id", type = Integer.class),
                                @ColumnResult(name = "address", type = String.class)
                        }
                )
        })
})
@Table(name = "person")
@Entity
public class Person implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "address", length = 128)
    private String address;

    public Person() {
    }

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (age != null ? !age.equals(person.age) : person.age != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
