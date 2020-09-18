package Computer.Fabric.Game;

import Computer.Fabric.FabricProcessor;
import Computer.Processor;

public class IntelProcessorI7 implements FabricProcessor {

    @Override
    public Processor getProcessor() {
        return new Processor(4.2, 16, 2.0, "Core i7", "Intel");
    }
}
