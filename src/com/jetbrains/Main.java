package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String answer;
        Scanner scan = new Scanner(System.in);
        long userNumber = scan.nextLong();
        long initialNumber = userNumber;
        long factorialNumber = 0;

        do {
            System.out.println("Please enter any number between 1 & 25 you'd like a factorial of. ");

            //get the usernumber and get the factorial of it with this method
            factorialNumber = getFactorialNumber(userNumber, factorialNumber);

            //print output to user
            System.out.println("The factorial of " + initialNumber + " is " + factorialNumber + ".");

            //asks user if they want to continue
            answer = wantsToContinue(scan);
            if (answer == null) break;
        }
        while (answer.equalsIgnoreCase("Y"));

        //prints when user inputs anything besides Y or y
        System.out.println("Thanks. Have fun out there.");

    }

    private static String wantsToContinue(Scanner scan) {
        String answer;
        scan.nextLine();
        System.out.println("Continue? Y/N");
        answer = scan.nextLine();
        if (!answer.equals("Y")) {
            return null;
        }
        return answer;
    }

    private static long getFactorialNumber(long userNumber, long factorialNumber) {
        for (long i = userNumber - 1; i >= 1; i--) {
            userNumber = userNumber * i;
            factorialNumber = userNumber;
        }
        return factorialNumber;
    }
}
