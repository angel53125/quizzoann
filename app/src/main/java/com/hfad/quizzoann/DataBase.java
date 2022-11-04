package com.hfad.quizzoann;

import java.util.ArrayList;

public class DataBase {
    private String data;

    private ArrayList<Question> questions = new ArrayList<Question>();

    public ArrayList<Question>  retrieveQuestionsWithGenre(String genre)
    {
        //Create a new list and loop

        addQuestion();

        return questions;
        /*
        if(genre.equals("Geography"))
        {

            System.out.println("o");
            System.out.println(questions.get(0).getQuestion());
            System.out.println(questions.get(1).getQuestion());
            System.out.println(questions.get(2).getQuestion());
            System.out.println(questions.get(3).getQuestion());
            System.out.println(questions.get(0).toString());
            return questions.;
        }
        else if (genre.equals("Sports")) {
            System.out.println("o");
            System.out.println(questions.get(0).getQuestion());
            System.out.println(questions.get(1).getQuestion());
            System.out.println(questions.get(2).getQuestion());
            System.out.println(questions.get(3).getQuestion());

            return questions;
        }

        else return questions;


        else if (genre.equals("Sports")) {
            System.out.println(questions.get(0).getQuestion());
            return questions.get(1).getQuestion();
        }
        else if (genre.equals("Video Games")) {
            System.out.println(questions.get(0).getQuestion());
            return questions.get(1).getQuestion();
        }
        else if (genre.equals("Animals")) {
            System.out.println(questions.get(0).getQuestion());
            return questions.get(1).getQuestion();
        }


        else return "";

        */
    }



    public void addQuestion()
    {
        ArrayList<String> choices = new ArrayList<String>();

        choices.add("Pacific");
        choices.add("Atlantic");
        choices.add("Artic");
        choices.add("Indian");

        Question gQ1 = new  Question("Geography","Which ocean is the largest","Pacific",choices,"The Pacific Ocean stretches to an astonishing 63.8 million square miles!");
        questions.add(gQ1);
        choices.clear();

        choices.add("192");
        choices.add("195");
        choices.add("193");
        choices.add("197");

        Question gQ2 = new  Question("Geography","How many countries are in the world?","195",choices,"Africa has the most countries of any continent with 54.");
        questions.add(gQ2);
        choices.clear();

        choices.add("Mississippi");
        choices.add("Nile");
        choices.add("Congo");
        choices.add("Amazon");

        Question gQ3 = new  Question("Geography","What is the name of the longest river in the world?","Nile",choices,"Explorer John Hanning Speke discovered the source of the Nile on August 3rd, 1858.");
        questions.add(gQ3);
        choices.clear();

        choices.add("United States");
        choices.add("China");
        choices.add("Japan");
        choices.add("India");

        Question gQ4 = new  Question("Geography","Which country has the largest population?","China",choices,"Shanghai is the most populated city in China with a population of 24,870,895.");
        questions.add(gQ4);
        choices.clear();

        choices.add("Mars");
        choices.add("Mercury");
        choices.add("Venus");
        choices.add("Jupiter");

        Question gQ5 = new  Question("Geography","Which planet is closest to Earth?","Venus",choices,"Even though Venus is the closest, the planet it still ~38 million miles from Earth!");
        questions.add(gQ5);
        choices.clear();

        choices.add("Sega");
        choices.add("Nintendo");
        choices.add("Sony");
        choices.add("Atari");

        Question vG1 = new  Question("Video Games","Which company created the famous plumber Mario?","Nintendo",choices,"Nintendo created Mario in 1981 for the arcade game Donkey Kong.");
        questions.add(vG1);
        choices.clear();


        choices.add("Sonic");
        choices.add("Tails");
        choices.add("Knuckles");
        choices.add("Amy");

        Question vG2 = new  Question("Video Games","What is the name of the famous video character who is a blue hedgehog?","Sonic",choices,"In some official concept art, Sonic was originally meant to be a rabbit.");
        questions.add(vG2);
        choices.clear();

        choices.add("Wii Sports");
        choices.add("Grand Theft Auto V");
        choices.add("Tetris");
        choices.add("Minecraft");

        Question vG3 = new  Question("Video Games","As of 2022, which of the following is the best selling video game of all time?","Minecraft",choices,"As of 2022, Minecraft has sold over 238 million units.");
        questions.add(vG3);
        choices.clear();

        choices.add("place 3 milk, 2 sugar, 1 egg, and 3 wheat in the 3x3 crafting grid");
        choices.add("place 2 milk, 3 sugar, 2 eggs, and 3 wheat in the 3x3 crafting grid");
        choices.add("place 3 milk, 5 sugar, 6 eggs, and 3 wheat in the 3x6 crafting grid");
        choices.add("place 1 milk, 1 sugar, 1 egg, and 1 wheat in the 1x1 crafting grid.");

        Question vG4 = new  Question("Video Games","How do you craft a cake in Minecraft?","place 3 milk, 2 sugar, 1 egg, and 3 wheat in the 3x3 crafting grid.\n",choices,"Cake is the only food that has to be placed for players to eat it.");
        questions.add(vG4);
        choices.clear();

        choices.add("Diddy Kong");
        choices.add("Donkey Kong Jr.");
        choices.add("Dixie Kong");
        choices.add("Papa Kong");

        Question vG5 = new  Question("Video Games","Who is Donkey Kong’s son?","Donkey Kong Jr.",choices,"Donkey Kong Jr. has appeared only in the game Super Mario Kart for Super Nintendo Entertainment System as a playable character celebrating the 10th anniversary of his arcade game and his shared history with Mario.");
        questions.add(vG5);
        choices.clear();

        choices.add("1");
        choices.add("5");
        choices.add("4");
        choices.add("10");

        Question vG6 = new  Question("Video Games","How many Xenoblade Chronicles have been created?","5",choices,"Xenoblade Chronicles was originally going to be titled \"Monado: Beginning of the World\" and was not intended as an entry into the Xeno series.");
        questions.add(vG6);
        choices.clear();


        choices.add("BLack");
        choices.add("White");
        choices.add("Pink");
        choices.add("Brown");

        Question aQ1 = new  Question("Animals","What colour is a polar bear’s skin?","Black",choices,"Polar bear fur is actually hollow and transparent!");
        questions.add(aQ1);
        choices.clear();

        choices.add("Man-o-war");
        choices.add("Box jellyfish");
        choices.add("Irukandji Jellyfish");
        choices.add("Sea Nettle");

        Question aQ2 = new  Question("Animals","Which jellyfish has the deadliest sting?","Irukandji Jellyfish",choices,"Some jellyfish species are functionally immortal.");
        questions.add(aQ2);
        choices.clear();

        choices.add("True");
        choices.add("False");


        Question aQ3 = new  Question("Animals","Hyenas scavenge more than lions do","False",choices," Lions actually scavenge for food more than they hunt it");
        questions.add(aQ3);
        choices.clear();

        choices.add("Grizzly bear");
        choices.add("Polar bear");
        choices.add("Raccoon");
        choices.add("Cat");
        choices.add("Spectacled bear");


        Question aQ4 = new  Question("Animals","What is the giant panda’s closest relative?","Spectacled bear",choices,"Despite common belief, molecular studies show that pandas are in fact closer to bears than raccoons.");
        questions.add(aQ4);
        choices.clear();

        choices.add("Hippo");
        choices.add("Sloth");
        choices.add("Bats");
        choices.add("Elk");
        choices.add("Fish");


        Question aQ5 = new  Question("Animals","Which one of these animals cannot swim?","Hippo",choices,"Hippos are the world’s most dangerous land mammal.");
        questions.add(aQ5);
        choices.clear();

        choices.add("Eagles");
        choices.add("Packers");
        choices.add("Cowboys");
        choices.add("76ser");
        choices.add("Ravens");


        Question sQ1 = new  Question("Sports"," Who won the first superbowl in NFL history?"," Packers",choices,"The Packers have won the NFL championship 4 times.");
        questions.add(sQ1);
        choices.clear();

        choices.add("1");
        choices.add("2");
        choices.add("Infinite");
        choices.add("7");
        choices.add("3");


        Question sQ2 = new  Question("Sports","How many points did Kobe Bryant score in his last NBA game of NBA?","60",choices,"Kobe scored over 60 five times during his career.");
        questions.add(sQ2);
        choices.clear();

        choices.add("28");
        choices.add("7");
        choices.add("23");
        choices.add("13");


        Question sQ3 = new  Question("Sports","How many gold medals has Michael Phelps been awarded in his olympic career?","23",choices," Michael Phelps is the most successful olympian for owning the most medals and most gold medals of any athlete");
        questions.add(sQ3);
        choices.clear();

        choices.add("Michael Jordan");
        choices.add("Magic Johnson");
        choices.add("Bill Russel");
        choices.add("Lebron James");


        Question sQ4 = new  Question("Sports","What player has the most NBA Championships in NBA History?","Bill Russel",choices,"Bill Russel won the NBA championship 11 times in his career!");
        questions.add(sQ4);
        choices.clear();

        choices.add("Venus Williams");
        choices.add("Roger Federer");
        choices.add("Rafael Nadal");
        choices.add("Serena Williams");
        choices.add("Novak Djokovic");


        Question sQ5 = new  Question("Sports","Who has earned more Grand Slam single titles during the open era in tennis?","Serena Williams",choices,"Serena and Her Sister Venus won 14 Grand Slam Doubles titles and three doubles gold medals at the Olympics");
        questions.add(sQ5);
        choices.clear();

        choices.add("50");
        choices.add("100");
        choices.add("75");
        choices.add("60");


        Question sQ6 = new  Question("Sports","How many points did Kobe Bryant score in his last NBA game of NBA?","60",choices," Kobe scored over 60 five times during his career.");
        questions.add(sQ6);
        choices.clear();



    }



}
