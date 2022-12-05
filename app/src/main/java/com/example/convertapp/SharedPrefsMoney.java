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
import com.example.convertapp.SharedPrefsMoney;
import com.example.convertapp.Moneys;

import java.util.Objects;

public class SharedPrefsMoney {
    public static SharedPreferences pref;
    public static SharedPreferences.Editor editor;

    public static void setMoney1(Context context, String money, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("money_symbol_1", money);
        editor.putInt("money_index_1", index);
        editor.apply();
    }

    public static void setMoney2(Context context, String money, int index) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        editor = pref.edit();
        editor.putString("money_symbol_2", money);
        editor.putInt("money_index_2", index);
        editor.apply();
    }

    //get money symbol (Rupiah, Dollar, Euro, Poundsterling, Yen) 1
    public static String getMoneySymbol1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("money_symbol_1", "");
    }

    //get money symbol (Rupiah, Dollar, Euro, Poundsterling, Yen) 2
    public static String getMoneySymbol2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getString("money_symbol_2", "");
    }

    //get money (1) index
    public static int getMoneyIndex1(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("money_index_1", 0);
    }

    public static int getMoneyIndex2(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context);
        return pref.getInt("money_index_2", 0);
    }
}
