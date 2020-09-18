package Computer.Strategy;

import Computer.Fabric.Game.*;

public class StrategyGame extends PurposeOfDevice {

    public StrategyGame (DellMonitor fabricMonitor, GigabyteRam fabricRam, IntelProcessorI7 fabricProcessor, NvidiaGraphicsCard
                         fabricGraphicsCard, SshdMemoryStorage fabricMemoryStorage) {
        super(fabricProcessor, fabricGraphicsCard, fabricRam, fabricMonitor, fabricMemoryStorage);
    }
}
