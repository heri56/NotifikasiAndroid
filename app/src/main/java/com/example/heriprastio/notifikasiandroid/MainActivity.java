package com.example.heriprastio.notifikasiandroid;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String CHANNEL_ID = "Alert";
    private String texttile = "Pemberitahuan";
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.ButtonShow);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.notif);
        final NotificationCompat.Builder mbuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.notif)
                .setContentTitle(texttile)
                .setContentText("Much longer cannot")
                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
               notificationManager.notify(001, mbuilder.build());

            }
        });
    }
}
