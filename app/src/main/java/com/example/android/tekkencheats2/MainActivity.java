package com.example.android.tekkencheats2;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setTabGravity(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(pagerAdapter.getTabView(i));
        }




    }
    class PagerAdapter extends FragmentPagerAdapter {

        String tabTitles[] = new String[]{"Tab One", "Tab Two", "Tab Three", "Tab Four", "Tab Five"};
        Context context;

        public PagerAdapter(FragmentManager fm, Context context) {
            super(fm);
            this.context = context;
        }

        @Override
        public int getCount() {
            return tabTitles.length;
        }

        @Override
        public Fragment getItem(int position) {

            // add new categories here
            switch (position) {
                case 0:
                    return new Categ1();
                case 1:
                    return new Categ1();
                case 2:
                    return new Categ1();
                case 3:
                    return new Categ1();
                case 4:
                    return new Categ1();
            }

            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            return tabTitles[position];
        }

        public View getTabView(int position) {
            View tab = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_tab, null);
            TextView tv = (TextView) tab.findViewById(R.id.custom_text);
            tv.setText(tabTitles[position]);
            return tab;
        }
    }
}
