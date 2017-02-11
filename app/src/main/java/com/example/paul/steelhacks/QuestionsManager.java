package com.example.paul.steelhacks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionsManager {
    ArrayList<Questions> inventionQs = new ArrayList<Questions>();

    public QuestionsManager() throws FileNotFoundException{
        try {
            Scanner input = new Scanner(new File("Inventions.txt"));
            input.useDelimiter(", ");

            while (input.hasNext())
            {
                inventionQs.add(new Questions(input.next(), input.next(), input.next(), input.next(), input.next(), input.nextInt()));
            }


        }
        catch (FileNotFoundException e)
        {

        }

    }

    public Questions getQuestion()
    {
        Random rand = new Random();
        int  n = rand.nextInt(inventionQs.size());


        return inventionQs.get(n);
    }
}
