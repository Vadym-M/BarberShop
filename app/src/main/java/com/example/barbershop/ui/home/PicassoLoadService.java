package com.example.barbershop.ui.home;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ss.com.bannerslider.ImageLoadingService;

public class PicassoLoadService implements ImageLoadingService {
   // Context context;
    public PicassoLoadService() {
       // this.context = context;
    }

    @Override
    public void loadImage(String url, ImageView imageView) {
        Picasso.get().load(url).fit().into(imageView);
    }

    @Override
    public void loadImage(int resource, ImageView imageView) {
        Picasso.get().load(resource).fit().into(imageView);
    }

    @Override
    public void loadImage(String url, int placeHolder, int errorDrawable, ImageView imageView) {
        Picasso.get().load(url).placeholder(placeHolder).error(errorDrawable).fit().into(imageView);
    }
}
