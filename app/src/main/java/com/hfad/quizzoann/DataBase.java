package com.hfad.quizzoann;

import java.util.ArrayList;
import java.util.Arrays;

//Angel Negron
public class DataBase {
    private String data;

    private static ArrayList<Question> questions = new ArrayList<Question>();


    public Question retrieveQuestionsWithGenre(String genre, int x) {
        dataBase();
//System.out.println("This" + questions.get(8).getQuestion());
        if (genre.equals("Geography")) {

            if (questions.get(x).getGenre().equals("Geography")) {
                return questions.get(x);
            }
        } else if (genre.equals("Video Games")) {
            x += 5;
            if (questions.get(x).getGenre().equals("Video Games")) {
                return questions.get(x);
            }
        } else if (genre.equals("Animals")) {
            x += 11;

            if (questions.get(x).getGenre().equals("Animals")) {

                return questions.get(x);
            }
        } else if (genre.equals("Sports")) {
            x += 16;

            if (questions.get(x).getGenre().equals("Sports")) {

                return questions.get(x);
            }
        }
        else if (genre.equals("All")) {
            x += 0;

                return questions.get(x);

        }

        x = 22;
        return questions.get(x);
    }


    public void dataBase() {
        Question gQ1 = new Question("Geography", "Which ocean is the largest", "Pacific", new ArrayList<String>(Arrays.asList("Pacific", "Atlantic", "Artic", "Indian")), "The Pacific Ocean stretches to an astonishing 63.8 million square miles!");
        questions.add(gQ1);

        Question gQ2 = new Question("Geography", "How many countries are in the world?", "195", new ArrayList<String>(Arrays.asList("192", "195", "193", "197")), "Africa has the most countries of any continent with 54.");
        questions.add(gQ2);


        Question gQ3 = new Question("Geography", "What is the name of the longest river in the world?", "Nile", new ArrayList<String>(Arrays.asList("Mississippi", "Nile", "Congo", "Amazon")), "Explorer John Hanning Speke discovered the source of the Nile on August 3rd, 1858.");
        questions.add(gQ3);


        Question gQ4 = new Question("Geography", "Which country has the largest population?", "China", new ArrayList<String>(Arrays.asList("United States", "China", "Japan", "India")), "Shanghai is the most populated city in China with a population of 24,870,895.");
        questions.add(gQ4);

        Question gQ5 = new Question("Geography", "Which planet is closest to Earth?", "Venus", new ArrayList<String>(Arrays.asList("Mars", "Mecury", "Venus", "Jupiter")), "Even though Venus is the closest, the planet it still ~38 million miles from Earth!");
        questions.add(gQ5);


        Question vG1 = new Question("Video Games", "Which company created the famous plumber Mario?", "Nintendo", new ArrayList<String>(Arrays.asList("Sega", "Nintendo", "Sony", "Atari")), "Nintendo created Mario in 1981 for the arcade game Donkey Kong.");
        questions.add(vG1);


        Question vG2 = new Question("Video Games", "What is the name of the famous video character who is a blue hedgehog?", "Sonic", new ArrayList<String>(Arrays.asList("Sonic", "Tails", "Knuckles", "Amy")), "In some official concept art, Sonic was originally meant to be a rabbit.");
        questions.add(vG2);


        Question vG3 = new Question("Video Games", "As of 2022, which of the following is the best selling video game of all time?", "Minecraft", new ArrayList<String>(Arrays.asList("Wii Sports", "Grand Theft Auto V", "Tetris", "Minecraft")), "As of 2022, Minecraft has sold over 238 million units.");
        questions.add(vG3);


        Question vG4 = new Question("Video Games", "How do you craft a cake in Minecraft?", "place 3 milk, 2 sugar, 1 egg, and 3 wheat in the 3x3 crafting grid.",
                new ArrayList<String>(Arrays.asList("place 3 milk, 2 sugar, 1 egg, and 3 wheat in the 3x3 crafting grid", "place 2 milk, 3 sugar, 2 eggs, and 3 wheat in the 3x3 crafting grid",
                        "place 3 milk, 5 sugar, 6 eggs, and 3 wheat in the 3x6 crafting grid", "place 1 milk, 1 sugar, 1 egg, and 1 wheat in the 1x1 crafting grid."))
                , "Cake is the only food that has to be placed for players to eat it.");
        questions.add(vG4);


        Question vG5 = new Question("Video Games", "Who is Donkey Kong’s son?", "Donkey Kong Jr.",
                new ArrayList<String>(Arrays.asList("Diddy Kong", "Donkey Kong jr", "Dixie Kong", "Papa Kong")),
                "Donkey Kong Jr. has appeared only in the game Super Mario Kart for Super Nintendo Entertainment System as a playable character celebrating the 10th anniversary of his arcade game and his shared history with Mario.");
        questions.add(vG5);


        Question vG6 = new Question("Video Games", "How many Xenoblade Chronicles have been created?", "5"
                , new ArrayList<String>(Arrays.asList("1", "5", "4", "10"))
                , "Xenoblade Chronicles was originally going to be titled \"Monado: Beginning of the World\" and was not intended as an entry into the Xeno series.");
        questions.add(vG6);


        Question aQ1 = new Question("Animals", "What colour is a polar bear’s skin?", "Black",
                new ArrayList<String>(Arrays.asList("Black", "White", "Pink", "Brown")), "Polar bear fur is actually hollow and transparent!");
        questions.add(aQ1);


        Question aQ2 = new Question("Animals", "Which jellyfish has the deadliest sting?", "Irukandji Jellyfish",
                new ArrayList<String>(Arrays.asList("Man-o-war", "Box jellyfish", "Irukandji Jellyfish", "Sea Nettle")), "Some jellyfish species are functionally immortal.");
        questions.add(aQ2);


        Question aQ3 = new Question("Animals", "Hyenas scavenge more than lions do", "False",
                new ArrayList<String>(Arrays.asList("IDK", "True", "False", "Maybe")), " Lions actually scavenge for food more than they hunt it");
        questions.add(aQ3);


        Question aQ4 = new Question("Animals", "What is the giant panda’s closest relative?", "Spectacled bear",
                new ArrayList<String>(Arrays.asList("Grizzly bear", "Polar bear",
                        "Raccoon", "Cat", "Spectacled bear")), "Despite common belief, molecular studies show that pandas are in fact closer to bears than raccoons.");
        questions.add(aQ4);


        Question aQ5 = new Question("Animals", "Which one of these animals cannot swim?", "Hippo",
                new ArrayList<String>(Arrays.asList("Hippo", "Sloth", "Bats", "Elk", "Fish")), "Hippos are the world’s most dangerous land mammal.");
        questions.add(aQ5);


        Question sQ1 = new Question("Sports", " Who won the first superbowl in NFL history?", " Packers",
                new ArrayList<String>(Arrays.asList("Eagles", "Packers", "Cowboys", "76ers", "Ravens")), "The Packers have won the NFL championship 4 times.");
        questions.add(sQ1);


        Question sQ2 = new Question("Sports", "How many points did Kobe Bryant score in his last NBA game of NBA?", "60",
                new ArrayList<String>(Arrays.asList("1", "2", "Infinite", "7", "3")), "Kobe scored over 60 five times during his career.");
        questions.add(sQ2);


        Question sQ3 = new Question("Sports", "How many gold medals has Michael Phelps been awarded in his olympic career?", "23",
                new ArrayList<String>(Arrays.asList("28", "7", "23", "13")), " Michael Phelps is the most successful olympian for owning the most medals and most gold medals of any athlete");
        questions.add(sQ3);


        Question sQ4 = new Question("Sports", "What player has the most NBA Championships in NBA History?", "Bill Russel",
                new ArrayList<String>(Arrays.asList("Michael Jordan", "Magic Johnson", "Bill Russel", "Lebron James")), "Bill Russel won the NBA championship 11 times in his career!");
        questions.add(sQ4);


        Question sQ5 = new Question("Sports", "Who has earned more Grand Slam single titles during the open era in tennis?", "Serena Williams",
                new ArrayList<String>(Arrays.asList("Venus Williams", "Roger Federer",
                        "Rafael Nadal", "Serena Williams", "Novak Djokovic")), "Serena and Her Sister Venus won 14 Grand Slam Doubles titles and three doubles gold medals at the Olympics");
        questions.add(sQ5);


        Question sQ6 = new Question("Sports", "How many points did Kobe Bryant score in his last NBA game of NBA?", "60",
                new ArrayList<String>(Arrays.asList("50", "100", "75", "60")), " Kobe scored over 60 five times during his career.");
        questions.add(sQ6);


    }

    public void addQuestion(Question ques) {
        questions.clear();
        dataBase();
        questions.add(ques);
    }


    //Size of questionbs
    public int getSize(String genre)
    {
        if(genre.equals("Geography"))
        {
            return 5;
        }
        if(genre.equals("Animals"))
        {
            return 5;
        }
        if(genre.equals("Video Games"))
        {
            return 6;
        }
        if(genre.equals("Sports"))
        {
            return 6;
        }
        if(genre.equals("All"))
        {
            return 23;
        }
        return 1;
    }

}
