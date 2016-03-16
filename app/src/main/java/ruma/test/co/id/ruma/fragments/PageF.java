package ruma.test.co.id.ruma.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ruma.test.co.id.ruma.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PageF extends Fragment {

    public PageF() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.f_page_f, container, false);
    }
}
