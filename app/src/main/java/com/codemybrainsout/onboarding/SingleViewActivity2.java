package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SingleViewActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view2);
        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter2 imageAdapter = new ImageAdapter2(this);

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

    }
}
