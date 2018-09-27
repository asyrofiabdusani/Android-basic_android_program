package com.example.asyrofiabdusani.birthdaycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView bacgroundImg;
    private TextView textCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bacgroundImg = (ImageView) findViewById(R.id.bc);
        textCard = (TextView) findViewById(R.id.tx);

        bacgroundImg.setImageResource(R.drawable.bacground_2);
        textCard.setText("HBD Maya");
    }
}
