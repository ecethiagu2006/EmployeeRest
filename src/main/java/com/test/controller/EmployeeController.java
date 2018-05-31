package com.test.controller;

import com.test.dto.EmployeeDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

    @RequestMapping(value="/{employeeId}", method = RequestMethod.GET)
    public EmployeeDto getEmployee(@PathVariable("employeeId") Long employeeId){
      EmployeeDto employeeDto = new EmployeeDto(employeeId, "thiagu");
      return employeeDto;
    }
}
