package com.weblfux.employee.dao;

import com.weblfux.employee.dto.Employee;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Component
public class EmployeeDao {

    public Flux<Employee> getAllEmployee(){
        return Flux.range(0, 10)
                .doOnNext(i -> System.out.println("Processing i = " + i + " object "))
                .map(integer -> new Employee(integer, ""));
    }

}
