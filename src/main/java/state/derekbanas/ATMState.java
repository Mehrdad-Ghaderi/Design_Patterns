package state.derekbanas;

public interface ATMState {

    //bring down all the possible states a context can be in to as few as possible cuz this can easily get confusing
    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);
}
