package com.example.paul.steelhacks;

import android.content.res.AssetManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionsManager {
    ArrayList<Questions> QuestionList = new ArrayList<Questions>();
    ArrayList<Integer> UsedQuestions = new ArrayList<Integer>();
    String inventions = "What carnival ride was invented by a yinzer?, Carousel, Ferris Wheel, Bumper Cars, Scrambler, 1, The Klondike Bar was invented in Pittsburgh by the owner of what business?, Ice Cream Shop, Bakery, Restaurant, Deli, 3, What McDonald's menu item was created by a franchisee in Pittsburgh?, Big Mac, McRib, Snack Wrap, Chicken McNuggets, 0, Jonas Salk a researcher at the University of Pittsburgh invented the vaccine for what disease?, Measles, Small Pox, Polio, Rubella, 2, The Poison Center at Children's Hospital of Pittsburgh created what?, Mr. Yuck Stickers, Child Locks, Non-Toxic Disinfectant, Ipecac, 0, What game was invented in Pittsburgh?, Monopoly, Bingo, LIFE, Trouble, 1, What emoticon was first used by a CMU computer scientist?, :-), 8-), <3, ¯\\_(ツ)_/¯, 0";

    public QuestionsManager(String categories) throws FileNotFoundException{
        //try {
            //File file = new File(categories+".txt");
            Scanner input = new Scanner(inventions);
            input.useDelimiter(", ");
            int i = 0;

            while (input.hasNext())
            {
                //System.out.println(input.next()+"\n"+input.next());
                QuestionList.add(new Questions(input.next(), input.next(), input.next(), input.next(), input.next(), input.next()));
                //System.out.println(QuestionList.get(i).toString());
                //input.nextLine();
                i++;
            }
       // }
        /*catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }*/

    }

    public Questions getQuestion()
    {
        Random rand = new Random();
        int  n = rand.nextInt(QuestionList.size());
        while(UsedQuestions.contains(n)){
            n = rand.nextInt(QuestionList.size());
        }
        UsedQuestions.add(n);
        if(UsedQuestions.size() == QuestionList.size()) UsedQuestions.clear();
        return QuestionList.get(n);
    }
}
