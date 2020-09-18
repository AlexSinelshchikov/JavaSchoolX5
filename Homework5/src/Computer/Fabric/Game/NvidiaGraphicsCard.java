package Computer.Fabric.Game;

import Computer.Fabric.FabricGraphicsCard;
import Computer.GraphicsCard;

public class NvidiaGraphicsCard implements FabricGraphicsCard {

    @Override
    public GraphicsCard getGraphicsCard() {
        return new GraphicsCard("nVidia", "GDDR6", 11264, "Water cooling");
    }
}
