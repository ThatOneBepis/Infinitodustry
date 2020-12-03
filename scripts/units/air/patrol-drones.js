//const ais = require("mechanics/ai-directory");
const bullets = require("mechanics/beams");

const t1Patrol = extendContent(UnitType, "patrol-drone-mk1", {});
t1Patrol.constructor = () => extend(UnitEntity, {});
t1Patrol.ammoType = AmmoTypes.powerLow;

const t2Patrol = extendContent(UnitType, "patrol-drone-mk2", {});
t2Patrol.constructor = () => extend(UnitEntity, {});
t2Patrol.ammoType = AmmoTypes.power;
t2Patrol

const t3Patrol = extendContent(UnitType, "patrol-drone-mk3", {});
t3Patrol.constructor = () => extend(UnitEntity, {});
t3Patrol.ammoType = AmmoTypes.power;
t3Patrol

const tractorBeam = bullets.newTractorBeam(8, 7);
var range = 128;
tractorBeam.color = Pal.lancerLaser;
tractorBeam.length = range;
tractorBeam.maxRange = range;
tractorBeam.lifetime = 120;

const tractorBeamWeapon = extendContent(Weapon, "stasis-beam", {});
tractorBeamWeapon.mirror = false;
tractorBeamWeapon.x = 0;
tractorBeamWeapon.y = 4;
tractorBeamWeapon.shootY = 6;
tractorBeamWeapon.reload = 30;
tractorBeamWeapon.rotate = true;
tractorBeamWeapon.continuous = true;
tractorBeamWeapon.shootSound = Sounds.tractorbeam;
tractorBeamWeapon.bullet = tractorBeam;
tractorBeamWeapon.recoil = 0.6;

const laserBolt = extend(LaserBoltBulletType, {});
laserBolt.color = Pal.lancerLaser;
laserBolt.damage = 30;
laserBolt.lifetime = 75;
laserBolt.speed = 4;

const laserHeavyBolter = extendContent(Weapon, "laser-heavy-bolter", {});
laserHeavyBolter.bullet = laserBolt;
laserHeavyBolter.recoil = 0.4;
laserHeavyBolter.shootSound = Sounds.laser;
laserHeavyBolter.reload = 30;
laserHeavyBolter.x = 0;
laserHeavyBolter.y = -10;
laserHeavyBolter.top = true;

const t4Patrol = extendContent(UnitType, "patrol-drone-mk4", {});
t4Patrol.constructor = () => extend(UnitEntity, {});
//t4Patrol.defaultController = ais.patrolAi;

t4Patrol.abilities.add(ShieldRegenFieldAbility(120, 150, 60 * 16, 250));
t4Patrol.ammoType = AmmoTypes.power;
t4Patrol.weapons.add(tractorBeamWeapon);
t4Patrol.weapons.add(laserHeavyBolter);

/*
//can be used for later needs
var upgrade = new Seq([Vars.content.getByName(ContentType.unit, "purple-air-protidae"), Vars.content.getByName(ContentType.unit, "purple-air-renigata")]);
Blocks.exponentialReconstructor.upgrades.add(upgrade.toArray(UnitType));
*/