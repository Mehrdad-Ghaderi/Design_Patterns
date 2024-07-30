package chainofresponsibility.derekbanas.prac;

import chainofresponsibility.derekbanas.Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        Chain add = new Add();
        Chain subtract = new Subtract();
        Chain multiply = new Multiply();
        Chain divide = new Divide();

        add.setNextInChain(subtract);
        subtract.setNextInChain(multiply);
        multiply.setNextInChain(divide);

        while (true) {
            System.out.println("Enter your first number, then the operation, then the second number:");

            try {
                int num1 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                String operation = new BufferedReader(new InputStreamReader(System.in)).readLine();
                int num2 = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                Function function = new Function(num1, num2, operation);

                System.out.println(add.calculate(function));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
