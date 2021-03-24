package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {



    @Bean(name = "toDoList")
    public TaskList list1() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    public TaskList list2() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList list3() {
        return new TaskList();
    }


}
