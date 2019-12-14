package com.doc.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
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

            }
        });

        Welcome welcome = new Welcome();
        welcome.setAbout("\tДобро пожаловать!" +
                "\nЭто игра — текстовый квест, в котором Вас приняли на работу, на неизвестную должность, в неизвестную компанию" +
                "\nЕдинственное, что Вы знаете, так это то, что Вам надо выполнять появляющиеся на Вашем компьютере задачи" + "\n");
        textView.setText(welcome.getAbout());

    }
}
