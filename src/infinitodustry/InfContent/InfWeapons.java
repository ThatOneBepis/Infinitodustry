package infinitodustry.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.weapon.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.io.*;
import mindustry.world.*;
import mindustry.content.*;
import infinitodustry.entities.weapon.*;

import static mindustry.Vars.*;

public class InfinitodustryWeapons implements ContentList{
    public static Weapon
  

    @Override
    public void load(){
      distancer = new("clear"){{
          bullet = new BasicBulletType(){{
            instantDissapear = true;
            lifetime = 200f;
         }};
         rotate = true;   
       }};
      }
  }
}
