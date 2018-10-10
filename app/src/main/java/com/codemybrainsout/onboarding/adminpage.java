package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by muskaankalra on 15/07/17.
 */

public class adminpage  extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);

        Button signin = (Button) findViewById(R.id.adminsignin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInIntent = new Intent(adminpage.this, adminsignin.class);
                startActivity(signInIntent);
            }
        });

    }
}
