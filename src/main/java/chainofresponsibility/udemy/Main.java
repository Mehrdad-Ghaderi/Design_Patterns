package chainofresponsibility.udemy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        CeoPurchasePower ceoPurchasePower = new CeoPurchasePower();
        DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
        ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();

        ceoPurchasePower.setSuccessor(directorPurchasePower);
        directorPurchasePower.setSuccessor(ceoPurchasePower);
        managerPurchasePower.setSuccessor(directorPurchasePower);

        while (true) {
            System.out.println("Enter the amount to check who should approve your budget:");

            try {
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                managerPurchasePower.processRequest(new PurchaseRequest(d, "Buy stuff"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
