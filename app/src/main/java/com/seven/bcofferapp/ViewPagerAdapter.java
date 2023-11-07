package com.seven.bcofferapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.seven.bcofferapp.fragment.IndividualFragment;
import com.seven.bcofferapp.fragment.MerchantFragment;
import com.seven.bcofferapp.fragment.ProfessionalFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {


    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new IndividualFragment();
            case 1:
                return new ProfessionalFragment();
            case 2:
                return new MerchantFragment();
            default:
                return new IndividualFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
