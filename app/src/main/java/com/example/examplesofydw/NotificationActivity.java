package com.example.examplesofydw;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 状态栏弹出通知
 */
public class NotificationActivity extends AppCompatActivity {

    static final int NOTIFICATION_ID = 0X123;
    NotificationManager nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        ButterKnife.bind(this);
        nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    }
    @OnClick(R.id.button)
    public void send(){
        Intent intent = new Intent(NotificationActivity.this, MoveBallActivity.class);
        Intent[] intents = new Intent[]{intent};
        PendingIntent pi = PendingIntent.getActivities(NotificationActivity.this, 0, intents, 0);
        Notification notification = new Notification.Builder(this)
                .setAutoCancel(true)
                .setTicker("新消息")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("一条新通知")
                .setContentText("随便弹出点东西")
                .setDefaults(Notification.DEFAULT_SOUND/*|Notification.DEFAULT_VIBRATE*/)//这句不能少，否则会闪退
                .setVibrate(new long[]{0, 50, 100, 150, 500})//震动
                .setContentIntent(pi)
                .setWhen(System.currentTimeMillis())
                .build();
        nm.notify(NOTIFICATION_ID, notification);
    }

    @OnClick(R.id.button1)
    public void cancel(){
        nm.cancel(NOTIFICATION_ID);
    }
}
