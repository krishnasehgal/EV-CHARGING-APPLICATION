package com.codemybrainsout.onboarding;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import static com.codemybrainsout.onboarding.R.id.button;

/**
 * Created by muskaankalra on 18/07/17.
 */

public class adminfragment4 extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.adminmenu4,container,false);

        Button button = (Button) myView.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getActivity(), piechart.class);
                startActivity(myintent);
            }
        });


         return myView;
    }


}
