package com.baizhi;

import com.baizhi.entity.Emp;
import com.baizhi.entity.EmpExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmsbootApplicationTests {
    @Resource
    private EmpMapper empMapper;
    @Test
    public void all() {
        EmpExample example = new EmpExample();
        List<Emp> list = empMapper.selectByExample(example);
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

}
