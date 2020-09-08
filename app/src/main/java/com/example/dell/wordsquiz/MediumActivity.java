package com.example.dell.wordsquiz;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MediumActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView word_medium;
    private EditText edit_text;
    private Button check_btn, newGame_btn;
    private String wordtofind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);

        word_medium = (TextView)findViewById(R.id.word_medium);
        edit_text = (EditText) findViewById(R.id.edit_med);
        check_btn = (Button) findViewById(R.id.check_med);
        newGame_btn = (Button) findViewById(R.id.newGame_med);
        check_btn.setOnClickListener(this);
        newGame_btn.setOnClickListener(this);

        newGame_btn();
    }

    public void onClick(View view){
        if(view == check_btn)
        {

            check_btn();
        }
        else if (view == newGame_btn)
        {
            newGame_btn();
        }
    }
    private void check_btn()
    {

        String w = edit_text.getText().toString();
        if (wordtofind.equals(w))
        {
            Toast.makeText(this, "Congratulatios !!! You found the word" + wordtofind, Toast.LENGTH_SHORT).show();
            newGame_btn();
        }
        else
        {
            Toast.makeText(this, "Try again", Toast.LENGTH_SHORT).show();
        }
    }

    private void newGame_btn()
    {
        wordtofind = Anagram.randsmedium();
        String wordShuffled = Anagram.shuffleword(wordtofind);
        word_medium.setText(wordShuffled);
        edit_text.setText("");
    }
}
