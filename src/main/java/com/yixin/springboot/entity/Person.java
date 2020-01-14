package com.yixin.springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Package: com.yixin.springboot.dao
 * @ClassName: Person
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2020/1/14 15:18
 */
@Data
@Entity
@Table(name = "tbl_person")
public class Person implements Serializable {
    @Id
    private int id;
    private String name;
    private String phone;
    private int age;

}
