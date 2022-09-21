package origins.content;

import arc.graphics.Color;
import mindustry.type.*;

public class OriginItems {
    public static Item
        crystallizedSolarPower;

    public static void load() {
        crystallizedSolarPower = new Item("crystallized-solar-power", Color.valueOf("FF9000")){{
            hardness = 4;
            explosiveness = 0.6f;
        }};
    }
}
