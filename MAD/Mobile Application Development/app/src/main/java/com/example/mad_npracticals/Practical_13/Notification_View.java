package com.example.mad_npracticals.Practical_13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mad_npracticals.R;

public class Notification_View extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_view);
        textView = findViewById(R.id.textView);
        //getting the notification message

        String message = getIntent().getStringExtra("message");
        textView.setText(message);
    }

}
