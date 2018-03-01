package com.example.a637352.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ActivityButton(View view) {
        Intent myIntent = new Intent(this, NotMainActivity.class);
        startActivity(myIntent);
        MediaPlayer sound = MediaPlayer.create(getApplicationContext(), R.raw.sound);
        sound.start();
    }
}