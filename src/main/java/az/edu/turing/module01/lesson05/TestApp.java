package az.edu.turing.module01.lesson05;

public class TestApp {
    public static void main(String[] args) {
        int a = 10;

        a -= 3;
        System.out.println("a -= 3 əməliyyatı sonrası a-nın dəyəri: " + a);


        a++;
        System.out.println("a++ əməliyyatı sonrası a-nın dəyəri: " + a);

        int b = 8;
        if (a == b) {
            System.out.println("a və b bərabərdir.");
        }

        int c = 5;
        if (a != c) {
            System.out.println("a və c fərqlidir.");
        }
    }
}
