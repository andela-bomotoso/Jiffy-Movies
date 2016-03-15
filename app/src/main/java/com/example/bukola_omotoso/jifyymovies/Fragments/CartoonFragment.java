package com.example.bukola_omotoso.jifyymovies.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bukola_omotoso.jifyymovies.Model.Utilities;
import com.example.bukola_omotoso.jifyymovies.R;
import com.example.bukola_omotoso.jifyymovies.RecyclerAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class CartoonFragment extends Fragment {


    public CartoonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Utilities.setCurrentFragment(this);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cartoon, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cartoon_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setHasFixedSize(true);
        super.onViewCreated(view,savedInstanceState);
    }

    public static CartoonFragment getInstance() {
        CartoonFragment cartoonFragment = new CartoonFragment();
        return cartoonFragment;
    }



}
