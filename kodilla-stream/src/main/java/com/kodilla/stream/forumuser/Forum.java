package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1,"Jaś",'M', LocalDate.of(1989, Month.APRIL,22), 5 ));
        forumUserList.add(new ForumUser(2, "Zolek", 'F', LocalDate.of(2077, Month.OCTOBER, 2),0));
        forumUserList.add(new ForumUser(3,"Ktoś",'M', LocalDate.of(1849, Month.FEBRUARY,6), 15 ));
        forumUserList.add(new ForumUser(4, "Kasiek", 'F', LocalDate.of(2700, Month.JANUARY, 1),100));
        forumUserList.add(new ForumUser(5,"Zosia",'F', LocalDate.of(1989, Month.MARCH,10), 45 ));
        forumUserList.add(new ForumUser(6, "Ania", 'F', LocalDate.of(2065, Month.MAY, 22),0));
    }
    public List<ForumUser> getForumUserList (){
        return new ArrayList<>(forumUserList);
    }
}
