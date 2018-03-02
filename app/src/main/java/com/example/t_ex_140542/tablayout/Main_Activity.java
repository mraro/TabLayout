package com.example.t_ex_140542.tablayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main_Activity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        tabLayout = (TabLayout) findViewById(R.id.tablayoutId);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarId);
        viewPager = (ViewPager) findViewById(R.id.viewPageId);

        ViewPageAdpter adpter = new
                ViewPageAdpter(getSupportFragmentManager());

        adpter.addFragment(new Fragment_Quiz(),"Quiz");
        adpter.addFragment(new Fragment(),"Explorer");
        adpter.addFragment(new Fragment(),"Store");

        viewPager.setAdapter(adpter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
