package com.hfad.quizzoann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

//import androidx.navigation.findNavController;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */

public class PracticeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_practice, container, false);
        Button btnNext = view.findViewById(R.id.btn_add);
        TextView messageView = view.findViewById(R.id.etv_message);
        Spinner spin = view.findViewById(R.id.spinner_genre);
        DataBase data = new DataBase();
        ArrayList<Question> questions = new ArrayList<Question>();


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x = data.retrieveQuestionsWithGenre(getSpinner(spin)).get(0).getQuestion();

               System.out.println(x);
            }
        });



        return view;
    }

    public String getSpinner(Spinner spin)
    {
        return spin.getSelectedItem().toString();
    }
}