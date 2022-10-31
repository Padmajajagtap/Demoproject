package com.abc.service;

import com.abc.dao.DepartmentDao;
import com.abc.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    public Department saveData(Department department){
        return departmentDao.saveData(department);
    }

    public Department getDataById(int deptId){
        return departmentDao.getDataById(deptId);
    }





}
