package com.hfad.quizzoann;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

//import androidx.navigation.findNavController;

//ANgel Negron
/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 * Adds a new genre to the list of options
 */
public class AddQuestionsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_questions, container, false);
        Button btnCreate = view.findViewById(R.id.button_create);

        Button btnNext = view.findViewById(R.id.btn_next);
        Spinner spin = view.findViewById(R.id.spinner_genre);

        EditText etGen = view.findViewById(R.id.et_genre);
        EditText etAns = view.findViewById(R.id.et_ans);
        EditText etChoice1 = view.findViewById(R.id.et_q1);
        EditText etChoice2 = view.findViewById(R.id.et_q2);
        EditText etChoice3 = view.findViewById(R.id.et_q3);
        EditText etChoice4 = view.findViewById(R.id.et_q4);
        EditText etQues = view.findViewById(R.id.et_ques);
        EditText etFact = view.findViewById(R.id.et_fact);

        ArrayList<String> choice = new  ArrayList<String>();



        DataBase data = new DataBase();



        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                choice.add(etChoice1.getText().toString());
                choice.add(etChoice2.getText().toString());
                choice.add(etChoice3.getText().toString());
                choice.add(etChoice4.getText().toString());

                //Gets new question from the user
                Question new_ques = new Question((etGen.getText().toString()),etQues.getText().toString()
                        ,etAns.getText().toString(),choice,etFact.getText().toString());

               String new_genre =  new_ques.getGenre();

               //adds the new question to the database
               data.addQuestion(new_ques);

              System.out.println("Test" + data.retrieveQuestionsWithGenre(new_genre,0).getChoices().get(0));



               //Sends the newly added spinner item to the home fragment
              AddQuestionsFragmentDirections.ActionAddQuestionsFragmentToHomeFragment2 action
                   = AddQuestionsFragmentDirections.actionAddQuestionsFragmentToHomeFragment2(new_genre);
                Navigation.findNavController(view).navigate(action);

            }
        });


        return view;
    }

    public String getSpinner(Spinner spin)
    {
        return spin.getSelectedItem().toString();
    }
}