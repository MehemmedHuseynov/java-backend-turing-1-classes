package az.edu.turing.module01.lesson05;

import java.util.Scanner;

public class opretionApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        if (value % 3 == 0) {
            System.out.println("Edede 3 e bolunur ");
        } else if (value % 3 == 1) {
            System.out.println("Eded tam 3 bolunmur ve qaliq 1 dir ");
        } else {
            System.out.println("eded 3 tam bolunmur ve qaliq 2 dir");
        }

    }
}
