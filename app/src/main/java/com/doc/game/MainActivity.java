package com.doc.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int level = 0;

    public static TextView textView;
    public static EditText editText;
    Button ButtonDesktop;
    Button ButtonDownloads;
    Button ButtonDocuments;
    Button ButtonMusic;
    Button ButtonHelp;
    Button ButtonLs;
    Button ButtonCd;
    Button ButtonOpen;
    Button ButtonStart;
    Button ButtonStop;
    Button Enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        ButtonDesktop = findViewById(R.id.buttonDesktop);
        ButtonDownloads = findViewById(R.id.buttonDownloads);
        ButtonDocuments = findViewById(R.id.buttonDocuments);
        ButtonMusic = findViewById(R.id.buttonMusic);
        ButtonHelp = findViewById(R.id.buttonHelp);
        ButtonLs = findViewById(R.id.buttonLs);
        ButtonCd = findViewById(R.id.buttonCd);
        ButtonOpen = findViewById(R.id.buttonOpen);
        ButtonStart = findViewById(R.id.buttonStart);
        ButtonStop = findViewById(R.id.buttonStop);
        Enter = findViewById(R.id.buttonEnter);

        textView.setMovementMethod(new ScrollingMovementMethod());



        final Welcome welcome = new Welcome();

        welcome.setAbout("\tДобро пожаловать!" +
                "\nЭто игра — текстовый квест, в котором Вас приняли на работу, на неизвестную должность, в неизвестную компанию" +
                "\nЕдинственное, что Вы знаете, так это то, что Вам надо выполнять появляющиеся на Вашем компьютере задачи" + "\n");

        welcome.setStartGame("Что ж, давайте начинать" +
                "\nДля начала введите своё имя: ");



        final NumberOne numberOne = new NumberOne();

        numberOne.setFriendName("Nick");

        numberOne.setFriendMassage("Привет, " + Gamer.getName() + "\n" +
                "Спишу тебе сообщить твоё первое задание. Тебе надо разобраться с управлением твоим компьютером, представляешь?\n" +
                "Мне кажется, что наш работодатель совершенно не знает кто на него работает.\n" + "Ладно, удачи");

        numberOne.setQuestion("Задание: разберитесь с управлением, найдите файл helpFORyou и откройте его");

        numberOne.setFile("helpFORyou");

        numberOne.setFDir(1);

        numberOne.setMassage("You can take flag: Qwerty");

        numberOne.setAnswer("Qwerty");

        numberOne.setCheckTrueMassage("Отлично сработано, " + Gamer.getName());

        numberOne.setCheckFailMassage("Попробуйте ещё раз");



        final NumberTwo numberTwo = new NumberTwo();

        numberTwo.setQuestion("Задание: прочитайте сообщение на почте");

        numberTwo.setFDir(6);

        numberTwo.setFile("");

        numberTwo.setMailMassage("Дата доставки письма: 20:20\n" +
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

        numberTwo.setAnswer("a1Z26");

        numberTwo.setCheckTrueMassage("Мои поздравления, " + Gamer.getName());

        numberTwo.setCheckFailMassage("У Вас не получилось, попробуйте снова");



        final NumberThree numberThree = new NumberThree();

        numberThree.setFriendName("Mike");

        numberThree.setFDir(2);

        numberThree.setFile("index.html");

        numberThree.setMassage("Сайт открыт"/* + "theoneboringmancompany.rf.gd"*/);

        numberThree.setAnswer("");

        numberThree.setCheckTrueMassage("У Вас всё получилось, спасибо за потраченное время.\n" + "Досвидания");

        numberThree.setCheckFailMassage("У Вас не получилось, попробуйте ещё");

        numberThree.setPythonMassage("python запущен на порту 8080...");






        final Finish finish = new Finish();

        finish.setEnd("Ваш счёт" + "\nУровень прогресса: " + Gamer.getProgress() + "\n\n\n" + "\t\t\tThe End" + "\n\n\n");




        if (level <= 0) {
            textView.setText(welcome.getAbout());
        }
        else {
            String s = "";
            if (level <= 13){
                s = "начальном";
            }
            else if (level <= 20 && level > 13){
                s = "первом";
            }
            else if (level <= 25 && level > 20){
                s = "втором";
            }
            else if(level <= 32 && level > 25 ) {
                s = "третьем";
            }
            else if (level <= 34 && level > 32 ){
                s = "финишном";
            }
            String str = "Произошла ошибка!\nВы находитесь на " + s + " уровне" + ".\nДля решения проблемы нажмите enter";
            if (level >= 35 ){
                str = "Произошла ошибка!\nВы находитесь на неизвестном уровне" + ".\nДля решения проблемы выйдите из игры и отчистите оперативную память";
            }
            textView.setText(str);
        }
        ButtonDesktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { editText.setText("cd Desktop"); }});
        ButtonDownloads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { editText.setText("cd Downloads"); }});
        ButtonDocuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {editText.setText("cd Documents");}
        });
        ButtonMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("cd Music");
            }
        });
        ButtonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { editText.setText("help");}
        });
        ButtonLs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("ls");
            }
        });
        ButtonCd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("cd");
            }
        });
        ButtonOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("open ");
            }
        });
        ButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("start ");
            }
        });
        ButtonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("stop ");
            }
        });
        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number.editTextString = editText.getText().toString();
                editText.setText("");
                switch (MainActivity.level){
                    //Welcome
                    case 0:
                        textView.setText(welcome.getStartGame());
                        level++;
                        break;
                    case 1:
                        welcome.welcome();
                        break;
                    case 2:
                        textView.setText("Все настройки находятся в изначальном состоянии, в том числе логины и пароли");
                        level++;
                        break;
                    case 3:
                        textView.setText("Введите логин:");
                        level++;
                        break;
                    case 4:
                        welcome.beginLogin();
                        break;
                    case 5:
                        textView.setText("Введите пароль:");
                        level++;
                        break;
                    case 6:
                        welcome.beginPassword();
                        break;
                    case 7:
                        textView.setText("Если Вы хотите быть хорошим работником, то лучше начать сейчас\nХотите сменить стандартные логин и пароль?\nДа (1) или Нет (0)");
                        level++;
                        break;
                    case 8:
                        welcome.password();
                        break;
                    case 9:
                        textView.setText("Введите новый логин: ");
                        level++;
                        break;
                    case 10:
                        welcome.Login();
                        break;
                    case 11:
                        textView.setText("Введите новый пароль: ");
                        level++;
                        break;
                    case 12:
                        welcome.Password();
                        break;
                    case 13:
                        textView.setText("\nПрошло уже две недели Вашей \"работы\", но Вы еще не поучили ни одного зада...\n");
                        level++;
                        break;
                    //NumberOne
                    case 14:
                        textView.setText("*У Вас одно новое уведомление*\n");
                        level++;
                        break;
                    case 15:
                        String str = "Сообщение от " + numberOne.getFriendName() + "\n" + numberOne.getFriendMassage();
                        textView.setText(str);
                        level++;
                        break;
                    case 16:
                        String str1 = "\n\t" + numberOne.getQuestion() + "\n";
                        textView.setText(str1);
                        level++;
                        break;
                    case 17:
                        numberOne.terminal();
                        break;
                    case 18:
                        numberOne.check();
                        break;
                    case 19:
                        Gamer.setProgress(Gamer.getProgress() + 2);
                        level++;
                    //NumberTwo
                    case 20:
                        textView.setText("После того глупого задания прошла неделя. Вам уже начинает наскучивать это бездействие");
                        level++;
                        break;
                    case 21:
                        textView.setText("Но на экране появляется новое задание");
                        level++;
                        break;
                    case 22:
                        String str2 = "\n\t" + numberTwo.getQuestion() + "\n";
                        textView.setText(str2);
                        level++;
                        break;
                    case 23:
                        numberTwo.terminal();
                        break;
                    case 24:
                        String str3 = "Справитесь ли Вы с заданием?" + "\nДа (1) или Нет (0)";
                        textView.setText(str3);
                        level++;
                        break;
                    case 25:
                        numberTwo.letterCheck();
                        break;
                    //NumberThree
                    case 26:
                        if (Gamer.getProgress() >= 3) {
                            numberThree.setFriendMassage("Здравствуйте, " + Gamer.getName() + "\n" +
                                    "Так как Вы довольно успешно справляетесь с задниями, мы решили дать Вам более сложное и интерсное." +
                                    "\nСейчас Вы его получите.");
                            numberThree.setQuestion("Запустите python и поднимите свой сайт, открыв файл index.html");
                        }
                        else {
                            numberThree.setFriendMassage("Здравствуйте, " + Gamer.getName() + "\n" +
                                    "Так как у Вас есть проблемы с выполнением заданий, мы дадим Вам более легкое." +
                                    "\nСейчас Вы его получите");
                            numberThree.setQuestion("От Вас требуется запустить при помощи команды start программу python\n" +
                                    "находящуюся в Documents и откройте файл index.html из Desktop, для запуска своего сайта");
                        }
                        level++;
                    case 27:
                        textView.setText("Спустя неделю");
                        level++;
                        break;
                    case 28:
                        String mail = "Сообщение от " + numberThree.getFriendName() + "\n" + numberThree.getFriendMassage();
                        textView.setText(mail);
                        level++;
                        break;
                    case 29:
                        textView.setText(numberThree.getQuestion());
                        level++;
                        break;
                    case 30:
                        numberThree.terminal();
                        break;
                    case 31:
                        if (!numberThree.isPyFlag()){
                            textView.setText("Сайт упал. Для начала запустите python");
                            level--;
                            numberThree.terminal();
                        }
                        else {
                            level++;
                        }
                        break;
                    case 32:
                        numberThree.terminal();
                        break;
                    //Finish
                    case 33:
                        finish.finish();
                        level++;
                        break;
                    case 34:
                        textView.setText(finish.getEnd());
                        break;
                }
            }});


    }
}
