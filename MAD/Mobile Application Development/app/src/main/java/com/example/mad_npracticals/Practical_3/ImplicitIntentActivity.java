package com.example.mad_npracticals.Practical_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mad_npracticals.R;

public class ImplicitIntentActivity extends AppCompatActivity {
    EditText etURL;
    Button btnURL;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        etURL = findViewById(R.id.etUrl);
        btnURL = findViewById(R.id.btnURL);
        btnURL.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(etURL.getText().toString()));
                startActivity(intent);
            }

        });

    }

}
