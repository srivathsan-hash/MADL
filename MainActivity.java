package com.example.srivathsan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bn1;
    Button bn2;
    Button bn3;
    TextView display;
    Toast t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn1 = (Button) findViewById(R.id.bn1);
        bn2 = (Button) findViewById(R.id.bn2);
        bn3 = (Button) findViewById(R.id.bn3);
        display = (TextView) findViewById(R.id.textView);
        t = Toast.makeText(this,"buttons are working",Toast.LENGTH_LONG);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setTextSize(50);
                t.show();

            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setTextColor(Color.GREEN);
                t.show();
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                display.setBackgroundColor(Color.RED);
                t.show();
            }
        });







    }
}