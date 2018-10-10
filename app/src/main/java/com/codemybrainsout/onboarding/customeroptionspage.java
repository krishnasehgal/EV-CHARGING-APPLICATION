package com.codemybrainsout.onboarding;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class customeroptionspage extends Activity implements AdapterView.OnItemSelectedListener{
    RadioButton fastcharge, slowcharge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customeroptionspage);
        // Spinner element

        final Spinner spinner = (Spinner) findViewById(R.id.choosestation);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Select");
        categories.add("A: PGCIL Charge");
        categories.add("B: Township 43 Charge");
        categories.add("C: Township 46 Charge");
        categories.add("D: PAL Manesar Charge");
        categories.add("E: EIL Charge");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        fastcharge = (RadioButton) findViewById(R.id.fastcharging);
        slowcharge = (RadioButton) findViewById(R.id.slowcharging);

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        //final Spinner spinner2 = (Spinner) findViewById(R.id.chooseslot);
        //final Spinner spinner = (Spinner) findViewById(R.id.choosestation);

        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.fastcharging:
                if (checked) {
                    Button your = (Button) findViewById(R.id.slot);

                    your.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Intent intent = (new Intent(customeroptionspage.this, Gridfile.class));
                            startActivity(intent);


                        }


                    });
                }
                break;
            //spinner2.setOnItemSelectedListener(this);

            //List<String> categories2 = new ArrayList<String>();
            //categories2.add("Select");
            //categories2.add("10AM-12PM        50%");
            //categories2.add("12PM-2PM         50%");
            //categories2.add("2PM-4PM          50%");
            //categories2.add("4PM-6PM          50%");
            //categories2.add("6PM-8PM          50%");
            //categories2.add("8PM-10PM         50%");
            //categories2.add("10AM-2PM        100%");
            //categories2.add("2PM-6PM         100%");
            //categories2.add("6PM-10PM        100%");
            //categories2.add("10PM-2AM        100%");
            //ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);

            // Drop down layout style - list view with radio button
            //dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            //spinner2.setAdapter(dataAdapter);


            case R.id.slowcharging:
                if (checked) {
                    Button your = (Button) findViewById(R.id.slot);

                    your.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            Intent intent = (new Intent(customeroptionspage.this, Gridfile2.class));
                            startActivity(intent);


                        }


                    });
                }
                break;

            //spinner2.setOnItemSelectedListener(this);

            //List<String> categories3 = new ArrayList<String>();
            //categories3.add("Select");
            //categories3.add("10AM-2PM          50%");
            //categories3.add("2PM-6PM           50%");
            //categories3.add("6PM-10PM          50%");
            //categories3.add("10PM-2AM          50%");
            //categories3.add("2AM-6AM           50%");
            //categories3.add("6AM-10AM          50%");
            //categories3.add("10AM-6PM         100%");
            //categories3.add("6PM-2AM          100%");
            //categories3.add("2AM-10AM         100%");
            //ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories3);

            // Drop down layout style - list view with radio button
            //dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // attaching data adapter to spinner
            //spinner2.setAdapter(dataAdapter2);



            // Button yourButton = (Button) findViewById(R.id.book);

            //yourButton.setOnClickListener(new View.OnClickListener() {
            // public void onClick(View v) {
            //      Intent intent = (new Intent(customeroptionspage.this, Bookingpage.class));
            //    intent.putExtra("data", String.valueOf(spinner.getSelectedItem()));
            //  intent.putExtra("data2", String.valueOf(spinner2.getSelectedItem()));
            //startActivity(intent);
            //     }
            // });
            //break;

        }}



    @Override
    public void onItemSelected (AdapterView < ? > parent, View view,int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "" + item, Toast.LENGTH_LONG).show();
        // An item was selected. You can retrieve the selected item using

        parent.getItemAtPosition(position);





    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub


    }}



