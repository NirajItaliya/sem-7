package com.example.mad_npracticals.Practical_13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.mad_npracticals.R;

public class Practical_13 extends AppCompatActivity {
    Button button;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical13);
        button = findViewById(R.id.btnNotify);


        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                    NotificationChannel channel = new NotificationChannel("MyNotifications", "MyNotifications", NotificationManager.IMPORTANCE_DEFAULT);
                    NotificationManager manager = getSystemService(NotificationManager.class);
                    manager.createNotificationChannel(channel);
                }

                NotificationCompat.Builder builder =

                        new NotificationCompat.Builder(Practical_13.this, "MyNotifications")

                                .setSmallIcon(R.drawable.user1) //set icon for notification

                                .setContentTitle("MAD Practicl_13 finish") //set title of notification

                                .setContentText("You have a notification  message!!")//this is notification message

                                .setAutoCancel(true)

                                .setPriority(NotificationCompat.PRIORITY_HIGH);//	makes	auto	cancel	of


                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(Practical_13.this);
                managerCompat.notify(999, builder.build());
            }

        });

    }

}
