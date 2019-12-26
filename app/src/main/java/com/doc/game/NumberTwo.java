package com.doc.game;

public class NumberTwo extends Number {
    public void letterCheck(){
            String s = Number.editTextString;
            if (s.equals("1")) {
                MainActivity.textView.setText("(У Вас одна попытка) Введите ответ: ");
                MainActivity.level++;
            } else if (s.equals("0")) {
                Gamer.setProgress(Gamer.getProgress() - 1);
                MainActivity.textView.setText("Очень жаль...");
                MainActivity.level+=2;
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }