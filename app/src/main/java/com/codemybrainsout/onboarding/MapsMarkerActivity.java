package com.codemybrainsout.onboarding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsMarkerActivity extends FragmentActivity implements OnMapReadyCallback
         {

    public GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_marker);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng powergridtownship46 = new LatLng(28.437895, 77.057413);
        googleMap.addMarker(new MarkerOptions().position(powergridtownship46)
                .title("Powergrid Township Sector-46")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(28.435519, 77.032815), 11.5f));
        LatLng powergridtownship43 = new LatLng(28.454842, 77.074915);
        googleMap.addMarker(new MarkerOptions().position(powergridtownship43)
                .title("Powergrid Township Sector-43")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng powergridsector29 = new LatLng(28.473845, 77.071187);
        googleMap.addMarker(new MarkerOptions().position(powergridsector29)
                .title("Powergrid PGCIL")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng EILbuilding14 = new LatLng(28.466199, 77.052733);
        googleMap.addMarker(new MarkerOptions()
                .position(EILbuilding14)
                .title("EIL Building Sector-14")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng PALManesar = new LatLng(28.359936, 76.939881);
        googleMap.addMarker(new MarkerOptions().position(PALManesar)
                .title("PAL Manesar")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng A = new LatLng(28.467874, 77.068196);
        googleMap.addMarker(new MarkerOptions().position(A)
                .title("A: PGCIL Charge "));

        LatLng B = new LatLng(28.449961, 77.086022);
        googleMap.addMarker(new MarkerOptions().position(B)
                .title("B: Township 43 Charge"));

        LatLng C = new LatLng(28.433946, 77.063071);
        googleMap.addMarker(new MarkerOptions().position(C)
                .title("C: Township 46 Charge"));

        LatLng D = new LatLng(28.403287, 76.984291);
        googleMap.addMarker(new MarkerOptions().position(D)
                .title("D: PAL Manesar Charge"));

        LatLng E = new LatLng(28.460621, 77.048404);
        googleMap.addMarker(new MarkerOptions().position(E)
                .title("E: EIL Charge"));


        Button yourButton = (Button) findViewById(R.id.next);

        yourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MapsMarkerActivity.this, customeroptionspage.class));
            }
        });
    }
}
