package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by muskaankalra on 15/07/17.
 */

public class evstationpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evstationpage);

        Button signin = (Button) findViewById(R.id.evstationsignin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = new Intent(evstationpage.this, evstationsignin.class);
                startActivity(signInIntent);
            }
        });

    }
}
