package com.example.kadibibas.limodim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        ImageView mail = (ImageView) findViewById(R.id.imageView55);
        mail.setImageResource(R.drawable.ic_email_black_24dp);

        ImageView tel = (ImageView) findViewById(R.id.imageView66);
        tel.setImageResource(R.drawable.call);

        ImageView stars = (ImageView) findViewById(R.id.imageView88);
        stars.setImageResource(R.drawable.rating2);

                back3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent registerIntent = new Intent(Main_User.this, MainActivity.class);
                        Main_User.this.startActivity(registerIntent);
                    }
                });




    }

}
