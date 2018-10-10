package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by muskaankalra on 14/07/17.
 */

public class chooseoption extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseoption);

        Button customerButton = (Button) findViewById(R.id.customer);
        Button evstationButton = (Button) findViewById(R.id.evstation);
        Button adminButton = (Button) findViewById(R.id.admin);

        customerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent customerIntent = new Intent(chooseoption.this, customerpage.class);
                startActivity(customerIntent);
            }
        });

        evstationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent evstationIntent = new Intent(chooseoption.this, evstationpage.class);
                startActivity(evstationIntent);
            }
        });

        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adminIntent = new Intent(chooseoption.this, adminpage.class);
                startActivity(adminIntent);

            }
        });

}}
