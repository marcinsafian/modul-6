package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.reference.PoemBeautifierReference;
import com.kodilla.stream.beautifier.reference.PoemExecutor;

public class StreamMain {
    public static void main(String[] args) {
        /*
        Forum forum = new Forum();

        Map<Integer, ForumUser>theMapUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> Period.between(forumUser.getBirthdayDate(),LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPostsQty()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser->ForumUser));

        theMapUsers.entrySet().stream()
                .map(entry -> entry.getKey()+" : "+entry.getValue())
                .forEach(System.out::println);

         */

        PoemBeautifier poemBeautifier = new PoemBeautifier();
              poemBeautifier.beautify("tapped using small letters",(m)->m.toUpperCase());
              poemBeautifier.beautify("TAPPED using CAPITAL LETTERS", (m)->m.toLowerCase());
              poemBeautifier.beautify("Lorem ipsum dolor sit amet.",(m)->m.replace('m','Z'));

                PoemExecutor poemExecutor = new PoemExecutor();
                poemExecutor.executeBeauti("Lorem ipsum",PoemBeautifierReference::doSth);

    }
}