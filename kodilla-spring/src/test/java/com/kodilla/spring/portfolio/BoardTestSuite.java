package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void beanExists() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

    }

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getInProgressList().getTasks().add("test");
        String test =  board.getInProgressList().getTasks().get(0);
        System.out.println(board.getInProgressList().getTasks().get(0));

        board.getDoneList().getTasks().add("test1");
        String test1 = board.getDoneList().getTasks().get(0);
        System.out.println(board.getDoneList().getTasks().get(0));

        board.getToDoList().getTasks().add("test2");
        String test2 = board.getToDoList().getTasks().get(0);
        System.out.println(board.getToDoList().getTasks().get(0));

        //Then
        assertEquals("test", test);
        assertEquals("test1", test1);
        assertEquals("test2", test2);

    }
}
