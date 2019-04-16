package com.baizhi.conttroller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Resource
    private EmpService empService;

    @RequestMapping("showAll")
    public String showALL(HttpServletRequest request){
        List<Emp> list = empService.showAll();
            request.setAttribute("list",list);
        return "emplist";
    }

}
