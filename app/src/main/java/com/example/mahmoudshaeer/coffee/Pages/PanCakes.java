package com.example.mahmoudshaeer.coffee.Pages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.mahmoudshaeer.coffee.R;
import com.example.mahmoudshaeer.coffee.adapters.PancakesAdapter;
import com.example.mahmoudshaeer.coffee.models.PancakesInformation;

import java.util.ArrayList;
import java.util.List;

public class PanCakes extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan_cakes);


        listView = (ListView) findViewById(R.id.ListPancakes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        List arr = new ArrayList<PancakesInformation>();
        String title = "Pan Cakes";
        String details = "Lorem ipsum dolor sit amet,consectuer adipisicing elit ";
        String M = "M";
        String L = "L";
        String PriceM = "25";
        String priceL = "20";
        int idleft = R.drawable.juice1;
        int idright = R.drawable.juice2;

        PancakesInformation information = new PancakesInformation(idleft, idright, title, title, details, details, M, M,
                PriceM, PriceM, L, L, priceL, priceL);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        Log.e("error her ", ""+arr.size());
        PancakesAdapter PanCake = new PancakesAdapter(this, arr);
        listView.setAdapter(PanCake);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}