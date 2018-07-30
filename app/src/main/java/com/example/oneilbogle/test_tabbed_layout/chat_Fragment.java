package com.example.oneilbogle.test_tabbed_layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by oneilbogle on 8/16/17.
 */

public class chat_Fragment extends Fragment {
    private static final String TAG = "ChatFrag";




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstancesState){
        View view = inflater.inflate(R.layout.chat_frag_act,container,false );

        return view;
    }





}

