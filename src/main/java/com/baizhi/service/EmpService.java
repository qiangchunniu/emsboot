package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> showAll();
    public List<Emp> login(String name,String password);
}
