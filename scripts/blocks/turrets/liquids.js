//liquids
const lemonade = extendContent(Liquid, "lemon-acid", {});
const space = extendContent(Liquid, "dark-matter", {});
const ink = extendContent(Liquid, "ink", {});
const ion = extendContent(Liquid, "ion-matter", {});
const errorliquid = extendContent(Liquid, "test-3", {
	//make it so every liquid with no sprites share it's sprite
});

//effects
const lag = new StatusEffect("l-a-g");
lag.speedMultiplier = 0;
lag.healthMultiplier = 0;
lag.damageMultiplier = 0;
lag.reloadMultiplier = 0;
lag.damage = 1;
lag.effect = Fx.unitDespawn;
lag.color = Color.valueOf("ffffff");
errorliquid.effect = lag;
const rekt = new StatusEffect("evaporation");
rekt.speedMultiplier = 0.9;
rekt.healthMultiplier = 0.7;
rekt.damageMultiplier = 0.9;
rekt.reloadMultiplier = 0.7;
rekt.damage = 0.5;
rekt.effect = Fx.melting;
rekt.color = Color.valueOf("00ffff");
ion.effect = rekt;
const inked = new StatusEffect("inked");
inked.speedMultiplier = 0.6;
inked.effect = Fx.oily;
inked.color = Color.valueOf("16264c");
space.effect = StatusEffects.tarred;
lemonade.effect = StatusEffects.melting; 

//turrets using said liquids