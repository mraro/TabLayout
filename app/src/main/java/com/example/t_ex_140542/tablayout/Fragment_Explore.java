package com.example.t_ex_140542.tablayout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by t-ex-140542 on 28/02/2018.
 */

public class Fragment_Explore extends Fragment{

    View view;
    public Fragment_Explore(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.explorer_fragment,container,false);

        return view;
    }
}
