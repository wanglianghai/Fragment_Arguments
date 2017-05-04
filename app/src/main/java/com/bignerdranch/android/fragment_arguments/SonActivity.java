package com.bignerdranch.android.fragment_arguments;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/5/4/004.
 */

public class SonActivity extends SingleActivityFragment {
    @Override
    public Fragment createFragment() {
        return new SonFragment();
    }
}
