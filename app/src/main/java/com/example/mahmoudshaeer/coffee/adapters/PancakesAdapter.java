package com.example.mahmoudshaeer.coffee.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mahmoudshaeer.coffee.models.PancakesInformation;
import com.example.mahmoudshaeer.coffee.R;

import java.util.List;

/**
 * Created by mahmoud Shaeer on 5/7/2017.
 */

public class PancakesAdapter extends ArrayAdapter<PancakesInformation> {


    List<PancakesInformation> arr;
    boolean isPressed=true;
    boolean isPressed2=true;

    Context context;
    public PancakesAdapter(@NonNull Context context, @NonNull List<PancakesInformation> objects) {
        super(context, 0,objects);
        Log.e("this null ? ","Constarctor");
        arr=objects;
        this.context=context;
        Log.e("this null ? ",""+arr.size());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //   return super.getView(position, convertView, parent);
        Log.e("this null ? ","get View call");
        //return  null;

        PancakesInformation item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.pan_cakes_row, parent, false);
            //     Log.e("this null ? ","get View");

        }
        //------------------------First Row-----------------
        //--------------catch fields in the acivity -----------

        ImageView imageViewLeft=(ImageView) convertView.findViewById(R.id.PanCakeimageRight);
        TextView tvtitleleft = (TextView) convertView.findViewById(R.id.PanCaketextView5);
        TextView tvDetailsleft = (TextView) convertView.findViewById(R.id.PanCaketextView6);
        TextView tvmleft = (TextView) convertView.findViewById(R.id.PanCaketextView8);
        TextView tvmPriceleft = (TextView) convertView.findViewById(R.id.PanCaketextView7);
        TextView tvLleft = (TextView) convertView.findViewById(R.id.PanCaketextView9);
        TextView tvLpriceleft = (TextView) convertView.findViewById(R.id.PanCakecost_L);

        imageViewLeft.setImageResource(R.drawable.pan1);
        Log.e("this null ? ","Lol");
        tvtitleleft.setText(item.getPanCakestTitleLeft());

        tvDetailsleft.setText(item.getPanCakesDetailsLeft());
        tvmleft.setText(item.getPanCakesMLeft());
        tvmPriceleft.setText(item.getPanCakesMpriceLeft());
        tvLleft.setText(item.getPanCakeslLeft());
        tvLpriceleft.setText(item.getPanCakeslpriceLeft());
        final ImageView imageViewLike=(ImageView) convertView.findViewById(R.id.PanCakelike);
        imageViewLike.setBackgroundResource(R.drawable.like);

        imageViewLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed){
                    v.setBackgroundResource(R.drawable.likeclick);
                    Toast.makeText(context, "Added in the Favourit", Toast.LENGTH_SHORT).show();
                    //------------------ send this object
                }else{
                    v.setBackgroundResource(R.drawable.like);
                    Toast.makeText(context, "Remove From Favourit", Toast.LENGTH_SHORT).show();
                    //----------------- send this opbject
                }
                isPressed = !isPressed; // reverse
            }
        });

        //-------------------------------secound Row ------------------------------

        ImageView imageViewRigth=(ImageView) convertView.findViewById(R.id.PanCakeimageLeft);
        TextView tvtitleRight = (TextView) convertView.findViewById(R.id.PanCakeCupcakestxt );
        TextView tvDetailsRight = (TextView) convertView.findViewById(R.id.PanCakeDetalis2);
        TextView tvmRight = (TextView) convertView.findViewById(R.id.PanCakemediam2);
        TextView tvmPriceRight = (TextView) convertView.findViewById(R.id.PanCakemediam2price);
        TextView tvLRight = (TextView) convertView.findViewById(R.id.PanCakelarg2);
        TextView tvLpriceRight = (TextView) convertView.findViewById(R.id.PanCakecost_L2);

        imageViewRigth.setImageResource(R.drawable.pan2);
        tvtitleRight.setText(item.getPanCakestitleright());
        tvDetailsRight.setText(item.getPanCakesDetailsRight());

        tvmRight.setText(item.getPanCakesMLeft());
        tvmPriceRight.setText(item.getPanCakesMpriceLeft());
        tvLRight.setText(item.getPanCakeslLeft());
        tvLpriceRight.setText(item.getPanCakeslpriceLeft());

        final ImageView imageViewLike2=(ImageView) convertView.findViewById(R.id.PanCakelike2);
        imageViewLike2.setBackgroundResource(R.drawable.like);
        imageViewLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isPressed2){
                    v.setBackgroundResource(R.drawable.likeclick);
                    Toast.makeText(context, "Added in the Favourit", Toast.LENGTH_SHORT).show();
                    //------------------ send this object
                }else{
                    v.setBackgroundResource(R.drawable.like);
                    Toast.makeText(context, "Remove From Favourit", Toast.LENGTH_SHORT).show();
                    //----------------- send this opbject
                }
                isPressed2 = !isPressed2; // reverse
            }
        });

        return convertView;
    }
}
