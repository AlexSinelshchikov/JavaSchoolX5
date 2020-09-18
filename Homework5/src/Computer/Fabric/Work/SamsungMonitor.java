package Computer.Fabric.Work;

import Computer.Fabric.FabricMonitor;
import Computer.Monitor;

public class  SamsungMonitor implements FabricMonitor {

    @Override
    public Monitor getMonitor() {
        return new Monitor("Samsung", 19, "IPS");
    }
}
