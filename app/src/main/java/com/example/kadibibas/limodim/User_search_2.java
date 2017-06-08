package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class User_search_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search_2);

        final ImageButton back15 = (ImageButton)findViewById(R.id.back15);

        back15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(User_search_2.this, Search.class);
                User_search_2.this.startActivity(registerIntent);
            }
        });

        final ImageButton prev = (ImageButton)findViewById(R.id.prev);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(User_search_2.this, User_search_1.class);
                User_search_2.this.startActivity(registerIntent);
            }
        });

        final Button op = (Button)findViewById(R.id.bt15);
        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opIntent = new Intent(User_search_2.this, opinion.class);
                User_search_2.this.startActivity(opIntent);
            }
        });


        final Button bt14 = (Button) findViewById(R.id.bt14);
        bt14.setText(Html.fromHtml("<a href=\"mailto:noamgoren@gmail.com\">פניה למורה</a>"));
        bt14.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
