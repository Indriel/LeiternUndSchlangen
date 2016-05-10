package com.mygdx.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nickname extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }
    public void onButtonClickNickZurück(View v){
        Intent intent = new Intent(getApplicationContext(), startscreen.class);
        startActivity(intent);
    }
    public void onButtonClickOk(View v){
        Intent intent = new Intent(getApplicationContext(), AndroidLauncher.class);
        startActivity(intent);

    }


    }

