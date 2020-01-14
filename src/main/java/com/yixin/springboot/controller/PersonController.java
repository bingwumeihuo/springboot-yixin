package com.yixin.springboot.controller;

import com.yixin.springboot.entity.Person;
import com.yixin.springboot.service.PersonService;
import com.yixin.springboot.utils.Result;
import com.yixin.springboot.utils.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package: com.yixin.springboot.controller
 * @ClassName: PersonController
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2020/1/14 15:24
 */
@Api(value = "/person", tags = "查询用户信息")
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    @ApiOperation(value = "查询全部", notes = "全部数据查询")
    public Result findAll() {
        List<Person> list = personService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", list);
    }


}
