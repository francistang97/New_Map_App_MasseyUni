package com.mapbox.mapboxandroiddemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.mapbox.mapboxandroiddemo.adapter.ExampleAdapter;
import com.mapbox.mapboxandroiddemo.examples.annotations.AnimatedMarkerActivity;
import com.mapbox.mapboxandroiddemo.examples.annotations.DrawCustomMarkerActivity;
import com.mapbox.mapboxandroiddemo.examples.annotations.DrawMarkerActivity;
import com.mapbox.mapboxandroiddemo.examples.basics.SimpleMapViewActivity;
import com.mapbox.mapboxandroiddemo.examples.basics.SupportMapFragmentActivity;
import com.mapbox.mapboxandroiddemo.examples.location.BasicUserLocation;
import com.mapbox.mapboxandroiddemo.examples.mas.DirectionsActivity;
import com.mapbox.mapboxandroiddemo.examples.mas.GeocodingActivity;
import com.mapbox.mapboxandroiddemo.examples.query.SelectBuildingActivity;
import com.mapbox.mapboxandroiddemo.examples.styles.BasicExtrusionActivity;
import com.mapbox.mapboxandroiddemo.examples.styles.ColorSwitcherActivity;
import com.mapbox.mapboxandroiddemo.examples.styles.DefaultStyleActivity;
import com.mapbox.mapboxandroiddemo.examples.styles.LanguageSwitchActivity;
import com.mapbox.mapboxandroiddemo.model.ExampleItemModel;
import com.mapbox.mapboxandroiddemo.utils.ItemClickSupport;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

  private ArrayList<ExampleItemModel> exampleItemModel;
  private ExampleAdapter adapter;
  private int currentCategory = R.id.nav_basics;
  private RecyclerView recyclerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    exampleItemModel = new ArrayList<>();

    // Create the adapter to convert the array to views
    adapter = new ExampleAdapter(this, exampleItemModel);
    // Attach the adapter to a ListView
    recyclerView = (RecyclerView) findViewById(R.id.details_list);
    if (recyclerView != null) {
      recyclerView.setHasFixedSize(true);
      recyclerView.setLayoutManager(new LinearLayoutManager(this));
      recyclerView.setAdapter(adapter);
    }
    if (savedInstanceState == null) {
      listItems(R.id.nav_basics);
    } else {
      currentCategory = savedInstanceState.getInt("CURRENT_CATEGORY");
      listItems(currentCategory);
    }

    ItemClickSupport.addTo(recyclerView).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
      @Override
      public void onItemClicked(RecyclerView recyclerView, int position, View view) {
        if (currentCategory == R.id.nav_lab && position == 0) {
          return;
        } else if (currentCategory == R.id.nav_mas && position == 0) {
          return;
        }
        startActivity(exampleItemModel.get(position).getActivity());
      }
    });

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
      this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    if (drawer != null) {
      drawer.addDrawerListener(toggle);
    }
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    if (navigationView != null) {
      navigationView.setNavigationItemSelectedListener(this);
      navigationView.setCheckedItem(R.id.nav_basics);
    }
  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer != null) {
      if (drawer.isDrawerOpen(GravityCompat.START)) {
        drawer.closeDrawer(GravityCompat.START);
      } else {
        moveTaskToBack(true);
      }
    }
  }

  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id != currentCategory) {
      listItems(id);
    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer != null) {
      drawer.closeDrawer(GravityCompat.START);
    }
    return true;
  }

  private void listItems(int id) {
    exampleItemModel.clear();
    switch (id) {
      case R.id.nav_styles:
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_style_default_title,
          R.string.activity_style_default_description,
          new Intent(MainActivity.this, DefaultStyleActivity.class),
          R.string.activity_style_default_url
        ));
        currentCategory = R.id.nav_styles;
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_styles_color_switcher_title,
          R.string.activity_styles_color_switcher_description,
          new Intent(MainActivity.this, ColorSwitcherActivity.class),
          R.string.activity_styles_color_switcher_url
        ));
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_styles_langauge_switch_title,
          R.string.activity_styles_langauge_switch_description,
          new Intent(MainActivity.this, LanguageSwitchActivity.class),
          R.string.activity_styles_langauge_switch_url
        ));
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_style_basic_extrusions_title,
          R.string.activity_style_basic_extrusions_description,
          new Intent(MainActivity.this, BasicExtrusionActivity.class),
          R.string.activity_style_basic_extrusions_url
        ));
        break;
      case R.id.nav_annotations:
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_annotation_marker_title,
          R.string.activity_annotation_marker_description,
          new Intent(MainActivity.this, DrawMarkerActivity.class),
          R.string.activity_annotation_marker_url
        ));
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_annotation_custom_marker_title,
          R.string.activity_annotation_custom_marker_description,
          new Intent(MainActivity.this, DrawCustomMarkerActivity.class),
          R.string.activity_annotation_custom_marker_url
        ));
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_annotation_animated_marker_title,
          R.string.activity_annotation_animated_marker_description,
          new Intent(MainActivity.this, AnimatedMarkerActivity.class),
          R.string.activity_annotation_animated_marker_url
        ));
        currentCategory = R.id.nav_annotations;
        break;

      case R.id.nav_query_map:
        exampleItemModel.add(null);
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_query_select_building_title,
          R.string.activity_query_select_building_description,
          new Intent(MainActivity.this, SelectBuildingActivity.class),
          R.string.activity_query_select_building_url
        ));
        currentCategory = R.id.nav_query_map;
        break;
      case R.id.nav_mas:
        exampleItemModel.add(null);
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_mas_directions_title,
          R.string.activity_mas_directions_description,
          new Intent(MainActivity.this, DirectionsActivity.class),
          R.string.activity_mas_directions_url
        ));
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_mas_geocoding_title,
          R.string.activity_mas_geocoding_description,
          new Intent(MainActivity.this, GeocodingActivity.class),
          R.string.activity_mas_geocoding_url
        ));
        currentCategory = R.id.nav_mas;
        break;
      case R.id.nav_location:
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_location_basic_title,
          R.string.activity_location_basic_description,
          new Intent(MainActivity.this, BasicUserLocation.class),
          R.string.activity_location_basic_image_url
        ));
        currentCategory = R.id.nav_location;
        break;


      default:
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_basic_simple_mapview_title,
          R.string.activity_basic_simple_mapview_description,
          new Intent(MainActivity.this, SimpleMapViewActivity.class),
          R.string.activity_basic_simple_mapview_url
        ));
        exampleItemModel.add(new ExampleItemModel(
          R.string.activity_basic_support_map_frag_title,
          R.string.activity_basic_support_map_frag_description,
          new Intent(MainActivity.this, SupportMapFragmentActivity.class),
          R.string.activity_basic_support_map_frag_url
        ));
        currentCategory = R.id.nav_basics;
        break;
    }
    adapter.notifyDataSetChanged();

    // Scrolls recycler view back to top.
    LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
    layoutManager.scrollToPositionWithOffset(0, 0);
  }

  public int getCurrentCategory() {
    return currentCategory;
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate toolbar items
    getMenuInflater().inflate(R.menu.menu_activity_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_info) {
      new MaterialStyledDialog.Builder(MainActivity.this)
        .setTitle(getString(R.string.info_dialog_title))
        .setDescription(getString(R.string.info_dialog_description))
        .setIcon(R.mipmap.ic_launcher)
        .setHeaderColor(R.color.mapboxBlue)
        .withDivider(true)
        .setPositiveText(getString(R.string.info_dialog_positive_button_text))
        .onPositive(new MaterialDialog.SingleButtonCallback() {
          @Override
          public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.massey.ac.nz"));
            startActivity(intent);
          }
        })
        .setNegativeText(getString(R.string.info_dialog_negative_button_text))
        .onNegative(new MaterialDialog.SingleButtonCallback() {
          @Override
          public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
          }
        })
        .show();
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt("CURRENT_CATEGORY", currentCategory);
  }
}
