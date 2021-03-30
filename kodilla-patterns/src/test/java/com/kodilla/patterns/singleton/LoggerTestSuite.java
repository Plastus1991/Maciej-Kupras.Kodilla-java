package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void logger() {
        logger = Logger.INSTANCE;
        logger.log("logger");
    }

    @Test
    void getLastLog() {
        //Given
        //When
        String file = logger.getLastLog();
        //Then
        assertEquals("logger", file);

    }
}
