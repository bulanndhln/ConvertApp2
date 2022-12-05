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
import com.example.convertapp.SharedPrefsDistance;
import com.example.convertapp.Distances;

import java.util.Objects;
public class SharedPrefsDistance {
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setDistance1(Context context, String distance, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("distance_symbol_1", distance);
        editor.putInt("distance_index_1", index);
        editor.apply();
    }

    public static void setDistance2(Context context, String distance, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("distance_symbol_2", distance);
        editor.putInt("distance_index_2", index);
        editor.apply();
    }

    //get Distance symbol (km, hm, dam, m, dm, cm, mm) 1
    public static String getDistanceSymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("distance_symbol_1", "");
    }

    //get Distance symbol (km, hm, dam, m, dm, cm, mm) 2
    public static String getDistanceSymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("distance_symbol_2", "");
    }

    //get Distance (1) index
    public static int getDistanceIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("distance_index_1", 0);
    }

    public static int getDistanceIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("distance_index_2", 0);
    }
}
