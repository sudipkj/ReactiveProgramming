package com.weblfux.employee.handler;

import com.weblfux.employee.dao.EmployeeDao;
import com.weblfux.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeHandler {

    @Autowired
    EmployeeDao dao;

    public Mono<ServerResponse> getAllEmployee(ServerRequest request) {
        Flux<Employee> employeeFlux = dao.getAllEmployee();
        return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM)
                .body(employeeFlux, Employee.class);
    }


}
