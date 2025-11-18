package com.example.gradechecker_nacpil;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et_grade;
    TextView tv_results;
    ImageView iv_memes;
    Double db_grade;
    String str_grade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        et_grade = (EditText)findViewById(R.id.et_grade);
        tv_results = (TextView)findViewById(R.id.tv_results);
        iv_memes = (ImageView)findViewById(R.id.iv_memes);

    }

    @SuppressLint("SetTextI18n")
    public void proceed(View view) {

        str_grade = et_grade.getText().toString();
        db_grade = Double.parseDouble(str_grade);

        if (db_grade <= 60.0 && db_grade >= 0) {
            tv_results.setText("R");
            tv_results.setTextColor(Color.parseColor("#F57E79"));
            iv_memes.setImageResource(R.drawable.repeat);
        } else if (db_grade <= 65.0 && db_grade >= 60.0) {
            tv_results.setText("1.0");
            tv_results.setTextColor(Color.parseColor("#61AB6C"));
            iv_memes.setImageResource(R.drawable.uno);
        } else if (db_grade <= 71.0 && db_grade >= 66.0) {
            tv_results.setText("1.5");
            tv_results.setTextColor(Color.parseColor("#61AB6C"));
            iv_memes.setImageResource(R.drawable.unopayb);
        } else if (db_grade <= 77.0 && db_grade >= 72.0) {
            tv_results.setText("2.0");
            tv_results.setTextColor(Color.parseColor("#61AB6C"));
            iv_memes.setImageResource(R.drawable.dos);
        } else if (db_grade <= 83.0 && db_grade >= 78.0) {
            tv_results.setText("2.5");
            tv_results.setTextColor(Color.parseColor("#61AB6C"));
            iv_memes.setImageResource(R.drawable.dospayb);
        } else if (db_grade <= 89.0 && db_grade >= 84.0) {
            tv_results.setText("3.0");
            tv_results.setTextColor(Color.parseColor("#61AB6C"));
            iv_memes.setImageResource(R.drawable.tres);
        } else if (db_grade <= 95.0 && db_grade >= 90.0) {
            tv_results.setText("3.5");
            tv_results.setTextColor(Color.parseColor("#61AB6C"));
            iv_memes.setImageResource(R.drawable.trespayb);
        } else if (db_grade <= 100.0 && db_grade >= 96.0) {
            tv_results.setText("4.0");
            tv_results.setTextColor(Color.parseColor("#61AB6C"));
            iv_memes.setImageResource(R.drawable.kwatro);
        } else {
            tv_results.setText("INVALID INPUT");
            tv_results.setTextColor(Color.parseColor("#5270b6"));
            iv_memes.setImageResource(R.drawable.invalid);
        }

    }
}