package en.codegym.task.pro.task14.task1406;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Buy an elephant
*/

class Solution {
    static List<String> excuses = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Buy an elephant");
        } else if (answer.toLowerCase().equals("ok")) {
            System.out.println("That's better :) List of your excuses: ");
            throw new SecurityException();
        } else {
            excuses.add(answer);
            System.out.println("Everyone says \"" + answer + "\", but you say to buy an elephant");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (SecurityException e) {
            System.out.println(answer);
            throw e;
        }
    }
}

