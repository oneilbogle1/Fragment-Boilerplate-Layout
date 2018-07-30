package com.example.oneilbogle.test_tabbed_layout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Chat_Activity";

    private  SectionsPagesAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity);


        mSectionsPageAdapter = new SectionsPagesAdapter(getSupportFragmentManager());


        //set up the viewPager with the section adapter
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    private void setupViewPager(ViewPager viewPager) {
        SectionsPagesAdapter adapter = new SectionsPagesAdapter(getSupportFragmentManager());
        adapter.addFragment(new friends_Fragment(),"FRIENDS");
        adapter.addFragment(new chat_Fragment(), "CHATs");
        viewPager.setAdapter(adapter);


    }


}
