package com.codemybrainsout.onboarding;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by muskaankalra on 18/07/17.
 */

public class cusfragment3 extends Fragment {

    private View v;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      View  v = inflater.inflate(R.layout.charge,container, false);
        configureImageButton();
        ImageButton btn = (ImageButton)v.findViewById(R.id.imageButton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent signInIntent = new Intent(getActivity(), MapsMarkerActivity.class);
                startActivity(signInIntent);
            }
        });


        return v;
    }

    private void configureImageButton() {
        // TODO Auto-generated method stub


    } }

