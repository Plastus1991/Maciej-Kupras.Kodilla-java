package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistic {

    Statistics statistics;

    public ForumStatistic(Statistics statistics) {

        this.statistics = statistics;
    }

    public List<String> userNames(ArrayList user) {
        ArrayList<String> users = new ArrayList<>();
        users.addAll(user);

        return users;
    }

    public int postCount() {

        return 0;
    }

    public int commentsCount() {
        return 0;
    }

    public double calculateAdvStatistics(Statistics statistics) {

        return 0;
    }

    public double showStatistics() {

        return 0;
    }
}
