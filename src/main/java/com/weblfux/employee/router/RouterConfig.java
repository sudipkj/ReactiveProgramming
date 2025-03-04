package com.weblfux.employee.router;

import com.weblfux.employee.handler.EmployeeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Autowired
    EmployeeHandler employeeHandler;

    @Bean
    public RouterFunction<ServerResponse> getAllEmployee() {
        return RouterFunctions.route()
                .GET("/router/employee", employeeHandler::getAllEmployee).build();
    }
}
