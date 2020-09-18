package Computer.Strategy;

import Computer.Fabric.Game.*;
import Computer.Fabric.Work.*;

public class StrategyWork extends PurposeOfDevice {

    public StrategyWork(SamsungMonitor fabricMonitor, CorsairRam fabricRam, IntelProcessor fabricProcessor, AsusGraphicsCard
            fabricGraphicsCard, HddMemoryStorage fabricMemoryStorage) {
        super(fabricProcessor, fabricGraphicsCard, fabricRam, fabricMonitor, fabricMemoryStorage);
    }
}
