package com.doc.game;
public class Finish extends Number {
    private String end = "";

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    public Finish(){
        finish();
        setEnd("Ваш счёт" + "\nУровень прогресса: " + Gamer.getProgress() + "\n\n\n" + "\t\t\tThe End" + "\n\n\n");
        System.out.println(getEnd());
    }
}