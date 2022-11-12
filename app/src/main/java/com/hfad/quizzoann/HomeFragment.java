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

//Angel Negron

/**
 * This fragment is the home screen where the user can choose to
 * add a genre, select a genre, or start practicing quizzo questions
 */
public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnStart = view.findViewById(R.id.btn_start);
        Button btnQuiz = view.findViewById(R.id.btn_practice);
        Spinner spin = view.findViewById(R.id.spinner_genre);



        //Array list that adds items to the spinner
        ArrayList<String> items = new ArrayList<>();
        items.add("Geography");
        items.add("Video Games");
        items.add("Animals");
        items.add("Sports");
        items.add("All");

            //Tries too retrieve the new genre from the add genre page
            //But if there has not been a genre added the exception is caught
            try {
                items.add(HomeFragmentArgs.fromBundle(requireArguments()).getNewGenre());
            }
            catch(Exception e)
            {
                System.out.println("No genre has been added");
            }

        //List of spinner items
        String[] test = new String[items.size()];
        for (int i = 0; i < items.size(); i++) {
            test[i] = items.get(i);
        }

        //passes added info into spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_dropdown_item,items);
        spin.setAdapter(adapter);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sends the user to the add question fragment
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_addQuestionFragment);
            }
        });


        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = spin.getSelectedItem().toString();

                //Send the genre to the practice fragment
                HomeFragmentDirections.ActionHomeFragmentToPracticeFragment action
                        = HomeFragmentDirections.actionHomeFragmentToPracticeFragment(genre);

                Navigation.findNavController(view).navigate(action);
            }
        });

        return view;
    }


}
