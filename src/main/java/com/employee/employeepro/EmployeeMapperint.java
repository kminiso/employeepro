package com.employee.employeepro;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapperint {

    EmployeeMapperint INSTANCE = Mappers.getMapper(EmployeeMapperint.class);

    @Mapping(source = "employeeId", target = "empid")
    @Mapping(source = "employeeName", target = "empName")
    @Mapping(source = "employeeDesignation", target = "empDesignation")
    @Mapping(source = "createDate", target = "createdDate")
    @Mapping(source = "createUser", target = "owner")
    OutputBean sourceToTarget(InputBean in);

}
