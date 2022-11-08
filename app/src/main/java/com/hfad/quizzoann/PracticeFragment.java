package com.hfad.quizzoann;

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

//import androidx.navigation.findNavController;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */


public class PracticeFragment extends Fragment {
    int i = 0;
    int x = 0;
    int j = 1;
    int correct = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_practice, container, false);

        Button btnNext = view.findViewById(R.id.btn_next);
        Button btnResult = view.findViewById(R.id.btn_result);
        DataBase data = new DataBase();
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

        tv_question.setText(data.retrieveQuestionsWithGenre(genre,x).getQuestion());
        for (int i = 0; i < data.retrieveQuestionsWithGenre(genre,x).getChoices().size();i++)
        {
            rb_Question[i].setText(data.retrieveQuestionsWithGenre(genre,x).getChoices().get(i));
        }
        tv_total.setText(String.valueOf(data.retrieveQuestionsWithGenre(genre,x).getChoices().size()+ 1));
        tv_remaining.setText(String.valueOf(j));

        int total = data.retrieveQuestionsWithGenre(genre,x).getChoices().size()+ 1;





        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (x < data.retrieveQuestionsWithGenre(genre,x).getChoices().size()) {
                    x++;
                    j++;
                }
                System.out.println("Test" + data.retrieveQuestionsWithGenre(genre,x).getQuestion());

                tv_question.setText(data.retrieveQuestionsWithGenre(genre,x).getQuestion());
                for (int i = 0; i < data.retrieveQuestionsWithGenre(genre,x).getChoices().size();i++)
                {
                    rb_Question[i].setText(data.retrieveQuestionsWithGenre(genre,x).getChoices().get(i));
                }

                tv_remaining.setText(String.valueOf(j));




                       correct = correct + correct(rb_Question,data.retrieveQuestionsWithGenre(genre,x).getAnswer());
                System.out.println(data.retrieveQuestionsWithGenre(genre,x).getAnswer());











                //tv_total.setText(data.retrieveQuestionsWithGenre(genre,x).getQuestion());



               // String x = data.retrieveQuestionsWithGenre(getSpinner(spin)).get(i).getQuestion();

                //tv_question.setText(x);
               // rb_q1.setText(data.retrieveQuestionsWithGenre(getSpinner(spin)).get(i).getChoices().get(i));
               // rb_q2.setText("Okay");
                //data.retrieveQuestionsWithGenre().getGenre().toString();


               //tv_question.setText(data.retrieveQuestionsWithGenre(getSpinner(spin)).getChoices().get(3));

            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PracticeFragmentDirections.ActionPracticeFragmentToResultFragment action
                        = PracticeFragmentDirections.actionPracticeFragmentToResultFragment(correct
                        ,total);

                Navigation.findNavController(view).navigate(action);
            }
        });






        return view;


    }

    public int correct(RadioButton[] rb,String answer)
    {
        for (int z = 0; z < rb.length;z++) {
            if (rb[z].isChecked()) {
               if(rb[z].getText().equals(answer))
               {
                   return 1;
               }
            }
        }
        return 0;
    }



}

