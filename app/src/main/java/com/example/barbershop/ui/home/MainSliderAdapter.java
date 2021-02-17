package com.example.barbershop.ui.home;

import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class MainSliderAdapter extends SliderAdapter {
    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public void onBindImageSlide(int position, ImageSlideViewHolder imageSlideViewHolder) {
        switch (position) {
            case 0:
                imageSlideViewHolder.bindImageSlide("https://blackpoint-barbershop.com/wp-content/uploads/2021/01/LOOKBOOK-6-scaled-400x600.jpg");
                break;
            case 1:
                imageSlideViewHolder.bindImageSlide("https://blackpoint-barbershop.com/wp-content/uploads/2021/01/LOOKBOOK-5-scaled-400x600.jpg");
                break;
            case 2:
                imageSlideViewHolder.bindImageSlide("https://blackpoint-barbershop.com/wp-content/uploads/2021/01/LOOKBOOK-29-scaled-400x600.jpg");
                break;
        }
    }
}
