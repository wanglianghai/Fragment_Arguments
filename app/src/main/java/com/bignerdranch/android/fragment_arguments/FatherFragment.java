package com.bignerdranch.android.fragment_arguments;

import android.content.Intent;
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

public class FatherFragment extends Fragment {
    private Button mButtonIn;
    private CheckBox mCheckBoxIn;
    private boolean mClick;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        mCheckBoxIn = (CheckBox) view.findViewById(R.id.check_box);
        mCheckBoxIn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mClick = isChecked;
            }
        });
        mButtonIn = (Button) view.findViewById(R.id.button);
        mButtonIn.setText(R.string.button_in);
        mButtonIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = FatherActivity.newIntent(getActivity(), mClick);
                startActivity(i);
            }
        });
        return view;
    }
}
