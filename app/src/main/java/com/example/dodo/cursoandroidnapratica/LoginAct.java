package com.example.dodo.cursoandroidnapratica;import android.support.v7.app.AppCompatActivity;import android.os.Bundle;import com.facebook.FacebookSdk;public class LoginAct extends AppCompatActivity {    @Override    protected void onCreate(Bundle savedInstanceState) {        //super.onCreate(savedInstanceState);        //setContentView(R.layout.act_login);        super.onCreate(savedInstanceState);        FacebookSdk.sdkInitialize(getApplicationContext());        setContentView(R.layout.act_login);    }}