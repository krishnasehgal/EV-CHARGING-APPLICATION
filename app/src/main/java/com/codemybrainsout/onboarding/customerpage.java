package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by muskaankalra on 15/07/17.
 */

public class customerpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerpage);

        Button signin = (Button)findViewById(R.id.customersignin);
        Button signup = (Button)findViewById(R.id.customersignup);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = new Intent(customerpage.this, customersignin.class);
                startActivity(signInIntent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent signUpIntent = new Intent(LoginOptionActivity.this, SignUpActivity.class);
                //startActivity(signUpIntent);
            }
        });
}}
