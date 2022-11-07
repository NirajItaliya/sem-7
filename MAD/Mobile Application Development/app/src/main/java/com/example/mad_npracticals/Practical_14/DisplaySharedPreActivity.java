package com.example.mad_npracticals.Practical_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mad_npracticals.R;

public class DisplaySharedPreActivity extends AppCompatActivity {


    TextView tvName;
    Button btnDis;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_shared_pre);


        SharedPreferences sp = getSharedPreferences("MySp", MODE_PRIVATE);
        String s1 = sp.getString("Name", "");
        sp.getString("Pass", "");


        String name = "Hey, " + s1;
        tvName = findViewById(R.id.tvSpDisplay);
        tvName.setText(name);


        btnDis = findViewById(R.id.btnSpback);
        btnDis.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                startActivity(new Intent(DisplaySharedPreActivity.this, practical_14.class));

            }

        });

    }

}
