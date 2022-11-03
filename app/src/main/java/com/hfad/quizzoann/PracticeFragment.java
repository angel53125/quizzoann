package com.hfad.quizzoann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PracticeFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_practice, container, false);

        String message = PracticeFragmentArgs.fromBundle(requireArguments()).getMessage();

        TextView tvEncMessage = view.findViewById(R.id.tv_encrypted_msg);

        tvEncMessage.setText(message);

        return view;


    }
}