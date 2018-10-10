package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by muskaankalra on 17/07/17.
 */

public class customersignin extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText editName, editpassword;
    Button b1,b2,btnlogin;
    EditText ed1,ed2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customersignin);

        b1 = (Button) findViewById(R.id.clogin);
        ed1 = (EditText) findViewById(R.id.cusername);
        ed2 = (EditText) findViewById(R.id.cpassword);
        myDb = new DatabaseHelper(this);
        login();
        // b2 = (Button)findViewById(R.id.ccustomer);
    }
    public void login() {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDb = new DatabaseHelper(customersignin.this);

                Cursor res = myDb.logincheck(ed1.getText().toString(),ed2.getText().toString());

                if (res.getCount() == 0) {
                    // show message
                    Toast.makeText(getApplicationContext(), "Please Enter Valid name and password", Toast.LENGTH_SHORT).show();
                    return;

                } else {

                    while (res.moveToNext()) {


                        SharedPreferences pref = view.getContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                        SharedPreferences.Editor editor = pref.edit();
                        editor.putString("key_name", res.getString(0)); // Storing string
                        editor.putString("key_password", res.getString(1));
                        editor.commit();
                        Intent in = new Intent(view.getContext(), customerhome.class);
                        startActivity(in);
                    }
                }
            }
        });


        }}
