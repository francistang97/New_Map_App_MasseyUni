package com.mapbox.mapboxandroiddemo.examples.annotations;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import com.mapbox.mapboxandroiddemo.R;
        import com.mapbox.mapboxsdk.Mapbox;
        import com.mapbox.mapboxsdk.annotations.MarkerOptions;
        import com.mapbox.mapboxsdk.geometry.LatLng;
        import com.mapbox.mapboxsdk.maps.MapView;
        import com.mapbox.mapboxsdk.maps.MapboxMap;
        import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class DrawMarkerActivity extends AppCompatActivity {

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

        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.732373, 174.700930))
                .title("QB Building Computer Labs")
                .snippet("All the labs locate at QB basement. Postgraduate students only: CLQB2, CLQB3 (24 Hour Card Access Only). CLQB1, CLQB4 and CLQB5 are opening 8am - 10pm on weekdays, 12noon - 6pm on weekends."));

        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.732995, 174.700933))
                .title("Atrium Building Computer Labs")
                .snippet("AT1:LL2.25 (36 computers, lower level 2) and AT2:LL2.39 (13 computers, lower level 2) are only opening 9am - 6pm on weekdays."));

        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.733836, 174.701035))
                .title("Mathmatical Science Building Computer Labs")
                .snippet("IIMS5:L1.19 (19 computers) and IIMS6:L1.11 (22 computers) locate at MS Building level 1 and only open 9am - 6pm weekdays."));

        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.733393, 174.700761))
                .title("General Library Computer Lab")
                .snippet("Same opening hours to the general library: Mon - Thur 8am - 11pm, Fri - Sun 10am - 8pm."));

        mapboxMap.addMarker(new MarkerOptions()
                .position(new LatLng(-36.7346813, 174.6931656))
                .title("Building 106 Labs on Oteha Rohe Campus")
                .snippet("B106.18 (16 computers) and B106.2 and CL-B106.3 (42 computers) are only opening 8am - 5pm."));

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