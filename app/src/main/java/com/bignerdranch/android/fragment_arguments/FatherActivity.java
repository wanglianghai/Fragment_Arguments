package com.bignerdranch.android.fragment_arguments;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class FatherActivity extends SingleActivityFragment {

    @Override
    public Fragment createFragment() {
        return new FatherFragment();
    }
}
