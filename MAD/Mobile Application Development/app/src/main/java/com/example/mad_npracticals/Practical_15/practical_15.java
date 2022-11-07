package com.example.mad_npracticals.Practical_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mad_npracticals.R;

public class practical_15 extends AppCompatActivity {
    EditText CallNumbers;
    Button makecall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical15);

        //Getting the edittext and button instance
        CallNumbers = (EditText) findViewById(R.id.editText1);
        makecall = (Button) findViewById(R.id.button1);

        //Performing action on button click
        makecall.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String number = CallNumbers.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                startActivity(callIntent);
            }

        });
    }
}