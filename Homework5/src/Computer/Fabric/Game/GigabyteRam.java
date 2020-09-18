package Computer.Fabric.Game;

import Computer.Fabric.FabricRam;
import Computer.Ram;

public class GigabyteRam implements FabricRam {

    @Override
    public Ram getRam() {
        return new Ram("Gigabyte", 16, 3200, "DDR4");
    }
}
