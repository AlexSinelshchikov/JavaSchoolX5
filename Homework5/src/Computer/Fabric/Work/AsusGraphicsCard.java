package Computer.Fabric.Work;

import Computer.Fabric.FabricGraphicsCard;
import Computer.GraphicsCard;

public class AsusGraphicsCard implements FabricGraphicsCard {

    @Override
    public GraphicsCard getGraphicsCard() {
        return new GraphicsCard("ASUS", "GDDR6", 6144, "passive");
    }


}
