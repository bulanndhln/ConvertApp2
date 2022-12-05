package com.example.convertapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;

import java.util.Objects;

public class Money extends AppCompatActivity {
    private AppCompatEditText edit_money1;
    private AppCompatEditText edit_money2;
    private Moneys money;
    private LinearLayout layout_formula;
    private TextView text_formula;
    private Animation rotate_zoom_out;
    private String[] moneys = new String[]{
            "Rupiah",
            "Dollar",
            "Euro",
            "Poundsterling",
            "Yen"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money);

        money = new Moneys (this);

        layout_formula = findViewById(R.id.layout_formula);
        text_formula = findViewById(R.id.text_formula);

        rotate_zoom_out = AnimationUtils.loadAnimation(Money.this, R.anim.rotate_zoom_out);

        setupToolbar();

        //edit text money to conversion 1
        edit_money1 = findViewById(R.id.edit_1_money_to_conversion);
        edit_money1.setHint(SharedPrefsMoney.getMoneySymbol1(Money.this));

        //edit text money to conversion 2
        edit_money2 = findViewById(R.id.edit_2_money_to_conversion);
        edit_money2.setHint(SharedPrefsMoney.getMoneySymbol2(Money.this));
        edit_money2.setKeyListener(null);
        edit_money2.setClickable(false);

        //Spinner & Adapter 1
        ArrayAdapter<String> arrayAdapter1 =
                new ArrayAdapter(Money.this, android.R.layout.simple_spinner_item, moneys);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner1 = findViewById(R.id.spinner_1_money_to_conversion);
        appCompatSpinner1.setAdapter(arrayAdapter1);

        //set selection
        appCompatSpinner1.setSelection(SharedPrefsMoney.getMoneyIndex1(Money.this));
        appCompatSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String money_symbol1 = moneys[position];
                SharedPrefsMoney.setMoney1(Money.this, money_symbol1, position);
                edit_money1.setHint(moneys[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner & adapter 2
        ArrayAdapter<String> arrayAdapter2 =
                new ArrayAdapter(Money.this, android.R.layout.simple_spinner_item, moneys);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner2 = findViewById(R.id.spinner_2_money_to_conversion);
        appCompatSpinner2.setAdapter(arrayAdapter2);
        appCompatSpinner2.setSelection(SharedPrefsMoney.getMoneyIndex2(Money.this));
        appCompatSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String money_symbol2 = moneys[position];
                SharedPrefsMoney.setMoney2(Money.this, money_symbol2, position);
                edit_money2.setHint(moneys[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Button Count
        AppCompatButton btn_count = findViewById(R.id.count);
        btn_count.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (Objects.requireNonNull(edit_money1.getText()).toString().isEmpty()) {

                    Toast.makeText(Money.this,
                            "Masukan nilai mata uang yang ingin di konversi", Toast.LENGTH_SHORT).show();

                } else {
                    layout_formula.startAnimation(rotate_zoom_out);
                    if (layout_formula.getVisibility() == View.GONE) {
                        layout_formula.setVisibility(View.VISIBLE);
                    }
                    String symbol_money1 = SharedPrefsMoney.getMoneySymbol1(Money.this);
                    String symbol_money2 = SharedPrefsMoney.getMoneySymbol2(Money.this);
                    double value_to_conversion = Double.parseDouble(edit_money1.getText().toString());

                    // Rupiah to usd
                    if (symbol_money1.equals("Rupiah") && symbol_money2.equals("Dollar")) {
                        edit_money2.setText(money.RptoUsd(value_to_conversion));
                        text_formula.setText(money.getFormula("Rupiah", "Dollar",
                                value_to_conversion, money.RptoUsd(value_to_conversion)));
                    }
                    // Rupiah to Euro
                    else if (symbol_money1.equals("Rupiah") && symbol_money2.equals("Euro")) {
                        edit_money2.setText(money.RptoEuro(value_to_conversion));
                        text_formula.setText(money.getFormula("Rupiah", "Euro",
                                value_to_conversion, money.RptoEuro(value_to_conversion)));
                    }
                    // Rupiah to Poundsterling
                    else if (symbol_money1.equals("Rupiah") && symbol_money2.equals("Poundsterling")) {
                        edit_money2.setText(money.RptoPoundsterling(value_to_conversion));
                        text_formula.setText(money.getFormula("Rupiah", "Poundsterling",
                                value_to_conversion, money.RptoPoundsterling(value_to_conversion)));
                    }
                    // Rupiah to Yen
                    else if (symbol_money1.equals("Rupiah") && symbol_money2.equals("Yen")) {
                        edit_money2.setText(money.RptoYen(value_to_conversion));
                        text_formula.setText(money.getFormula("Rupiah", "Yen",
                                value_to_conversion, money.RptoYen(value_to_conversion)));
                    }
                    // Dollar to Rupiah
                    else if (symbol_money1.equals("Dollar") && symbol_money2.equals("Rupiah")) {
                        edit_money2.setText(money.UsdtoRp(value_to_conversion));
                        text_formula.setText(money.getFormula("Dollar", "Rupiah",
                                value_to_conversion, money.UsdtoRp(value_to_conversion)));
                    }
                    // Dollar to Euro
                    else if (symbol_money1.equals("Dollar") && symbol_money2.equals("Euro")) {
                        edit_money2.setText(money.UsdtoEuro(value_to_conversion));
                        text_formula.setText(money.getFormula("Dollar", "Euro",
                                value_to_conversion,money.UsdtoEuro(value_to_conversion)));
                    }
                    // Dollar to Poundsterling
                    else if (symbol_money1.equals("Dollar") && symbol_money2.equals("Poundsterling")) {
                        edit_money2.setText(money.UsdtoPounds(value_to_conversion));
                        text_formula.setText(money.getFormula("Dollar", "Poundsterling",
                                value_to_conversion, money.UsdtoPounds(value_to_conversion)));
                    }
                    // Dollar to Yen
                    else if (symbol_money1.equals("Dollar") && symbol_money2.equals("Yen")) {
                        edit_money2.setText(money.UsdtoYen(value_to_conversion));
                        text_formula.setText(money.getFormula("Dollar", "Yen",
                                value_to_conversion, money.UsdtoYen(value_to_conversion)));
                    }
                    // Euro to Rupiah
                    else if (symbol_money1.equals("Euro") && symbol_money2.equals("Rupiah")) {
                        edit_money2.setText(money.EurotoRp(value_to_conversion));
                        text_formula.setText(money.getFormula("Euro", "Rupiah",
                                value_to_conversion, money.EurotoRp(value_to_conversion)));
                    }
                    // Euro to Dollar
                    else if (symbol_money1.equals("Euro") && symbol_money2.equals("Dollar")) {
                        edit_money2.setText(money.EurotoUsd(value_to_conversion));
                        text_formula.setText(money.getFormula("Euro", "Dollar",
                                value_to_conversion, money.EurotoUsd(value_to_conversion)));
                    }
                    // Euro to Poundsterling
                    else if (symbol_money1.equals("Euro") && symbol_money2.equals("Poundsterling")) {
                        edit_money2.setText(money.EurotoPounds(value_to_conversion));
                        text_formula.setText(money.getFormula("Euro", "Poundsterling",
                                value_to_conversion, money.EurotoPounds(value_to_conversion)));
                    }
                    // Euro to Yen
                    else if (symbol_money1.equals("Euro") && symbol_money2.equals("Yen")) {
                        edit_money2.setText(money.EurotoYen(value_to_conversion));
                        text_formula.setText(money.getFormula("Euro", "Yen",
                                value_to_conversion, money.EurotoYen(value_to_conversion)));
                    }
                    // Poundsterling to Rupiah
                    else if (symbol_money1.equals("Poundsterling") && symbol_money2.equals("Rupiah")) {
                        edit_money2.setText(money.PoundstoRp(value_to_conversion));
                        text_formula.setText(money.getFormula("F", "Rupiah",
                                value_to_conversion, money.PoundstoRp(value_to_conversion)));
                    }
                    // Poundsterling to Dollar
                    else if (symbol_money1.equals("Poundsterling") && symbol_money2.equals("Dollar")) {
                        edit_money2.setText(money.PoundstoUsd(value_to_conversion));
                        text_formula.setText(money.getFormula("Poundsterling", "Dollar",
                                value_to_conversion, money.PoundstoUsd(value_to_conversion)));
                    }
                    // Poundsterling to Euro
                    else if (symbol_money1.equals("Poundsterling") && symbol_money2.equals("Euro")) {
                        edit_money2.setText(money.PoundtoEuro(value_to_conversion));
                        text_formula.setText(money.getFormula("Poundsterling", "Euro",
                                value_to_conversion, money.PoundtoEuro(value_to_conversion)));
                    }
                    // Poundsterling to Yen
                    else if (symbol_money1.equals("Poundsterling") && symbol_money2.equals("Yen")) {
                        edit_money2.setText(money.PoundtoYen(value_to_conversion));
                        text_formula.setText(money.getFormula("Poundsterling", "Yen",
                                value_to_conversion, money.PoundtoYen(value_to_conversion)));
                    }
                    // Yen to Rupiah
                    else if (symbol_money1.equals("Yen") && symbol_money2.equals("Rupiah")) {
                        edit_money2.setText(money.YentoRp(value_to_conversion));
                        text_formula.setText(money.getFormula("Yen", "Rupiah",
                                value_to_conversion, money.YentoRp(value_to_conversion)));
                    }
                    // Yen to Dollar
                    else if (symbol_money1.equals("Yen") && symbol_money2.equals("Dollar")) {
                        edit_money2.setText(money.YentoUsd(value_to_conversion));
                        text_formula.setText(money.getFormula("Yen", "Dollar",
                                value_to_conversion, money.YentoUsd(value_to_conversion)));
                    }
                    // Yen to Euro
                    else if (symbol_money1.equals("Yen") && symbol_money2.equals("Euro")) {
                        edit_money2.setText(money.YentoEuro(value_to_conversion));
                        text_formula.setText(money.getFormula("Yen", "Euro",
                                value_to_conversion, money.YentoEuro(value_to_conversion)));
                    }
                    // Yen to Poundsterling
                    else if (symbol_money1.equals("Yen") && symbol_money2.equals("Poundsterling")) {
                        edit_money2.setText(money.YentoPounds(value_to_conversion));
                        text_formula.setText(money.getFormula("Yen", "Poundsterling",
                                value_to_conversion, money.YentoPounds(value_to_conversion)));
                    }
                    //if Rupiah equals Rupiah
                    else if (symbol_money1.equals("Rupiah") && symbol_money2.equals("Rupiah")) {
                        edit_money2.setText(money.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Rupiah  =  " + money.check_after_decimal_point(value_to_conversion));
                    }
                    //if Dollar equals Dollar
                    else if (symbol_money1.equals("Dollar") && symbol_money2.equals("Dollar")) {
                        edit_money2.setText(money.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Dollar  =  " + money.check_after_decimal_point(value_to_conversion));
                    }
                    //if Euro equals Euro
                    else if (symbol_money1.equals("Euro") && symbol_money2.equals("Euro")) {
                        edit_money2.setText(money.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Euro  =  " +money.check_after_decimal_point(value_to_conversion));
                    }
                    //if Poundsterling equals Pounsterling
                    else if (symbol_money1.equals("Poundsterling") && symbol_money2.equals("Poundsterling")) {
                        edit_money2.setText(money.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Poundsterling  =  " + money.check_after_decimal_point(value_to_conversion));
                    }
                    //if Yen equals Yen
                    else if (symbol_money1.equals("Yen") && symbol_money2.equals("Yen")) {
                        edit_money2.setText(money.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("Yen  =  " + money.check_after_decimal_point(value_to_conversion));
                    }
                }
            }
        });
    }

    private void setupToolbar() {
        Objects.requireNonNull(getSupportActionBar()).setTitle("Convertify");
    }

}