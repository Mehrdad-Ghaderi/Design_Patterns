package proxy.derekbanas;

public class ATMMachine implements GetATMData {
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;
    int cashInMachine = 2000;


    @Override
    public ATMState getATMData() {
        return atmState;
    }

    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
