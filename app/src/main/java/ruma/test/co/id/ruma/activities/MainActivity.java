package ruma.test.co.id.ruma.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import ruma.test.co.id.ruma.R;
import ruma.test.co.id.ruma.adapters.PagerAdapter;
import ruma.test.co.id.ruma.fragments.TabOne;
import ruma.test.co.id.ruma.fragments.TabThree;
import ruma.test.co.id.ruma.fragments.TabTwo;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.a_main);

        viewPager = (ViewPager) findViewById(R.id.vp_tab);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabOne(), "Part 1");
        adapter.addFragment(new TabTwo(), "Part 2");
        adapter.addFragment(new TabThree(), "Part 3");
        viewPager.setAdapter(adapter);
    }
}
