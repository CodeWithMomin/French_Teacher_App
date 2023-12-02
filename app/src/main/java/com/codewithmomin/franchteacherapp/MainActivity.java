package com.codewithmomin.franchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button blackBtn,yellowBtn,redBtn,purpleBtn,greenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackBtn=findViewById(R.id.blackButton);
        greenBtn=findViewById(R.id.greenButton);
        purpleBtn=findViewById(R.id.purpleButton);
        redBtn=findViewById(R.id.redButton);
        yellowBtn=findViewById(R.id.yellowButton);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {


        //finding the id of the Button and play the Correct sound
        int clickBtnId=v.getId();
        if(clickBtnId==R.id.blackButton)
        {
                playSounds(R.raw.black);
        } else if (clickBtnId==R.id.greenButton)
        {
                playSounds(R.raw.green);
        } else if (clickBtnId==R.id.purpleButton)
        {
                playSounds(R.raw.purple);
        } else if (clickBtnId==R.id.redButton)
        {
                playSounds(R.raw.red);
        }
        else {
            playSounds(R.raw.yellow);
        }

    }
    public void playSounds(int id)
    {
        MediaPlayer mediaPlayer=MediaPlayer.create(this,id);

        mediaPlayer.start();
    }

}