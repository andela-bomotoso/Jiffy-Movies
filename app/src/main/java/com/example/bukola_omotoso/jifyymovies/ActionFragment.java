package com.example.bukola_omotoso.jifyymovies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.net.PortUnreachableException;


/**
 * A simple {@link Fragment} subclass.
 */
public class ActionFragment extends Fragment {


    public ActionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_action, container, false);
    }

    public static ActionFragment getInstance()    {
        ActionFragment actionFragment = new ActionFragment();
        return actionFragment;
    }

}
