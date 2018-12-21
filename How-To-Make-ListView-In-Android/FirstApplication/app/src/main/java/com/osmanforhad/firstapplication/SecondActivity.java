package com.osmanforhad.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button b, b2;
    //This is the Main Method for 2nd Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Click on First Button", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Click on Second Button", Toast.LENGTH_SHORT).show();
    }

    //Third Button
    public void myButton(View v){
        Toast.makeText(getApplicationContext(), "Click on Third Button", Toast.LENGTH_SHORT).show();
    }
}
