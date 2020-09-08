package com.example.dell.wordsquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button play_btn;
    private Button settings_btn;
    private Button about_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        play_btn = (Button)findViewById(R.id.play_btn);
        settings_btn = (Button)findViewById(R.id.settings_btn);
        about_btn = (Button)findViewById(R.id.about_btn);

        //final MediaPlayer mp = MediaPlayer.create(this, R.raw.Pop);

        play_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityplay();
              //  mp.start();
            }
        });

        settings_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySettings();
                //mp.start();
            }
        });

        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityAbout();
                //mp.start();
            }
        });
    }

    public void openActivityplay(){
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }

    public void openActivitySettings(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void openActivityAbout(){
        Intent intent = new Intent(this, AboutUsActivity.class);
                startActivity(intent);
    }

}
