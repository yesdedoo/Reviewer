package com.example.dell.reviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void GotoLogin()
    {
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }

}
