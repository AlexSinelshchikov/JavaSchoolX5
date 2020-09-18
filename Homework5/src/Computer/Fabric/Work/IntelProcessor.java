package Computer.Fabric.Work;

import Computer.Fabric.FabricProcessor;
import Computer.Processor;

public class IntelProcessor implements FabricProcessor {

    @Override
    public Processor getProcessor() {
        return new Processor(3.2,4, 1.5, "Core i5", "Intel");
    }
}
