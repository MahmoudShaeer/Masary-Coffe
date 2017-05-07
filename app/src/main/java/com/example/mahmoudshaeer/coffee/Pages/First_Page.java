package com.example.mahmoudshaeer.coffee.Pages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mahmoudshaeer.coffee.R;

public class First_Page extends AppCompatActivity {

    private Button btn_feedBack;
    private Button btn_iamHungry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__page);
        btn_feedBack=(Button)findViewById(R.id.btn_feedBack);
        btn_iamHungry=(Button)findViewById(R.id.btn_iamHungry);

    }

    public void GoPageFeedBack(View view) {
        Intent intent=new Intent(this,feedback.class);
        startActivity(intent);
    }

    public void GoPageHome(View view) {
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
