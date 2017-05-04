package com.bignerdranch.android.fragment_arguments;

import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

/**
 * Created by Administrator on 2017/5/4/004.
 */

public class SonFragment extends Fragment {
    private static final String ARGS_CLICK = "click";
    private Button mButtonReturn;
    private CheckBox mCheckBox;
    private boolean mClick;

    public static SonFragment newFragment(boolean click) {
        Bundle args = new Bundle();
        args.putSerializable(ARGS_CLICK, click);

        SonFragment sonF = new SonFragment();
        sonF.setArguments(args);
        return sonF;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        mClick = (boolean) getArguments().getSerializable(ARGS_CLICK);
        mCheckBox = (CheckBox) view.findViewById(R.id.check_box);
        mCheckBox.setChecked(mClick);
        mButtonReturn = (Button) view.findViewById(R.id.button);
        mButtonReturn.setText(R.string.button_return);
        mButtonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), FatherActivity.class);
                startActivity(i);
            }
        });
        return view;
    }
}
