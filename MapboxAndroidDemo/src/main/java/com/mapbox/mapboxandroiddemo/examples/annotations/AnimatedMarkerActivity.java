package com.mapbox.mapboxandroiddemo.examples.annotations;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mapbox.mapboxandroiddemo.R;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.annotations.MarkerViewOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class AnimatedMarkerActivity extends AppCompatActivity {

  private MapView mapView;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Mapbox access token is configured here. This needs to be called either in your application
    // object or in the same activity which contains the mapview.
    Mapbox.getInstance(this, getString(R.string.access_token));

    // This contains the MapView in XML and needs to be called after the account manager
    setContentView(R.layout.activity_annotation_marker);

    mapView = (MapView) findViewById(R.id.mapView);
    mapView.onCreate(savedInstanceState);
    mapView.getMapAsync(new OnMapReadyCallback() {
      @Override
      public void onMapReady(MapboxMap mapboxMap) {

        Icon icon_blue = IconFactory.getInstance(AnimatedMarkerActivity.this).fromResource(R.drawable.blue_marker);
        Icon icon_red = IconFactory.getInstance(AnimatedMarkerActivity.this).fromResource(R.drawable.red_marker);
        Icon icon_yellow = IconFactory.getInstance(AnimatedMarkerActivity.this).fromResource(R.drawable.yellow_marker);
        Icon icon_green = IconFactory.getInstance(AnimatedMarkerActivity.this).fromResource(R.drawable.green_marker);

        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.731719, 174.700027))
                .title("Staff Parking")
                .snippet("Staff parking only.")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.732300, 174.700167))
                .title("Staff Parking")
                .snippet("Staff parking only.")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.733838, 174.700644))
                .title("Staff Parking")
                .snippet("Staff parking only.")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.731952, 174.704127))
                .title("General Student Parking")
                .snippet("Free parking for students and visitors")
                .icon(icon_yellow));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.733229, 174.703580))
                .title("General Student Parking")
                .snippet("Free parking for students and visitors")
                .icon(icon_yellow));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.733741, 174.704771))
                .title("General Student Parking")
                .snippet("Free parking for students and visitors")
                .icon(icon_yellow));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.735239, 174.694263))
                .title("General Student Parking")
                .snippet("Free parking for students and visitors")
                .icon(icon_yellow));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.732644, 174.702140))
                .title("Car Pool Area (shared parking)")
                .snippet("Car Pool only. Two ASA Car Pool cards need to be displayed.")
                .icon(icon_blue));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.732675, 174.701763))
                .title("Visitor Parking")
                .snippet("Vistor parking on the car pool area. 20 mins limit.")
                .icon(icon_red));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.734149, 174.702507))
                .title("Accommodation Parking")
                .snippet("Free parking for campus residents only.")
                .icon(icon_red));

      }
    });
  }

  @Override
  public void onResume() {
    super.onResume();
    mapView.onResume();
  }

  @Override
  protected void onStart() {
    super.onStart();
    mapView.onStart();
  }

  @Override
  protected void onStop() {
    super.onStop();
    mapView.onStop();
  }

  @Override
  public void onPause() {
    super.onPause();
    mapView.onPause();
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    mapView.onSaveInstanceState(outState);
  }

  @Override
  public void onLowMemory() {
    super.onLowMemory();
    mapView.onLowMemory();
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    mapView.onDestroy();
  }
}