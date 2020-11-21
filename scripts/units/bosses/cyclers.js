//Messanger and Messy drones

const mess = extendContent(UnitType, "a-mess", {});
mess.constructor = () => extend(PayloadUnit, {});
const nMess = extendContent(UnitType, "a-lesser-mess", {});
nMess.constructor = function(){
  return extend(UnitEntity, {});
};

mess.payloadCapacity = (5.3 * 5.3) * 20;
mess.abilities.add(UnitSpawnAbility(nMess, 200, 14, 0));
mess.abilities.add(UnitSpawnAbility(nMess, 200, -14, 0));
mess.abilities.add(UnitSpawnAbility(nMess, 200, 7, 34));
mess.abilities.add(UnitSpawnAbility(nMess, 200, -7, 34));
mess.abilities.add(UnitSpawnAbility(nMess, 200, 35, -5));
mess.abilities.add(UnitSpawnAbility(nMess, 200, -35, -5));
mess.abilities.add(UnitSpawnAbility(nMess, 200, 15, -30));
mess.abilities.add(UnitSpawnAbility(nMess, 200, -15, -30));

//Sigma (name up to debate)

const mitosis = extendContent(UnitType, "mitosis", {});
mitosis.constructor = () => extend(UnitEntity, {});
//const selfSpawn = new (UnitSpawnAbility(mitosis, 2500, 0, 0));
mitosis.abilities.add(UnitSpawnAbility(mitosis, 2500, 0, 0))/*selfSpawn*/;

//FedEX

/*const coreCycler = extendContent(UnitType, "delivery-time", {});
//unsure if this is how its done
const CoreUnit = extend(BuilderPayloadUnit, {
	//stuff that makes it a mobile core
	//cause a gameover event if destroyed, and no cores/mobile cores are present
	//should be summoned via editor
})
//or its this
coreCycler.constructor = () => extend(PayloadUnit, {
	//stuff that makes it a mobile core
	//cause a gameover event if destroyed, and no cores/mobile cores are present
	//should be summoned via editor
});
coreCycler.payloadCapacity = (6 * 4.5);
coreCycler.abilities.add(UnitSpawnAbility(UnitTypes.mono, 500, 30, 30));
coreCycler.abilities.add(UnitSpawnAbility(UnitTypes.mono, 500, -30, 30));
coreCycler.itemCapacity = 17500;
coreCycler.ammoCapacity = 5000;
coreCycler.UnitType = nMess;
coreCycler.priority = TargetPriority.core;
coreCycler.unitCapModifier = 14;
coreCycler.flying = true;
coreCycler.health = 60000;
coreCycler.armor = 25;
coreCycler.commandLimit = 14;
coreCycler.buildSpeed = 1.45;
coreCycler.engineSize = 4;
coreCycler.engineOffset = 60;
coreCycler.lightRadius = 200;
*/

//Other