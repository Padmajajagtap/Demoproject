package com.abc.controller;

import com.abc.model.Employee;
import com.abc.service.EmployeeService;
import com.abc.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveData(employee));
    }

    @GetMapping("/{empId}")
    public ResponseEntity<RestTemplateVO> getDataById(@PathVariable int empId){
        return ResponseEntity.ok(employeeService.getDataById(empId));
    }
}
