package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Rambo");
        User kodilla = new YGeneration("Kodilla");
        User van = new ZGeneration("Van Damme");

        //When
        String johnWhatUse = john.socialMediaUse();
        System.out.println("John use: " + johnWhatUse);
        String kodillaWhatUse = kodilla.socialMediaUse();
        System.out.println("Kodilla use: " + kodillaWhatUse);
        String vanWhatUse = van.socialMediaUse();
        System.out.println("Van use: " + vanWhatUse + "\n");


        //Then
        assertEquals("Use Facebook", johnWhatUse);
        assertEquals("Use Twitter", kodillaWhatUse);
        assertEquals("Use Snapchat", vanWhatUse);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Rambo");

        //When
        String johnWhatUse = john.socialMediaUse();
        System.out.println("John use: " + johnWhatUse);

        john.setSocialPublisher(new SnapchatPublisher());
        johnWhatUse = john.socialMediaUse();
        System.out.println("John now use: " + johnWhatUse);

        assertEquals("Use Snapchat", johnWhatUse);
    }
}
