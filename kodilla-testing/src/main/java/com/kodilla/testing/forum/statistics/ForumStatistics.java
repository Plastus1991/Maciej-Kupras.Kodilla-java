package com.kodilla.testing.forum.statistics;

import java.util.List;

public class ForumStatistics {

    private int userCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsOnUser;
    private double averageCommentsOnUser;
    private double averageCommentOnPost;

    public void calculateAdvStatistics(Statistics statistics) {

        List<String> user = statistics.usersNames();
        int a = user.size();
        this.userCount = a;

    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }
}
