package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by muskaankalra on 17/07/17.
 */

public class evstationsignin extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;


    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evstationsignin);

        b1 = (Button)findViewById(R.id.evLogin);
        ed1 = (EditText)findViewById(R.id.evusername);
        ed2 = (EditText)findViewById(R.id.evpassword);

       // b2 = (Button)findViewById(R.id.ccustomer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(evstationsignin.this, evhome.class));
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();



                }
            }
        });


    }
}

