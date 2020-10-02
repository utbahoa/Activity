package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                doOpenChildActivity();
            }
        });
    }
    public void doOpenChildActivity()
    {
        Intent myIntent=new Intent(this, ChildActivity.class);
        startActivity(myIntent);
    }

}