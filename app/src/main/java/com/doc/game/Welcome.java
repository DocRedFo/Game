package com.doc.game;

public class Welcome extends Number {
    private String about;
    private String StartGame;

    public void welcome(){
                String enter = Number.editTextString;
                if (enter.equals("") || enter.equals(" ") || enter.equals("   ") || enter.equals("  ")) {
                    MainActivity.textView.setText("Неверное имя, попробуйте снова\nВведите имя:");
                } else {
                    Gamer.setName(enter);
                    String str = "Добро пожаловать, " + Gamer.getName();
                    MainActivity.textView.setText(str);
                    MainActivity.level++;
                }
    }

    public void password(){
            String enter = Number.editTextString;
            if (enter.equals("1")) {
                PasswordsAndLogin();
                Gamer.setProgress(Gamer.getProgress() + 1);
                MainActivity.textView.setText("Вы удачно сменили логин и пароль");
                MainActivity.level++;
            } else if (enter.equals("0")) {
                MainActivity.textView.setText("Это ваше решение");
                MainActivity.level++;
            } else {
                MainActivity.textView.setText("Неизвестная команда, попробуйте снова");
            }
    }

    public String getAbout() {
        return about;
    }

    public String getStartGame() {
        return StartGame;
    }

    public void setStartGame(String startGame) {
        StartGame = startGame;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
