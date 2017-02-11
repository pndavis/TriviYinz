package com.example.paul.steelhacks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionsManager {
    ArrayList<Questions> QuestionList = new ArrayList<Questions>();

    public QuestionsManager(String categories) throws FileNotFoundException{
        try {
            Scanner input = new Scanner(new File(categories + ".txt"));
            input.useDelimiter(", ");

            while (input.hasNext())
            {
                QuestionList.add(new Questions(input.next(), input.next(), input.next(), input.next(), input.next(), input.nextInt()));
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

        return QuestionList.get(n);
    }
}
