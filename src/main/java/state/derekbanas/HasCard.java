package state.derekbanas;

public class HasCard implements ATMState{

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState()); // change the state of ATM after ejection

    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("Correct PIN!");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasPin()); // change the state of ATM Pin is entered
        } else {
            System.out.println("Wrong PIN!");
            atmMachine.correctPinEntered = false;
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN First");
    }
}
