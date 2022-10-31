package com.abc.dao;

import com.abc.model.Employee;
import com.abc.repo.EmployeeRepo;
import com.abc.vo.Department;
import com.abc.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmployeeDao {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    RestTemplate restTemplate;

    public Employee saveData(Employee employee) {

        return employeeRepo.save(employee);
    }

    public RestTemplateVO getDataById(int empId) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Employee employee = employeeRepo.findByEmpId(empId);

        Department department = restTemplate.getForObject("http://DepartmentService/departments/" + employee.getDeptId(),Department.class);

        restTemplateVO.setEmployee(employee);
        restTemplateVO.setDepartment(department);

        return restTemplateVO;

    }
}