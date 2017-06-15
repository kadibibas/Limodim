package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

        public class Main_User extends AppCompatActivity {



            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                requestWindowFeature(Window.FEATURE_NO_TITLE);
                setContentView(R.layout.activity_main__user);




                final ImageButton back3 = (ImageButton)findViewById(R.id.back3);
                ImageView Profilimage = (ImageView) findViewById(R.id.imageView44);
                Profilimage.setImageResource(R.drawable.kadi);

                final Button bt3 = (Button)findViewById(R.id.bt3);
                bt3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent registerIntent = new Intent(Main_User.this, opinion.class);
                        Main_User.this.startActivity(registerIntent);
                    }
                });


                ImageView mail = (ImageView) findViewById(R.id.imageView55);
                mail.setImageResource(R.drawable.ic_email_black_24dp);

                ImageView tel = (ImageView) findViewById(R.id.imageView66);
                tel.setImageResource(R.drawable.call);

                ImageView stars = (ImageView) findViewById(R.id.imageView88);
                stars.setImageResource(R.drawable.rating2);

                back3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent registerIntent = new Intent(Main_User.this, TopTen.class);
                        Main_User.this.startActivity(registerIntent);
                    }
                });

                final Button bt2 = (Button) findViewById(R.id.bt2);
                bt2.setText(Html.fromHtml("<a href=\"mailto:kadibibas@gmail.com\">פניה למורה</a>"));
                bt2.setMovementMethod(LinkMovementMethod.getInstance());



                final Button bt1 = (Button)findViewById(R.id.bt1);

                bt1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent registerIntent = new Intent(Main_User.this, Schedule.class);
                        Main_User.this.startActivity(registerIntent);
                    }
                });






    }

}
