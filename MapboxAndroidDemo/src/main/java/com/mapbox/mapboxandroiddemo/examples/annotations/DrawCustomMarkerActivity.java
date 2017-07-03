package com.mapbox.mapboxandroiddemo.examples.annotations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mapbox.mapboxandroiddemo.R;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class DrawCustomMarkerActivity extends AppCompatActivity {

  private MapView mapView;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Mapbox access token is configured here. This needs to be called either in your application
    // object or in the same activity which contains the mapview.
    Mapbox.getInstance(this, getString(R.string.access_token));

    // This contains the MapView in XML and needs to be called after the account manager
    setContentView(R.layout.activity_annotation_custom_marker);

    mapView = (MapView) findViewById(R.id.mapView);
    mapView.onCreate(savedInstanceState);
    mapView.getMapAsync(new OnMapReadyCallback() {
      @Override
      public void onMapReady(MapboxMap mapboxMap) {

        // Create Icon objects for the marker to use
        Icon icon_purple = IconFactory.getInstance(DrawCustomMarkerActivity.this).fromResource(R.drawable.purple_marker);
        Icon icon_green = IconFactory.getInstance(DrawCustomMarkerActivity.this).fromResource(R.drawable.green_marker);

        // Add recycle bins to the map

        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7343852, 174.7011146))
                .title("Recycle Bin")
                .snippet("A recycle bin allows people to throw recyclable rubbish")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7341812, 174.6932173))
                .title("Recycle Bin")
                .snippet("A recycle bin allows people to throw recyclable rubbish")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7344564, 174.6933783))
                .title("Recycle Bin")
                .snippet("A recycle bin allows people to throw recyclable rubbish")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7340185, 174.6927107))
                .title("Recycle Bin")
                .snippet("A recycle bin allows people to throw recyclable rubbish")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7332558, 174.6930309))
                .title("Recycle Bin")
                .snippet("A recycle bin allows people to throw recyclable rubbish")
                .icon(icon_green));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7322393, 174.7010796))
                .title("Recycle Bin")
                .snippet("A recycle bin allows people to throw recyclable rubbish")
                .icon(icon_green));

        //Markers for normal bins
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7314596, 174.7001732))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7317019, 174.7003929))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7316847, 174.7012673))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7319475, 174.700707))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7322479, 174.7012298))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7322904, 174.7009934))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7324672, 174.7012405))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7327294, 174.7013585))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7327036, 174.7009347))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7325744, 174.7018649))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7327294, 174.7013585))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7329213, 174.7012488))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7330734, 174.7015141))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7334157, 174.7014156))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7334775, 174.70116))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7336194, 174.7008435))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7335315, 174.7002665))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7336839, 174.7011922))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7337312, 174.7014658))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7335702, 174.7016801))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7338558, 174.7016643))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7338478, 174.7021446))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7334302, 174.7020559))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7340834, 174.7020232))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.733327, 174.7029518))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7333101, 174.7032572))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7333337, 174.7041718))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7334695, 174.7034106))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7338668, 174.7037695))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7341616, 174.7026972))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7342798, 174.7021795))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7345442, 174.7026569))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7347992, 174.7027367))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7348366, 174.7028071))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7349398, 174.7029251))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7347742, 174.7020963))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7345283, 174.7020715))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.734368, 174.7020266))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7343809, 174.7010798))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7343919, 174.6936036))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7344134, 174.6933032))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7340142, 174.6930701))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7336095, 174.692521))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7332311, 174.6931047))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7345207, 174.6920268))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7346367, 174.692346))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7349312, 174.6936931))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7350393, 174.6944303))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7351361, 174.694504))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));
        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7353405, 174.6938663))
                .title("Normal Rubish Bin")
                .snippet("A normal rubbish bin in the campus")
                .icon(icon_purple));


      }
    });
  }

  @Override
  public void onResume() {
    super.onResume();
    mapView.onResume();
  }

  @Override
  public void onPause() {
    super.onPause();
    mapView.onPause();
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
  public void onLowMemory() {
    super.onLowMemory();
    mapView.onLowMemory();
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    mapView.onSaveInstanceState(outState);
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    mapView.onDestroy();
  }
}