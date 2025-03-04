package com.weblfux.employee.handler;

import com.weblfux.employee.dao.EmployeeDao;
import com.weblfux.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeHandler {

    @Autowired
    EmployeeDao dao;

    Mono<ServerResponse> getAllEmployee() {
        Flux<Employee> employeeFlux = dao.getAllEmployee();
        return ServerResponse.ok().body(employeeFlux, Employee.class);
    }
}
