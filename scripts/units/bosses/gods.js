//Divinity will probably get his own file, probably omegarad and toxomega too

//Dagger god, god of getting dagged
const daggerGod = extendContent(UnitType, "daggergod", {});
daggerGod.constructor = function(){
  return extend(MechUnit, {});
};
daggerGod.abilities.add(UnitSpawnAbility(UnitTypes.dagger, 240, 30, 30));
daggerGod.abilities.add(UnitSpawnAbility(UnitTypes.dagger, 240, -30, 30));

//Octmega, the prophecy platform
const octMega = extendContent(UnitType, "octmega", {});
octMega.constructor = () => extend(PayloadUnit, {});
octMega.abilities.add(UnitSpawnAbility(UnitTypes.nova, 60, 0, 0));
octMega.abilities.add(UnitSpawnAbility(UnitTypes.nova, 60, 20, 20));
octMega.abilities.add(UnitSpawnAbility(UnitTypes.nova, 60, -20, 20));
octMega.abilities.add(UnitSpawnAbility(UnitTypes.nova, 60, 20, -20));
octMega.abilities.add(UnitSpawnAbility(UnitTypes.nova, 60, -20, -20));
octMega.abilities.add(ForceFieldAbility(140 * 140, 64, 7000 * 7000 /* * 7000*/, 60));
octMega.abilities.add(RepairFieldAbility(130, 60 * 2, 140));
octMega.payloadCapacity = (5.3 * 5.3) * (5.3 * 5.3) * (5.3 * 5.3);

//unknown
/*
const toxomega = extendContent(UnitType, "toxomega", {
	//reactive armor?
});
toxomega.constructor = () => extend(BuilderLegsUnit, {
	//perhaps seek the strongest enemy unit by default
});
toxomega.abilities.add(globalBuildBoost);
//can be likely done with vanilla abilities if not counting for required lack of visual effects
toxomega.abilities.add(globalShielding);
toxomega.abilities.add(globalRegen);
*/
//[REDACTED]
/*
const omegarad = extendContent(UnitType, "trueWrath", {
	//having a shockwawe upon spawn, that deals as much SplashDamage as combined DPS of entities capable of targeting it.
	//reactive armor too because fuck everyone trying to slay this

	//current basis
	calcTeam = this.team;
	DPSvalue = 0;
	Groups.unit.each(u=>{
  	if(u.team != calcTeam){
    u.type.weapons.each(w=>{
      DPSvalue+=(w.bullet.damage+w.bullet.splashDamage)/w.reload*60;
    })
  }
});
	calcTeam = this.team;
	DPSvalue = 0;
	Vars.world.tiles.eachTile(t => {
  if(t.build != null){
    if(t.build.ammo != null){
      if(t.team() != calcTeam){
        if(t.build.ammo.size > 0){
          tbullet = t.build.ammo.get(0).type();
          DPSvalue += (tbullet.damage + tbullet.splashDamage) * tbullet.reloadMultiplier / t.block().reloadTime * 60 / Math.pow(t.block().size, 2);
        }
      }
    }
  }
});
});
omegarad.constructor = function(){
  return extend(MechUnit, {
	//make the spawn ability trigger again whenever an attack that can deal >20% of the unit max health is being performed, or with high enough dps
	//also override any music with boss3.ogg
  });
};
const spawnShockWave = extend(Abilities.Ability, {
 //spawn a bullet with damage that of calculated dps
});
const omegasplashung = extendContent(BasicBulletType, "lol", {});
omegasplashung.splashDamage = shockWaveValue;
omegasplashung.splashDamageRadius = Number.MAX_VALUE;//so nothing can escape it, damage propagation rates may apply
omegasplashung.instantDisappear = true;
omegarad.abilities.add(spawnShockWave);
*/