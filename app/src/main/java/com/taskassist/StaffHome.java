package com.taskassist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StaffHome extends AppCompatActivity {

    Context ctx = StaffHome.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Shared sh = new Shared(this);
        Toast.makeText(getApplicationContext(),
                ""+sh.getLoggedIn("staffloggin"),Toast.LENGTH_SHORT).show();

        if (sh.getLoggedIn("staffloggin") == "logged") {
            setContentView(R.layout.activity_staffhome);


            Button querybtn = (Button) findViewById(R.id.button3);

            querybtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(StaffHome.this, StaffMain.class);
                    startActivity(intent);

                }

            });

            Button logoutbtn = (Button) findViewById(R.id.button4);
            logoutbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sh.setLoggedOut(ctx , "staffloggin");
                    Intent intent = new Intent(StaffHome.this, Login.class);
                    startActivity(intent);

                }

            });
        }
        else{
            Toast.makeText(getApplicationContext(),
                    "Please login to continue....."+sh.getLoggedIn("staffloggin"),Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(StaffHome.this, Login.class);
            startActivity(intent);
        }

    }
    }

