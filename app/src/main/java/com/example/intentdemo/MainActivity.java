package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraint;
    private Button button;
    private int REQUEST_CODE = 1;
    private int RESPONSE_CODE = 1;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = "Click the button";

        constraint = findViewById(R.id.layoutID);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        textView.setText(s);

        final Intent i = new Intent(this, Activity2.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(i, 1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE){
            if(resultCode == RESPONSE_CODE){
                textView.setText("I finished my round trip");
                int imgId = data.getExtras().getInt("imgId");

                constraint.setBackground(getDrawable(imgId));
            }
        }
    }
}
