package Computer;

public class Computer {

    private Processor processor;
    private GraphicsCard graphicsCard;
    private MemoryStorage memoryStorage;
    private Monitor monitor;
    private Ram ram;

    public Computer (Processor processor, GraphicsCard graphicsCard, MemoryStorage memoryStorage, Monitor monitor, Ram ram) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.memoryStorage = memoryStorage;
        this.monitor = monitor;
        this.ram = ram;
    }

    public Computer() {

    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public MemoryStorage getMemoryStorage() {
        return memoryStorage;
    }

    public void setMemoryStorage(MemoryStorage memoryStorage) {
        this.memoryStorage = memoryStorage;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Компьютер: " +  processor + ";" +  graphicsCard + ";" + memoryStorage + ";" +  monitor + ";"  + ram + ".";
    }
}
