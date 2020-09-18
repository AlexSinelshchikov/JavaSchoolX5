package Computer.Fabric.Work;

import Computer.Fabric.FabricMemoryStorage;
import Computer.MemoryStorage;

public class HddMemoryStorage implements FabricMemoryStorage {
    @Override
    public MemoryStorage getMemoryStorage() {
        return new MemoryStorage("Western Digital", 2000, "HDD", 3.5 );
    }
}
