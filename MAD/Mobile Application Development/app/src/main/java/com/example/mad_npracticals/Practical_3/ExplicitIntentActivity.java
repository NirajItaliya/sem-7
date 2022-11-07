package com.example.mad_npracticals.Practical_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mad_npracticals.R;

public class ExplicitIntentActivity extends AppCompatActivity {
    Button btnPre;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        btnNext = findViewById(R.id.btnnext);
        btnPre = findViewById(R.id.btnpre);

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ExplicitIntentActivity.this, ImplicitIntentActivity.class));

            }

        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ExplicitIntentActivity.this, StartActForResult_1Activity.class));

            }

        });

    }

}
