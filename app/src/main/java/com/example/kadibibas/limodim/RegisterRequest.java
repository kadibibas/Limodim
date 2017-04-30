package com.example.kadibibas.limodim;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kadi Bibas on 28/04/2017.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "booziest-debts.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String email, String password, String Name, String city, String phone_num, Response.Listener<String>listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);
        params.put("Name", Name);
        params.put("city", city);
        params.put("phone_num", phone_num);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}