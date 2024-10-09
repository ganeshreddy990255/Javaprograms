

import java.util.Random;
import java.util.Scanner;

public class Quizgame {
	    private static boolean used5050 = false;
	    private static boolean usedAudience = false;
	    Question q = new Question();
	    public static void main(String[] args) {
	        // Array of questions
	        Question[] questions = {
	            new Question(),
	            new Question(),
	            // Add more questions here
	        };

	        int score = 0;
	        Scanner scanner = new Scanner(System.in);

	        // Iterate over each question
	        for (Question question : questions) {
	            System.out.println(question.getQuestionText());
	            String[] options = question.getOptions();
	            for (String option : options) {
	                System.out.println(option);
	            }

	            // Offer lifelines
	            System.out.println("\nWould you like to use a lifeline? (Type '5050' for 50:50 or 'audience' to Ask the Audience or 'none')");
	            String lifelineChoice = scanner.nextLine();

	            if (lifelineChoice.equalsIgnoreCase("5050") && !used5050) {
	                use5050(question);
	                used5050 = true;
	            } else if (lifelineChoice.equalsIgnoreCase("audience") && !usedAudience) {
	                askTheAudience(question);
	                usedAudience = true;
	            } else if (!lifelineChoice.equalsIgnoreCase("none")) {
	                System.out.println("Lifeline already used or invalid choice.");
	            }

	            // Get the answer from the player
	            System.out.print("Enter your answer (A, B, C, or D): ");
	            String answer = scanner.nextLine().toUpperCase();

	            // Check if the answer is correct
	            if (answer.equals(question.getCorrectAnswer())) {
	                System.out.println("Correct!");
	                score++;
	            } else {
	                System.out.println("Wrong! The correct answer was " + question.getCorrectAnswer());
	            }

	            System.out.println();
	        }

	        // Display final score
	        System.out.println("Quiz finished! Your final score is: " + score + "/" + questions.length);
	        scanner.close();
	    }

	    // Lifeline: 50:50
	    private static void use5050(Question question) {
	        String correct = question.getCorrectAnswer();
	        Random random = new Random();
	        String[] options = question.getOptions();
	        String incorrect1 = " ", incorrect2 = " ";

	        // Find incorrect answers to remove
	        int removedCount = 0;
	        while (removedCount < 2) {
	            int randomIndex = random.nextInt(4); // Pick random index from options
	            String option = options[randomIndex].substring(0, 1); // Get the option letter (A, B, C, D)
	            if (!option.equals(correct)) {
	                if (removedCount == 0) {
	                    incorrect1 = options[randomIndex];
	                    removedCount++;
	                } else if (!options[randomIndex].equals(incorrect1)) {
	                    incorrect2 = options[randomIndex];
	                    removedCount++;
	                }
	            }
	        }

	        System.out.println("50:50 Lifeline used! Remaining options:");
	        System.out.println(correct + ": " + options[correct.charAt(0) - 'A']);
	        System.out.println(incorrect1 + ": " + incorrect2);
	    }

	    // Lifeline: Ask the Audience
	    private static void askTheAudience(Question question) {
	        Random random = new Random();
	        int correctPercentage = random.nextInt(41) + 60; // Random percentage between 60-100 for the correct answer
	        int otherPercentage = 100 - correctPercentage;
	        System.out.println("Audience results:");
	        System.out.println(question.getCorrectAnswer() + ": " + correctPercentage + "%");
	        System.out.println("Others: " + otherPercentage + "% split among remaining answers.");
	    }
	}

