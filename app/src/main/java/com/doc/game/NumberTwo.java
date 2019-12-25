package com.doc.game;

public class NumberTwo extends Number {
    public void letterCheck(){
            String s = Number.editTextString;
            if (s.equals("1")) {
                check();
                Gamer.setProgress(Gamer.getProgress() + 2);
                MainActivity.level++;
            } else if (s.equals("0")) {
                Gamer.setProgress(Gamer.getProgress() - 1);
                System.out.println("Очень жаль...");
                MainActivity.level++;
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }