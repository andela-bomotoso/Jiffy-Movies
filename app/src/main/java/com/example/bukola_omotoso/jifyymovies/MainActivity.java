package com.example.bukola_omotoso.jifyymovies;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initializeScreen();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void initializeScreen()  {
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("ACTION"));
        tabLayout.addTab(tabLayout.newTab().setText("CARTOON"));
        tabLayout.addTab(tabLayout.newTab().setText("SCIENCE FRICTION"));

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        SectionPagerAdapter sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(sectionPagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    public class SectionPagerAdapter extends FragmentStatePagerAdapter  {
        int no_Of_Tabs;

    public SectionPagerAdapter(FragmentManager fm, int no_Of_Tabs){

        super(fm);
        this.no_Of_Tabs = no_Of_Tabs;

    }
        @Override
        public Fragment getItem(int position)   {
            Fragment fragment = new Fragment ();
            switch (position)   {
                case 0:
                    fragment = ActionFragment.getInstance();
                    break;
                case 1:
                    fragment = CartoonFragment.getInstance();
                    break;
                case 2:
                    fragment = ScienceFrictionFragment.getInstance();
                    break;
                default:
                    fragment = ActionFragment.getInstance();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount()   {
            return 3;
        }
    }
}
