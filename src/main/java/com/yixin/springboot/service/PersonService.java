package com.yixin.springboot.service;

import com.yixin.springboot.dao.PersonDAO;
import com.yixin.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: com.yixin.springboot.service
 * @ClassName: PersonService
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2020/1/14 15:21
 */
@Service
public class PersonService {
    @Autowired
    private PersonDAO personDAO;

    public List<Person> findAll() {
        List<Person> list = personDAO.findAll();
        if (list.size() < 1) {
            return null;
        } else {
            return list;
        }
    }
}
