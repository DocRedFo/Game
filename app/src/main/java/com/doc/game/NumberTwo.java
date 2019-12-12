package com.doc.game;
import java.util.Scanner;

public class NumberTwo extends Number {
    public void letterCheck(){
        Scanner scanner = new Scanner(System.in);
        boolean f = false;
        while (!f) {
            String s = scanner.nextLine();
            if (s.equals("1")) {
                check();
                Gamer.setProgress(Gamer.getProgress() + 2);
                f = true;
            } else if (s.equals("0")) {
                Gamer.setProgress(Gamer.getProgress() - 1);
                System.out.println("Очень жаль...");
                f = true;
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }
    public NumberTwo(){
        System.out.println("После того глупого задания прошла неделя. Вам уже начинает наскучивать это бездействие");
        System.out.println("Но на экране появляется новое задание");
        setQuestion("Задание: прочитайте сообщение на почте");
        System.out.println("\n\t" + getQuestion() + "\n");
        setFDir(6);
        setFile("");
        setMailMassage("Дата доставки письма: 20:20\n" +
                "\n" +
                "Dear Friend ; Especially for you - this red-hot announcement \n" +
                ". This is a one time mailing there is no need to request \n" +
                "removal if you won't want any more . This mail is being \n" +
                "sent in compliance with Senate bill 2216 ; Title 9 \n" +
                "; Section 306 ! This is different than anything else \n" +
                "you've seen ! Why work for somebody else when you can \n" +
                "become rich inside 96 days . Have you ever noticed \n" +
                "people will do almost anything to avoid mailing their \n" +
                "bills & the baby boomers are more demanding than their \n" +
                "parents . Well, now is your chance to capitalize on \n" +
                "this ! We will help you decrease perceived waiting \n" +
                "time by 140% & decrease perceived waiting time by 140% \n" +
                ". You can begin at absolutely no cost to you ! But \n" +
                "don't believe us ! Mrs Anderson who resides in Idaho \n" +
                "tried us and says \"I was skeptical but it worked for \n" +
                "me\" . We are licensed to operate in all states . So \n" +
                "make yourself rich now by ordering immediately . Sign \n" +
                "up a friend and you'll get a discount of 70% . Thanks \n" +
                "! Dear Salaryman , Thank-you for your interest in our \n" +
                "newsletter ! If you no longer wish to receive our publications \n" +
                "simply reply with a Subject: of \"REMOVE\" and you will \n" +
                "immediately be removed from our mailing list ! This \n" +
                "mail is being sent in compliance with Senate bill 2716 \n" +
                "; Title 2 , Section 301 ! This is different than anything \n" +
                "else you've seen ! Why work for somebody else when \n" +
                "you can become rich in 47 WEEKS . Have you ever noticed \n" +
                "how long the line-ups are at bank machines and most \n" +
                "everyone has a cellphone ! Well, now is your chance \n" +
                "to capitalize on this . WE will help YOU decrease perceived \n" +
                "waiting time by 200% plus deliver goods right to the \n" +
                "customer's doorstep . You can begin at absolutely no \n" +
                "cost to you . But don't believe us . Ms Jones who resides \n" +
                "in West Virginia tried us and says \"My only problem \n" +
                "now is where to park all my cars\" ! We are licensed \n" +
                "to operate in all states ! If not for you then for \n" +
                "your loved ones - act now . Sign up a friend and your \n" +
                "friend will be rich too . Best regards ! " +
                "\n");
        terminal();
        setAnswer("a1Z26");
        System.out.println("Справитесь ли Вы с заданием?" +
                "\nДа (1) или Нет (0)");
        setCheckTrueMassage("Мои поздравления, " + Gamer.getName());
        setCheckFailMassage("У Вас не получилось, попробуйте снова");
        letterCheck();
    }
}
