package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class TopTen extends AppCompatActivity {

    ImageButton kadi,itai,noam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_ten);

        final ImageButton back4 = (ImageButton)findViewById(R.id.back4) ;
        kadi = (ImageButton)findViewById(R.id.icon);
        kadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kadi1Intent = new Intent(TopTen.this, Main_User.class);
                TopTen.this.startActivity(kadi1Intent);
            }
        });

        itai = (ImageButton)findViewById(R.id.icon2);
        itai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itai1Intent = new Intent(TopTen.this, User1_1.class);
                TopTen.this.startActivity(itai1Intent);
            }
        });
        noam = (ImageButton)findViewById(R.id.icon1);
        noam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noam1Intent = new Intent(TopTen.this, User1_2.class);
                TopTen.this.startActivity(noam1Intent);
            }
        });

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(TopTen.this, MainActivity.class);
                TopTen.this.startActivity(registerIntent);
            }
        });




    }



}
