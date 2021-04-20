package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class testForumStatistic {

    @Mock
    private Statistics statistics;

    @Test
    void userCount() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statistics);

        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");

        //When
        when(statistics.usersNames()).thenReturn(users);

        //When
        forumStatistics.calculateAdvStatistics(statistics);
        assertEquals(2, forumStatistics.getUserCount());
    }
}
