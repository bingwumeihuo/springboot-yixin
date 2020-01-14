package com.yixin.springboot.dao;

import com.yixin.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Package: com.yixin.springboot.dao
 * @ClassName: PersonDAO
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2020/1/14 15:20
 */

public interface PersonDAO extends JpaRepository<Person, Integer>, JpaSpecificationExecutor<Person> {
}
