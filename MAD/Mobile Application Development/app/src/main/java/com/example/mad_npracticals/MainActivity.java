package com.example.mad_npracticals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mad_npracticals.Practical_1.Practical_1;
import com.example.mad_npracticals.Practical_12.practical_12;
import com.example.mad_npracticals.Practical_13.Practical_13;
import com.example.mad_npracticals.Practical_14.practical_14;
import com.example.mad_npracticals.Practical_15.practical_15;
import com.example.mad_npracticals.Practical_16.practical_16;
import com.example.mad_npracticals.Practical_17.practical_17;
import com.example.mad_npracticals.Practical_3.Practical_3;
import com.example.mad_npracticals.Practical_4.Practical_4;
import com.example.mad_npracticals.Practical_5.Practical_5;
import com.example.mad_npracticals.Practical_6.parcticl_6;
import com.example.mad_npracticals.Practical_7.practical_7;
import com.example.mad_npracticals.Practical_8.practical_8;
import com.example.mad_npracticals.Practical_9.Practical_9;

public class MainActivity extends AppCompatActivity {

    public Button
            prc1_2,
            prc3,
            prc4,
            prc5,
            prc6,
            prc7,
            prc8,
            prc9,
            prc10,
            prc11,
            prc12,
            prc13,
            prc14,
            prc15,
            prc16,
            prc17;

    // startActivity(new Intent(ExplicitIntentActivity.this, ImplicitIntentActivity.class));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prc1_2 = findViewById(R.id.pratciale1);
        prc3 = findViewById(R.id.pratciale3);
        prc4 = findViewById(R.id.pratciale4);
        prc6 = findViewById(R.id.pratciale6);
        prc5 = findViewById(R.id.pratciale5);
        prc7 = findViewById(R.id.pratciale7);
        prc9 = findViewById(R.id.pratciale9);
        prc8 = findViewById(R.id.pratciale8);
        prc10 = findViewById(R.id.pratciale10);
        prc12 = findViewById(R.id.pratciale12);
        prc11 = findViewById(R.id.pratciale11);
        prc13 = findViewById(R.id.pratciale13);
        prc15 = findViewById(R.id.pratciale15);
        prc14 = findViewById(R.id.pratciale14);
        prc16 = findViewById(R.id.pratciale16);
        prc17 = findViewById(R.id.pratciale17);

        prc1_2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Practical_1.class));
            }

        });
        prc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Practical_3.class));
            }
        });
        prc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "direct output wp ma che code aaj rese ", Toast.LENGTH_LONG).show();
             //   startActivity(new Intent(MainActivity.this, Practical_4.class));
            }
        });
        prc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, parcticl_6.class));
            }
        });
        prc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,  Practical_5.class));
            }
        });
        prc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, practical_7.class));
            }
        });
        prc9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Practical_9.class));
            }
        });
        prc8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, practical_8.class));
            }
        });
        prc10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  startActivity(new Intent(MainActivity.this, Practical_3.class));
                Toast.makeText(getApplicationContext(), "practical 10 Baki che aena SC and Code hu direct mokalish ", Toast.LENGTH_LONG).show();
            }
        });
        prc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, practical_12.class));
            }
        });
        prc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   startActivity(new Intent(MainActivity.this, Practical_3.class));
                Toast.makeText(getApplicationContext(), "practical 11 Baki che aena SC and Code hu direct mokalish ", Toast.LENGTH_LONG).show();
            }
        });
        prc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Practical_13.class));
            }
        });
        prc15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, practical_15.class));
            }
        });
        prc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, practical_14.class));
            }
        });
        prc16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  startActivity(new Intent(MainActivity.this, practical_16.class));
                Toast.makeText(getApplicationContext(), "wp direct out put mokalu che code aj rese", Toast.LENGTH_LONG).show();
            }
        });
        prc17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, practical_17.class));
            }
        });


    }
}