package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {



    @Bean Board getBoard() {
        return new Board();
    }

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
