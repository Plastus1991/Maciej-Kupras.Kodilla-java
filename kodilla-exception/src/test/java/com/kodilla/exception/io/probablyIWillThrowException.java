package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class probablyIWillThrowException {

    @Test
    void testSecondChallenge1() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when and then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));

    }
    @Test
    void testSecondChallenge2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when and then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.6));

    }


}
