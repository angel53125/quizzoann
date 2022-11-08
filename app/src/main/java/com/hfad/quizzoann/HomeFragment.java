package com.hfad.quizzoann;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.navigation.Navigation;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    //Boolean f =AddQuestionsFragmentArgs.fromBundle(requireArguments()).getFlag();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnStart = view.findViewById(R.id.btn_start);
        Button btnQuiz = view.findViewById(R.id.btn_practice);
        Spinner spin = view.findViewById(R.id.spinner_genre);



        ArrayList<String> items = new ArrayList<>();
        items.add("Geography");
        items.add("Video Games");
        items.add("Animals");
        items.add("Sports");
        items.add("All");


            System.out.println("Info we made it");

            try {
                items.add(HomeFragmentArgs.fromBundle(requireArguments()).getNewGenre());
            }
            catch(Exception e)
            {
                System.out.println("okay");
            }


        String[] test = new String[items.size()];

        for (int i = 0; i < items.size(); i++) {
            test[i] = items.get(i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_dropdown_item,items);
        spin.setAdapter(adapter);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_addQuestionFragment);



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

                String genre = spin.getSelectedItem().toString();


                System.out.println(genre);
                HomeFragmentDirections.ActionHomeFragmentToPracticeFragment action
                        = HomeFragmentDirections.actionHomeFragmentToPracticeFragment(genre);

                Navigation.findNavController(view).navigate(action);
            }
        });

        return view;
    }


}
