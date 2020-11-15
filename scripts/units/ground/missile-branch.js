const missile1 = extendContent(UnitType, "missile-mech-1", {
	researchRequirements(){
    return ItemStack.with(Items.silicon, 1600, Items.plastanium, 800)
  }
});
const missile2 = extendContent(UnitType, "missile-mech-2", {
	/*researchRequirements(){
    return ItemStack.with(Items.silicon, 3500, Vars.content.getByName(ContentType.item, "infinitodustry-tau-plate"), 2735, Vars.content.getByName(ContentType.item, "infinitodustry-toughitinum"), 1420)
  }*/
});
const missile3 = extendContent(UnitType, "missile-mech-3", {
	/*researchRequirements(){
    return ItemStack.with(Items.silicon, 8000, Items.thorium, 6150, Vars.content.getByName(ContentType.item, "infinitodustry-blast-fabric"), 5845, Vars.content.getByName(ContentType.item, "infinitodustry-matrix"), 4300, Vars.content.getByName(ContentType.item, "infinitodustry-visionary-glass"), 5540)
  }*/
});
const missileHoly = extendContent(UnitType, "missile-mech-4", {
	/*researchRequirements(){
    return ItemStack.with(Items.silicon, 20000, Items.plastanium, 17330, Items.phaseFabric, 11060, Vars.content.getByName(ContentType.item, "infiintodustry-tensor"), 7330)
  }*/
});
//const missileSurge = extendContent(UnitType, "missile-mech-surge", {});

missile1.constructor = function(){
  return extend(MechUnit, {});
};

missile2.constructor = () => extend(BuilderMechUnit, {});

missile3.constructor = () => extend(BuilderMechUnit, {});

missileHoly.constructor = () => extend(BuilderMechUnit, {});

//missileSurge.constructor = () => extend(BuilderMechUnit, {});
