package com.codemybrainsout.onboarding;

import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by muskaankalra on 18/07/17.
 */

public class adminfragment1 extends Fragment {
    DatabaseHelper myDb;
    EditText editName, editpassword;
    Button btnAddData;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //Inflate our fragment into the container
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle
            savedInstanceState) {
        View v = inflater.inflate(R.layout.adminmenu1, parent, false);
        myDb = new DatabaseHelper(getActivity());

        editName = (EditText) v.findViewById(R.id.editText);
        editpassword = (EditText) v.findViewById(R.id.editText2);
        btnAddData = (Button) v.findViewById(R.id.button);

        AddData();

        return v;

    }

    public void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editName.getText().toString(),
                                editpassword.getText().toString());
                        if (isInserted == true)

                            Toast.makeText(getActivity().getApplicationContext(), "data inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(getActivity().getApplicationContext(), "data not inserted", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }






}
