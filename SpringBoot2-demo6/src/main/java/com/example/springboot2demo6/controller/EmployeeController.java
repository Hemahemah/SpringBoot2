package com.example.springboot2demo6.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot2demo6.domain.TEmployee;
import com.example.springboot2demo6.service.TEmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Resource
    private TEmployeeService employeeService;

    @GetMapping("/getEmps/{page}")
    public Page<TEmployee> getEmps(@PathVariable Integer page){
        Page<TEmployee> tEmployeePage = new Page<>(page,5);
        return employeeService.page(tEmployeePage, null);
    }

    @DeleteMapping("/deleteEmp/{id}")
    public boolean deleteEmp(@PathVariable Integer id){
        return employeeService.removeById(id);
    }
}
