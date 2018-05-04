package com.example.abdel.egyptguide;

public class Images {
    private int mAPlaceName;
    private int mImageView;

    Images(int placeName, int image) {

        mAPlaceName = placeName;
        mImageView = image;
    }

    public int getmPlacesName() {
        return mAPlaceName;
    }

    public int getImageResourceId() {
        return mImageView;
    }
}
