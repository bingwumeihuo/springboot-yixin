package com.yixin.springboot.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 带有分页的结果集封装
 * @author 式神
 *
 */
@Data
public class PageResult<E> implements Serializable{

    private long total;
    private List<E> list;


    public PageResult(){

    }

    public PageResult(long total, List<E> list) {
        this.total = total;
        this.list = list;
    }
}
