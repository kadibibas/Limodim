package com.example.kadibibas.limodim;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class kesher extends  AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesher);

        final Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(kesher.this, MainActivity.class);
                kesher.this.startActivity(registerIntent);
            }
        });


        /*Toolbar my_Toolbar = (Toolbar) findViewById(R.id.mCustomToolbar);
        setSupportActionBar(my_Toolbar);

        setSupportActionBar(my_Toolbar);

        getSupportActionBar().setTitle("");
        getSupportActionBar();
        */
    }

}
