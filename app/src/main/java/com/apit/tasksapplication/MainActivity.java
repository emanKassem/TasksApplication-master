package com.apit.tasksapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.apit.tasksapplication.MvpInterfaces.MvpInterface;

public class MainActivity extends AppCompatActivity implements MvpInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
