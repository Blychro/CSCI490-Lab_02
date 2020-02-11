package com.example.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private ImageView superMoon;
    private ImageView waterfall;

    final Intent intent = new Intent();
    private int imgId;
    private int RESPONSE_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Intent intent = new Intent(this, MainActivity.class);

        superMoon = findViewById(R.id.supermoon);
        waterfall = findViewById(R.id.waterfall);

        superMoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.supermoon;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
            }
        });

        waterfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgId = R.drawable.waterfall;

                intent.putExtra("imgId", imgId);
                setResult(RESPONSE_CODE, intent);
                finish();
            }
        });
    }



    //protected void onActivityResult(int requestCode, int resultCode, Intent data) {



    //}

}
