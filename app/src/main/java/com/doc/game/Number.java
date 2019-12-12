package com.doc.game;
import java.util.Scanner;

public abstract class Number {
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

    public boolean isPyFlag(){
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
    public void terminal(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            String string = scanner.nextLine();
            if (string.equals(getHelp()) || string.equals(getHelp() + " ")){
                System.out.println("\nСписок доступных команд:" +
                        "\nhelp - вызов помощи" +
                        "\nls - обзор папки" +
                        "\ncd [аргумент] - перемещение между папками" +
                        "\nopen [аргумент] - открытие файлов или приложений" +
                        "\nstart [аргумент] - запуск служб или процессов" +
                        "\nstop [аргумент] - остановка служб или процессов\n");
            }
            else if (string.equals(getLs()) || string.equals(getLs() + " ")){
                if (getDir() == 0) {
                    if (getFDir() == 0) System.out.println("\n" + getDesktop() + "\n" + getDownloads() + "\n" + getDocuments() + "\n" + getMusic() + "\n" + getFile() + "\n");
                    else System.out.println("\n" + getDesktop() + "\n" + getDownloads() + "\n" + getDocuments() + "\n" + getMusic() + "\n");
                }
                else if (getDir() == 1){
                    if (getFDir() == 1) System.out.println("\npicture" + "\nvideo.jpn" + "\n" + getFile() + "\nнидфорспид.game\n");
                    else System.out.println("\npicture" + "\nvideo.jpn" + "\nнидфорспид.game\n");
                }
                else if (getDir() == 2){
                    if (getFDir() == 2) System.out.println("\njimmy.jar" + "\n" + getFile() + "\nкит.photo" + "\nmichael\n" + "mail\n");
                    else System.out.println("\njimmy.jar" + "\nкит.photo" + "\nmichael\n" + "mail\n");
                }
                else if (getDir() == 3){
                    if (getFDir() == 3) System.out.println("\nschool.doc" + "\npython" + "\nintresting" + "\nпароли.txt" + "\n" + getFile() + "\n");
                    else System.out.println("\nschool.doc" + "\npython" + "\nintresting" + "\nпароли.txt\n");
                }
                else if (getDir() == 4){
                    if (getFDir() == 4) System.out.println("\nQueen.alb" + "\nOne\n" + getFile() + "\nКороль и Шут");
                    else System.out.println("\nQueen.alb" + "\nOne" + "\nКороль и Шут\n");
                }
                else System.out.println("Непредвиденная ошибка!");
            }
            else if (string.equals(getCd()) || string.equals(getCd() + " ") || string.equals(getCd() + " " + "/") || string.equals(getCd() + " " + "..") ||
                    string.equals(getCd() + " " + ".." + " ")){
                setDir(0);
            }
            else if (string.equals(getCd() + " " + getDesktop()) || string.equals(getCd() + " " + getDesktop() + " ") ||
                    string.equals(getCd() + " " + getDesktop() + "/")){
                if (getDir() == 0) setDir(2);
                else System.out.println("Каталог не найден");
            }
            else if (string.equals(getCd() + " " + getDownloads()) || string.equals(getCd() + " " + getDownloads() + " ")
                    || string.equals(getCd() + " " + getDownloads() + "/")){
                if (getDir() == 0) setDir(1);
                else System.out.println("Каталог не найден");
            }
            else if (string.equals(getCd() + " " + getDocuments()) || string.equals(getCd() + " " + getDocuments() + " ")
                    || string.equals(getCd() + " " + getDocuments() + "/")){
                if (getDir() == 0) setDir(3);
                else System.out.println("Каталог не найден");
            }
            else if (string.equals(getCd() + " " + getMusic()) || string.equals(getCd() + " " + getMusic() + " ") ||
                    string.equals(getCd() + " " + getMusic() + "/")){
                if (getDir() == 0) setDir(4);
                else System.out.println("Каталог не найден");
            }
            else if (string.equals(getOpen()) || string.equals(getOpen() + " ")){
                System.out.println("Введите аргумент");
            }
            else if (string.equals(getOpen() + " " + "picture") || string.equals(getOpen() + " " + "video.jpn") ||
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
                    || string.equals(getOpen() + " " + "One" + " ") || string.equals(getOpen() + " " + "Король и Шут" + " ")){
                System.out.println("Ошибка!" +
                        "\nНеизвестный формат");
            }
            else if (string.equals(getOpen() + " " + getFile()) || string.equals(getOpen() + " " + getFile() + " ")){
                if (getDir() == getFDir()) {
                    System.out.println(getMassage());
                    flag = false;
                }
                else {
                    System.out.println("Файл отсутствует");
                }
            }
            else if (string.equals(getOpen() + " " + getMusic()) || string.equals(getOpen() + " " + getDocuments()) || string.equals(getOpen() + " " + getDesktop()) || string.equals(getOpen() + " " + getDownloads()) ||
                    string.equals(getOpen() + " " + getMusic() + " ") || string.equals(getOpen() + " " + getDocuments() + " ") || string.equals(getOpen() + " " + getDesktop() + " ") || string.equals(getOpen() + " " + getDownloads() + " ")){
                System.out.println("Это каталог");
            }
            else if (string.equals(getOpen() + " " + getMail()) || string.equals(getOpen() + " " + getMail() + " ")){
                if (getMailDir() == getDir()) {
                    System.out.println(getMailMassage());
                    flag = false;
                }
                else {
                    System.out.println("Файл отсутствует");
                }
            }
            else if (string.equals(getStart()) || string.equals(getStart() + " ")){
                System.out.println("Введите аргумент");
            }
            else if (string.equals(getStart() + " " + getPython()) || string.equals(getStart() + " " + getPython() + " ")){
                if (getPythonDir() == getDir()) {
                    System.out.println("python запущен");
                    setPyFlag(true);
                    flag = false;
                }
                else {
                    System.out.println("Файл отсутствует");
                }
            }
            else if (string.equals(getStop()) || string.equals(getStop() + " ")){
                System.out.println("Введите аргумент");
            }
            else if (string.equals(getStop() + " " + getPython()) || string.equals(getStop() + " " + getPython() + " ")){
                if (isPyFlag()) {
                    System.out.println("python остановлен");
                    setPyFlag(false);
                    flag = false;
                }
                else {
                    System.out.println("Приложение не было запущено");
                }
            }
            else if (string.equals(getPython()) || string.equals(getPython() + " ")){
                if (getPythonDir() == getDir()) {
                    System.out.println("--version python 4.4.4 and I think it's lie");
                }
                else {
                    System.out.println("Файл отсутствует");
                }
            }
            else {
                System.out.println("Неизвестная команда\nВоспользуйтесь командой help");
            }
        }
    }
    //Проверка правильности ответа
    public void check(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.print("Введите ответ: ");
            String string = scanner.nextLine();
            if (string.equals(getAnswer())){
                System.out.println(getCheckTrueMassage());
                flag = false;
            }
            else {
                System.out.println(getCheckFailMassage());
            }
        }
    }
    //Начало, Ввод пароля для входа и знакомство с механикой игры
    public void begin(){
        System.out.println("Все настройки находятся в изначальном состоянии, в том числе логины и пароли");
        Scanner scanner = new Scanner(System.in);
        String string;
        boolean f = true;
        while (f) {
            System.out.print("Введите логин: ");
            string = scanner.nextLine();
            if (string.equals("root") || string.equals("admin")) {
                Gamer.setLogin(string);
                System.out.println();
                f = false;
            } else {
                System.out.println("Неверный логин или пароль. Попробуйте снова");
            }
        }
        while (!f) {
            System.out.print("Введите пароль: ");
            string = scanner.nextLine();
            if (string.equals("root") || string.equals("admin") || string.equals("qwerty") || string.equals("123456")){
                Gamer.setPassword(string);
                System.out.println();
                f = true;
            }
            else {
                System.out.println("Неверный логин или пароль. Попробуйте снова");
            }
        }
    }
    //Смена Логина и Пароля
    public void PasswordsAndLogin(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String string;
        while (flag) {
            System.out.print("Введите новый логин: ");
            string = scanner.nextLine();
            if (string.equals(Gamer.getLogin())){
                System.out.println("Логины совпадают!");
            }
            else {
                Gamer.setLogin(string);
                flag = false;
            }
        }
        while (!flag){
            System.out.print("Введите новый пароль: ");
            string = scanner.nextLine();
            if (string.equals(Gamer.getPassword())){
                System.out.println("Пароли совпадают!");
            }
            else if (string.equals(Gamer.getLogin())){
                System.out.println("Пароль и логин сопадают!");
            }
            else {
                Gamer.setPassword(string);
                while (!flag) {
                    System.out.print("Подтвердите пароль: ");
                    string = scanner.nextLine();
                    if (string.equals(Gamer.getPassword())) {
                        System.out.println("Поздравляем со сменой логина и пароля");
                        flag = true;
                    }
                    else {
                        System.out.println("Пароли не совпадают поробуйте снова");
                    }
                }
            }
        }
    }
    //Концовка
    public void finish(){
        if (Gamer.getProgress() >= 5){
            System.out.println("Вы справились с заднаниями, " + Gamer.getName());
        }
        else {
            System.out.println("Кажется, что у Вас что-то не получилось, " + Gamer.getName());
        }
    }
}
