package com.example.examplesofydw;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.PopupWindow;
import android.widget.TimePicker;

import java.util.Calendar;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DatetimePickerDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_time_pickerdialog);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void data_onClick(){
        Calendar c = Calendar.getInstance();
        new DatePickerDialog(DatetimePickerDialogActivity.this,
                new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

            }
        }, c.get(Calendar.YEAR)
        ,c.get(Calendar.MONTH)
        ,c.get(Calendar.DAY_OF_MONTH)).show();

    }

    @OnClick(R.id.button1)
    public void time_onClick(){
        Calendar c = Calendar.getInstance();
        new TimePickerDialog(DatetimePickerDialogActivity.this,
        new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            }
        },c.get(Calendar.HOUR_OF_DAY)
                ,c.get(Calendar.MINUTE)
                //true表示采用24小时制
                ,true).show();
    }
}
