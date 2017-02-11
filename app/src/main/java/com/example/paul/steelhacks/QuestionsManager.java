package com.example.paul.steelhacks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class QuestionsManager {
    public QuestionsManager() throws FileNotFoundException{
        try {
            Scanner input = new Scanner(new File("Inventions.txt"));
            input.useDelimiter(", ");




        }
        catch (FileNotFoundException)
        {

        }

    }
}
