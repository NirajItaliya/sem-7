package com.example.mad_npracticals.Practical_3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mad_npracticals.R;

public class StartActForResult_1Activity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_act_for_result1);

        tvDisplay = findViewById(R.id.tvDisplay);
        btnDisplay = findViewById(R.id.btnDisplay);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent intent = new Intent(StartActForResult_1Activity.this, StartActForResult_2Activity.class);
                startActivityForResult(intent, 2);
            }

        });

    }

    @Override

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 2) {
            String message = data.getStringExtra("message");
            tvDisplay.setText(message);

        }

        super.onActivityResult(requestCode, resultCode, data);

    }

}
