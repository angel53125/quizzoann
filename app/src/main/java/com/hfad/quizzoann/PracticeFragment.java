package com.hfad.quizzoann;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

//import androidx.navigation.findNavController;

//Angel Negron
/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 * This fragment class allows the user to practice quizzo questions
 * depending on what genre selected from the previous fragment
 */


public class PracticeFragment extends Fragment {
    int x = 0;
    int j = 1;
    int correct = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_practice, container, false);

        Button btnNext = view.findViewById(R.id.btn_next);
        TextView tv_question = view.findViewById((R.id.textView_question));
        TextView tv_remaining = view.findViewById(R.id.textView_answered);
        TextView tv_total = view.findViewById(R.id.textView_total);

        RadioGroup radioGroup;
        RadioButton rb_q1 = view.findViewById(R.id.radioButton_Q1);
        RadioButton rb_q2 = view.findViewById(R.id.radioButton_Q2);
        RadioButton rb_q3 = view.findViewById(R.id.radioButton_Q3);
        RadioButton rb_q4 = view.findViewById(R.id.radioButton_Q4);
        RadioButton rb_q5 = view.findViewById(R.id.radioButton_Q5);
        RadioButton rb_q6 = view.findViewById(R.id.radioButton_Q6);

        RadioButton[] rb_Question = {rb_q1,rb_q2,rb_q3,rb_q4,rb_q5,rb_q6};

        String genre = PracticeFragmentArgs.fromBundle(requireArguments()).getGenre();

        tv_question.setText(DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x).getQuestion());











        for (int i = 0; i < DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x).getChoices().size();i++)
        {
            rb_Question[i].setText(DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x).getChoices().get(i));
        }

        //tv_total.setText(String.valueOf(data.retrieveQuestionsWithGenre(genre,x).getChoices().size()+ 1));
        tv_total.setText(String.valueOf(DataBase.getMyDatabase().getSize(genre)));
        tv_remaining.setText(String.valueOf(j));

        //int total = data.retrieveQuestionsWithGenre(genre,x).getChoices().size()+ 1;
        int total = DataBase.getMyDatabase().getSize(genre);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x <= total) {
                    x++;
                    j++;
                }


                tv_question.setText(DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x).getQuestion());

                tv_remaining.setText(String.valueOf(j));

                //Stores the number of correct answers

                correct = correct + correct(rb_Question,DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x-1).getAnswer(),DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x-1).getfunFact());

                //Loads in next set of questions and choices
                for (int i = 0; i < DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x).getChoices().size();i++)
                {
                    rb_Question[i].setText(DataBase.getMyDatabase().retrieveQuestionsWithGenre(genre,x).getChoices().get(i));

                }

                //Once the all questions have been answered takes the user to
                //the results screen
                if (x >= total)
                {
                    PracticeFragmentDirections.ActionPracticeFragmentToResultFragment action
                            = PracticeFragmentDirections.actionPracticeFragmentToResultFragment(correct
                            ,total);

                    Navigation.findNavController(view).navigate(action);

                }
            }
        });

        return view;


    }

    /**
     * Takes the selected answer and compares it to the correct answer
     * also displays correct a toast after each answer
     * @param rb an array of all the choices for a question
     * @param answer The correct answer
     * @param funFact a fun fact about the prvious question
     * @return 1 for a point earned or 0 for 9 point earned
     */
    public int correct(RadioButton[] rb,String answer,String funFact)
    {
        for (int z = 0; z < rb.length;z++) {
            if (rb[z].isChecked()) {
               if(rb[z].getText().equals(answer))
               {
                   Context context = getContext();
                   int time = Toast.LENGTH_LONG;

                   Toast toast = Toast.makeText(context, "The answer is correct:\nFun Fact: " + funFact,time);
                   toast.show();
                   return 1;
               }
            }
        }
        Context context = getContext();
        int time = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, "The answer is incorrect:\nFun Fact: " + funFact,time);
        toast.show();
        return 0;
    }



}

