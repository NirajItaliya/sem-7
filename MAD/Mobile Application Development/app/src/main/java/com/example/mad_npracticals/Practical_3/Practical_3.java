package com.example.mad_npracticals.Practical_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mad_npracticals.MainActivity;
import com.example.mad_npracticals.Practical_1.Practical_1;
import com.example.mad_npracticals.R;

public class Practical_3 extends AppCompatActivity {
    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical3);
        btn1 = findViewById(R.id.btnImplicit);
        btn2 = findViewById(R.id.btnExplicit);
        btn3 = findViewById(R.id.btnStartActivityFOrResult);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Practical_3.this, ImplicitIntentActivity.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Practical_3.this, ExplicitIntentActivity.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Practical_3.this, StartActForResult_1Activity.class));
            }
        });

    }
}