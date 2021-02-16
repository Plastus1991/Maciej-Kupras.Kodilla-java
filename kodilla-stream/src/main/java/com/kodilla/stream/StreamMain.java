package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUser = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (Period.between(user.getDateOfBirth(), today)).getYears() >=20)
                .filter(user -> user.getPostCount() >=1)
                .collect(Collectors.toMap(ForumUser::getUserID, user-> user));

        mapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
