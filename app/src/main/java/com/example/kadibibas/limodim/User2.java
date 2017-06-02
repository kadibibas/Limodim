package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class User2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_user2);

        ImageView Profilimage = (ImageView) findViewById(R.id.imageView44);
        Profilimage.setImageResource(R.drawable.itai);

        ImageView mail = (ImageView) findViewById(R.id.imageView55);
        mail.setImageResource(R.drawable.ic_email_black_24dp);

        ImageView tel = (ImageView) findViewById(R.id.imageView66);
        tel.setImageResource(R.drawable.telephone);

        ImageView stars = (ImageView) findViewById(R.id.imageView88);
        stars.setImageResource(R.drawable.rating2);

        final Button opinion = (Button) findViewById(R.id.button55);
        opinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opinionIntent = new Intent(User2.this, opinion.class);
                User2.this.startActivity(opinionIntent);
            }
        });

        final Button refer = (Button) findViewById(R.id.button33);
        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent referIntent = new Intent(User2.this, Refer.class);
                User2.this.startActivity(referIntent);
            }
        });

        final Button schedule = (Button) findViewById(R.id.button44);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scheduleIntent = new Intent(User2.this, Schedule.class);
                User2.this.startActivity(scheduleIntent);
            }
        });


    }

/*
        final EditText etname = (EditText) findViewById(R.id.etname);
        final EditText etphone = (EditText) findViewById(R.id.etphone);
        final EditText etAddress = (EditText) findViewById(R.id.etAddress);
        final EditText etProfession = (EditText) findViewById(R.id.etProfession);
        final TextView tvname = (TextView) findViewById(R.id.tvname);
        final TextView tvphone = (TextView) findViewById(R.id.tvphone);
        final TextView tvProfession = (TextView) findViewById(R.id.tvProfession);
        final TextView tvAddress = (TextView) findViewById(R.id.tvAddress);
*/


}