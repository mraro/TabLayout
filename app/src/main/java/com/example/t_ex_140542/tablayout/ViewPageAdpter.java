package com.example.t_ex_140542.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t-ex-140542 on 28/02/2018.
 */

public class ViewPageAdpter extends FragmentPagerAdapter{

    private final List<Fragment> fragmentsList = new ArrayList<>();
    private final List<String> FragmentListTitle = new ArrayList<>();

    public ViewPageAdpter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentListTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitle.get(position);
    }

    public void addFragment(Fragment fragment, String Title)
    {
        fragmentsList.add(fragment);
        FragmentListTitle.add(Title);
    }
}
