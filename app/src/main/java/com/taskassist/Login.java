package com.taskassist;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;
    RelativeLayout image,content;
    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Shared sh = new Shared(this);
        ConstraintLayout myLayout=(ConstraintLayout)findViewById(R.id.myLayout);
        final Context ctx = Login.this;
        AnimationDrawable aniDraw;

        aniDraw = (AnimationDrawable)myLayout.getBackground();

        aniDraw.setEnterFadeDuration(4000);
        aniDraw.setExitFadeDuration(4000);
        aniDraw.start();


        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((ed1.getText().toString()).length()==5 &&
                        ed2.getText().toString().equals("staff")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting to staff.....",Toast.LENGTH_SHORT).show();
                    sh.setLoggedIn(ctx, "staffloggin","logged");
                    Intent intent = new Intent(Login.this, StaffHome.class);
                    startActivity(intent);
                }

                else if((ed1.getText().toString()).length()==8 &&
                        ed2.getText().toString().equals("student")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting to Student.....",Toast.LENGTH_SHORT).show();
                    sh.setLoggedIn(ctx, "studentloggin","logged");
                    Intent intent = new Intent(Login.this, StudentHome.class);
                    startActivity(intent);
                }
                else if((ed1.getText().toString()).length()==5 &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting to Admin.....",Toast.LENGTH_SHORT).show();
                    sh.setLoggedIn(ctx, "adminloggin","logged");
                    Intent intent = new Intent(Login.this, AdminHome.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();


                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
            }
        });
    }
}
