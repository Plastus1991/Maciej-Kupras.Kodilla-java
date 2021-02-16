package com.kodilla.testing.forum.statistics;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testListUserName() {
        //Given

        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        ArrayList<String>usersName = new ArrayList<>();
        usersName.add("user1");
        usersName.add("user2");
        usersName.add("user3");
        usersName.add("user4");

        //When
        List<String> forum = forumStatistic.userNames(usersName);

        //Then
        assertEquals(4, forum.size());


    }
    @Test
    void testPostCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);

        //When


        //Then



    }




}
