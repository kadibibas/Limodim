package com.example.kadibibas.limodim;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menu);


        final TextView tvAdvserch = (TextView) findViewById(R.id.tvAdvserch);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        final TextView tvProfil = (TextView) findViewById(R.id.tvProfil);
        final TextView textView8 = (TextView) findViewById(R.id.textView8);
        final TextView tvLogout = (TextView) findViewById(R.id.tvLogout);
        final TextView tvLogin = (TextView) findViewById(R.id.tvLogin);



        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Menu.this, User.class);
                Menu.this.startActivity(registerIntent);
            }
        });
        {

        }

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Menu.this, Login.class);
                Menu.this.startActivity(registerIntent);
            }
        });
        {

        }

        tvProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Menu.this, kesher.class);
                Menu.this.startActivity(registerIntent);
            }
        });
        {

        }
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(Menu.this, about.class);
                Menu.this.startActivity(registerIntent);
            }
        });
        {

        }


        TextView tvLogout1 = (TextView) findViewById(R.id.tvLogout);
        tvLogout1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }
}
