package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class User1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1_2);

        final ImageButton back13 = (ImageButton)findViewById(R.id.back13);

        back13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(User1_2.this, TopTen.class);
                User1_2.this.startActivity(registerIntent);
            }
        });



        final Button bt8 = (Button) findViewById(R.id.bt8);
        bt8.setText(Html.fromHtml("<a href=\"mailto:noamgoren@gmail.com\">פניה למורה</a>"));
        bt8.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
