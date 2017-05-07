package com.example.mahmoudshaeer.coffee.Pages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.mahmoudshaeer.coffee.R;
import com.example.mahmoudshaeer.coffee.adapters.JuiceAdapter;
import com.example.mahmoudshaeer.coffee.models.Juice_Information;

import java.util.ArrayList;
import java.util.List;

public class juice extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juice);
        listView = (ListView) findViewById(R.id.ListJuice);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        List arr = new ArrayList<Juice_Information>();
        String title = "Juice";
        String details = "Lorem ipsum dolor sit amet,consectuer adipisicing elit ";
        String M = "M";
        String L = "L";
        String PriceM = "25";
        String priceL = "20";
        int idleft = R.drawable.juice1;
        int idright = R.drawable.juice2;

        Juice_Information information = new Juice_Information(idleft, idright, title, title, details, details, M, M,
                PriceM, PriceM, L, L, priceL, priceL);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        Log.e("error her ", ""+arr.size());
        JuiceAdapter Juice = new JuiceAdapter(this, arr);
        listView.setAdapter(Juice);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}