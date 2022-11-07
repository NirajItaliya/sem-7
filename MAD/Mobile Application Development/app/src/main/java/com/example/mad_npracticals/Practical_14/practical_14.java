package com.example.mad_npracticals.Practical_14;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mad_npracticals.R;

public class practical_14 extends AppCompatActivity {

    EditText etName, etPass;
    Button btnEnter;

    final static String spName = "MySp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical14);

        btnEnter = findViewById(R.id.btnspenter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                startActivity(new Intent(practical_14.this, DisplaySharedPreActivity.class));

            }

        });

        etName = findViewById(R.id.etSpName);
        etPass = findViewById(R.id.etSpPass);
        SharedPreferences sp = getSharedPreferences(spName, MODE_PRIVATE);
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = sp.edit();
        editor.putString("Name", etName.getText().toString());
        editor.putString("Pass", etPass.getText().toString());


        editor.apply();
        editor.commit();
    }

}
