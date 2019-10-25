package com.sadataljony.app.android.demo.showtoast;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Statement for showing Toast
        Toast.makeText(MainActivity.this, "Toast Working Pretty Well", Toast.LENGTH_LONG).show();
        // context is your current Activity
        // what text or string you want to show place in text. it may be any literal or string comes from any variable or object
        // LENGTH_LONG is the showing time. LENGTH_LONG for more time and LENGTH_SHORT for less time
        // finally show() method. it's very very important to add show() at the end of the statement. otherwise your toast show nothing
    }
}
