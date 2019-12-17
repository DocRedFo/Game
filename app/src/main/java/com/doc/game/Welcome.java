package com.doc.game;

public class Welcome extends Number {
    private String about;
    private String StartGame;

    public void welcome(){
        boolean f = false;
        while (!f){
            String enter = Number.editTextString;
            if (enter.equals("") || enter.equals(" ") || enter.equals("   ") || enter.equals("  ")){
                mainActivity.textView.setText("Неверное имя, попробуйте снова\nВведите имя:");
            }
            else {
                Gamer.setName(enter);
                String str = "Добро пожаловать, " + Gamer.getName();
                mainActivity.textView.setText(str);
                f = true;
            }
        }
    }

    public void password(){
        boolean f = true;
        while (f) {
            String enter = Number.editTextString;
            if (enter.equals("1")) {
                PasswordsAndLogin();
                Gamer.setProgress(Gamer.getProgress() + 1);
                f = false;
            } else if (enter.equals("0")) {
                mainActivity.textView.setText("Ok");
                f = false;
            } else {
                mainActivity.textView.setText("Неизвестная команда, попробуйте снова");
            }
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
//    public Welcome(){
//        setAbout("\tДобро пожаловать!" +
//                "\nЭто игра — текстовый квест, в котором Вас приняли на работу, на неизвестную должность, в неизвестную компанию" +
//                "\nЕдинственное, что Вы знаете, так это то, что Вам надо выполнять появляющиеся на Вашем компьютере задачи" + "\n");
//        setStartGame("Что ж, давайте начинать" +
//                "\nДля начала введите своё имя: ");
//        mainActivity.textView.setText(getAbout());
//        System.out.print(getStartGame());
//        welcome();
//        begin();
//        System.out.println("Если Вы хотите быть хорошим работником, то лучше начать сейчас.\n" +
//                "Смените свой логин и пароль.");
//        System.out.println("Хотите сменить логин и пароль?\n" +
//                "Да (1) или Нет (0)");
//        password();
//    }
}
