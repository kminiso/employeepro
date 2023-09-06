package com.employee.employeepro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employe")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService ;

    @PostMapping("/map")
    public OutputBean inpuOutputBean(@RequestBody InputBean in)
    {
       return employeeService.mapInputToOutput(in);
    }

    
}
