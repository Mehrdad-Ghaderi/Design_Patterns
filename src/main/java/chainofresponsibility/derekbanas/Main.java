package chainofresponsibility.derekbanas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new SubtractNumbers();
        Chain chainCal3 = new MultiplyNumbers();
        Chain chainCal4 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        chainCal3.setNextChain(chainCal4);

        while (true) {
            System.out.println("Enter your first number, then the operation, then the second number:");

            try {
                int num1 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                String function = new BufferedReader(new InputStreamReader(System.in)).readLine();
                int num2 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                Numbers request = new Numbers(num1, num2, function);

                chainCal1.calculate(request);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
