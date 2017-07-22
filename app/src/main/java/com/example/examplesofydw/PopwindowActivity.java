package com.example.examplesofydw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class PopwindowActivity extends AppCompatActivity {

    PopupWindow popup;
    View root;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);
        ButterKnife.bind(this);
        root = getLayoutInflater().inflate(R.layout.moveball, null);
        popup = new PopupWindow(root, 560, 720);
    }

    @OnClick(R.id.button)
    public void pop_onClick(){
//        popup.showAsDropDown(root);
        popup.showAtLocation(findViewById(R.id.button), Gravity.CENTER, 20, 20);
    }

    @OnClick(R.id.button1)
    public void cancel_onClick(){
        popup.dismiss();
    }
}
