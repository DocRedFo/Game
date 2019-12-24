package com.doc.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        final Welcome welcome = new Welcome();
        welcome.setAbout("\tДобро пожаловать!" +
                "\nЭто игра — текстовый квест, в котором Вас приняли на работу, на неизвестную должность, в неизвестную компанию" +
                "\nЕдинственное, что Вы знаете, так это то, что Вам надо выполнять появляющиеся на Вашем компьютере задачи" + "\n");
        welcome.setStartGame("Что ж, давайте начинать" +
                "\nДля начала введите своё имя: ");
        NumberOne numberOne = new NumberOne();
        NumberTwo numberTwo = new NumberTwo();
        NumberThree numberThree = new NumberThree();
        Finish finish = new Finish();
        if (level <= 0) {
            textView.setText(welcome.getAbout());
        }
        else {
            textView.setText("Произошла ошибка!\nВы прошли однин или несколько уровней, но вышли из приложения.\nДля решения проблемы отчистите оперативную память или нажмите enter");
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
                }
            }});


    }
}
