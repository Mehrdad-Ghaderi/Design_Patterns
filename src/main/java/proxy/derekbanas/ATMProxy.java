package proxy.derekbanas;

public class ATMProxy implements GetATMData{ // this goes between the ATMMachine and the Client
    // it is run and tested in the state TestATMMachine
    @Override
    public ATMState getATMData() {
        ATMMachine realATMMachine = new ATMMachine();

        return realATMMachine.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        // we create a real ATMMachine and then send the state through the method
        return realATMMachine.getCashInMachine();
    }
}
