const planetInfusionGen = extend(SerpuloPlanetGenerator, {});
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
planetInfusionGen.basegen = new BaseGenerator(/*who knows, custom base generation may be added*/);
planetInfusionGen.water = 3 / planetInfusionGen.arr[0].length;
planetInfusionGen.waterOffset = 0.07;
planetInfusionGen.scl = 4;

const ainara = new JavaAdapter(Planet, {}, "ainara", Planets.sun, 5, 1.35);

ainara.blooming = false;
ainara.startSector = 25;
ainara.atmosphereColor = Pal.heal;
ainara.generator = planetInfusionGen;
ainara.hasAtmosphere = true;
ainara.sectorSize = 6;
ainara.meshLoader = () => new HexMesh(ainara, 10);
