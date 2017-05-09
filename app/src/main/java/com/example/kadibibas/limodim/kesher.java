package com.example.kadibibas.limodim;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;


public class kesher extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesher);

        final Button button2 = (Button) findViewById(R.id.button2);
        final Button kadi = (Button) findViewById(R.id.kadi);


        final Button Phone = (Button) findViewById(R.id.imageButton2);
        Phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sIntent = new Intent(Intent.ACTION_CALL);
                sIntent.setData(Uri.parse("tel:0545377335"));
                if (ActivityCompat.checkSelfPermission(kesher.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(sIntent);

            }
            });




        kadi.setText(Html.fromHtml("<a href=\"mailto:kadibibas@gmail.com\">.</a>"));
        kadi.setMovementMethod(LinkMovementMethod.getInstance());


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(kesher.this, MainActivity.class);
                kesher.this.startActivity(registerIntent);
            }
        });


    }

}
