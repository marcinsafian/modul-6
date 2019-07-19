package com.kodilla.stream.forumuser;

import java.time.*;

public final class ForumUser {

        private final int UserId;
        private final String name;
        private final char sex;
        private final LocalDate birthdayDate;
        private final int postsQty;

    public ForumUser(final int userId, final String name, final char sex, final LocalDate birthdayDate, final int postsQty) {
        UserId = userId;
        this.name = name;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postsQty = postsQty;
    }

    public int getUserId() {
        return UserId;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostsQty() {
        return postsQty;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "UserId=" + UserId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postsQty=" + postsQty +
                '}';
    }
}
