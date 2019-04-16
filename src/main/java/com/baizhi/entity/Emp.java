package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;

    private String name;

    private String password;

    private Double salary;

    private Integer age;

    private String sex;

    private String statr;


}