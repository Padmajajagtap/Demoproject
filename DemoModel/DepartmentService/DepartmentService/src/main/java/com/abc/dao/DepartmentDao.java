package com.abc.dao;

import com.abc.model.Department;
import com.abc.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDao {
    @Autowired
    DepartmentRepo departmentRepo;

    public Department saveData(Department department){
        return departmentRepo.save(department);
    }

    public Department getDataById(int deptId){
        return departmentRepo.findById(deptId).get();
    }
}
