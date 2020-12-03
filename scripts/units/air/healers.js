//const ais = require("mechanics/ai-directory");
//const repair = require("mechanics/repair-beam");

const t1healer = extendContent(UnitType, "medic-mk1", {});
t1healer.constructor = () => extend(UnitEntity, {});

const t2healer = extendContent(UnitType, "medic-mk2", {});
t2healer.constructor = () => extend(UnitEntity, {});

const t3healer = extendContent(UnitType, "medic-mk3", {});
t3healer.constructor = () => extend(UnitEntity, {});

const waveCannon = extendContent(Weapon, "wave-cannon", {
	load(){
		this.weaponRegion = Core.atlas.find("wave");
	}
});
waveCannon.reload = 2;
waveCannon.rotate = true;
waveCannon.shootSound = Sounds.splash;
waveCannon.bullet = Bullets.waterShot;
waveCannon.recoil = 0;
waveCannon.x = 5;
waveCannon.y = 4;

const surgePods = extendContent(Weapon, "surge-missile-pod", {});
surgePods.bullet = Bullets.missileSurge;
surgePods.shots = 5;
surgePods.recoil = 0.4;
surgePods.shootSound = Sounds.missile;
surgePods.reload = 70;
surgePods.xRand = 6;
surgePods.x = 5;
surgePods.y = -10;

const t4healer = extendContent(UnitType, "semigod", {});
t4healer.constructor = () => extend(UnitEntity, {});
//t4healer.defaultController = ais.healerAi;

t4healer.abilities.add(RepairFieldAbility(20, 60 * 45, 100));
t4healer.ammoType = AmmoTypes.power;
t4healer.weapons.add(surgePods);
t4healer.weapons.add(waveCannon);

/*
//can be used for later needs
var upgrade = new Seq([Vars.content.getByName(ContentType.unit, "purple-air-protidae"), Vars.content.getByName(ContentType.unit, "purple-air-renigata")]);
Blocks.exponentialReconstructor.upgrades.add(upgrade.toArray(UnitType));
*/