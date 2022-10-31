package com.abc.controller;
import com.abc.model.Department;
import com.abc.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public ResponseEntity<Department> saveData(@RequestBody Department department){
        log.info("#########Trying to save data fro Department: "+ department.getDeptName());
        return ResponseEntity.ok(departmentService.saveData(department));
    }

    @GetMapping("/{deptId}")
    public ResponseEntity<Department> getDataById(@PathVariable int deptId){
        return ResponseEntity.ok(departmentService.getDataById(deptId));
    }
}
