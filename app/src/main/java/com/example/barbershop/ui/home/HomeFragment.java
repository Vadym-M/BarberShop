package com.example.barbershop.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.barbershop.R;
import com.example.barbershop.ui.home.PagerFragments.AboutFragment;
import com.example.barbershop.ui.home.PagerFragments.GalleryFragment;
import com.example.barbershop.ui.home.PagerFragments.ReviewFragment;
import com.example.barbershop.ui.home.PagerFragments.ServicesFragment;
import com.google.android.material.tabs.TabLayout;

import ss.com.bannerslider.Slider;

public class HomeFragment extends Fragment {
    Slider slider;
    ViewPager viewPager;
    TabLayout tabLayout;
    FragmentActivity fragmentActivity;
    NestedScrollView nestedScrollView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager = root.findViewById(R.id.view_pager);
        tabLayout = root.findViewById(R.id.tabLayout);
        nestedScrollView = root.findViewById(R.id.nest_scrollView);

        AboutFragment aboutFragment = new AboutFragment();
        GalleryFragment galleryFragment = new GalleryFragment();
        ReviewFragment reviewFragment = new ReviewFragment();
        ServicesFragment servicesFragment = new ServicesFragment();
        FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), 0);
        viewPagerAdapter.addFragment(servicesFragment, "Services");
        viewPagerAdapter.addFragment(new AboutFragment(), "About");
        viewPagerAdapter.addFragment(galleryFragment, "Gallery");
        viewPagerAdapter.addFragment(reviewFragment, "Review");

        viewPager.setAdapter(viewPagerAdapter);
        CardView cardView = root.findViewById(R.id.cardOrder);
        //cardView.setVisibility(View.GONE);
        slider = root.findViewById(R.id.homeBanner);
        Slider.init(new PicassoLoadService());
        slider.setAdapter(new MainSliderAdapter());
        final TextView textView = root.findViewById(R.id.text_home);

        nestedScrollView.setFillViewport(true);
        return root;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        fragmentActivity = (FragmentActivity) context;
        super.onAttach(context);
    }
}