package main;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.net.Administration.*;
import mindustry.world.blocks.storage.*;

public class norussians extends Plugin {

    //called when game initializes
    @Override
    public void init(){
        //listen for PlayerJoin event.
        Events.on(PlayerJoin.class, event -> {

        });
    }
}