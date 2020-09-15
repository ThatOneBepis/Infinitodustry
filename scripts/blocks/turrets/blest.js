const lib = require("mechanics/xp");

const blast = lib.extend(ItemTurret, ItemTurret.ItemTurretBuild, "blast-tower", {
  maxLevel: 10,
  //Which fields to increase in what way.
  expFields: [
    {
      type: "linear",
      field: "splashDamage",
      start: "splashDamage",
      intensity: "splashDamage"*0.1
    }
  ],
  //The original Block extension object. Excluded because it uses unconventional means of warfare
  /*init(){
    this.super$init();
    this.ammo(Items.coal, Bullets.basicFlame, Items.pyratite, Bullets.pyraFlame);
  }*/
}, {
  //The original Building extension object.
  shoot(type){
    //Increment EXP, replace this with whenever you want the block to gain EXP.
    this.incExp(5);
    print("Reload: "+blast.reloadTime);
    this.super$shoot(type);
  },
  levelUp(level){
    print("This tower has blasted into level " + level);
  },
  load: function(){
    this.region = Core.atlas.find("clear");
    this.heatRegion = Core.atlas.find(this.name + "-pillar");
    this.baseRegion = Core.atlas.find(this.name);
  },
  generateIcons: function(){
  return [
    Core.atlas.find(this.name),
  ];},
});