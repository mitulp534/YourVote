package com.example.yourvote.ui.search;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yourvote.R;
import com.example.yourvote.ui.home.HomeViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }

    private  SearchViewModel searchViewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        searchViewModel= ViewModelProviders.of(this).get(SearchViewModel.class);

        // Inflate the layout for this fragment
        View root =inflater.inflate(R.layout.fragment_search, container, false);
        final TextView textView=root.findViewById(R.id.text_search);
        searchViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }

}
