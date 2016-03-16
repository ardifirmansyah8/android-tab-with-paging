package ruma.test.co.id.ruma.fragments;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ruma.test.co.id.ruma.R;
import ruma.test.co.id.ruma.adapters.PagerAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class TabOne extends Fragment {

    private ViewPager viewPager;
    private View iconPage0;
    private View iconPage1;
    private View iconPage2;

    public TabOne() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.f_tabone, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.vp_page);
        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                iconPage0 = (View) view.findViewById(R.id.iconPage0);
                iconPage1 = (View) view.findViewById(R.id.iconPage1);
                iconPage2 = (View) view.findViewById(R.id.iconPage2);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    if (position == 0) {
                        iconPage0.setBackground(getResources().getDrawable(R.drawable.circle_green));
                        iconPage1.setBackground(getResources().getDrawable(R.drawable.circle_grey));
                        iconPage2.setBackground(getResources().getDrawable(R.drawable.circle_grey));
                    } else if (position == 1) {
                        iconPage0.setBackground(getResources().getDrawable(R.drawable.circle_grey));
                        iconPage1.setBackground(getResources().getDrawable(R.drawable.circle_green));
                        iconPage2.setBackground(getResources().getDrawable(R.drawable.circle_grey));
                    } else {
                        iconPage0.setBackground(getResources().getDrawable(R.drawable.circle_grey));
                        iconPage1.setBackground(getResources().getDrawable(R.drawable.circle_grey));
                        iconPage2.setBackground(getResources().getDrawable(R.drawable.circle_green));
                    }
                }
            }
        });

        setupViewPager(viewPager);

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter adapter = new PagerAdapter(getChildFragmentManager());
        adapter.addFragment(new PageA(), "");
        adapter.addFragment(new PageB(), "");
        adapter.addFragment(new PageC(), "");
        viewPager.setAdapter(adapter);
    }
}