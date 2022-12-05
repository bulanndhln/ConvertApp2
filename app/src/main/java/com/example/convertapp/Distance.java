package com.example.convertapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSpinner;

import java.util.Objects;
public class Distance extends AppCompatActivity {
    private AppCompatEditText edit_distance1;
    private AppCompatEditText edit_distance2;
    private Distances distance;
    private LinearLayout layout_formula;
    private TextView text_formula;
    private Animation rotate_zoom_out;
    private String[] distances = new String[]{
            "km",
            "hm",
            "dam",
            "m",
            "dm",
            "cm",
            "mm"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        distance = new Distances(this);

        layout_formula = findViewById(R.id.layout_formula);
        text_formula = findViewById(R.id.text_formula);

        rotate_zoom_out = AnimationUtils.loadAnimation(Distance.this, R.anim.rotate_zoom_out);

        setupToolbar();

        //edit text temp to conversion 1
        edit_distance1 = findViewById(R.id.edit_1_distance_to_conversion);
        edit_distance1.setHint(SharedPrefsDistance.getDistanceSymbol1(Distance.this));

        //edit text temp to conversion 2
        edit_distance2 = findViewById(R.id.edit_2_distance_to_conversion);
        edit_distance2.setHint(SharedPrefsDistance.getDistanceSymbol2(Distance.this));
        edit_distance2.setKeyListener(null);
        edit_distance2.setClickable(false);

        //Spinner & Adapter 1
        ArrayAdapter<String> arrayAdapter1 =
                new ArrayAdapter(Distance.this, android.R.layout.simple_spinner_item, distances);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner1 = findViewById(R.id.spinner_1_distance_to_conversion);
        appCompatSpinner1.setAdapter(arrayAdapter1);

        //set selection
        appCompatSpinner1.setSelection(SharedPrefsDistance.getDistanceIndex1(Distance.this));
        appCompatSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String distance_symbol1 = distances[position];
                SharedPrefsDistance.setDistance1(Distance.this, distance_symbol1, position);
                edit_distance1.setHint(distances[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner & adapter 2
        ArrayAdapter<String> arrayAdapter2 =
                new ArrayAdapter(Distance.this, android.R.layout.simple_spinner_item, distances);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        AppCompatSpinner appCompatSpinner2 = findViewById(R.id.spinner_2_distance_to_conversion);
        appCompatSpinner2.setAdapter(arrayAdapter2);
        appCompatSpinner2.setSelection(SharedPrefsDistance.getDistanceIndex2(Distance.this));
        appCompatSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String distance_symbol2 = distances[position];
                SharedPrefsDistance.setDistance2(Distance.this, distance_symbol2, position);
                edit_distance2.setHint(distances[position]);
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
                if (Objects.requireNonNull(edit_distance1.getText()).toString().isEmpty()) {

                    Toast.makeText(Distance.this,
                            "Masukan nilai yang ingin di konversi", Toast.LENGTH_SHORT).show();

                } else {
                    layout_formula.startAnimation(rotate_zoom_out);
                    if (layout_formula.getVisibility() == View.GONE) {
                        layout_formula.setVisibility(View.VISIBLE);
                    }
                    String symbol_distance1 = SharedPrefsDistance.getDistanceSymbol1(Distance.this);
                    String symbol_distance2 = SharedPrefsDistance.getDistanceSymbol2(Distance.this);
                    double value_to_conversion = Double.parseDouble(edit_distance1.getText().toString());

                    // km to hm
                    if (symbol_distance1.equals("km") && symbol_distance2.equals("hm")) {
                        edit_distance2.setText(distance.KmtoHm(value_to_conversion));
                        text_formula.setText(distance.getFormula("km", "hm",
                                value_to_conversion, distance.KmtoHm(value_to_conversion)));
                    }
                    // km to dam
                    else if (symbol_distance1.equals("km") && symbol_distance2.equals("dam")) {
                        edit_distance2.setText(distance.KmtoDam(value_to_conversion));
                        text_formula.setText(distance.getFormula("km", "dam",
                                value_to_conversion, distance.KmtoDam(value_to_conversion)));
                    }
                    // km to m
                    else if (symbol_distance1.equals("km") && symbol_distance2.equals("m")) {
                        edit_distance2.setText(distance.KmtoM(value_to_conversion));
                        text_formula.setText(distance.getFormula("km", "m",
                                value_to_conversion, distance.KmtoM(value_to_conversion)));
                    }
                    // km to dm
                    // R to C
                    else if (symbol_distance1.equals("km") && symbol_distance2.equals("dm")) {
                        edit_distance2.setText(distance.KmtoDm(value_to_conversion));
                        text_formula.setText(distance.getFormula("km", "dm",
                                value_to_conversion, distance.KmtoDm(value_to_conversion)));
                    }
                    // km to cm
                    // C to F
                    else if (symbol_distance1.equals("km") && symbol_distance2.equals("cm")) {
                        edit_distance2.setText(distance.KmtoCm(value_to_conversion));
                        text_formula.setText(distance.getFormula("km", "cm",
                                value_to_conversion, distance.KmtoCm(value_to_conversion)));
                    }
                    //km to mm
                    else if (symbol_distance1.equals("km") && symbol_distance2.equals("mm")) {
                        edit_distance2.setText(distance.KmtoMm(value_to_conversion));
                        text_formula.setText(distance.getFormula("km", "mm",
                                value_to_conversion, distance.KmtoMm(value_to_conversion)));
                    }

                    // hm to km
                    else if (symbol_distance1.equals("hm") && symbol_distance2.equals("km")) {
                        edit_distance2.setText(distance.HmtoKm(value_to_conversion));
                        text_formula.setText(distance.getFormula("hm", "km",
                                value_to_conversion, distance.HmtoKm(value_to_conversion)));
                    }
                    // hm to dam
                    else if (symbol_distance1.equals("hm") && symbol_distance2.equals("dam")) {
                        edit_distance2.setText(distance.HmtoDam(value_to_conversion));
                        text_formula.setText(distance.getFormula("hm", "dam",
                                value_to_conversion, distance.HmtoDam(value_to_conversion)));
                    }
                    // hm to m
                    else if (symbol_distance1.equals("hm") && symbol_distance2.equals("m")) {
                        edit_distance2.setText(distance.HmtoM(value_to_conversion));
                        text_formula.setText(distance.getFormula("hm", "m",
                                value_to_conversion, distance.HmtoM(value_to_conversion)));
                    }
                    // hm to dm
                    else if (symbol_distance1.equals("hm") && symbol_distance2.equals("dm")) {
                        edit_distance2.setText(distance.HmtoDm(value_to_conversion));
                        text_formula.setText(distance.getFormula("hm", "dm",
                                value_to_conversion, distance.HmtoDm(value_to_conversion)));
                    }
                    // hm to cm
                    else if (symbol_distance1.equals("hm") && symbol_distance2.equals("cm")) {
                        edit_distance2.setText(distance.HmtoCm(value_to_conversion));
                        text_formula.setText(distance.getFormula("hm", "cm",
                                value_to_conversion, distance.HmtoCm(value_to_conversion)));
                    }
                    // hm to mm
                    else if (symbol_distance1.equals("hm") && symbol_distance2.equals("mm")) {
                        edit_distance2.setText(distance.HmtoMm(value_to_conversion));
                        text_formula.setText(distance.getFormula("hm", "mm",
                                value_to_conversion, distance.HmtoMm(value_to_conversion)));
                    }
                    // dam to km
                    else if (symbol_distance1.equals("dam") && symbol_distance2.equals("km")) {
                        edit_distance2.setText(distance.DamtoKm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dam", "km",
                                value_to_conversion, distance.DamtoKm(value_to_conversion)));
                    }
                    // dam to hm
                    else if (symbol_distance1.equals("dam") && symbol_distance2.equals("hm")) {
                        edit_distance2.setText(distance.DamtoHm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dam", "hm",
                                value_to_conversion, distance.DamtoHm(value_to_conversion)));
                    }
                    // dam to m
                    else if (symbol_distance1.equals("dam") && symbol_distance2.equals("m")) {
                        edit_distance2.setText(distance.DamtoM(value_to_conversion));
                        text_formula.setText(distance.getFormula("dam", "m",
                                value_to_conversion, distance.DamtoM(value_to_conversion)));
                    }
                    // dam to dm
                    else if (symbol_distance1.equals("dam") && symbol_distance2.equals("dm")) {
                        edit_distance2.setText(distance.DamtoDm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dam", "dm",
                                value_to_conversion, distance.DamtoDm(value_to_conversion)));
                    }
                    // dam to cm
                    else if (symbol_distance1.equals("dam") && symbol_distance2.equals("cm")) {
                        edit_distance2.setText(distance.DamtoCm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dam", "cm",
                                value_to_conversion, distance.DamtoCm(value_to_conversion)));
                    }
                    // dam to mm
                    else if (symbol_distance1.equals("dam") && symbol_distance2.equals("mm")) {
                        edit_distance2.setText(distance.DamtoMm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dam", "mm",
                                value_to_conversion, distance.DamtoMm(value_to_conversion)));
                    }
                    // m to km
                    else if (symbol_distance1.equals("m") && symbol_distance2.equals("km")) {
                        edit_distance2.setText(distance.MtoKm(value_to_conversion));
                        text_formula.setText(distance.getFormula("m", "km",
                                value_to_conversion, distance.MtoKm(value_to_conversion)));
                    }
                    // m to hm
                    else if (symbol_distance1.equals("m") && symbol_distance2.equals("hm")) {
                        edit_distance2.setText(distance.MtoHm(value_to_conversion));
                        text_formula.setText(distance.getFormula("m", "hm",
                                value_to_conversion, distance.MtoHm(value_to_conversion)));
                    }
                    // m to dam
                    else if (symbol_distance1.equals("m") && symbol_distance2.equals("dam")) {
                        edit_distance2.setText(distance.MtoDam(value_to_conversion));
                        text_formula.setText(distance.getFormula("m", "dam",
                                value_to_conversion, distance.MtoDam(value_to_conversion)));
                    }
                    // m to dm
                    else if (symbol_distance1.equals("m") && symbol_distance2.equals("dm")) {
                        edit_distance2.setText(distance.MtoDm(value_to_conversion));
                        text_formula.setText(distance.getFormula("m", "dm",
                                value_to_conversion, distance.MtoDm(value_to_conversion)));
                    }
                    // m to cm
                    else if (symbol_distance1.equals("m") && symbol_distance2.equals("cm")) {
                        edit_distance2.setText(distance.MtoCm(value_to_conversion));
                        text_formula.setText(distance.getFormula("m", "cm",
                                value_to_conversion, distance.MtoCm(value_to_conversion)));
                    }
                    // m to mm
                    else if (symbol_distance1.equals("m") && symbol_distance2.equals("mm")) {
                        edit_distance2.setText(distance.MtoMm(value_to_conversion));
                        text_formula.setText(distance.getFormula("m", "mm",
                                value_to_conversion, distance.MtoMm(value_to_conversion)));
                    }
                    // dm to km
                    else if (symbol_distance1.equals("dm") && symbol_distance2.equals("km")) {
                        edit_distance2.setText(distance.DmtoKm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dm", "km",
                                value_to_conversion, distance.DmtoKm(value_to_conversion)));
                    }
                    // dm to hm
                    else if (symbol_distance1.equals("dm") && symbol_distance2.equals("hm")) {
                        edit_distance2.setText(distance.DmtoHm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dm", "hm",
                                value_to_conversion, distance.DmtoHm(value_to_conversion)));
                    }
                    // dm to dam
                    else if (symbol_distance1.equals("dm") && symbol_distance2.equals("dam")) {
                        edit_distance2.setText(distance.DmtoDam(value_to_conversion));
                        text_formula.setText(distance.getFormula("dm", "dam",
                                value_to_conversion, distance.DmtoDam(value_to_conversion)));
                    }
                    // dm to m
                    else if (symbol_distance1.equals("dm") && symbol_distance2.equals("m")) {
                        edit_distance2.setText(distance.DmtoM(value_to_conversion));
                        text_formula.setText(distance.getFormula("dm", "m",
                                value_to_conversion, distance.DmtoM(value_to_conversion)));
                    }
                    // dm to cm
                    else if (symbol_distance1.equals("dm") && symbol_distance2.equals("cm")) {
                        edit_distance2.setText(distance.DmtoCm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dm", "cm",
                                value_to_conversion, distance.DmtoCm(value_to_conversion)));
                    }
                    // dm to mm
                    else if (symbol_distance1.equals("dm") && symbol_distance2.equals("mm")) {
                        edit_distance2.setText(distance.DmtoMm(value_to_conversion));
                        text_formula.setText(distance.getFormula("dm", "mm",
                                value_to_conversion, distance.DmtoMm(value_to_conversion)));
                    }
                    // cm to km
                    else if (symbol_distance1.equals("cm") && symbol_distance2.equals("km")) {
                        edit_distance2.setText(distance.CmtoKm(value_to_conversion));
                        text_formula.setText(distance.getFormula("cm", "km",
                                value_to_conversion, distance.CmtoKm(value_to_conversion)));
                    }
                    // cm to hm
                    else if (symbol_distance1.equals("cm") && symbol_distance2.equals("hm")) {
                        edit_distance2.setText(distance.CmtoHm(value_to_conversion));
                        text_formula.setText(distance.getFormula("cm", "hm",
                                value_to_conversion, distance.CmtoHm(value_to_conversion)));
                    }
                    // cm to dam
                    else if (symbol_distance1.equals("cm") && symbol_distance2.equals("dam")) {
                        edit_distance2.setText(distance.CmtoDam(value_to_conversion));
                        text_formula.setText(distance.getFormula("cm", "dam",
                                value_to_conversion, distance.CmtoDam(value_to_conversion)));
                    }
                    // cm to m
                    else if (symbol_distance1.equals("cm") && symbol_distance2.equals("m")) {
                        edit_distance2.setText(distance.CmtoM(value_to_conversion));
                        text_formula.setText(distance.getFormula("cm", "m",
                                value_to_conversion, distance.CmtoM(value_to_conversion)));
                    }
                    // cm to dm
                    else if (symbol_distance1.equals("cm") && symbol_distance2.equals("dm")) {
                        edit_distance2.setText(distance.CmtoDm(value_to_conversion));
                        text_formula.setText(distance.getFormula("cm", "dm",
                                value_to_conversion, distance.CmtoDm(value_to_conversion)));
                    }
                    // cm to mm
                    else if (symbol_distance1.equals("cm") && symbol_distance2.equals("mm")) {
                        edit_distance2.setText(distance.CmtoMm(value_to_conversion));
                        text_formula.setText(distance.getFormula("cm", "mm",
                                value_to_conversion, distance.CmtoMm(value_to_conversion)));
                    }
                    // mm to km
                    else if (symbol_distance1.equals("mm") && symbol_distance2.equals("km")) {
                        edit_distance2.setText(distance.MmtoKm(value_to_conversion));
                        text_formula.setText(distance.getFormula("mm", "km",
                                value_to_conversion, distance.MmtoKm(value_to_conversion)));
                    }
                    // mm to hm
                    else if (symbol_distance1.equals("mm") && symbol_distance2.equals("hm")) {
                        edit_distance2.setText(distance.MmtoHm(value_to_conversion));
                        text_formula.setText(distance.getFormula("mm", "hm",
                                value_to_conversion, distance.MmtoHm(value_to_conversion)));
                    }
                    // mm to dam
                    else if (symbol_distance1.equals("mm") && symbol_distance2.equals("dam")) {
                        edit_distance2.setText(distance.MmtoDam(value_to_conversion));
                        text_formula.setText(distance.getFormula("mm", "dam",
                                value_to_conversion, distance.MmtoDam(value_to_conversion)));
                    }
                    // mm to m
                    else if (symbol_distance1.equals("mm") && symbol_distance2.equals("m")) {
                        edit_distance2.setText(distance.MmtoM(value_to_conversion));
                        text_formula.setText(distance.getFormula("mm", "m",
                                value_to_conversion, distance.MmtoM(value_to_conversion)));
                    }
                    // mm to dm
                    else if (symbol_distance1.equals("mm") && symbol_distance2.equals("dm")) {
                        edit_distance2.setText(distance.MmtoDm(value_to_conversion));
                        text_formula.setText(distance.getFormula("mm", "dm",
                                value_to_conversion, distance.MmtoDm(value_to_conversion)));
                    }
                    // mm to cm
                    else if (symbol_distance1.equals("mm") && symbol_distance2.equals("cm")) {
                        edit_distance2.setText(distance.MmtoCm(value_to_conversion));
                        text_formula.setText(distance.getFormula("mm", "cm",
                                value_to_conversion, distance.MmtoCm(value_to_conversion)));
                    }
                    //if km equals km
                    else if (symbol_distance1.equals("km") && symbol_distance2.equals("km")) {
                        edit_distance2.setText(distance.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("km  =  " + distance.check_after_decimal_point(value_to_conversion));
                    }
                    //if hm equals hm
                    else if (symbol_distance1.equals("hm") && symbol_distance2.equals("hm")) {
                        edit_distance2.setText(distance.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("hm  =  " + distance.check_after_decimal_point(value_to_conversion));
                    }
                    //if dam equals dam
                    else if (symbol_distance1.equals("dam") && symbol_distance2.equals("dam")) {
                        edit_distance2.setText(distance.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("dam  =  " + distance.check_after_decimal_point(value_to_conversion));
                    }
                    //if m equals m
                    else if (symbol_distance1.equals("m") && symbol_distance2.equals("m")) {
                        edit_distance2.setText(distance.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("m  =  " + distance.check_after_decimal_point(value_to_conversion));
                    }
                    //if dm equals dm
                    else if (symbol_distance1.equals("dm") && symbol_distance2.equals("dm")) {
                        edit_distance2.setText(distance.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("dm  =  " + distance.check_after_decimal_point(value_to_conversion));
                    }
                    //if cm equals cm
                    else if (symbol_distance1.equals("cm") && symbol_distance2.equals("cm")) {
                        edit_distance2.setText(distance.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("cm  =  " + distance.check_after_decimal_point(value_to_conversion));
                    }
                    //if mm equals mm
                    else if (symbol_distance1.equals("mm") && symbol_distance2.equals("mm")) {
                        edit_distance2.setText(distance.check_after_decimal_point(value_to_conversion));
                        text_formula.setText("mm  =  " + distance.check_after_decimal_point(value_to_conversion));
                    }
                }
            }
        });
    }

    private void setupToolbar() {
        Objects.requireNonNull(getSupportActionBar()).setTitle("Convertify");
    }


}