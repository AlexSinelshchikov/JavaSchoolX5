package Computer.Fabric.Game;

import Computer.Fabric.FabricMonitor;
import Computer.Monitor;

public class DellMonitor implements FabricMonitor {

    @Override
    public Monitor getMonitor() {
        return new Monitor("Dell", 24, "OLED");
    }
}
