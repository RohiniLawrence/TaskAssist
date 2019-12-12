package com.taskassist;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Shared extends Application {
    Context context;

    Shared(Context context) {
        this.context = context;
    }

    public boolean setPreference(Context context, String key, String value) {
        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = settings.edit();
        edit.putString(key, value);
        edit.putBoolean("queryadded", true);
        return edit.commit();
    }

    public String getPreference(String key) {
        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        return settings.getString(key,"defaultValue");
    }

    public int getID(String key) {
        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        return settings.getInt(key,0);
    }


    public boolean setID(Context context, String key, int val) {

        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = settings.edit();
        edit.putInt(key, val);
        return edit.commit();
    }

    public boolean setLoggedIn(Context context, String key, String value) {

        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = settings.edit();
        edit.putString(key, value);
        return edit.commit();

    }
    public boolean setLoggedOut(Context context, String key) {
        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = settings.edit();
        edit.remove(key);
        edit.putString(key,"notloggedin");
        return edit.commit();

    }

    public String getLoggedIn(String key) {
        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        return settings.getString(key, "null");
    }




    public boolean getqueryadded(String key) {
        SharedPreferences settings = context.getSharedPreferences("PREFS_NAME", Context.MODE_PRIVATE);
        return settings.getBoolean(key,false);
    }

    }

