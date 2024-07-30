package facade.derekbanas;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode) {

        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        bankWelcome = new WelcomeToBank();
        accountNumberChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountNumberChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundsChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
     }

    public void depositCash(double cashToDeposit) {
        if (accountNumberChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {
            fundsChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete \n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }
}
