package com.taskassist;

import android.content.Intent;
import android.graphics.Point;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Admin extends AppCompatActivity {


    static int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Button b1 = (Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(Admin.this, AdminHome.class);
                    startActivity(intent);}
        });


                Shared sh = new Shared(Admin.this);
        final LinearLayout lm = (LinearLayout) findViewById(R.id.rootLayout);

        boolean queadded = sh.getqueryadded("queryadded");
        if (queadded == true) {
            int id = sh.getID("ID");

            for (int i = (id - 1); i >= 0; i--) {


                String key = "msg" + i;
                String key1 = "issue" + i;
                String query = sh.getPreference(key);

                LinearLayout linLayout = new LinearLayout(this), linLayinner;


                linLayout.setOrientation(LinearLayout.VERTICAL);
                linLayout.setBackgroundResource(R.drawable.box);
                linLayout.setId(i);

                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int width = displayMetrics.widthPixels;
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams((int)(width/1.05),
                        LinearLayout.LayoutParams.WRAP_CONTENT);

                linLayout.setLayoutParams(lp);

                //ViewGroup.LayoutParams linLayoutP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                linLayout.setPadding(25, 25, 25, 25);


             /*  linLayinner = new LinearLayout(this);
               linLayinner.setOrientation(LinearLayout.VERTICAL);
               linLayinner.setGravity(Gravity.CENTER);
               linLayinner.setId(i);


               ViewGroup.LayoutParams linLayinnerP = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);*/
                TextView tv1 = new TextView(this);
                tv1.setText(sh.getPreference(key1));
                tv1.setTextSize(20);
                tv1.setTypeface(Typeface.DEFAULT_BOLD);
                tv1.setId(id);


                TextView tv2 = new TextView(this);
                tv2.setText(sh.getPreference(key));

                tv2.setTextSize(18);
                tv2.setId(i);


                linLayout.addView(tv1);
                linLayout.addView(tv2);

//             linLayout.addView(linLayinner);


//we can also put a button that says query solved that sends a message to the user saying the query has been solved


                lm.addView(linLayout);

                LinearLayout divider = new LinearLayout(this);
                divider.setBackgroundResource(R.drawable.divider);
                lm.addView(divider);

            }
            //sh.queryadded_false(Admin.this,"queryadded", false);


        } else {
            TextView txt = (TextView) findViewById(R.id.textView7);
            txt.setText("No Queries");
        }


    }

}
