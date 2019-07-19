package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser>theMapUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> Period.between(forumUser.getBirthdayDate(),LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPostsQty()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser->ForumUser));

        theMapUsers.entrySet().stream()
                .map(entry -> entry.getKey()+" : "+entry.getValue())
                .forEach(System.out::println);
    }
}