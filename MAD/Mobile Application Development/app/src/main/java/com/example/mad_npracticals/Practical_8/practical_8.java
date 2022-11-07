
package com.example.mad_npracticals.Practical_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mad_npracticals.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class practical_8 extends AppCompatActivity {

    TextInputEditText etFanme;
    TextInputEditText etLname;
    TextInputEditText etAge;
    MaterialButton btnInsert;
    SqliteHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical8);
        etFanme = findViewById(R.id.etFname);
        etLname = findViewById(R.id.etLname);
        etAge = findViewById(R.id.etAge);
        btnInsert = findViewById(R.id.btnInsert);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                insertData();
            }

        });

    }

    private void insertData() {

        String fname = etFanme.getText().toString();
        String lname = etLname.getText().toString();
        String age = etAge.getText().toString();
        MyDetail myDetail = new MyDetail(fname, lname, Integer.parseInt(age));
        helper = new SqliteHelper(this);
        helper.addDetails(myDetail);

        Toast.makeText(this, "Data Inserted Successfully.", Toast.LENGTH_SHORT).show();

    }

}

