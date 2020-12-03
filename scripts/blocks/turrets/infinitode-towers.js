const lib = require("mechanics/xp");

//Blast tower
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
    print("Damage: "+blast.splashDamage);
    this.super$shoot(type);
  },
  levelUp(level){
    print("This tower has blasted into level " + level);
  },
  draw: function(){
    this.region = Core.atlas.find("clear");
    this.heatRegion = Core.atlas.find(this.name + "-pillar");
    this.baseRegion = Core.atlas.find(this.name);
  },
  generateIcons: function(){
  return [
    Core.atlas.find(this.name),
  ];},
});

//Multishot tower
const shotgun = lib.extend(ItemTurret, ItemTurret.ItemTurretBuild, "multishot", {
  maxLevel: 10,
  expFields: [
    {
      type: "exp",
      field: "shots",
      start: 4,
      intensity: 1.2
    }
  ],
}, {
  shoot(type){
    this.incExp(15);
    print("Projectile count: "+shotgun.shots);
    this.super$shoot(type);
  },
  levelUp(level){
    print("This tower has made to level " + level);
  },
});

//Venom tower
const venom = lib.extend(ItemTurret, ItemTurret.ItemTurretBuild, "venom-tower", {
  maxLevel: 10,
  expFields: [
    {
      type: "linear",
      field: "fragBullets",//StatusEffects.melting,
      start: "fragBullets",//StatusEffects.melting,
      intensity: "fragBullets"/*StatusEffects.melting,*/*0.15
    }
  ]
}, {
  shoot(type){
    this.incExp(45);
    //print("Acid strength: "+StatusEffects.melting);
    this.super$shoot(type);
  },
  levelUp(level){
    print("This tower has made to level " + level);
  },
});

//Anti-air tower
const air = lib.extend(ItemTurret, ItemTurret.ItemTurretBuild, "anti-air", {
  maxLevel: 10,
  expFields: [
    /*{
      type: "linear",
      field: "pierceCap",
      start: "pierceCap",
      intensity: "pierceCap"*0.2
    },*/
    {
      type: "linear",
      field: "damage",
      start: "damage",
      intensity: "damage"*0.3
    }
  ],
}, {
  shoot(type){
    this.incExp(25);
    print("Penetration: "+air.pierceCap);
    this.super$shoot(type);
  },
  levelUp(level){
    print("This tower has made to level " + level);
  },
});

//Tesla
/*const tesla = lib.extend(PowerTurret, PowerTurret.PowerTurretBuild, "edison", {
  maxLevel: 10,
  expFields: [
    {
      type: "linear",
      field: "lightningLength",
      start: 10,
      intensity: 1
    },
    {
      type: "linear",
      field: "range",
      start: 100,
      intensity: 10
    }],
},{
  shoot(type){
    this.incExp(10);
    print("Lightning Chain Length: "+tesla.lightningLength);
    this.super$shoot(type);
  },
  levelUp(level){
    print("This tower has made to level " + level);
  },
});*/