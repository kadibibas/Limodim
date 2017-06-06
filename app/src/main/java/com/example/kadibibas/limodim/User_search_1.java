package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class User_search_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search_1);

        final ImageButton back14 = (ImageButton)findViewById(R.id.back14);

        back14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(User_search_1.this, Search.class);
                User_search_1.this.startActivity(registerIntent);
            }
        });

        final ImageButton next = (ImageButton)findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(User_search_1.this, User_search_2.class);
                User_search_1.this.startActivity(registerIntent);
            }
        });

        final Button bt11 = (Button) findViewById(R.id.bt11);
        bt11.setText(Html.fromHtml("<a href=\"mailto:itainagar@gmail.com\">פניה למורה</a>"));
        bt11.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
