const railAmmo = extendContent(Item, "infiar",{});
const digitalPierce = extend(RailBulletType, {});
const phasePierce = extend(PointBulletType, {});
const golrg /*Good ol' Railgun for short*/ = extendContent(ItemTurret, "railgun", {
	init(){
	this.super$init();
    this.ammo(
        railAmmo, digitalPierce,
        Items.phaseFabric, phasePierce
    );
}
  /*hasAmmo(){
    return ((this.ammo.size > 0) && (this.ammo.peek().amount >= 1) && (this.liquids.get(Liquids.water) > this.liquidCapacity / 10));}*/
});
golrg.unitSort = (u, x, y) => -u.maxHealth;
golrg.ammoUseEffect = Fx.casing2;
const absolutrange = golrg.range = 350;
//digitalPierce.speed = absolutrange;
digitalPierce.damage = 2500;
digitalPierce.length = absolutrange;
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