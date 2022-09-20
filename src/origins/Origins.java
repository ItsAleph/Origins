package origins;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class Origins extends Mod{

    public Origins(){
        Log.info("Loaded Origins constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Welcome");
                dialog.cont.add("This mod is super experimental and can break (almost) everything so use it it with caution!").row();
                dialog.cont.add("It is highly recommended to backup your data somewhere or else you might loose all your progress!").row();
                dialog.cont.button("I understand", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some Origins content.");
    }

}
