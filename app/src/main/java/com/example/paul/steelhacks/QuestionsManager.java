package com.example.paul.steelhacks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionsManager {
    ArrayList<Questions> QuestionList = new ArrayList<Questions>();
    ArrayList<Integer> UsedQuestions = new ArrayList<Integer>();

    public QuestionsManager(String categories) throws FileNotFoundException{
        try {
            Scanner input = new Scanner(new File("assets/"+categories + ".txt"));
            input.useDelimiter(", ");

            while (input.hasNext())
            {
                QuestionList.add(new Questions(input.next(), input.next(), input.next(), input.next(), input.next(), input.nextInt()));
                input.nextLine();
            }
        }
        catch (FileNotFoundException e)
        {

        }

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
