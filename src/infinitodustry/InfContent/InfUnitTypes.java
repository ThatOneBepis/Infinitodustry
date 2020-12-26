package infinitodustry.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.ai.types.*;
import mindustry.annotations.Annotations.*;
import mindustry.ctype.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;
import mindustry.content.*;
import infinitodustry.content.weapons.*;

import static mindustry.Vars.*;

public class InfinitodustryUnitTypes implements ContentList{
    // region classes
  
    // standard mechs

    // legged units     

    // flying units
       public static @EntityDef({Unitc.class}) UnitType shadow, abyss, /*cavum*/;
  
    // flying support units
  
    // hovering ground units
  
    // naval units
    
    // flying units (payload)
  
    // endregion
    const voidColor = Color.valueOf("791515");
    @Override
    public void load(){
      
        shadow = new UnitType("assassin-drone-mk1"){{
        health = 135f;
        speed = 1.45f;
        armor = 2f;
        commandLimit = 4f;
        range = 120f; 
    
        //exists = false;
        hitSize = 8f;
        flying = true;
        mass = 5f;
        crashDamageMultiplier = 0.4f;
        
        ammoType = AmmoTypes.power;
        weapons.add(new Weapon("clear"){{
           reload = 120f;
           shootSound = Sounds.none;
            
           x = 0f;
           y = 2f;
            
           bullet = new BasicBulletType(){{
                frontColor = backColor = voidColor;
                speed = 5f;
                damage = 150f;
                lifetime = 30f;
             }};
        }});
        weapons.add(InfWeapons.distancer);     
        }};
        abyss = new UnitType("assassin-drone-mk2"){{
        health = 450f;
        speed = 1.05f;
        armor = 25f;
        commandLimit = 6f;
        range = 150;
        
        //exists = false;
        hitSize = 14f;
        flying = true;
        mass = 15f;
        drag= 0.9f;
        crashDamageMultiplier = 0.4f;
        
        engineOffset = 7f;
        ammoType = AmmoTypes.power;
        weapons.add(new Weapon("clear")){{
          ammoMultiplier = 1.75f;
          reload = 30f;
          shootSound = Sounds.conveyor;
            
          x = 0f;
          y = 2f;  
              
          bullet = new SapBulletType(){{
                color = voidColor;
                length = 150f;
                width = 5;
                sapStrength = 0.2f;
                damage = 20f;
            }};
            }};
        weapons.add(InfWeapons.distancer);
        }};  
    }
}
