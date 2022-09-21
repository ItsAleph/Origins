package origins.content;

import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.type.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.environment.*;

import static mindustry.type.ItemStack.*;

public class OriginBlocks {
    public static Block
        oreCrystallizedSolarPower,
        crystallizedSolarPowerWall;
    public static void load() {
        oreCrystallizedSolarPower = new OreBlock(OriginItems.crystallizedSolarPower){{
           oreDefault = true;
        }};

        crystallizedSolarPowerWall = new Wall("crystallized-solar-power-wall"){{
            requirements(Category.defense, with(OriginItems.crystallizedSolarPower, 1));
            health = 100 * 4 * 4;
            envDisabled |= Env.scorching;
            lightningChance = 0.1f;
        }};
    }
}