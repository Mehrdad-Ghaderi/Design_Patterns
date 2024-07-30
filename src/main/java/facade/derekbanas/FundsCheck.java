package facade.derekbanas;

public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    private void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    private void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > getCashInAccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdraw Complete: Current Balance is " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
    }
}
