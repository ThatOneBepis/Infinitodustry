package infinitodustry.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.experimental.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
/*
import infinitodustry.world.blocks.defense.*;
import infinitodustry.world.blocks.units.*;
import infinitodustry.world.blocks.distribution.*;
*/
import infinitodustry.content.*;
import static mindustry.type.ItemStack.*;
                                             
public class InfBlocks implements ContentList{
    public static Block

    //environment
    tauTanFloor, tauTanFloorA, tauTanFloorB, tauTanFloorC, tauTanThermal, tauWallTan, tauGlassWall,
    tauBlueFloor, tauBlueFloorA, tauBlueFloorB, tauBlueFloorC, tauBlueThermal, tauWallBlue,
    tauPurpleFloor, tauPurpleFloorA, tauPurpleFloorB, tauPurpleFloorC, tauPurpleThermal, tauWallPurple,
    tauGrayFloor, tauGrayFloorA, tauGrayFloorB, tauGrayFloorC, tauGrayThermal, tauWallGray,
    //tauGlassFloorWater, tauGlassFloorSlag, tauGlassFloorCryo, tauGlassFloorOil, tauGlassFloorLemon,

    plastaniumSoil, plastaniumFloor, plastaniumFloorOrange, plastaniumFloorCyan, plastaniumFloorRed, plastaniumFloorScarlet,
    plastaniumFloorBlue, plastaniumFloorBlack, plastaniumFloorWhite, derelictCopper, derelictCopperWall, derelictCopperBoulder,  ink,

    //ores
    oreInfiar, oreTensor, oreMatrix, oreVector, oreScalar, 
    orePlastanium, oreError/*, source,*/;
    
    //crafting
    
    //sandbox
    //overjector, overmender, overspotter,

    //defense
    //mendDome, mendNexus,
    //powerWall, powerWallLarge, mendWall, mendWallLarge, blastWall, blastWallLarge, infiarWall, infiarWallLarge,
    //overclock, overdriveNexus,
    //spotter, sensorArray, sensorDome, sensorNexus, echoWall, echoWallLarge,

    //transport
    
    //liquid

    //power

    //production

    //storage

    //downloader, dataBunker,
    //energyMatrix,

    //turrets
    //freezingMK1, freezingMK2, air, splash, blast, multishot, venom, tesla, swarmerLarge,
    //eradrailgun, chillbeam, skyCleaner, ransomware,
    //grenadier,


    //units
    //droneFactory, godFactory, naturalReconstructorm, rationalReconstructor, realReconstructor, wholeReconstructor,

    //logic
    //attachment, mail, memoryVortex,
    //rangedProcessor, rangedProcessorLarge, rangedProcessorHuge, sandboxProcessor,

    //campaign
    //nukeSilo;

    @Override
    public void load(){
        // region enviorment

        tauTanFloor = new Floor("tau-floor"){{
            variants = 0;
            wall = tauWallTan;
        }};
        tauTanFloorA = new Floor ("tau-floor-line"){{
            variants = 0;
            wall = tauWallTan;
            blendGroup = tauTanFloor;
        }};
        tauTanFloorB = new Floor ("tau-floor-square"){{
            variants = 0;
            wall = tauWallTan;
            blendGroup = tauTanFloor;
        }};
        tauTanFloorC = new Floor ("tau-floor-stripe"){{
            variants = 0;
            wall = tauWallTan;
            blendGroup = tauTanFloor;
        }};
        tauTanThermal = new Floor ("tau-floor-plasma"){{
            variants = 0;
            wall = tauWallTan;
            blendGroup = tauTanFloor;
            attributes.set(Attribute.heat, 0.3f);
            attributes.set(Attribute.water, -0.25f);
            emitLight = true;
            lightRadius = 30f;
            lightColor = Color.cyan.cpy().a(0.42f);
        }};
        tauBlueFloor = new Floor("tau-floor-blue"){{
            variants = 0;
            wall = tauWallBlue;
        }};
        tauBlueFloorA = new Floor ("tau-floor-blue-line"){{
            variants = 0;
            wall = tauWallBlue;
            blendGroup = tauBlueFloor;
        }};
        tauBlueFloorB = new Floor ("tau-floor-blue-square"){{
            variants = 0;
            wall = tauWallBlue;
            blendGroup = tauBlueFloor;
        }};
        tauBlueFloorC = new Floor ("tau-floor-blue-stripe"){{
            variants = 0;
            wall = tauWallBlue;
            blendGroup = tauBlueFloor;
        }};
        tauBlueThermal = new Floor ("tau-floor-blue-plasma"){{
            variants = 0;
            wall = tauWallBlue;
            blendGroup = tauBlueFloor;
            attributes.set(Attribute.heat, 0.3f);
            attributes.set(Attribute.water, -0.25f);
            emitLight = true;
            lightRadius = 30f;
            lightColor = Color.cyan.cpy().a(0.42f);
        }};
        tauPurpleFloor = new Floor("tau-floor-purple"){{
            variants = 0;
            wall = tauWallPurple;
        }};
        tauPurpleFloorA = new Floor ("tau-floor-purple-line"){{
            variants = 0;
            wall = tauWallPurple;
            blendGroup = tauPurpleFloor;
        }};
        tauPurpleFloorB = new Floor ("tau-floor-purple-square"){{
            variants = 0;
            wall = tauWallPurple;
            blendGroup = tauPurpleFloor;
        }};
        tauPurpleFloorC = new Floor ("tau-floor-purple-stripe"){{
            variants = 0;
            wall = tauWallPurple;
            blendGroup = tauPurpleFloor;
        }};
        tauPurpleThermal = new Floor ("tau-floor-purple-plasma"){{
            variants = 0;
            wall = tauWallPurple;
            blendGroup = tauPurpleFloor;
            attributes.set(Attribute.heat, 0.3f);
            attributes.set(Attribute.water, -0.25f);
            emitLight = true;
            lightRadius = 30f;
            lightColor = Color.cyan.cpy().a(0.42f);
        }};
        tauGrayFloor = new Floor("tau-floor-magma"){{
            variants = 0;
            wall = tauWallGray;
        }};
        tauGrayFloorA = new Floor ("tau-floor-magma-line"){{
            variants = 0;
            wall = tauWallGray;
            blendGroup = tauGrayFloor;
        }};
        tauGrayFloorB = new Floor ("tau-floor-magma-square"){{
            variants = 0;
            wall = tauWallGray;
            blendGroup = tauGrayFloor;
        }};
        tauGrayFloorC = new Floor ("tau-floor-magma-stripe"){{
            variants = 0;
            wall = tauWallGray;
            blendGroup = tauGrayFloor;
        }};
        tauGrayThermal = new Floor ("tau-floor-magma-plasma"){{
            variants = 0;
            wall = tauWallGray;
            blendGroup = tauBlueFloor;
            attributes.set(Attribute.heat, 0.3f);
            attributes.set(Attribute.water, -0.25f);
            emitLight = true;
            lightRadius = 30f;
            lightColor = Color.cyan.cpy().a(0.42f);
        }};

        tauWallTan = new StaticWall("tau-wall"){{
            variants = 2;
        }};
        tauWallBlue = new StaticWall("tau-wall-blue"){{
            variants = 2;
        }};
        tauWallPurple = new StaticWall("tau-wall-purple"){{
            variants = 2;
        }};
        tauWallGray = new StaticWall("tau-wall-magma"){{
            variants = 2;
        }};
        tauGlassWall = new StaticWall("tau-wall-clear"){{
            variants = 4;
        }};

        plastaniumSoil = new Floor("plastanium-soil"){{
            variants = 3;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.75f);
        }};
        plastaniumFloor = new Floor("plastanium-floor-lime"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};
        plastaniumFloorOrange = new Floor("plastanium-floor-orange"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};
        plastaniumFloorCyan = new Floor("plastanium-floor-cyan"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};
        plastaniumFloorRed = new Floor("plastanium-floor-red"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};
        plastaniumFloorScarlet = new Floor("plastanium-floor-scarlet"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};
        plastaniumFloorBlue = new Floor("plastanium-floor-blue"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};
        plastaniumFloorBlack = new Floor("plastanium-floor-black"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};
        plastaniumFloorWhite = new Floor("plastanium-floor-white"){{
            variants = 0;
            itemDrop = Items.plastanium;
            playerUnmineable = true;
            attributes.set(Attribute.oil, 1.25f);
        }};

        derelictCopper = new Floor("derelict-copper"){{
            variants = 3;
            wall = derelictCopperWall;
            attributes.set(Attribute.oil, 0.5f);
            playerUnmineable = true;
            itemDrop = Items.sand;
        }}
        derelictCopperBoulder = new Boulder("derelict-copper-boulder"){{
            variants = 2;
            derelictCopper.asFloor().decoration = this;
        }};
        derelictCopperWall = new StaticWall("derelict-copper-wall"){{
            variants = 2;
        }};

        ink = new Floor("ink"){{
            isLiquid = true;
            liquidDrop = InfLiquids.ink;
            status = InfStatusEffect.inked;
            statusDuration = 240f;
            cacheLayer = CacheLayer.tar;
            variants = 0;
            drowntime = 200f;
            speedMultiplier = 0.4;
        }};

        // endregion
        // region ore
        oreError = new OreBlock(InfItems.errorItem){{
            oreDefault = false;
        }};
        oreInfiar = new OreBlock(InfItems.infiar){{
            oreDefault = true;
            oreThreshold = 0.917f;
            oreScale = 25.555555f;
        }};
        oreTensor = new OreBlock(InfItems.tensor){{
            oreDefault = true;
            oreThreshold = 0.903f;
            oreScale = 25.352764;
        }};
        oreMatrix = new OreBlock(InfItems.matrix){{
            oreDefault = true;
            oreThreshold = 0.865f;
            oreScale = 23.975435f;
        }};
        oreVector = new OreBlock(InfItems.vector){{
            oreDefault = true;
            oreThreshold = 0.891f;
            oreScale = 24.863362f;
        }};
        oreScalar = new OreBlock(InfItems.scalar){{
            oreDefault = true;
            oreThreshold = 0.885f;
            oreScale = 24.436374;
        }};
        orePlastanium = new OreBlock(Items.plastanium){{
            oreDefault = true;
        }};
        //source = new SourceBlock(){{}};

        // endregion
        // region turrets
        /*
        var defaultMaxXPlevel = 10;

        freezingMK1 = new StatusEffectProjector("freezing-tower"){{
            requirements(Category.turret, with(Items.titanium, 220, Items.silicon, 160, InfItems.scalar, 90));
            health = 270 * size * size;
            range = 170;

            status = StatusEffect.freezing;
            statusMultiplier = 1f;
            statusTarget != this.team;
            consumes.powerCond(5f);

            maxLevel = defaultMaxXPlevel;
            upgrades[{
                block = InfBlocks.freezingMK2;
                min = 20;
            }];
            expStats(
                {
                    type = InfExpType.list;
                    field = range;
                    intensity[1] = 5;
                    intensity[3] = 5;
                    intensity[6] = 10;
                    intensity[10] = 10;
                    intensity[15] = 15;
                    intensity[20] = 15;
                    intensity[25] = 20;
                };
            );
        }};

        freezingMK2 = new StatusEffectProjector("freezing-nexus"){{
            requirements(Category.turret, with(Items.titanium, 850, Items.silicon, 450, Items.phaseFabric, 300, Items.surgeAlloy, 500, InfItems.copperSeptoxide, 220, InfItems.tensor, 300));
            health = 300 * size * size;
            range = 450;

            status = StatusEffect.freezing;
            statusMultiplier = 6.33f;
            statusTarget != this.team;
            consumes.powerCond(20f);
            maxLevel = defaultMaxXPlevel;
            expStats(
                {
                    type = InfExpType.list;
                    field = range;
                    intensity[3] = 20;
                    intensity[7] = 25;
                    intensity[12] = 25;
                    intensity[19] = 35;
                    intensity[25] = 45;
                };
            );
        }};

        air = new ItemTurret("anti-air"){{
            requirements(Category.turret, with(Items.copper, 140, Items.lead, 70, InfItems.opticGlass, 50));
            size = 2;

            health = 215 * size * size;
            shots = 2;
            reloadTime = 15f;
            range = 200;
            rotateSpeed = 3f;
            inaccuracy = 0f;

            smokeEffect = Fx.shootSmallSmoke;
            ammoUseEffect = Fx.casing1;
            shootX = 5f;
            targetGround = false;

            ammo(
                Items.copper, InfBullets.flakCopper,
                Items.lead, Bullets.flakLead,
                Items.titanium, InfBullets.flakTitan,
                Items.pyratite, InfBullets.flakIncendiary,
                Items.surgeAlloy, Bullets.flakSurge,
                InfItems.vector, InfBullets.nyoomFlak,
                InfItems.copperSeptoxide, InfBullets.flakOxiCopper,
            );
            maxLevel = defaultMaxXPlevel;
            expStats(
                {
                    type = InfExpType.linear;
                    field = pierceCap;
                    start = field;
                    intensity = field * 0.2f;
                };
                {
                    type = InfExpType.linear;
                    field = damage;
                    start = field;
                    intensity = field * 0.3f;
                };
            );
        }};

        var blastRange = 160;
        blast = new ItemTurret("blast-tower"){{
            requirements(Category.turret, with(InfItems.stone, 100, InfItems.matrix, 110, InfItems.blastFabric, 90));
            size = 2;

            health = 815 * size * size;
            reloadTime = 120;
            range = blastRange;
            inaccuracy = 0f;
            targetGround = true;
            targetAir = false;

            turretRegion = Core.atlas.find("clear");
            heatRegion = Core.atlas.find(this.name + "-pillar");
            baseRegion = Core.atlas.find(this.name);
            rotateSpeed = 360f * 500;
            shootSound = Sounds.explosion;
            ammoUseEffect = Fx.explosion;

            ammo(
                Items.blastCompound, new BombBulletType(){{
                    instantDissapear = true;
                    colidesAir = false;
                    despawnEffect = Fx.commandSend;

                    ammoMultiplier = 1f;
                    splashDamage = 60;
                    splashDamageRadius = blastRange;
                    reloadMultiplier = 2f;
                }},
                Items.phaseFabric, new BombBulletType(){{
                    instantDissapear = true;
                    colidesAir = false;
                    despawnEffect = Fx.commandSend;

                    ammoMultiplier = 2f;
                    splashDamage = 150;
                    splashDamageRadius = blastRange * 2;
                }},
                Items.surgeAlloy, new BombBulletType(){{
                    instantDissapear = true;
                    colidesAir = false;
                    despawnEffect = Fx.commandSend;

                    ammoMultiplier = 5f;
                    splashDamage = 85;
                    splashDamageRadius = blastRange;
                    lightning = 30;
                    lightningLength = blastRange - 15;
                }},
                Items.blastFabric, new BombBulletType(){{
                    instantDissapear = true;
                    colidesAir = false;
                    despawnEffect = Fx.commandSend;

                    ammoMultiplier = 5f;
                    splashDamage = 60;
                    splashDamageRadius = blastRange;
                    reloadMultiplier = 2;
                }}
            );
            maxLevel = defaultMaxXPlevel;
            expStats(
                {
                    type = InfExpType.linear;
                    field = splashDamage;
                    start = field;
                    intensity = field * 0.1f;
                };
                {
                    type = InfExpType.linear;
                    field = blastRange;
                    start = field;
                    intensity = field * 0.05f;
                };
            );
        }};

        multishot = new ItemTurret("multishot"){{
            requirements(Category.turret, with(Items.silicon, 175, Items.graphite, 200, Items.phaseFabric, 100));
            size = 2;

            health = 250 * size * size;
            reloadTime = 45;
            range = 160;
            rotateSpeed = 5f;
            shootCone = 65f
            inaccuracy = 0;

            ammoPerShot = 0.2f;
            shootSound = Sounds.shootSnap;
            ammoUseEffect = Fx.casing1;
            targetAir = true;
            ammo(
                Items.copper, InfBullets.apCopper,
                Items.graphite, InfBullets.apDense,
                Items.scrap, Bullets.flakScrap,
                Items.plastanium, Bullets.fragPlastic,
                Items.phaseFabric, InfBullets.quantumBolt,
                Items.surgeAlloy, InfBullets.apempBolt,
                InfItems.copperSeptoxide, InfBullets.apOxiCopper
            );
            maxLevel = defaultMaxXPlevel;
            expStats(
                {
                    type = InfExpType.linear;
                    field = shots;
                    start = 4;
                    intensity = 1.2f;
                };
                {
                    type = InfExpType.linear;
                    field = damage;
                    start = field;
                    intensity = field * 0.1f;
                };
            );
        }};

        venom = new ItemTurret("venom-tower"){{
            requirements(Category.turret, with(Items.graphite, 225, Items.metaglass, 125, InfItems.scalar, 90));
            size = 3;

            health = 310 * size * size;
            reloadTime = 75;
            range = 150;
            rotateSpeed = 4f;

            shootSound = Sounds.shootBig;
            targetGround = true;
            targetAir = true;
            ammo(
            InfItems.lemonPod, new BasicBulletType(){{
                    homingPower = 0.03f;
                    lifetime = 120f;
                    width = 12f;
                    height = 8f;
                    fragBullet = InfBullets.lemonShot;
                    fragBullets = 20f;
                    damage = 100;
                    knockback = 0.7f;
                }}
            );
            maxLevel = defaultMaxXPlevel;
            expStats(
                {
                    type = InfExpType.linear;
                    field = statusMultiplier;
                    start = field;
                    intensity = field * 0.15f;
                };
            );
        }};

        tesla = new PowerTurret("tesla-tower"){{
            requirements(Category.turret, with(Items.silicon, 95, Items.metaglass, 45, Items.plastanium, 50, InfItems.scalar, 60));
            size = 2;

            health = 260 * size * size;
            shots = 2;
            reloadTime = 45;
            range = 150;
            rotateSpeed = 3f;
            shootCone = 40f;
            inaccuracy = 0.1f;

            heatColor = Color.cyan;
            shootEffect = Fx.lightningShoot;
            shootSound = Sounds.spark;
            recoilAmount = 2f;
            shootX = 5;
            targetAir = true;
            targetGround = true;

            shootType = new LightningBulletType(){{
                damage = 35;
                lightningLength = 15;
                collidesAir = true;
            }};
            powerUse = 5f;
            maxLevel = defaultMaxXPlevel;
            expStats(
                {
                    type = InfExpType.linear;
                    field = lightningLength;
                    start = field;
                    intensity = range * 0.1f;
                };
                {
                    type = InfExpType.linear;
                    field = range;
                    start = field;
                    intensity = 10;
                };
            );
        }};

        */
        //walls
        /*

        powerWall = new PowerNode("power-wall"){{
            requirements(Category.defense, with(InfItems.copperSeptoxide, 6));
            buildCostMultiplier = 5;
            laserRange = 0f;

            group = BlockGroup.walls;
            health = 210 * Blocks.wallHealthMultiplier;
        }};

        powerWallLarge = new PowerNode("power-wall-large"){{
            requirements(Category.defense, ItemStack.mult(powerWall.requirements, 4));
            buildCostMultiplier = 5;
            laserRange = 0f;

            group = BlockGroup.walls;
            health = 210 * 4 * Blocks.wallHealthMultiplier;
            size = 2;
        }};

        mendWall = new MendProjector("mender-wall"){{
            requirements(Category.defense, with(Items.silicon, 6, Items.surgeAlloy, 3, InfItems.copperSeptoxide, 3));
            buildCostMultiplier = 5;
            group = BlockGroup.walls;

            health = 275 * Blocks.wallHealthMultiplier;
            consumes.power(0.1f);
            reload = 150f;
            range = 10f;
            healPercent = 5f;
            phaseBoost = 0f;
            phaseRangeBoost = 0f;
        }};

        mendWallLarge = new MendProjector("mender-wall-large"){{
            requirements(Category.defense, ItemStack.mult(mendWall.requirements, 4));
            buildCostMultiplier = 5;
            group = BlockGroup.walls;

            health = 275 * 4 * Blocks.wallHealthMultiplier;
            consumes.power(0.1f * 4);
            reload = 150f;
            range = 15f;
            healPercent = 7f;
            phaseBoost = 0f;
            phaseRangeBoost = 0f;
            size = 2;
        }};

        blastWall = new Wall("blast-wall"){{
           requirements(Category.defense, with(InfItems.blastFabric, 6));
           health = 160 * Blocks.wallHealthMultiplier;
           defelct = true;
           insulated = true;
           splashDamageResistance = 0.4f;
        }};

        blastWallLarge = new Wall("blast-wall-large"){{
           requirements(Category.defense, ItemStack.mult(blastWall.requirements, 4));
           health = 160 * 4 * Blocks.wallHealthMultiplier;
           defelct = true;
           insulated = true;
           splashDamageResistance = 0.4f;
           size = 2;
        }};

        infiarWall = new RegenWall("infiar-wall"){{
           requirements(Category.defense, with(InfItems.infiar, 6));
           health = 225 * Blocks.wallHealthMultiplier;
           update = true;
           absorbLasers = true;

           cooldown = 60f;
           healAmount = this.maxHealth / 25;
           healEffect = Fx.healBlockFull;
           healColor = Pal.heal;
        }};

        infiarWallLarge = new RegenWall("infiar-wall-large"){{
           requirements(Category.defense, ItemStack.mult(infiarWall.requirements, 4));
           health = 225 * 4 * Blocks.wallHealthMultiplier;
           update = true;
           absorbLasers = true;
           size = 2;

           cooldown = 60f;
           healAmount = this.maxHealth / 25;
           healEffect = Fx.healBlockFull;
           healColor = Pal.heal;
        }};

        */
        // endregion
        // region transport

        // endregion
        // region power
        
        // endregion
        // region storage
        /*downloader = new Unloader("downloader){{
            requirements(Category.effect, with(Items.silicon, 45, InfItems.infiar, 50));
            group = BlockGroup.transportation;

            speed = 3f;
            consumes.power(0.15f);
            unloads.dataBunker = true;
        }};
        dataBunker = new SpatialStorage("data-bunker"){{
            requirements(Category.effect, with(Items.titanium, 225, InfItems.infiar, 150));

            itemCapacity = 500;
            itemCapacity.total = 2500;
            size = 3;
        }};
        */


        // endregion
        // region production

        // endregion
        // region turrets

        // endregion
        // region units

        /*
        droneFactory = new UnitFactory("drone-factory"){{
            requirements(Category.units, with(Items.copper, 80, Items.lead, 60, Items.silicon, 50));
            plans = Seq.with(
                new UnitPlan(UnitTypes.mono, 60f * 35, with(Items.silicon, 30, Items.lead, 15)),
                new UnitPlan(InfUnitTypes.priest, 60f * 30, with(Items.silicon, 50, Items.lead, 35, InfItems.scalar, 20)),
                new UnitPlan(InfUnitTypes.knight, 60f * 45, with(Items.silicon, 75, Items.lead, 45, Items.titanium, 35)),
                new UnitPlan(InfUnitTypes.shadow, 60f * 45, with(Items.silicon, 60, Items.lead, 50, InfItems.matrix, 25)),
                new UnitPlan(InfUnitTypes.draug, 60f * 55, with()),
            );
            size = 3;
            consumes.power(2f);
        }};

        naturalReconstructor = new Reconstructor("sp1-reconstructor"){{
            requirements(Category.units, with(Items.copper, 250, Items.lead, 120, Items.silicon, 110, InfItems.scalar, 60));

            size = 3;
            consumes.power(3f);
            consumes.items(with(Items.lead, 50, InfItems.scalar, 35));

            constructTime = 60f * 20f;

            upgrades.addAll(
                    new UnitType[]{InfUnitTypes.knight, InfUnitTypes.crusader},
                    new UnitType[]{InfUnitTypes.priest, InfUnitTypes.monarch},
                    new UnitType[]{InfUnitTypes.aurora, InfUnitTypes.coronal}
            );
        }};
        rationalReconstructor = new Reconstructor("sp2-reconstructor"){{
            requirements(Category.units, with(Items.lead, 1400, Items.silicon, 650, Items.titanium, 500, Items.metaglass, 350, InfItems.scalar, 330, InfItems.vector, 220));

            size = 5;
            consumes.power(5f);
            consumes.items(with(Items.silicon, 160, InfItems.tauPlate, 125, InfItems.copperSeptoxide, 65));

            constructTime = 60f * 35f;

            upgrades.addAll(
                    new UnitType[]{InfUnitTypes.crusader, InfUnitTypes.inquisitor},
                    new UnitType[]{InfUnitTypes.slinger, InfUnitTypes.sledgehammer},
                    new UnitType[]{InfUnitTypes.shadow, InfUnitTypes.abyss},
                    new UnitType[]{InfUnitTypes.monarch, InfUnitTypes.patriarch},
                    new UnitType[]{InfUnitTypes.coronal, InfUnitTypes.nebula},
                    new UnitType[]{InfUnitTypes.knife, InfUnitTypes.butcher},
                    new UnitType[]{InfUnitTypes.knife, InfUnitTypes.sword}
            );
        }};
        realReconstructor = new Reconstructor("sp3-reconstructor"){{
            requirements(Category.units, with(Items.lead, 2250, Items.silicon, 1250, Items.titanium, 800, Items.thorium, 650, InfItems.opticGlass, 750, InfItems.scalar, 450, InfItems.vector, 350, InfItems.matrix, 650));

            size = 7;
            consumes.power(14f);
            consumes.items(with(Items.silicon, 950, Items.thorium, 500, InfItems.blastFabric, 475, InfItems.matrix, 365));
            consumes.liquid(Liquids.cryofluid, 1f);
            liquidCapacity = 60f;

            constructTime = 60f * 60f * 1f;

            upgrades.addAll(
                    new UnitType[]{InfUnitTypes.inquisitor, InfUnitTypes.matyr},
                    new UnitType[]{InfUnitTypes.sledgehammer, InfUnitTypes.warhammer},
                    new UnitType[]{InfUnitTypes.abyss, InfUnitTypes.cavum},
                    new UnitType[]{InfUnitTypes.patriarch, InfUnitTypes.angel},
                    new UnitType[]{InfUnitTypes.sword, InfUnitTypes.greatsword},
                    new UnitType[]{InfUnitTypes.nebula, InfUnitTypes.plasmoid}
            );
        }};
        wholeReconstructor = new Reconstructor("spi-reconstructor"){{
            requirements(Category.units, with(Items.lead, 4500, Items.silicon, 1750, Items.titanium, 2250, Items.surgeAlloy, 750, InfItems.matrix, 850, InfItems.tensor, 600, InfItems.blastFabric, 1450));

            size = 9;
            consumes.power(25f);
            consumes.items(with(Items.silicon, 1250, Items.plastanium, 700, Items.phaseFabric, 415, InfItems.tensor, 655));
            consumes.liquid(Liquids.cryofluid, 2f);
            liquidCapacity = 60f;

            constructTime = 60f * 60f * 3.5f;

            upgrades.addAll(
                    new UnitType[]{InfUnitTypes.warhammer, InfUnitTypes.stormhammer},
                    new UnitType[]{InfUnitTypes.warhammer, InfUnitTypes.paladin},
                    new UnitType[]{InfUnitTypes.reference, InfUnitTypes.metaphor},
                    new UnitType[]{InfUnitTypes.angel, InfUnitTypes.archangel},
                    new UnitType[]{InfUnitTypes.greatsword, InfUnitTypes.blacksmith},
                    new UnitType[]{InfUnitTypes.plasmoid, InfUnitTypes.luminosity}
            );
        }};*/
        /*
        godFactory = new UnitFactory("god-factory"){{
            requirements(Category.units, BuildVisibility.sandboxOnly, with(Items.silicon, 1000 * 1000 * 25, Items.titanium, 1000 * 1000 * 10, InfItems.tensor, 1000 * 1000 * 7.5f));
            plans = Seq.with(
                new UnitPlan(InfUnitTypes.divinity, 60f * 60f * 60f * 2.5f, with(Items.titanium, 5000, InfItems.copperSeptoxide, 1500, InfItems.errorItem, 35)),
                new UnitPlan(InfUnitTypes.omegaradicator, 60f * 60f * 60f * 24f * 1.5f, with(Items.copper, 1)),
                new UnitPlan(InfUnitTypes.daggergod, 60f * 60f * 60f * 1, with(Items.silicon, 1000, Items.lead, 450, InfItems.tensor, 225)),
                new UnitPlan(InfUnitTypes.wideEclipse, 60f * 60f * 60f * 2, with(Items.surgeAlloy, 1000, Items.phaseFabric, 1500)),
                new UnitPlan(InfUnitTypes.toxomega, 60f * 60f * 60f * 2, with(Items.sporePod, 2200, Items.scrap, 1500, InfItems.vector, 250)),
                new UnitPlan(InfUnitTypes.octmega, 60f * 60f * 60f * 2, with(InfItems.stone, 4000, Items.thorium, 1500, InfItems.matrix, 1500)),
                new UnitPlan(InfUnitTypes.ultOmr, 60f * 60f * 60f * 1.5f, with(Items.plastanium, 4500, Items.graphite, 4000, InfItems.infiar, 900)),

                new UnitPlan(InfUnitTypes.supAnt, 60f * 60f * 3, with(Items.pyratite, 250)),
                new UnitPlan(InfUnitTypes.supArk, 60f * 60f * 3, with(Items.sporePod, 250)),
                new UnitPlan(InfUnitTypes.supQua, 60f * 60f * 3, with(InfItems.matrix, 250)),
                new UnitPlan(InfUnitTypes.supSpt, 60f * 60f * 3, with(InfItems.copperSeptoxide, 250)),
                new UnitPlan(InfUnitTypes.supSei, 60f * 60f * 3, with(Items.blastCompound, 250)),
                new UnitPlan(InfUnitTypes.supVla, 60f * 60f * 3, with(Items.surgeAlloy, 250)),
                new UnitPlan(InfUnitTypes.ultCrv, 60f * 60f * 20, with(Items.silicon, 500, InfItems.errorItem, 25)),
            );
            size = 7;
            consumes.power(25f);
        }};
        */
        // endregion
        // region logic
        
        // endregion
        // region campaign
    
        // endregion
    }
}
