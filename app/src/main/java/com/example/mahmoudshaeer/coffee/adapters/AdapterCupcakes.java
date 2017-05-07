package com.example.mahmoudshaeer.coffee.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mahmoudshaeer.coffee.models.CupCakeInformation;
import com.example.mahmoudshaeer.coffee.R;

import java.util.List;

/**
 * Created by mahmoud Shaeer on 5/6/2017.
 */

public class AdapterCupcakes extends ArrayAdapter<CupCakeInformation> {

    List<CupCakeInformation> arr;
    boolean isPressed=true;
    boolean isPressed2=true;

    Context context;
    public AdapterCupcakes(@NonNull Context context, @NonNull List<CupCakeInformation> objects) {
        super(context, 0,objects);
        arr=objects;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //   return super.getView(position, convertView, parent);
        CupCakeInformation item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cup_cakes_row, parent, false);
        }

        //------------------------First Row-----------------
            //--------------catch fields in the acivity -----------
            ImageView imageViewLeft=(ImageView) convertView.findViewById(R.id.imageRight);
            TextView tvtitleleft = (TextView) convertView.findViewById(R.id.textView5);
            TextView tvDetailsleft = (TextView) convertView.findViewById(R.id.textView6);
            TextView tvmleft = (TextView) convertView.findViewById(R.id.textView8);
            TextView tvmPriceleft = (TextView) convertView.findViewById(R.id.textView7);
            TextView tvLleft = (TextView) convertView.findViewById(R.id.textView9);
            TextView tvLpriceleft = (TextView) convertView.findViewById(R.id.cost_L);

            imageViewLeft.setImageResource(R.drawable.cup1);
      //  Log.e("this null ? ",item.getGetTitleLeft());
            tvtitleleft.setText(item.getGetTitleLeft());
            tvDetailsleft.setText(item.getDetailsLeft());
            tvmleft.setText(item.getMLeft());
            tvmPriceleft.setText(item.getMpriceLeft());
            tvLleft.setText(item.getlLeft());
            tvLpriceleft.setText(item.getLpriceLeft());

            final ImageView imageViewLike=(ImageView) convertView.findViewById(R.id.like);

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

        ImageView imageViewRigth=(ImageView) convertView.findViewById(R.id.imageLeft);
        TextView tvtitleRight = (TextView) convertView.findViewById(R.id.Cupcakestxt);
        TextView tvDetailsRight = (TextView) convertView.findViewById(R.id.Detalis2);
        TextView tvmRight = (TextView) convertView.findViewById(R.id.mediam2);
        TextView tvmPriceRight = (TextView) convertView.findViewById(R.id.mediam2price);
        TextView tvLRight = (TextView) convertView.findViewById(R.id.larg2);
        TextView tvLpriceRight = (TextView) convertView.findViewById(R.id.cost_L2);

        imageViewRigth.setImageResource(R.drawable.cup2);
        tvtitleRight.setText(item.getTitleright());
        tvDetailsRight.setText(item.getDetailsRight());

        tvmRight.setText(item.getMLeft());
        tvmPriceRight.setText(item.getMpriceLeft());
        tvLRight.setText(item.getlLeft());
        tvLpriceRight.setText(item.getLpriceLeft());

        final ImageView imageViewLike2=(ImageView) convertView.findViewById(R.id.like2);
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
