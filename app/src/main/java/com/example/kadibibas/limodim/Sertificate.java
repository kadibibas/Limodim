package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Sertificate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sertificate);
        final ImageButton back17 = (ImageButton)findViewById(R.id.back17);

        back17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Sertificate.this, Schedule.class);
                Sertificate.this.startActivity(registerIntent);
            }
        });

        final TextView quit = (TextView) findViewById(R.id.textView28);

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Sertificate.this, MainActivity.class);
                Sertificate.this.startActivity(registerIntent);
            }
        });


    }
}
