package com.example.abdel.egyptguide;

import android.graphics.drawable.Drawable;

public class Images {
    private int mAPlaceName;
    private int imageView;

    Images(int placeName,int image) {

        mAPlaceName = placeName;
        imageView = image;
    }

    public int getmPlacesName() {
        return mAPlaceName;
    }

    public int getImageView() {
        return imageView;
    }


}
