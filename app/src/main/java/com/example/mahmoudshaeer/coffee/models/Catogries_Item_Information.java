package com.example.mahmoudshaeer.coffee.models;

import android.widget.ImageView;

/**
 * Created by mahmoud Shaeer on 5/5/2017.
 */

public class Catogries_Item_Information {
    String title;
    String details;
    int idImage;

    public Catogries_Item_Information() {
    }

    public Catogries_Item_Information(String title, String details,int idImage) {
        this.title = title;
        this.details = details;
        this.idImage=idImage;
   //     this.imageView = imageView;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

}
