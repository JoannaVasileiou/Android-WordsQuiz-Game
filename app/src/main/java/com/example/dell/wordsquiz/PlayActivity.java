package com.example.dell.wordsquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {

    private Button beginner_btn;
    private Button medium_btn;
    private Button hard_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        beginner_btn = (Button)findViewById(R.id.beginner_btn);
        medium_btn = (Button)findViewById(R.id.medium_btn);
        hard_btn = (Button)findViewById(R.id.hard_btn);

        //final MediaPlayer mp = MediaPlayer.create(this, R.raw.Pop);

        beginner_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityBegginer();
          //      mp.start();
            }
        });

        medium_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMedium();
               // mp.start();
            }
        });

        hard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityHard();
               // mp.start();
            }
        });

    }

    public void openActivityBegginer(){
        Intent intent = new Intent(this, BeginnerActivity.class);
        startActivity(intent);
    }

    public void openActivityMedium(){
        Intent intent = new Intent(this, MediumActivity.class);
        startActivity(intent);
    }

    public void openActivityHard(){
        Intent intent = new Intent(this, HardActivity.class);
        startActivity(intent);
    }
}
