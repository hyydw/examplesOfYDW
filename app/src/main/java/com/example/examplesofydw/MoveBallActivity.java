package com.example.examplesofydw;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MoveBallActivity extends AppCompatActivity {

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moveball);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_mian, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        if(mi.isCheckable()){
            mi.setChecked(true);
        }
        switch (mi.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(this, MainActivity.class);
                //添加额外的FLAG，将Activity栈中处于MainActivity之上的Activity弹出
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            case R.id.plain_item:
                Intent intent2 = new Intent(this, PopwindowActivity.class);
                //添加额外的FLAG，将Activity栈中处于MainActivity之上的Activity弹出
                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent2);
                break;
        }
        return true;
    }
}
