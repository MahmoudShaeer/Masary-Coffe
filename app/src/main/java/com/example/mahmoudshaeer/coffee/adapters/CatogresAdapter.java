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

import com.example.mahmoudshaeer.coffee.models.Catogries_Item_Information;
import com.example.mahmoudshaeer.coffee.R;

import java.util.List;

/**
 * Created by mahmoud Shaeer on 5/5/2017.
 */


public class CatogresAdapter extends ArrayAdapter<Catogries_Item_Information> {

    List <Catogries_Item_Information> arr;

    Context context;
    public CatogresAdapter(@NonNull Context context, @NonNull List<Catogries_Item_Information> objects) {
        super(context, 0,objects);
        arr=objects;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
     //   return super.getView(position, convertView, parent);
        Catogries_Item_Information item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_catogres, parent, false);
        }
        // Lookup view for data population
        final ImageView imageView2=(ImageView) convertView.findViewById(R.id.imageView);
        TextView tvtitle = (TextView) convertView.findViewById(R.id.textView4);
        TextView tvDetalis= (TextView) convertView.findViewById(R.id.details);
        // Populate the data into the template view using the data object

        tvtitle.setText(item.getTitle());
        tvDetalis.setText(item.getDetails());
        imageView2.setImageResource(item.getIdImage());

        return convertView;
    }
}
