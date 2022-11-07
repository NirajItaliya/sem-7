package com.example.mad_npracticals.Practical_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.mad_npracticals.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class Practical_1 extends AppCompatActivity {
    TextInputEditText etId;
    TextInputEditText etPass;
    Button btnSubmit;
    CheckBox checkBox;
    Button btnSS;
    String check = "";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical1);
        btnSubmit = findViewById(R.id.btnLogin);
        etId = findViewById(R.id.etId);
        etPass = findViewById(R.id.etPassword);
        checkBox = findViewById(R.id.chBox);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (!checkEmptyFields()) {
                    if (checkBox.isChecked()) {
                        check = "With Checkbox";
                    } else {
                        check = "Without CheckBox";
                    }
                    Toast.makeText(getApplicationContext(), Objects.requireNonNull(etId.getText()).toString() + " LoggedIN " + check, Toast.LENGTH_LONG).show();
                }

            }

        });

    }


    private boolean checkEmptyFields() {
        boolean e = false;
        if (Objects.requireNonNull(etId.getText()).toString().trim().isEmpty()) {
            etId.setError("Please enter your ID");
            e = true;

        } else {

            etId.setError(null);

        }

        if (Objects.requireNonNull(etPass.getText()).toString().trim().equals("")) {
            etPass.setError("Please Enter your Password");
            e = true;

        } else {

            etPass.setError(null);

        }

        return e;

    }

}
