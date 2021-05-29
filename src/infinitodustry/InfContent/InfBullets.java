package infinitodustry.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.ctype.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.io.*;
import mindustry.world.*;
import mindustry.content.*;
import infinitodustry.entities.bullet.*;
import infinitodustry.entities.bullet.special.*;
import infinitodustry.content.*;

import static mindustry.Vars.*;

public class InfBullets implements ContentList{
    public static BulletType

    //shells
    randomTempest, bayWarden,
    flakCopper, flakTitan, flakIncendiary, nyoomFlak, flakOxiCopper,

    //missiles

    //standard
    apCopper, apDense, apScrap, quantumBolt, apempBolt, apOxiCopper,

    //lasers
  
    //beams
  
    //energy
   
    //liquid
    inkyShot, ionShot, lemonShot, spaceShot, errorShot, heavyInkyShot, heavyIonShot, heavyLemonShot, heavySpaceShot, heavyErrorShot;//,

    //environment, misc.

    @Override
    public void load(){
        //region artillery

        //endregion
        //region flak

        flakCopper = new FlakBulletType(4.5f, 35){{
            lifetime = 45;
            splashDamage = 10f;
            splashDamageRadius = 15f;
            shootEffect = Fx.shootSmall;
            hitEffect = Fx.flakExplosion;
            width = 6f;
            height = 10f;
        }};

        flakTitan = new FlakBulletType(4.5f, 20){{
            pierce = true;
            pierceCap = 2;
            lifetime = 45;
            splashDamage = 15f;
            splashDamageRadius = 15f;
            shootEffect = Fx.shootSmall;
            hitEffect = Fx.flakExplosion;
            reloadMultiplier = 1.2f;
            width = 6f;
            height = 10f;
        }};

        flakIncendiary = new FlakBulletType(5f, 25){{
            splashDamage = 40f;
            splashDamageRadius = 30f;
            shootEffect = Fx.shootSmall;
            hitEffect = Fx.flakExplosion;
            width = 6f;
            height = 10f;
            incendAmount = 15f;
        }};

        flakOxiCopper = new FlakBulletType(5f, 65){{
            pierce = true;
            pierceCap = 3;
            splashDamage = 10f;
            splashDamageRadius = 15f;
            shootEffect = Fx.shootSmall;
            hitEffect = Fx.flakExplosion;
            width = 6f;
            height = 10f;
        }};

        nyoomFlak = new FlakBulletType(7f, 25){{
            lifetime = 30;
            shootEffect = Fx.shootSmall;
            hitEffect = Fx.flakExplosion;
            width = 6f;
            height = 10f;
            reloadMultiplier = 1.1f;
        }};

        //endregion
        //region explosives

        //endregion
        //region standard bullets

        apCopper = new BasicBulletType(6f, 20){{
            pierce = true;
            pierceCap = 3;
            lifetime = 25f;
            width = 6f;
            height = 10f;
            shootEffect = Fx.shootSmall;
            smokeEffect = Fx.shootSmallSmoke;
        }};

        apDense = new BasicBulletType(6f, 30){{
            pierce = true;
            pierceCap = 3;
            lifetime = 25f;
            width = 6f;
            height = 10f;
            shootEffect = Fx.shootSmall;
            smokeEffect = Fx.shootSmallSmoke;
            reloadMultiplier = 0.8f;
        }};

        quantumBolt new BasicBulletType(6f, 25){{
            pierce = true;
            pierceCap = 15;
            lifetime = 25f;
            width = 6f;
            height = 10f;
            shootEffect = Fx.shootSmall;
            smokeEffect = Fx.shootSmallSmoke;
        }};

        apempBolt new BasicBulletType(6f, 50){{
            pierce = true;
            pierceCap = 5;
            lifetime = 25f;
            width = 6f;
            height = 10f;
            shootEffect = Fx.shootSmall;
            smokeEffect = Fx.shootSmallSmoke;

            lightning = 2;
            lightningLength = 10;
        }};

        apOxiCopper new BasicBulletType(6f, 65){{
            pierce = true;
            pierceCap = 5;
            lifetime = 25f;
            width = 6f;
            height = 10f;
            shootEffect = Fx.shootSmall;
            smokeEffect = Fx.shootSmallSmoke;
        }};

        //endregion
        //region energy projectiles

        randomTempest = new BombBulletType(450f, 100f){{
           lifetime = 120f;
           //lifetimeMin = 60f;
           //lifetimeMax = 180f;
           hittable = false;
           reflectable = false;

           fragBullet = Bullets.artilleryExplosive;
           fragBullets = 15;
           lightning = 25;
           lightningLength = 30;
           lightningLengthRand = 5;
           lightningDamage = 5;

           frontColor = Color.valueOf("791515");
           backColor = Color.valueOf("6a0e0e");
           status = StatusEffects.shocked;
        }};

        bayWarden = new ArtilleryBulletType(5f, 40, "shell"){{
            lifetime = 95f;
            width = height = 12f;
            colidesAir = true;
            collidesTiles = false;
            splashDamageRadius = 35f * 0.75f;
            splashDamage = 95f;
            shootEffect = Fx.sparkShoot;

            lightning = 5;
            lightningLength = 6;
            lightningDamage = 10;

            frontColor = Pal.lancerLaser;
            backColor = Color.blue;
            status = StatusEffects.shocked;
        }};

        //endregion
        //region liquids

        ionShot = new LiquidBulletType(InfLiquids.ion){{
            damage = 7;
            drag = 0.01f;
        }};

        inkyShot = new LiquidBulletType(InfLiquids.ink){{
            knockback = 0.5f;
            drag = 0.01f;
        }};

        lemonShot = new LiquidBulletType(InfLiquids.lemonade){{
            damage = 3;
            drag = 0.01f;
        }};

        spaceShot = new LiquidBulletType(InfLiquids.darkMatter){{
            drag = 0.01f;
        }};

        errorShot = new LiquidBulletType(InfLiquids.errorLiquid){{
            drag = 0.01f;
        }};

        heavyIonShot = new LiquidBulletType(InfLiquids.ion){{
            lifetime = 49f;
            speed = 4f;
            knockback = 0.8f;
            puddleSize = 8f;
            orbSize = 4f;
            drag = 0.001f;
            ammoMultiplier = 0.4f;
            statusDuration = 60f * 4f;
            damage = 10;
        }};

        heavyInkyShot = new LiquidBulletType(InfLiquids.ink){{
            lifetime = 49f;
            speed = 4f;
            knockback = 1.2f;
            puddleSize = 8f;
            orbSize = 4f;
            drag = 0.001f;
            ammoMultiplier = 0.4f;
            statusDuration = 60f * 4f;
            damage = 0.2f;
        }};

        heavyLemonShot = new LiquidBulletType(InfLiquids.lemonade){{
            lifetime = 49f;
            speed = 4f;
            knockback = 1.5f;
            puddleSize = 8f;
            orbSize = 4f;
            drag = 0.001f;
            ammoMultiplier = 0.4f;
            statusDuration = 60f * 4f;
            damage = 6;
        }};

        heavySpaceShot = new LiquidBulletType(InfLiquids.darkMatter){{
            lifetime = 49f;
            speed = 4f;
            puddleSize = 8f;
            orbSize = 4f;
            drag = 0.001f;
            ammoMultiplier = 0.4f;
            statusDuration = 60f * 4f;
            damage = 0.2f;
        }};

        heavyErrorShot = new LiquidBulletType(InfLiquids.errorLiquid){{
            lifetime = 49f;
            speed = 4f;
            knockback = -0.5f;
            puddleSize = 8f;
            orbSize = 4f;
            drag = 0.001f;
            ammoMultiplier = 0.4f;
            statusDuration = 60f * 4f;
            damage = 4f;
        }};

        //endregion
        //region frag

        //endregion
        //region other

        //endregion
    }
}
