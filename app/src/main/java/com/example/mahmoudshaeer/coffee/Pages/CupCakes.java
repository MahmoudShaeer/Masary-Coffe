package com.example.mahmoudshaeer.coffee.Pages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.mahmoudshaeer.coffee.R;
import com.example.mahmoudshaeer.coffee.adapters.AdapterCupcakes;
import com.example.mahmoudshaeer.coffee.models.CupCakeInformation;

import java.util.ArrayList;
import java.util.List;

public class CupCakes extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cup_cakes);
     //   Toast.makeText(this, "here", Toast.LENGTH_SHORT).show();
        listView=(ListView)findViewById(R.id.ListCupcakes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        List arr=new ArrayList<CupCakeInformation>();
        String title="Cupcakes";
        String details="Lorem ipsum dolor sit amet,consectuer adipisicing elit ";
        String M="M";
        String L="L";
        String PriceM="25";
        String priceL="20";
        int idleft=R.drawable.cup1;
        int idright=R.drawable.cup2;

        CupCakeInformation information=new CupCakeInformation(idleft,idright,title,title,details,details,M,M,
                PriceM,PriceM,L,L,priceL,priceL);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        arr.add(information);
        arr.add(information);

        AdapterCupcakes cupcakes=new AdapterCupcakes(this,arr);
        listView.setAdapter(cupcakes);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
