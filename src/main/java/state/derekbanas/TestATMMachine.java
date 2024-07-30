package state.derekbanas;

import proxy.derekbanas.ATMProxy;
import proxy.derekbanas.GetATMData;

public class TestATMMachine {

    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.ejectCard();
        atmMachine.insetCard();
        atmMachine.ejectCard();
        atmMachine.insetCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insetCard();
        atmMachine.insertPin(1234);

        GetATMData realATMMAchine = new proxy.derekbanas.ATMMachine();
        GetATMData atmProxy = new ATMProxy();

        System.out.println("\nCurrent ATM State " + atmProxy.getATMData());
        System.out.println("\nCurrent ATM State " + atmProxy.getCashInMachine());
        // you cant do this
        //atmProxy.setCash
    }
}
