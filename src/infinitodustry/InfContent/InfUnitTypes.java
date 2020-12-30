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
    // region definitions
  
    // standard mechs

    // legged units
  
       //public static @EntityDef({Unitc.class, Legsc.class}) UnitType mitosis;      

    // flying units
  
       public static @EntityDef({Unitc.class}) UnitType shadow, abyss, /*cavum*/;
  
       //public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType nMess;
  
       //public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType crusader, inqusitor, matyr;
  
       //public static @EntityDef({Unitc.class}) UnitType aurora, coronal;
  
       //public static @EntityDef({Unitc.class}) UnitType knight, nebula, plasmoid, luminosity, angel;
  
   
    // flying support units
  
       //public static @EntityDef({Unitc.class, Unitc.healerc.class}) UnitType priest, partiarch, archangel;
       
       //public static @EntityDef({Unitc.class}) UnitType monarch;
  
       public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType draug;
  
    // hovering ground units
  
    // naval units
    
    // flying units (payload)
  
    //public static @EntityDef({Unitc.class, Payloadc.class, AmmoDistributec.class}) UnitType octmega, mess;
  
    //public static @EntityDef({Unitc.class, Payloadc.class, MobileCorec.class}) UnitType fedEx;
  
    // endregion
    const voidColor = Color.valueOf("791515");
    @Override
    public void load(){
    //region mechs
    
    //endregion
    //region legged units
    
    //endregion
    //region naval
    
    //endregion
    //region hovercrafts
    
    //endregion
    //region air units
    
    //endregion
    //region drones
      
        draug = new UnitType("draug"){{
              defaultController = MinerAI::new; 
              health = 80;
              speed = 1.2f;
              range = 50f;
        
              accel = 0.3f;
              drag = 0.01f;
              flying = true;
        
              ammoType = AmmoTypes.powerLow;
              mineSpeed = 0.9f;
              mineTier = 1;
        
              engineSize = 1.8f;
              engineOffset = 5.7f;
        }};
           
        shadow = new UnitType("assassin-drone-mk1"){{
               health = 135;
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
                                        damage = 150;
                                        lifetime = 30f;
             }};
        }});
             weapons.add(InfWeapons.distancer);     
        }}; 
      
        abyss = new UnitType("assassin-drone-mk2"){{
              health = 450;
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
                                     width = 5f;
                                     sapStrength = 0.2f;
                                     damage = 20;
            }};
            }};
            weapons.add(InfWeapons.distancer);
        }};
      
    //endregion
    //region other flying units
    
    //endregion
    //region bosses
    
    //endregion
    //region gods
    
    //endregion     
    }
}
