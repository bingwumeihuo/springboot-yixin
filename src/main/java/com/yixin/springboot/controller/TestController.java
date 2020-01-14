package com.yixin.springboot.controller;

import com.yixin.springboot.utils.Result;
import com.yixin.springboot.utils.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.yixin.springbootyixin.controller
 * @ClassName: TestController
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2020/1/14 14:35
 */
@Api(value = "/test", tags = "swagger测试")
@RequestMapping("/test")
@RestController
public class TestController {
    @ApiOperation(value = "测试查询接口", notes = "swagger测试")
    @GetMapping
    public Result test() {
        return new Result(true, StatusCode.OK, "查询成功");
    }
}
