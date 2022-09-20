package origins.content;

import mindustry.contents.*;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.type.*;
import mindustry.world.meta.*;

public class OriginBlocks implements ContentList {
    public static Block
        myOwnTitaniumWall;
    
    @Override
    public void load() {
        myOwnTitaniumWall = new Wall("titaniun-wall"){{
            requirements(Category.defense, with(Items.sand, 1)),
            health = 100 * 4 * 4,
            envDisabled |= Env.scorching,
        }}
    }
}