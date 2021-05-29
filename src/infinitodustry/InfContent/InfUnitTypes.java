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
  
        //public static @EntityDef({Unitc.class}) UnitType slinger, knife, razor, sword, butcher;
  
        //public static @EntityDef({Unitc.class}) UnitType sledgehammer, warhammer, blitzhammer;
  
        //public static @EntityDef({Unitc.class}) paladin;

    // legged units
  
        //public static @EntityDef({Unitc.class, Legsc.class}) UnitType greatsword, blacksmith;
  
        public static @EntityDef({Unitc.class, Legsc.class}) UnitType mitosis;

    // flying units
  
        public static @EntityDef({Unitc.class}) UnitType shadow, abyss, /*cavum*/;
  
        public static @EntityDef(value = {Unitc.class}) UnitType nMess;

        //public static @EntityDef(value = {Unitc.class}) UnitType crusader, inqusitor, matyr;
  
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

        // public static @EntityDef({Unitc.class, Hoverc.class, UnitBuildc.class}) UnitType lua, python, java, nim, kotlin;

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

        //knife = new UnitType("smg-mech-1"){{}};

        //razor = new UnitType("smg-mech-2"){{}};

        //sword = new UnitType("smg-mech-3"){{}};

        //butcher = new UnitType("combat-platform"){{}};

        //slinger = new UnitType("missile-mech-1"){{}};

        //sledgehammer = new UnitType("missile-mech-2"){{}};

        //warhammer = new UnitType("missile-mech-3"){{}};

        //blitzhammer = new UnitType("missile-mech-surge"){{}};

        //paladin = new UnitType("missile-mech-blaster"){{}};

        //strong = new UnitType("strong-tank"){{}};

        //light = new UnitType("light-tank"){{}};

        //armored = new UnitType("armored-tank"){{}};

    //endregion
    //region legged units
    
        mitosis = new UnitType("mitosis"){{
              health = 200;
              armor = 1;
              abilities.add(new UnitSpawnAbility(this, 60f * 60f * 2f, 0f, 0f));
              speed = 0.9f;
              range = 160;
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

        //lua = new UnitType("lua"){{}};

        //python = new UnitType("python"){{}};

        //java = new UnitType("java"){{}};

        //nim = new UnitType("nim"){{}};

        //kotlin = new UnitType("kotlin"){{}};
    
    //endregion
    //region air units

        //aurora = new UnitType("ftl-unit-1"){{}};

        //coronal = new UnitType("ftl-unit-2"){{}};

        //nebula = new UnitType("ftl-unit-3"){{}};

        //plasmoid = new UnitType("ftl-unit-4"){{}};

        //luminosity = new UnitType("ftl-unit-5"){{}};
          
    //endregion
    //region drones

        float nMessBuildTime = 60f * 15f;
        nMess = new UnitType("a-lesser-mess"){{
            health = 105;
            speed = 3f;
            commandLimit = 5;

            cicleTarget = false;
            accel = 0.2f;
            drag = 0.01;
            hitSize = 6f;
            flying = true;

            engineOffset = 5.5f;
            buildSpeed = 0.5f;
            weapons.add(new Weapon("clear"){{
                reload = 20;
                shootSound = Sounds.bang;
                x = 0;
                y = 2;

                ejectEffect = Fx.casing1;
                bullet = Bullets.standardDense;
            }});
        }};
      
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
               cicleTarget = false;
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
        }}; 
      
        abyss = new UnitType("assassin-drone-mk2"){{
              health = 450;
              armor = 25f;
              speed = 1.05f;
              commandLimit = 6f;
              range = 150;
        
              //exists = false;
              cicleTarget = false;
              drag = 0.9f;
              hitSize = 14f;
              flying = true;
              mass = 15f; 
              crashDamageMultiplier = 0.4f;
        
              engineOffset = 7f;
              ammoType = AmmoTypes.power;
              weapons.add(new Weapon("clear")){{
                     ammoMultiplier = 1.75f;
                     reload = 30;
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
        }};
      
    //endregion
    //region other flying units
    
    //endregion
    //region bosses
    
    //cycler = new UnitType("cycler"){{}};
      
    /*
    mess = new UnitType("a-mess"){{
        health = 45000;
        armor = 250;
        abilities.add(new UnitSpawnAbility(nMess, nMessBuildTime, 14f, 0f), new UnitSpawnAbility(nMess, nMessBuildTime, -14f, 0f), new UnitSpawnAbility(nMess, nMessBuildTime, 7f, 34f), new UnitSpawnAbility(nMess, nMessBuildTime, -7f, 34f), new UnitSpawnAbility(nMess, nMessBuildTime, 35f, -5f), new UnitSpawnAbility(nMess, nMessBuildTime, -35f, -5f), new UnitSpawnAbility(nMess, nMessBuildTime, 15f, -30f), new UnitSpawnAbility(nMess, nMessBuildTime, -15f, -30f));
        speed = 0.9f;
        accel = 0.05f;
        commandLimit = 14;

        drag = 2f;
        hitSize = 65f;
        flying = true;
        buildSpeed = 3.5f;
        payloadCapacity = (5.3f * 5.3f) * tilePayload;
        defaultController = DefenderAI::new;

        engineOffset = 35f;
        engineSize = 7.8f;
        ammoCapacity = 2500;
        ammoResupplyAmount = 35;
    }};

    cedEx = new UnitType("delivery-time"){{
        health = 60000;
        armor = 25;
        abilities.add(new UnitSpawnAbility(UnitTypes.mono, 60f * 30f, 30f, 20f), new UnitSpawnAbility(UnitTypes.mono, 60f * 30f, -30f, 20f));
        abilities.add(new SupplementalUnitAbility(nMess, nMessBuildTime / 10f, 0f, -35f));
        speed = 0.9f;
        unitCapModifier = 14;
        commandLimit = 14;

        drag = 1f;
        flying = true;
        buildSpeed = 1.45f;
        payloadCapacity = (6f * 4.2f) * tilePayload;
        rotateShooting = false;
        defaultController = DefenderAI::new;

        priority = flag.core;
        itemCapacity = 17500;
        ammoCapacity = 5000;
        weapons.add(
            new Weapon ("typhoon"){{
                reload = 220;
                inaccuracy = 60;
                shootSound = Sounds.laserBlast;

                x = 15;
                y = -20;
                recoil = 1.6f;

                alternate = true;
                bullet = InfBullets.bayWarden;
        }});
        ammoType = AmmoTypes.powerLow;
    }};
      
    havocc = new UnitType("havocc"){{
        health = 3500;
        abilities.add(new PersonalShieldGenerationAbility((10000f, 500f, 60f / 2, 2500f));
        abilities.add(new UnitSpawnAbility(nMess, nMessBuildTime, 23.25f, -40.75f), new UnitSpawnAbility(nMess, nMessBuildTime, -23.25f, -40.75f));
        speed = 0.7f;
        movementRange = 200 * 8;

        drag = 5f;
        hitSize = 45f;
        flying = true;
        mass = 110f;
        crashDamageMultiplier = 100f;
        crashBullet = InfBullets.randomTempest;
        crashBullet.lifetime = 40f;

        weapons.add(
            new Weapon("battery-caster"){{
                reload = 340;
                shootSound = Sounds.bang;

                x = y = 0;

                shootEffect = Fx.lancerLaserCharge;
                bullet = InfBullets.randomTempest;
        }});
        ammoType = AmmoTypes.powerLow;
    }};
     */
      
    /*h = new (UnitType, "h"){{
         blockDamageMultiplier = 0.000000000000001f;
     }};*/        
    
    //endregion
    //region gods

    //divinity = new UnitType("divinity"){{}};

    //endregion     
    }
}
