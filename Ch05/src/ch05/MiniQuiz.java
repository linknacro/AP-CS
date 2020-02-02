/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author 19502
 */
import java.util.Scanner;

public class MiniQuiz {
    //-----------------------------------------------------------------
    //  Presents a short quiz.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        Question q1, q2;

        q1 = new Question("What is the capital of Jamaica?",
                "Kingston");
        q1.setComplexity(4);

        q2 = new Question("Which is worse, ignorance or apathy?",
                "I don't know and I don't care");
        q2.setComplexity(10);
        
        System.out.println(Question.getName());
        Question.printName();

        MiniQuiz.askQuestion(q1);

        MiniQuiz.askQuestion(q2);
    }

    private static void askQuestion(Question question) {
        Scanner scan = new Scanner(System.in);
        System.out.print(question.getQuestion());
        System.out.println(" (Level: " + question.getComplexity() + ")");
        String possible = scan.nextLine();
        if (question.answerCorrect(possible)) {
            System.out.println("Correct");
        } else {
            System.out.println("No, the answer is " + question.getAnswer());
        }
    }
}
