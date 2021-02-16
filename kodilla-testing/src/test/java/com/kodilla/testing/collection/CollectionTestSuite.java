package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.LinkedList;
import java.util.List;


public class CollectionTestSuite {

    @BeforeEach
    public void beforeFirst() {
        System.out.println("Test: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test: end");
    }

    @DisplayName("result should return true because in constructor " +
            "take list without numbers ")

    @Test
    void testEmptyList() {
        List<Integer> empty = new LinkedList<>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result =  exterminator.exterminate(empty);
        Assertions.assertTrue(result.isEmpty());
        System.out.println(result);

    }

    @DisplayName("Input to linkedlist few numbers, in the result should return  " +
            "false because the list should include even numbers  ")
    @Test
    void testNotEmptyList() {
        List<Integer> notEmpty = new LinkedList<>();
        notEmpty.add(4);
        notEmpty.add(6);
        notEmpty.add(5);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result =  exterminator.exterminate(notEmpty);
        Assertions.assertFalse(result.isEmpty());
        System.out.println(result);
    }
}