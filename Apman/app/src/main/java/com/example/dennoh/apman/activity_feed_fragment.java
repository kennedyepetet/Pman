package com.example.dennoh.apman;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dennoh on 10/9/2017.
 */

public class activity_feed_fragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView= inflater.inflate(R.layout.activity_feed_layout, container,false);
        return myView;

    }
}