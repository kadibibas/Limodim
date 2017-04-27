package com.example.kadibibas.limodim;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class User extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_user);

        final EditText etname = (EditText) findViewById(R.id.etname);
        final EditText etphone = (EditText) findViewById(R.id.etphone);
        final EditText etAddress = (EditText) findViewById(R.id.etAddress);
        final EditText etProfession = (EditText) findViewById(R.id.etProfession);
        final TextView tvname = (TextView) findViewById(R.id.tvname);
        final TextView tvphone = (TextView) findViewById(R.id.tvphone);
        final TextView tvProfession = (TextView) findViewById(R.id.tvProfession);
        final TextView tvAddress = (TextView) findViewById(R.id.tvAddress);


    }
}
