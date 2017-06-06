package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class User1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1_1);




        final ImageButton back12 = (ImageButton)findViewById(R.id.back12);

        back12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(User1_1.this, TopTen.class);
                User1_1.this.startActivity(registerIntent);
            }
        });

        final Button bt5 = (Button) findViewById(R.id.bt5);
        bt5.setText(Html.fromHtml("<a href=\"mailto:itainagar@gmail.com\">פניה למורה</a>"));
        bt5.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
