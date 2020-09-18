package Computer.Facade;

import Computer.Computer;
import Computer.Fabric.Game.*;
import Computer.Fabric.Work.*;
import Computer.PurposeOfComputer;
import Computer.Strategy.PurposeOfDevice;
import Computer.Strategy.StrategyGame;
import Computer.Strategy.StrategyWork;

public class FacadeComputer {

    public void findOutDestination(Computer computer, PurposeOfComputer purposeOfComputer) {

        PurposeOfDevice assembly;

        switch (purposeOfComputer) {

            case WORK:

                assembly = new StrategyWork(new SamsungMonitor(), new CorsairRam(), new IntelProcessor(),
                        new AsusGraphicsCard(), new HddMemoryStorage());
                break;

            case GAME:

                assembly = new StrategyGame(new DellMonitor(), new GigabyteRam(), new IntelProcessorI7(),
                        new NvidiaGraphicsCard(), new SshdMemoryStorage());
                break;

            default:
                assembly = null;

        }
        assembly.creationism(computer);
    }
}









