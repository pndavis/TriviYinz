package com.example.paul.steelhacks;

public class Questions {
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int answer;

    public Questions(){

    }

    public Questions(String q, String o1, String o2, String o3, String o4, String a){
        question = q;
        option1 = o1;
        option2 = o2;
        option3 = o3;
        option4 = o4;
        answer = Integer.parseInt(a);
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public int getAnswer() {
        return answer;
    }

    public String toString(){
        return "Question: " + question + "Options: " + option1 + ", " + option2 + ", " + option3 + ", " + option4 + "Answer" + answer;
    }
}
