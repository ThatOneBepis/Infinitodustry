const railAmmo = Vars.content.getByName(ContentType.item, "infinitodustry-infiar");
const golrg /*Good ol' Railgun for short*/ = extendContent(ItemTurret, "railgun", {
	init() {
    this.ammo(
        railAmmo, digitalPierce,
        Items.phaseFabric, phasePierce
    );
    this.super$init();
}
  /*hasAmmo(){
    return ((this.ammo.size > 0) && (this.ammo.peek().amount >= 1) && (this.liquids.get(Liquids.water) > this.liquidCapacity / 10));}*/
});
golrg.unitSort = (u, x, y) => -u.maxHealth;
golrg.ammoUseEffect = Fx.casing2;
const absolutrange = golrg.range = 350;
const digitalPierce = extend(RailBulletType, {});
const phasePierce = extend(PointBulletType, {});
//golrg.ammoType.put(railAmmo, digitalPierce);
//golrg.ammoType.put(Items.phaseFabric, phasePierce);
digitalPierce.speed = absolutrange;
digitalPierce.damage = 2500;
digitalPierce.tileDamageMultiplier = 0.05;
digitalPierce.reloadMultiplier = 0.5;
digitalPierce.despawnEffect = Fx.instBomb;
digitalPierce.shootEffect = Fx.instShoot;
digitalPierce.hitEffect = Fx.instHit;
digitalPierce.smokeEffect = Fx.smokeCloud;
digitalPierce.trailEffect = Fx.instTrail;
digitalPierce.trailColor = Color.valueOf("#57f1fe");
phasePierce.speed = absolutrange;
phasePierce.damage = 1000;
phasePierce.tileDamageMultiplier = 0.25;
phasePierce.despawnEffect = Fx.instBomb;
phasePierce.shootEffect = Fx.instShoot;
phasePierce.hitEffect = Fx.instHit;
phasePierce.smokeEffect = Fx.smokeCloud;
phasePierce.trailEffect = Fx.instTrail;