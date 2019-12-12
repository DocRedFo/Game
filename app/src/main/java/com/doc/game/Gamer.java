package com.doc.game;
public class Gamer {
    private static String name;
    private static int progress;
    private static String password;
    private static String login;

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        Gamer.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static int getProgress() {
        return progress;
    }

    public static void setProgress(int progress) {
        Gamer.progress = progress;
    }

    public static void setPassword(String password) {
        Gamer.password = password;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Gamer.name = name;
    }
}
