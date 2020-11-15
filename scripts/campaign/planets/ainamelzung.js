//region planet gen
/*const planetInfusionGen = extend(PlanetGenerator, {
    getColor(position){
    let block = getBlock(position);
    Tmp.c1.set(block.mapColor).a = 1 - block.albedo;
    return Tmp.c1;
  }
});
planetInfusionGen.arr = [
    [Blocks.dirt,   Blocks.dirt,     Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water,     Blocks.water, Blocks.stone,   Blocks.grass],
    [Blocks.dirt,   Blocks.grass,    Blocks.grass,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water,     Blocks.stone, Blocks.stone,   Blocks.grass],
    [Blocks.dirt,   Blocks.grass,    Blocks.grass,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.stone,     Blocks.stone,     Blocks.stone,     Blocks.stone, Blocks.stone,   Blocks.grass],
    [Blocks.stone,  Blocks.dirt,     Blocks.darksand,      Blocks.darksandWater, Blocks.darksandWater, Blocks.water,         Blocks.grass,     Blocks.grass,     Blocks.stone,     Blocks.stone,     Blocks.water, Blocks.grass,   Blocks.grass],
    [Blocks.stone,  Blocks.stone,    Blocks.darksandWater, Blocks.water,         Blocks.water,         Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.stone,     Blocks.stone,     Blocks.water, Blocks.grass,   Blocks.grass],
    [Blocks.basalt, Blocks.basalt,   Blocks.darksand,      Blocks.darksandWater, Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water, Blocks.grass,   Blocks.grass],
    [Blocks.basalt, Blocks.basalt,   Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.water,     Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water, Blocks.stone,   Blocks.snow],
    [Blocks.dacite, Blocks.basalt,   Blocks.darksand,      Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.deepwater, Blocks.basalt,    Blocks.basalt,    Blocks.water, Blocks.snow,    Blocks.ice],
    [Blocks.dacite, Blocks.dacite,   Blocks.dacite,        Blocks.stone,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.deepwater, Blocks.basalt,    Blocks.deepwater, Blocks.water, Blocks.snow,    Blocks.ice],
    [Blocks.basalt, Blocks.dacite,   Blocks.dacite,        Blocks.stone,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water, Blocks.snow,    Blocks.ice],
    [Blocks.basalt, Blocks.basalt,   Blocks.basalt,        Blocks.basalt,        Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.dacite,    Blocks.dacite,    Blocks.deepwater, Blocks.water, Blocks.snow,    Blocks.ice],
    [Blocks.dacite, Blocks.basalt,   Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.darksandWater, Blocks.water,     Blocks.dacite,    Blocks.stone,     Blocks.stone,     Blocks.water, Blocks.ice,     Blocks.ice],
    [Blocks.dacite, Blocks.darksand, Blocks.darksandWater, Blocks.darksandWater, Blocks.water,         Blocks.water,         Blocks.water,     Blocks.deepwater, Blocks.stone,     Blocks.water,     Blocks.water, Blocks.ice,     Blocks.ice]
  ];
planetInfusionGen.dec = [
  Blocks.dacite, Blocks.basalt,
  Blocks.stone, Blocks.moss,
  Blocks.shale, Blocks.water,
  Blocks.shale, Blocks.deepwater
];
planetInfusionGen.tars = [
  Blocks.dacite, Blocks.shale,
  Blocks.basalt, Blocks.shale
  ];
planetInfusionGen.basegen = new BaseGenerator(*//*who knows, custom base generation may be added*//*);
planetInfusionGen.water = 3 / planetInfusionGen.arr[0].length;
planetInfusionGen.waterOffset = 0.07;
planetInfusionGen.scl = 4;
//end region
//region planet
const ainamelzung = new JavaAdapter(Planet, {}, "ainamelzung", Planets.sun, 5, 1.35);

ainamelzung.blooming = false;
ainamelzung.startSector = 45;
ainamelzung.atmosphereColor = Pal.heal;
ainamelzung.generator = planetInfusionGen;
ainamelzung.hasAtmosphere = true;
ainamelzung.sectorSize = 6;
ainamelzung.meshLoader = () => new HexMesh(ainamelzung, 10);
//end region
//region preset maps
const hmw_alloyists = Vars.content.getByName(ContentType.planet, "infinitodustry-ainamelzung");
const drillSector = new JavaAdapter(SectorPreset, {}, "debug-sector", hmw_alloyists, 25);
drillSector.alwaysUnlocked = true;
drillSector.captureWave = 145;
const tempLoc = new JavaAdapter(SectorPreset, {}, "Discount-bossfight", hmw_alloyists, 4);
tempLoc.alwaysUnlocked = true;
//end region
//region technicallities
Vars.renderer.planets.planet = hmw_alloyists;

//const noise1 = new Packages.arc.util.noise.RidgedPerlin(1, 2);
const noise2 = new Packages.arc.util.noise.Simplex();
noise2.octaveNoise3D();
function getBlock(pos){
  let height = rawHeight(pos);
  Tmp.v31.set(pos);
  pos = Tmp.v33.set(pos).scl(planetInfusionGen.scl);
  let rad = planetInfusionGen.scl;
  let temp = Mathf.clamp(Math.abs(pos.y * 2) / rad);
  let tnoise = noise2.octaveNoise3D(7, 0.56, 1 / 3, pos.x, pos.y + 999, pos.z);
  temp = Mathf.lerp(temp, tnoise, 0.5);
  height = height * 1.2;
  height = Mathf.clamp(height);
  let tar = noisez.octaveNoise3D(4, 0.55, 0.5, pos.x, pos.y + 999, pos.z) * 0.3 + Tmp.v31.dst(0, 0, 1) * 0.2;
  let res = [
    Mathf.clamp(temp * planetInfusionGen.arr.length, 0, planetInfusionGen.arr[0].length - 1)][Mathf.clamp(height * planetInfusionGen.arr[0].length, 0, planetInfusionGen.arr[0].length - 1)
    ];
  if (tar > 0.5){
    return planetInfusionGen.tars.get(res, res);
  } else {
    return res;
  };
};
function rawHeight(pos){
pos = Tmp.v33.set(pos);
pos.scl(planetInfusionGen.scl);
  return (Mathf.pow(noise2.octaveNoise3D(7, 0.5, 1 / 3, pos.x, pos.y, pos.z), 2.3) + planetInfusionGen.waterOffset) / (1 + planetInfusionGen.waterOffset);
};*/
//end region