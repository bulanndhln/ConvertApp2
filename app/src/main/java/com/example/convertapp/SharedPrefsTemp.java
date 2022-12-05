package com.example.convertapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.Toolbar;

import com.example.convertapp.R;
import com.example.convertapp.SharedPrefsTemp;
import com.example.convertapp.Temperatures;

import java.util.Objects;

public class SharedPrefsTemp {
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setTemperature1(Context context, String temperature, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("temp_symbol_1", temperature);
        editor.putInt("temp_index_1", index);
        editor.apply();
    }

    public static void setTemperature2(Context context, String temperature, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("temp_symbol_2", temperature);
        editor.putInt("temp_index_2", index);
        editor.apply();
    }

    //get temperature symbol (C, R, F, K) 1
    public static String getTempSymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("temp_symbol_1", "");
    }

    //get temperature symbol (C, R, F, K) 2
    public static String getTempSymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("temp_symbol_2", "");
    }

    //get temperarures (1) index
    public static int getTempIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("temp_index_1", 0);
    }

    public static int getTempIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("temp_index_2", 0);
    }
}
