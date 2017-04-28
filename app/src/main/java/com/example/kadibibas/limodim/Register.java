package com.example.kadibibas.limodim;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Register extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPassword = (EditText) findViewById(R.id.etpassword);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        final EditText etProfession = (EditText) findViewById(R.id.etProfession);
        final EditText etcity = (EditText) findViewById(R.id.etcity);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = etEmail.getText().toString();
                final String password = etPassword.getText().toString();
                final String Name = etName.getText().toString();
                final String city = etcity.getText().toString();
                final String phone_num = etEmail.getText().toString();

                final Response.Listener<String> responseListener = new Response.Listener<String>()
                {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jesonResponse = new JSONObject(response);
                            boolean success = jesonResponse.getBoolean("success");

                            if (success)
                            {
                                Intent intent = new Intent(Register.this, Login.class);
                                Register.this.startActivity(intent);
                            }
                            else
                            {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Register.this);
                                builder.setMessage("ההרשמה נכשלה").setNegativeButton("נסה שנית", null).create().show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(email, password, Name, city, phone_num, responseListener);
                RequestQueue queue = Volley.newRequestQueue(Register.this);
                queue.add(registerRequest);
            }
        });


    }
}
