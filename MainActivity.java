package com.example.songt.buttoncolorchangetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button colorChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorChange = (Button)findViewById(R.id.b1);
         colorChange.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 colorChange.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_button));
             }
         });
    }
}
