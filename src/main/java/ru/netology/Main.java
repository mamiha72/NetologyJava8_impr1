package ru.netology;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1972;

        String birthdayString;
        birthdayString = post.birthday.day + "." + post.birthday.month + "." + post.birthday.year;

        System.out.println(birthdayString);

        System.out.println(post.name);
        System.out.println(post.passport);
        System.out.println(post.patronymic);
        System.out.println(post.surname);
        System.out.println(post.phone);
        System.out.println(post.subscription);

    }
}