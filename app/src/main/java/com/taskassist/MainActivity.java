package com.taskassist;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {
    RelativeLayout image;

    private static final String PREFS_NAME = "preferenceName";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);


    }
    @Override
    protected void onStart()
    {
        super.onStart();

        ConstraintLayout myLayout=(ConstraintLayout)findViewById(R.id.mainlay);

        AnimationDrawable aniDraw;

        aniDraw = (AnimationDrawable)myLayout.getBackground();

        aniDraw.setEnterFadeDuration(1700);
        aniDraw.setExitFadeDuration(1700);
        aniDraw.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent Intent = new Intent(MainActivity.this, Login.class);
                startActivity(Intent);
            }
        }, 3000);




    }

}

