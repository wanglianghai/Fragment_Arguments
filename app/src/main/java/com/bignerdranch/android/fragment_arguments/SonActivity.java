package com.bignerdranch.android.fragment_arguments;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/5/4/004.
 */

public class SonActivity extends SingleActivityFragment {

    public static final String EXTRA_CLICK = "click";

    //带信息的intent
    public static Intent newIntent(Context packageContext, boolean clicked) {
        Intent i = new Intent(packageContext, SonActivity.class);
        i.putExtra(EXTRA_CLICK, clicked);
        return i;
    }
    @Override
    public Fragment createFragment() {
        return new SonFragment();
    }
}
