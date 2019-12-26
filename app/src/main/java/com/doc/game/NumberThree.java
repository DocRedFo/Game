package com.doc.game;
public class NumberThree extends Number {
    @Override
    public void check(){
        String string = Number.editTextString;
        if (isPyFlag()){
            MainActivity.textView.setText(getCheckTrueMassage());
            MainActivity.level++;
        }
        else {
            MainActivity.textView.setText(getCheckFailMassage());
            MainActivity.level-=2;
        }
    }

    @Override
    public void terminal(){
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
            MainActivity.path.setText(MainActivity.PCname);
        } else if (string.equals(getCd() + " " + getDesktop()) || string.equals(getCd() + " " + getDesktop() + " ") ||
                string.equals(getCd() + " " + getDesktop() + "/")) {
            if (getDir() == 0){ setDir(2); MainActivity.path.setText(MainActivity.PCname + "Desktop");}
            else MainActivity.textView.setText("Каталог не найден");
        } else if (string.equals(getCd() + " " + getDownloads()) || string.equals(getCd() + " " + getDownloads() + " ")
                || string.equals(getCd() + " " + getDownloads() + "/")) {
            if (getDir() == 0) {setDir(1); MainActivity.path.setText(MainActivity.PCname + "Downloads");}
            else MainActivity.textView.setText("Каталог не найден");
        } else if (string.equals(getCd() + " " + getDocuments()) || string.equals(getCd() + " " + getDocuments() + " ")
                || string.equals(getCd() + " " + getDocuments() + "/")) {
            if (getDir() == 0) {setDir(3); MainActivity.path.setText(MainActivity.PCname + "Documents");}
            else MainActivity.textView.setText("Каталог не найден");
        } else if (string.equals(getCd() + " " + getMusic()) || string.equals(getCd() + " " + getMusic() + " ") ||
                string.equals(getCd() + " " + getMusic() + "/")) {
            if (getDir() == 0) {setDir(4); MainActivity.path.setText(MainActivity.PCname + "Music");}
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

}
