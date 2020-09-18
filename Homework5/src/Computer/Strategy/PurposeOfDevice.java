package Computer.Strategy;

import Computer.Computer;
import Computer.Fabric.*;
import Computer.MemoryStorage;

public abstract class PurposeOfDevice {

    public FabricProcessor fabricProcessor;
    public FabricGraphicsCard fabricGraphicsCard;
    public FabricRam fabricRam;
    public FabricMonitor fabricMonitor;
    public FabricMemoryStorage fabricMemoryStorage;

    public PurposeOfDevice(FabricProcessor fabricProcessor, FabricGraphicsCard fabricGraphicsCard, FabricRam fabricRam,
                           FabricMonitor fabricMonitor, FabricMemoryStorage fabricMemoryStorage) {
        this.fabricGraphicsCard = fabricGraphicsCard;
        this.fabricMemoryStorage = fabricMemoryStorage;
        this.fabricMonitor = fabricMonitor;
        this.fabricProcessor = fabricProcessor;
        this.fabricRam = fabricRam;
    }

    public void creationism(Computer computer) {
        computer.setGraphicsCard(fabricGraphicsCard.getGraphicsCard());
        computer.setMemoryStorage(fabricMemoryStorage.getMemoryStorage());
        computer.setMonitor(fabricMonitor.getMonitor());
        computer.setProcessor(fabricProcessor.getProcessor());
        computer.setRam(fabricRam.getRam());
    }
}





