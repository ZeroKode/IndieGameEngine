package com.github.zerokode.coreengine.objects;

import com.github.zerokode.coreengine.objects.characters.Player;
import lombok.Data;

@Data
public class Scenario {

    World world;
    Camera camera;
    Player player;

}
