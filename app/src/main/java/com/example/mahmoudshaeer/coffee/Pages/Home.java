package com.example.mahmoudshaeer.coffee.Pages;

import android.app.SearchManager;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.mahmoudshaeer.coffee.R;
import com.example.mahmoudshaeer.coffee.adapters.CatogresAdapter;
import com.example.mahmoudshaeer.coffee.models.Catogries_Item_Information;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private  DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mtoggle;
    private List<Catogries_Item_Information> all_item_catorges=new ArrayList<>();
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        listView =(ListView)findViewById(R.id.ListCatogeries);
        mtoggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int id = R.drawable.lol;
        int id2=R.drawable.loll;
        Catogries_Item_Information catogries_item_information=new Catogries_Item_Information("Title","Lorem ipsum dolor sit amet , consectetur adipiscing elit , sed do eilusmod tempor incididunt ut"
        ,id);
        Catogries_Item_Information catogries_item_information2=new Catogries_Item_Information("Title","Lorem ipsum dolor sit amet , consectetur adipiscing elit , sed do eilusmod tempor incididunt ut"
                ,id2);
        all_item_catorges.add(catogries_item_information);
        all_item_catorges.add(catogries_item_information2);
        all_item_catorges.add(catogries_item_information);
        all_item_catorges.add(catogries_item_information2);
        all_item_catorges.add(catogries_item_information);
        all_item_catorges.add(catogries_item_information2);
        CatogresAdapter catogresAdapter=new CatogresAdapter(this,all_item_catorges);
        listView.setAdapter(catogresAdapter);


        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //

        if(mtoggle.onOptionsItemSelected(item))
        {
            return true;
        }
        int id = item.getItemId();
         if(id==R.id.feedback)
        {
         //   Intent intent = new Intent(this, CupCakes.class);
       //     startActivity(intent);
            gotofeedback();
        }
        else if(id==R.id.logout)
         {
             gotoFirstbahe();
         }
         /*else if(id==R.id.cup_cakesnav)
         {
             goToCupcakesPage();
         }
         */


        return super.onOptionsItemSelected(item);
    }



    private void gotoFirstbahe() {
        Intent view = new Intent(this,First_Page.class);
        startActivity(view);

    }

    private void gotofeedback() {
        Intent view = new Intent(this,feedback.class);
        startActivity(view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        /*
        final SearchView search = (SearchView) menu.findItem(R.id.action_search).getActionView();
    search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String s) {
            return false;
        }

        @Override
        public boolean onQueryTextChange(String s) {
            return false;
        }
    });
         */
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        if (id == R.id.cup_cakesnav) {
            // Handle the camera action
        //    Log.e("cross","navigation");
            Intent intent = new Intent(Home.this, CupCakes.class);
            startActivity(intent);
        }
        else if(id == R.id.juice_nav)
        {
            Intent intent = new Intent(Home.this, juice.class);
            startActivity(intent);
        }
        else if(id==R.id.Pan_cakesnav)
        {
            Intent intent = new Intent(Home.this, PanCakes.class);
            startActivity(intent);
        }

        return true;
    }
}
