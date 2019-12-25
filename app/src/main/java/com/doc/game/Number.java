package com.doc.game;

public abstract class Number {
    public static String editTextString;
    //Команды
    private String help = "help";
    private String ls = "ls";
    private String cd = "cd";
    private String open = "open";
    //Запуск и остановка Служб
    private String start = "start";
    private String stop = "stop";
    private boolean pyFlag = false;
    //Приложения
    private String mail = "mail";
    private int mailDir = 2;
    private String python = "python";
    private int pythonDir = 3;
    private String PythonMassage = "";
    //Папки
    private String Downloads = "Downloads"; //1
    private String Desktop = "Desktop"; //2
    private String Documents = "Documents"; //3
    private String Music = "Music"; //4
    //Название Файла
    private String file = "";
    //Сообщение в Файле
    private String massage = "";
    //Сообщение друга и его имя
    private String FriendMassage = "";
    private String FriendName = "";
    //Сообщение на mail
    private String mailMassage = "";
    //Вопрос и ответ на него
    private String question = "";
    private String answer = "";
    //Сообщение при удаче или ошибке
    private String CheckTrueMassage = "";
    private String CheckFailMassage = "";
    //Отображение ls
    private int dir = 0;
    //Нахождение file командой ls
    private int FDir = 0;

    public void setPyFlag(boolean pyFlag) {
        this.pyFlag = pyFlag;
    }

    public boolean isPyFlag() {
        return pyFlag;
    }

    public String getPythonMassage() {
        return PythonMassage;
    }

    public void setPythonMassage(String pythonMassage) {
        PythonMassage = pythonMassage;
    }

    public int getDir() {
        return dir;
    }

    public String getMailMassage() {
        return mailMassage;
    }

    public void setMailMassage(String mailMassage) {
        this.mailMassage = mailMassage;
    }

    public int getMailDir() {
        return mailDir;
    }

    public int getPythonDir() {
        return pythonDir;
    }

    public int getFDir() {
        return FDir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setFDir(int FDir) {
        this.FDir = FDir;
    }

    public String getMail() {
        return mail;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setFriendMassage(String friendMassage) {
        FriendMassage = friendMassage;
    }

    public void setCheckFailMassage(String checkFailMassage) {
        CheckFailMassage = checkFailMassage;
    }

    public void setCheckTrueMassage(String checkTrueMassage) {
        CheckTrueMassage = checkTrueMassage;
    }

    public void setFriendName(String friendName) {
        FriendName = friendName;
    }

    public String getMassage() {
        return massage;
    }

    public String getAnswer() {
        return answer;
    }

    public String getCheckFailMassage() {
        return CheckFailMassage;
    }

    public String getCheckTrueMassage() {
        return CheckTrueMassage;
    }

    public String getFriendMassage() {
        return FriendMassage;
    }

    public String getFriendName() {
        return FriendName;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpen() {
        return open;
    }

    public String getLs() {
        return ls;
    }

    public String getCd() {
        return cd;
    }

    public String getHelp() {
        return help;
    }

    public String getDesktop() {
        return Desktop;
    }

    public String getPython() {
        return python;
    }

    public String getDownloads() {
        return Downloads;
    }

    public String getDocuments() {
        return Documents;
    }

    public String getStart() {
        return start;
    }

    public String getStop() {
        return stop;
    }

    public String getFile() {
        return file;
    }

    public String getMusic() {
        return Music;
    }

    public void setFile(String file) {
        this.file = file;
    }

    //Обработчик команд в "терминале"
    public void terminal() {
        String string = Number.editTextString;
        if (string.equals(getHelp()) || string.equals(getHelp() + " ")) {
            String str = "\nСписок доступных команд:" +
                    "\nhelp - вызов помощи" +
                    "\nls - обзор папки" +
                    "\ncd [аргумент] - перемещение между папками" +
                    "\nopen [аргумент] - открытие файлов или приложений" +
                    "\nstart [аргумент] - запуск служб или процессов" +
                    "\nstop [аргумент] - остановка служб или процессов\n";
            MainActivity.textView.setText(str);
        } else if (string.equals(getLs()) || string.equals(getLs() + " ")) {
            if (getDir() == 0) {
                if (getFDir() == 0) {
                    String str = "\n" + getDesktop() + "\n" + getDownloads() + "\n" + getDocuments() + "\n" + getMusic() + "\n" + getFile() + "\n";
                    MainActivity.textView.setText(str);
                } else {
                    String str = "\n" + getDesktop() + "\n" + getDownloads() + "\n" + getDocuments() + "\n" + getMusic() + "\n";
                    MainActivity.textView.setText(str);
                }
            } else if (getDir() == 1) {
                if (getFDir() == 1) {
                    String str = "\npicture" + "\nvideo.jpn" + "\n" + getFile() + "\nнидфорспид.game\n";
                    MainActivity.textView.setText(str);
                } else {
                    String str = "\npicture" + "\nvideo.jpn" + "\nнидфорспид.game\n";
                    MainActivity.textView.setText(str);
                }
            } else if (getDir() == 2) {
                if (getFDir() == 2) {
                    String str = "\njimmy.jar" + "\n" + getFile() + "\nкит.photo" + "\nmichael\n" + "mail\n";
                    MainActivity.textView.setText(str);
                } else {
                    String str = "\njimmy.jar" + "\nкит.photo" + "\nmichael\n" + "mail\n";
                    MainActivity.textView.setText(str);
                }
            } else if (getDir() == 3) {
                if (getFDir() == 3) {
                    String str = "\nschool.doc" + "\npython" + "\nintresting" + "\nпароли.txt" + "\n" + getFile() + "\n";
                    MainActivity.textView.setText(str);
                } else {
                    String str = "\nschool.doc" + "\npython" + "\nintresting" + "\nпароли.txt\n";
                    MainActivity.textView.setText(str);
                }
            } else if (getDir() == 4) {
                if (getFDir() == 4) {
                    String str = "\nQueen.alb" + "\nOne\n" + getFile() + "\nКороль и Шут";
                    MainActivity.textView.setText(str);
                } else {
                    String str = "\nQueen.alb" + "\nOne" + "\nКороль и Шут\n";
                    MainActivity.textView.setText(str);
                }
            } else MainActivity.textView.setText("Непредвиденная ошибка!");
        } else if (string.equals(getCd()) || string.equals(getCd() + " ") || string.equals(getCd() + " " + "/") || string.equals(getCd() + " " + "..") ||
                string.equals(getCd() + " " + ".." + " ")) {
            setDir(0);
        } else if (string.equals(getCd() + " " + getDesktop()) || string.equals(getCd() + " " + getDesktop() + " ") ||
                string.equals(getCd() + " " + getDesktop() + "/")) {
            if (getDir() == 0) setDir(2);
            else MainActivity.textView.setText("Каталог не найден");
        } else if (string.equals(getCd() + " " + getDownloads()) || string.equals(getCd() + " " + getDownloads() + " ")
                || string.equals(getCd() + " " + getDownloads() + "/")) {
            if (getDir() == 0) setDir(1);
            else MainActivity.textView.setText("Каталог не найден");
        } else if (string.equals(getCd() + " " + getDocuments()) || string.equals(getCd() + " " + getDocuments() + " ")
                || string.equals(getCd() + " " + getDocuments() + "/")) {
            if (getDir() == 0) setDir(3);
            else MainActivity.textView.setText("Каталог не найден");
        } else if (string.equals(getCd() + " " + getMusic()) || string.equals(getCd() + " " + getMusic() + " ") ||
                string.equals(getCd() + " " + getMusic() + "/")) {
            if (getDir() == 0) setDir(4);
            else MainActivity.textView.setText("Каталог не найден");
        } else if (string.equals(getOpen()) || string.equals(getOpen() + " ")) {
            MainActivity.textView.setText("Введите аргумент");
        } else if (string.equals(getOpen() + " " + "picture") || string.equals(getOpen() + " " + "video.jpn") ||
                string.equals(getOpen() + " " + "нидфорспид.game") || string.equals(getOpen() + " " + "jimmy.jar") ||
                string.equals(getOpen() + " " + "кит.photo") || string.equals(getOpen() + " " + "michael") ||
                string.equals(getOpen() + " " + "school.doc") || string.equals(getOpen() + " " + "intresting") ||
                string.equals(getOpen() + " " + "пароли.txt") || string.equals(getOpen() + " " + "Queen.alb") ||
                string.equals(getOpen() + " " + "One") || string.equals(getOpen() + " " + "Король и Шут") ||
                string.equals(getOpen() + " " + "picture" + " ") || string.equals(getOpen() + " " + "video.jpn" + " ")
                || string.equals(getOpen() + " " + "нидфорспид.game" + " ") || string.equals(getOpen() + " " + "jimmy.jar" + " ")
                || string.equals(getOpen() + " " + "кит.photo" + " ") || string.equals(getOpen() + " " + "michael" + " ")
                || string.equals(getOpen() + " " + "school.doc" + " ") || string.equals(getOpen() + " " + "intresting" + " ")
                || string.equals(getOpen() + " " + "пароли.txt" + " ") || string.equals(getOpen() + " " + "Queen.alb" + " ")
                || string.equals(getOpen() + " " + "One" + " ") || string.equals(getOpen() + " " + "Король и Шут" + " ")) {
            MainActivity.textView.setText("Ошибка!\nНеизвестный формат");
        } else if (string.equals(getOpen() + " " + getFile()) || string.equals(getOpen() + " " + getFile() + " ")) {
            if (getDir() == getFDir()) {
                MainActivity.textView.setText(getMassage());
                MainActivity.level++;
            } else {
                MainActivity.textView.setText("Файл отсутствует");
            }
        } else if (string.equals(getOpen() + " " + getMusic()) || string.equals(getOpen() + " " + getDocuments()) || string.equals(getOpen() + " " + getDesktop()) || string.equals(getOpen() + " " + getDownloads()) ||
                string.equals(getOpen() + " " + getMusic() + " ") || string.equals(getOpen() + " " + getDocuments() + " ") || string.equals(getOpen() + " " + getDesktop() + " ") || string.equals(getOpen() + " " + getDownloads() + " ")) {
            MainActivity.textView.setText("Это каталог");
        } else if (string.equals(getOpen() + " " + getMail()) || string.equals(getOpen() + " " + getMail() + " ")) {
            if (getMailDir() == getDir()) {
                MainActivity.textView.setText(getMailMassage());
                MainActivity.level++;
            } else {
                MainActivity.textView.setText("Файл отсутствует");
            }
        } else if (string.equals(getStart()) || string.equals(getStart() + " ")) {
            MainActivity.textView.setText("Введите аргумент");
        } else if (string.equals(getStart() + " " + getPython()) || string.equals(getStart() + " " + getPython() + " ")) {
            if (getPythonDir() == getDir()) {
                String str = "python starting";
                MainActivity.textView.setText(str);
                setPyFlag(true);
                MainActivity.level++;
            } else {
                MainActivity.textView.setText("Файл отсутствует");
            }
        } else if (string.equals(getStop()) || string.equals(getStop() + " ")) {
            MainActivity.textView.setText("Введите аргумент");
        } else if (string.equals(getStop() + " " + getPython()) || string.equals(getStop() + " " + getPython() + " ")) {
            if (isPyFlag()) {
                String str = "python stopping";
                MainActivity.textView.setText(str);
                setPyFlag(false);
                MainActivity.level++;
            } else {
                MainActivity.textView.setText("Приложение не было запущено");
            }
        } else if (string.equals(getPython()) || string.equals(getPython() + " ")) {
            if (getPythonDir() == getDir()) {
                String str = "--version python 4.4.4 and I think it's lie";
                MainActivity.textView.setText(str);
            } else {
                MainActivity.textView.setText("Файл отсутствует");
            }
        } else {
            MainActivity.textView.setText("Неизвестная команда\nВоспользуйтесь командой help");
        }
    }
    //Проверка правильности ответа
    public void check(){
            MainActivity.textView.setText("Введите ответ: ");
            String string = Number.editTextString;
            if (string.equals(getAnswer())){
                MainActivity.textView.setText(getCheckTrueMassage());
                MainActivity.level++;
            }
            else {
                MainActivity.textView.setText(getCheckFailMassage());
            }
        }
    //Начало, Ввод пароля для входа и знакомство с механикой игры
    public void beginLogin() {
            String string;
            string = Number.editTextString;
            if (string.equals("root") || string.equals("admin")) {
                Gamer.setLogin(string);
                MainActivity.textView.setText("Логин введён");
                MainActivity.level++;

            } else {
                MainActivity.textView.setText("Неверный логин или пароль. Попробуйте снова");
            }
    }
    public void beginPassword(){
        String string;
        string = Number.editTextString;
        if (string.equals("root") || string.equals("admin") || string.equals("qwerty") || string.equals("123456")){
            Gamer.setPassword(string);
            MainActivity.textView.setText("Пароль введён");
            MainActivity.level++;
        }
        else {
            MainActivity.textView.setText("Неверный логин или пароль. Попробуйте снова");
        }
    }
    //Смена Логина и Пароля
    public void Login(){
        String string;
        string = Number.editTextString;
        if (string.equals("") || string.equals(" ") || string.equals("  ")){
            MainActivity.textView.setText("Вы ввели пустое значение!");
        }
        else if (string.equals(Gamer.getLogin())){
            MainActivity.textView.setText("Логины совпадают!");
        }
        else {
            Gamer.setLogin(string);
            MainActivity.level++;
            MainActivity.textView.setText("Логин успешно установлен");
        }
    }
    public void Password(){
        String string;
        string = Number.editTextString;
        if (string.equals("") || string.equals(" ") || string.equals("  ")){
            MainActivity.textView.setText("Вы ввели пустое значение!");
        }
        else if (string.equals(Gamer.getPassword())){
            MainActivity.textView.setText("Пароли совпадают!");
        }
        if (string.equals(Gamer.getLogin())){
            MainActivity.textView.setText("Пароль не должен совпадать с логином!");
        }
        else {
            Gamer.setPassword(string);
            MainActivity.textView.setText("Пароль установлен");
            MainActivity.level++;
        }
    }
    //Концовка
    public void finish(){
        if (Gamer.getProgress() >= 5){
            String string = "Вы справились с заднаниями, " + Gamer.getName();
            MainActivity.textView.setText(string);
        }
        else {
            String string = "Кажется, что у Вас что-то не получилось, " + Gamer.getName();
            MainActivity.textView.setText(string);
        }
    }
}
