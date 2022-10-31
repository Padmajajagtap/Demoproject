package com.abc.service;

import com.abc.dao.EmployeeDao;
import com.abc.model.Employee;
import com.abc.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;


    public Employee saveData(Employee employee){
        return employeeDao.saveData(employee);
    }

    public RestTemplateVO getDataById(int empId){
        return employeeDao.getDataById(empId);
    }

}
