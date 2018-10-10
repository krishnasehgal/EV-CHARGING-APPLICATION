package com.codemybrainsout.onboarding;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by muskaankalra on 18/07/17.
 */

public class cusfragment1 extends Fragment {
    //private static final String TAG = evfragment1.class.getSimpleName();

    public TextView playerName, playerStatus, playerScore;

    //private Button quizStartButton;


    View myView;
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.profile, container, false);
        getActivity().setTitle("Home");

        playerName = (TextView)myView.findViewById(R.id.player_name);
        playerStatus = (TextView)myView.findViewById(R.id.player_status);
        playerScore = (TextView)myView.findViewById(R.id.player_score);
        SharedPreferences pref = myView.getContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        playerName.setText(pref.getString("key_name","nothing"));



        return myView;
    }

}
