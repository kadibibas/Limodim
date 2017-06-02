package com.example.kadibibas.limodim;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.TimerTask;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Timer;
import java.util.TimerTask;

public class User extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_user);

        ImageView Profilimage = (ImageView) findViewById(R.id.imageView4);
        Profilimage.setImageResource(R.drawable.noam);

        ImageView mail = (ImageView) findViewById(R.id.imageView5);
        mail.setImageResource(R.drawable.ic_email_black_24dp);

        ImageView tel = (ImageView) findViewById(R.id.imageView6);
        tel.setImageResource(R.drawable.telephone);

        ImageView stars = (ImageView) findViewById(R.id.imageView8);
        stars.setImageResource(R.drawable.rating2);

        final Button opinion = (Button) findViewById(R.id.button5);
        opinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opinionIntent = new Intent(User.this, opinion.class);
                User.this.startActivity(opinionIntent);
            }
        });

        final Button refer = (Button) findViewById(R.id.button3);
        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent referIntent = new Intent(User.this, Refer.class);
                User.this.startActivity(referIntent);
            }
        });

        final Button schedule = (Button) findViewById(R.id.button4);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scheduleIntent = new Intent(User.this, Schedule.class);
                User.this.startActivity(scheduleIntent);
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


