package com.codemybrainsout.onboarding;

import android.app.Fragment;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by muskaankalra on 18/07/17.
 */

public class adminfragment2 extends Fragment {

    DatabaseHelper myDb;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //Inflate our fragment into the container
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle
            savedInstanceState) {
        View v = inflater.inflate(R.layout.adminmenu2, parent, false);
        myDb = new DatabaseHelper(getActivity());

        Cursor res = myDb.getAllData();

        if(res.getCount() == 0) {
            // show message
            Toast.makeText(getActivity().getApplicationContext(), "No Data Found", Toast.LENGTH_SHORT).show();
            return v;
        }
        TableLayout prices = (TableLayout)v.findViewById(R.id.TableLayout);

        prices.setStretchAllColumns(true);
        prices.bringToFront();
        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {

            buffer.append("Name :"+ res.getString(0)+"\n");
            buffer.append("Password :"+ res.getString(1)+"\n");

            TableRow tr =  new TableRow(v.getContext());
            TextView c1 = new TextView(v.getContext());
            c1.setText(String.valueOf(res.getString(0)));
            TextView c2 = new TextView(v.getContext());
            c2.setText(String.valueOf(res.getString(1)));
            tr.addView(c1);
            tr.addView(c2);
            prices.addView(tr);
        }

        return v;

    }
}
