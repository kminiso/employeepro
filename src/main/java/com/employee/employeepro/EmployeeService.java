package com.employee.employeepro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    // @Autowired
    // EmployeeMapperint employeeMapperint;

    private final EmployeeMapperint employeeMapperint;

    @Autowired
    public EmployeeService(EmployeeMapperint employeeMapperint) {
        this.employeeMapperint = employeeMapperint;
    }

    public OutputBean mapInputToOutput(InputBean in) {
        return employeeMapperint.sourceToTarget(in);

    }

}
