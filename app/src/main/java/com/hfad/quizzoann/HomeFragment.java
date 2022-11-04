package com.hfad.quizzoann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import androidx.navigation.Navigation;


public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnStart = view.findViewById(R.id.btn_start);
        Button btnQuiz = view.findViewById(R.id.btn_practice);
        Spinner spin = view.findViewById(R.id.spinner_genre);




        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).
                        navigate(R.id.action_homeFragment_to_addQuestionFragment);
            }
        });

        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String genre = spin.getSelectedItem().toString();

               // HomeFragmentDirections.ActionHomeFragmentToPracticeFragment action =
                     //   HomeFragmentDirections.actionHomeFragmentToPracticeFragment(genre);

                //Navigation.findNavController(view).
                       // navigate(R.id.action_homeFragment_to_practiceFragment);
                Navigation.findNavController(view).
                        navigate(R.id.action_homeFragment_to_practiceFragment);
                System.out.println("Click");
            }
        });

        return view;
    }

}
