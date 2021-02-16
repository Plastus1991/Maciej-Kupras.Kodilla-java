package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {

        userList.add(new ForumUser(12345678, "User1", 'M', "1992-12-25", 0  ));
        userList.add(new ForumUser(1234335678, "User2", 'F', "1999-06-25", 0  ));
        userList.add(new ForumUser(888435678, "User3", 'M', "1979-08-25", 0  ));
        userList.add(new ForumUser(4335678, "User4", 'F', "1959-11-25", 14  ));
        userList.add(new ForumUser(433588678, "User5", 'M', "1989-06-25", 121  ));
        userList.add(new ForumUser(1678, "User6", 'M', "2001-01-25", 11  ));

    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }


}
