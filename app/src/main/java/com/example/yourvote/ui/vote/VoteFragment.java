package com.example.yourvote.ui.vote;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class VoteFragment extends Fragment {


    public VoteFragment() {
        // Required empty public constructor
    }

    private VoteViewModel voteViewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        voteViewModel = ViewModelProviders.of(this).get(VoteViewModel.class);

        View root =inflater.inflate(R.layout.fragment_vote, container, false);
        final TextView textView=root.findViewById(R.id.text_vote);
        voteViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
