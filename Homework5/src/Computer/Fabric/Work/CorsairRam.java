package Computer.Fabric.Work;

import Computer.Fabric.FabricRam;
import Computer.Ram;

public class CorsairRam implements FabricRam {
    @Override
    public Ram getRam() {
        return new Ram ("Corsair", 8, 2666, "DDR4");
    }
}
