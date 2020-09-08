package com.example.dell.wordsquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.audiofx.Equalizer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

LinearLayout linearlayout_start_1,linearlayout_start_2;
private Button start_btn;




Animation uptodown, downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MediaPlayer player = MediaPlayer.create(this, R.raw.start);
        //player.setLooping(true);
        //player.start();



        start_btn = (Button)findViewById(R.id.start_btn);

        linearlayout_start_1 = (LinearLayout)findViewById(R.id.linearlayout_start_1);
        linearlayout_start_2 = (LinearLayout)findViewById(R.id.linearlayout_start_2);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        linearlayout_start_1.setAnimation(uptodown);
        linearlayout_start_2.setAnimation(downtoup);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitymenu();
            }
        });




    }

    public void openActivitymenu(){
        Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
    }


}
