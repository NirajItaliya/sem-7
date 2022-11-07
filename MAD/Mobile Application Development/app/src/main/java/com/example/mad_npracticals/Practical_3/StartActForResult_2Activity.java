package com.example.mad_npracticals.Practical_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mad_npracticals.R;

public class StartActForResult_2Activity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_act_for_result2);
        editText = findViewById(R.id.etSend);
        button = findViewById(R.id.btnSend);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("message", editText.getText().toString());
                setResult(2, intent);
                finish();

            }

        });

    }

}

