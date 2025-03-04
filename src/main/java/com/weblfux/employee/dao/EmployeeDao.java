package com.weblfux.employee.dao;

import com.weblfux.employee.dto.Employee;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

@Component
public class EmployeeDao {

    public Flux<Employee> getAllEmployee(){
        return Flux.range(1, 10)
                .doOnNext(EmployeeDao :: sleepThread)
                .doOnNext(i -> System.out.println("Processing i = " + i + " object "))
                .map(integer -> new Employee(integer, "Name" + integer));
    }

    private static void sleepThread(int i){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
