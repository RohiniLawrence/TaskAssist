package com.taskassist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studenthome);


        Button querybtn = (Button) findViewById(R.id.button3);

        querybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentHome.this, StudentMain.class);
                startActivity(intent);

            }

        });

        Button logoutbtn = (Button) findViewById(R.id.button4);
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentHome.this, Login.class);
                startActivity(intent);

            }

        });
    }
}
