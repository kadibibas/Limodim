package com.example.kadibibas.limodim;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Register extends Activity {

    Button cPro;
    TextView mItemSelected;
    String[] listItems;
    boolean[] checkedItems;
    ArrayList<Integer> mUserItems= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);

        cPro = (Button) findViewById(R.id.choosePro);
        mItemSelected = (TextView) findViewById(R.id.tvItemSelected);
        listItems= getResources().getStringArray(R.array.ProItem);
        checkedItems= new boolean[listItems.length];

        cPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder= new AlertDialog.Builder(Register.this);
                mBuilder.setTitle("סמן את מקצועות הלימוד");
                mBuilder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if (isChecked){
                            if(! mUserItems.contains(position)){
                                mUserItems.add(position);
                            }
                        }else if (mUserItems.contains(position)){
                            mUserItems.remove(position);
                        }
                    }
                });
                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("אשר", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item= "";
                        for(int i=0;i<mUserItems.size();i++ ){
                            item = item + listItems[mUserItems.get(i)];
                            if(i != mUserItems.size() -1){
                                item = item + ", ";
                            }
                        }
                        mItemSelected.setText(item);
                    }
                });

                mBuilder.setNegativeButton("בטל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                mBuilder.setNeutralButton("נקה הכל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for(int i = 0; i<checkedItems.length; i++){
                            checkedItems[i]= false;
                            mUserItems.clear();
                            mItemSelected.setText("לא נבחרו מקצועות");
                        }
                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

            }
        });


        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPassword = (EditText) findViewById(R.id.etpassword);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPhone = (EditText) findViewById(R.id.etPhone);
        final EditText etcity = (EditText) findViewById(R.id.etcity);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = etEmail.getText().toString();
                final String password = etPassword.getText().toString();
                final String Name = etName.getText().toString();
                final String city = etcity.getText().toString();
                final String phone_num = etPhone.getText().toString();

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
