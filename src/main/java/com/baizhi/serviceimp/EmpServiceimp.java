package com.baizhi.serviceimp;

import com.baizhi.EmpMapper;
import com.baizhi.entity.Emp;
import com.baizhi.entity.EmpExample;
import com.baizhi.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpServiceimp implements EmpService {
    @Resource
    private EmpMapper empMapper;
    @Override
    public List<Emp> showAll() {
         EmpExample empExample = new EmpExample();
         List<Emp> select = empMapper.selectByExample(empExample);
        return select;
    }

    @Override
    public List<Emp> login(String name, String password) {
        EmpExample empExample = new EmpExample();

        List<Emp> sel = empMapper.selectByExample(empExample);
        return sel;
    }
}
