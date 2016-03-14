package com.example.bukola_omotoso.jifyymovies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScienceFrictionFragment extends Fragment {


    public ScienceFrictionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_science_friction, container, false);
    }

public static ScienceFrictionFragment getInstance(){
    ScienceFrictionFragment scienceFrictionFragment = new ScienceFrictionFragment();
    return scienceFrictionFragment;
}

}
