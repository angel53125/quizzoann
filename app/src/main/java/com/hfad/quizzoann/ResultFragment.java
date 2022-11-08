package com.hfad.quizzoann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ResultFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_result, container, false);
        TextView tv_correct =view.findViewById(R.id.textView_correct);
        TextView tv_q = view.findViewById(R.id.textView_totalQuestions);
       // PracticeFragmentArgs.fromBundle(requireArguments()).getGenre();
        int correct = ResultFragmentArgs.fromBundle(requireArguments()).getScore();
        int total = ResultFragmentArgs.fromBundle(requireArguments()).getTotalQuestions();

        System.out.println(correct);
        System.out.println(total);
        System.out.println((correct*1.0));

        double percent_score = (correct/(total*1.0)) * 100;
        tv_correct.setText(String.valueOf(percent_score + "%"));

        if(percent_score > 90)
        {
            tv_q.setText("WOW YOURE REALLY SMART!");
        }
        else
            tv_q.setText("Try again for a better score");







        return view;
    }
}