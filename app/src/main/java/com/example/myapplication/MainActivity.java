package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button c,t;
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        c=findViewById(R.id.countbutton);
        t=findViewById(R.id.toastbutton);


    }

    public void count(View view) {
        a++;
        tv.setText(String.valueOf(a));
    }

    public void toast(View view) {
        Toast.makeText(this,"Toaast !",Toast.LENGTH_SHORT).show();

    }
}