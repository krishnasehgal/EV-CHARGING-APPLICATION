package com.codemybrainsout.onboarding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Bookingpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingpage);

        TextView textView=(TextView) findViewById(R.id.textView3);
        Bundle bundle=getIntent().getExtras();
        String data=bundle.get("data").toString();
        textView.setText(data);
        TextView textView2=(TextView) findViewById(R.id.textView4);
        Bundle bundle2=getIntent().getExtras();
        String data2=bundle2.get("data2").toString();
        textView2.setText(data2);

    }
}
