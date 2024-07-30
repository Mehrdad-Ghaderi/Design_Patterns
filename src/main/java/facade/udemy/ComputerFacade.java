package facade.udemy;

import facade.udemy.subsystem.CPU;
import facade.udemy.subsystem.HardDrive;
import facade.udemy.subsystem.Memory;

public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hdd;

    public ComputerFacade() {
        processor = new CPU();
        ram = new Memory();
        hdd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(1328, hdd.read(845, 89));

        processor.jump(1325);
        processor.execute();
    }
}
