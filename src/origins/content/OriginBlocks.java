package origins.content;

import mindustry.content.*;
import mindustry.ctype.ContentList;
import mindustry.world.*;
import mindustry.world.blocks.defense.*;
import mindustry.type.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.*;

public class OriginBlocks implements ContentList {
    public static Block
        myOwnTitaniumWall;
    
    @Override
    public void load() {
        myOwnTitaniumWall = new Wall("titanium-wall"){{
            requirements(Category.defense, with(Items.sand, 1));
            health = 100 * 4 * 4;
            envDisabled |= Env.scorching;
        }};
    }
}