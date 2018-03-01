package com.example.a637352.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class NotMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_main);
    }

    public void celebrate(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"samuel.oppel@dmschools.org"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "I DED A THIN!!!!!");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "I ded vah bes thin EVAH! \nI was abl tu pres a BUTON in a AP on a ANROY FOAN!!! \nArn yu prude uf mi?!? \nLES SELAREET TAGEVAH!!!!!");
        startActivity(emailIntent);
    }
}
