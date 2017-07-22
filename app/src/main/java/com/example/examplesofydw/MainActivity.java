package com.example.examplesofydw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button2)
    public void moveball_onClick(){
        Intent intent = new Intent(MainActivity.this, MoveBallActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button3)
    public void calculator_onClick(){
        Intent intent = new Intent(MainActivity.this, MyCalculatorActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button)
    public void notification_onClick(){
        Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button4)
    public void popup_onClick(){
        Intent intent = new Intent(MainActivity.this, PopwindowActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.button5)
    public void datatimePickerDialog_onClick(){
        Intent intent = new Intent(MainActivity.this, DatetimePickerDialogActivity.class);
        startActivity(intent);
    }
}
