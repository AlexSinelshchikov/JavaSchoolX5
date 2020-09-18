package Computer.Fabric.Game;

import Computer.Fabric.FabricMemoryStorage;
import Computer.MemoryStorage;

public class SshdMemoryStorage implements FabricMemoryStorage {

    @Override
    public MemoryStorage getMemoryStorage() {
        return new MemoryStorage("Seagate", 1000, "SSD", 3.5);
    }
}
