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

import com.example.mahmoudshaeer.coffee.models.Juice_Information;
import com.example.mahmoudshaeer.coffee.R;

import java.util.List;

/**
 * Created by mahmoud Shaeer on 5/6/2017.
 */

public class JuiceAdapter extends ArrayAdapter<Juice_Information>{

    List<Juice_Information> arr;
    boolean isPressed=true;
    boolean isPressed2=true;

    Context context;
    public JuiceAdapter(@NonNull Context context, @NonNull List<Juice_Information> objects) {
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

        Juice_Information item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.juice_row, parent, false);
       //     Log.e("this null ? ","get View");

        }
        //------------------------First Row-----------------
        //--------------catch fields in the acivity -----------

        ImageView imageViewLeft=(ImageView) convertView.findViewById(R.id.JuiceimageRight);
        TextView tvtitleleft = (TextView) convertView.findViewById(R.id.JuicetextView5);
        TextView tvDetailsleft = (TextView) convertView.findViewById(R.id.JuicetextView6);
        TextView tvmleft = (TextView) convertView.findViewById(R.id.JuicetextView8);
        TextView tvmPriceleft = (TextView) convertView.findViewById(R.id.JuicetextView7);
        TextView tvLleft = (TextView) convertView.findViewById(R.id.JuicetextView9);
        TextView tvLpriceleft = (TextView) convertView.findViewById(R.id.Juicecost_L);

        imageViewLeft.setImageResource(R.drawable.juice1);
         Log.e("this null ? ","Lol");
        tvtitleleft.setText(item.getJuicegetTitleLeft());

        tvDetailsleft.setText(item.getJuiceDetailsLeft());
        tvmleft.setText(item.getJuiceMLeft());
        tvmPriceleft.setText(item.getJuiceMpriceLeft());
        tvLleft.setText(item.getJuicelLeft());
        tvLpriceleft.setText(item.getJuicelpriceLeft());
        final ImageView imageViewLike=(ImageView) convertView.findViewById(R.id.Juicelike);
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

        ImageView imageViewRigth=(ImageView) convertView.findViewById(R.id.JuiceimageLeft);
        TextView tvtitleRight = (TextView) convertView.findViewById(R.id.JuiceCupcakestxt );
        TextView tvDetailsRight = (TextView) convertView.findViewById(R.id.JuiceDetalis2);
        TextView tvmRight = (TextView) convertView.findViewById(R.id.Juicemediam2);
        TextView tvmPriceRight = (TextView) convertView.findViewById(R.id.Juicemediam2price);
        TextView tvLRight = (TextView) convertView.findViewById(R.id.Juicelarg2);
        TextView tvLpriceRight = (TextView) convertView.findViewById(R.id.Juicecost_L2);

        imageViewRigth.setImageResource(R.drawable.juice2);
        tvtitleRight.setText(item.getJuicetitleright());
        tvDetailsRight.setText(item.getJuiceDetailsRight());

        tvmRight.setText(item.getJuiceMLeft());
        tvmPriceRight.setText(item.getJuiceMpriceLeft());
        tvLRight.setText(item.getJuicelLeft());
        tvLpriceRight.setText(item.getJuicelpriceLeft());

        final ImageView imageViewLike2=(ImageView) convertView.findViewById(R.id.Juicelike2);
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
