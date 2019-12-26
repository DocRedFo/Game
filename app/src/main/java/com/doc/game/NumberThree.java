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
        }
    }
}
