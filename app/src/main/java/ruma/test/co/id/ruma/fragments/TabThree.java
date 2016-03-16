package ruma.test.co.id.ruma.fragments;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ruma.test.co.id.ruma.R;
import ruma.test.co.id.ruma.adapters.PagerAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class TabThree extends Fragment {

    private ViewPager viewPager;

    public TabThree() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.f_tabthree, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.vp_page);

        setupViewPager(viewPager);

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PageF(), "");
        viewPager.setAdapter(adapter);
    }
}
