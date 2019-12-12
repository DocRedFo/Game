package com.doc.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        Number numberOne = new NumberOne();

    }
}
