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
import infinitodustry.content.*;

import static mindustry.Vars.*;

public class InfUnitTypes implements ContentList{
    // region definitions
  
    // standard mechs
  
        //public static @EntityDef({Unitc.class}) UnitType slinger, knife, sword, butcher;
  
        //public static @EntityDef({Unitc.class}) UnitType sledgehammer, warhammer, blitzhammer;
  
        //public static @EntityDef({Unitc.class}) paladin;

    // legged units
  
        //public static @EntityDef({Unitc.class, Legsc.class}) UnitType greatsword, blacksmith;
  
        public static @EntityDef({Unitc.class, Legsc.class}) UnitType mitosis;

    // flying units
  
        public static @EntityDef({Unitc.class}) UnitType shadow, abyss, /*cavum*/;
  
        public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType nMess;

        //public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType crusader, inqusitor, matyr;
  
        //public static @EntityDef({Unitc.class}) UnitType aurora, coronal;
  
        //public static @EntityDef({Unitc.class}) UnitType knight, nebula, plasmoid, luminosity, angel;
   
    // flying support units
  
        //public static @EntityDef({Unitc.class, Healerc.class}) UnitType priest, partiarch, archangel;
       
        //public static @EntityDef({Unitc.class, Healerc.class}) UnitType divinity;
  
        //public static @EntityDef({Unitc.class}) UnitType monarch;
  
        //public static @EntityDef({Unitc.class}) UnitType angel;

        public static @EntityDef(value = {Unitc.class}, legacy = true) UnitType draug;
  
    // tanks, yeah thats the entire definition

        //public static @EntityDef({Unitc.class, Trackc.class}) UnitType strong, light, armored;
  
    // hovering ground units

        // public static @EntityDef({Unitc.class, Hoverc.class}) UnitType tide, flood, dolphin;
  
    // naval units
    
    // flying units (payload)
  
        //public static @EntityDef({Unitc.class, Payloadc.class, AmmoDistributec.class}) UnitType octmega, mess;
  
        //public static @EntityDef({Unitc.class, Payloadc.class, MobileCorec.class}) UnitType fedEx;
  
    // endregion
    const voidColor = Color.valueOf("791515");
    const zapColor = Color.valueOf("a9d8ff");
    @Override
    public void load(){
    //region ground units
    
    //endregion
    //region legged units
    
        mitosis = new UnitType("mitosis"){{
              health = 200;
              speed = 0.9f;
              armor = 1;
              range = 160f;
              itemCapacity = 20;
        
              rotateSpeed = 3f;
              hitSize = 6f;
              sway = 0.2f;
              visualElevation = 0.2f;
        
              allowLegStep = true;
              legCount = 6;
              legLength = 5f;
              legTrns = 0.6f;
              legMoveSpace = 0.5f;
        
              weapons.add(new Weapon("mini-gauss"){{;
                     reload = 100f;
                     shootSound = Sounds.shootBig;
                     ejectEffect = Fx.casing2;
                     
                     mirror = false;
                     x = 0;
                     y = -4;
            
                     bullet = new MissileBulletType(){{
                            speed = 2f;
                            splashDamage = 75f;
                            splashDamageRadius = 25f;
                            lifetime = 80f;
                         }};                  
                }});                    
            }};
    
    //endregion
    //region naval
    
    //endregion
    //region hovercrafts
    
    //endregion
    //region air units
      
        nMess = new UnitType("a-lesser-mess"){{
              health = 105;
              speed = 3f;
              commandLimit = 5;
        
              accel = 0.2f;
              drag = 0.01;
              hitSize = 6f;
              flying = true;
              
              engineOffset = 5.5f;
              buildSpeed = 0.5f;
              weapons.add(new Weapon("clear"){{
                     reload = 20;
                     ejectEffect = Fx.casing1;
                     shootSound = Sounds.bang;
                     bullet = Bullets.standardDense;
                     
                     x = 0;
                     y = 2;
                  }});
          }};
          
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
        
              engineSize = 1.8f;
              engineOffset = 5.7f;
              ammoType = AmmoTypes.powerLow;
              mineSpeed = 0.9f;
              mineTier = 1;
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
                     reload = 120;
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
              drag = 0.9f;
              hitSize = 14f;
              flying = true;
              mass = 15f; 
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
    
    //cycler = new (UnitType, "cycler"){{}};
      
    //mess = new (UnitType, "a-mess"){{}};
      
    //tedEx = new (UnitType, "delivery-time"){{}};
      
    //havocc = new (UnitType, "havocc"){{}};
      
    /*h = new (UnitType, "h"){{
         blockDamageMultiplier = 0.000000000000001f;
     }};*/        
    
    //endregion
    //region gods
    
    //endregion     
    }
}
