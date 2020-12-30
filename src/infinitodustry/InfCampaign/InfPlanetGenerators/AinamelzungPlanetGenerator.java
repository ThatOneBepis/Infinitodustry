package infinitodustry.maps.planet;

import arc.graphics.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.util.noise.*;
import mindustry.ai.*;
import mindustry.ai.BaseRegistry.*;
import mindustry.content.*;
import mindustry.game.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.maps.generators.*;
import mindustry.type.*;
import mindustry.world.*;
import infinitodustry.content.*;

public class AinamelzungPlanetGenerator extends PlanetGenerator{
  BaseGenerator basegen = new BaseGenerator(){
    
  float scl = 4f;
  Block[][] arr = {
    {Blocks.dirt,   Blocks.dirt,     Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water,     Blocks.water, Blocks.stone,   Blocks.grass},
    {Blocks.dirt,   Blocks.grass,    Blocks.grass,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water,     Blocks.stone, Blocks.stone,   Blocks.grass},
    {Blocks.dirt,   Blocks.grass,    Blocks.grass,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.stone,     Blocks.stone,     Blocks.stone,     Blocks.stone, Blocks.stone,   Blocks.grass}, 
    {Blocks.stone,  Blocks.dirt,     Blocks.darksand,      Blocks.darksandWater, Blocks.darksandWater, Blocks.water,         Blocks.grass,     Blocks.grass,     Blocks.stone,     Blocks.stone,     Blocks.water, Blocks.grass,   Blocks.grass},
    {Blocks.stone,  Blocks.stone,    Blocks.darksandWater, Blocks.water,         Blocks.water,         Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.stone,     Blocks.stone,     Blocks.water, Blocks.grass,   Blocks.grass},   
    {Blocks.basalt, Blocks.basalt,   Blocks.darksand,      Blocks.darksandWater, Blocks.darksandWater, Blocks.water,         Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water, Blocks.grass,   Blocks.grass},
    {Blocks.basalt, Blocks.basalt,   Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.water,         Blocks.water,     Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water, Blocks.stone,   Blocks.snow},
    {Blocks.dacite, Blocks.basalt,   Blocks.darksand,      Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.deepwater, Blocks.basalt,    Blocks.basalt,    Blocks.water, Blocks.snow,    Blocks.ice},
    {Blocks.dacite, Blocks.dacite,   Blocks.dacite,        Blocks.stone,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.deepwater, Blocks.basalt,    Blocks.deepwater, Blocks.water, Blocks.snow,    Blocks.ice},
    {Blocks.basalt, Blocks.dacite,   Blocks.dacite,        Blocks.stone,         Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.deepwater, Blocks.deepwater, Blocks.deepwater, Blocks.water, Blocks.snow,    Blocks.ice},
    {Blocks.basalt, Blocks.basalt,   Blocks.basalt,        Blocks.basalt,        Blocks.darksand,      Blocks.darksandWater, Blocks.water,     Blocks.dacite,    Blocks.dacite,    Blocks.deepwater, Blocks.water, Blocks.snow,    Blocks.ice},
    {Blocks.dacite, Blocks.basalt,   Blocks.darksand,      Blocks.darksand,      Blocks.darksandWater, Blocks.darksandWater, Blocks.water,     Blocks.dacite,    Blocks.stone,     Blocks.stone,     Blocks.water, Blocks.ice,     Blocks.ice},
    {Blocks.dacite, Blocks.darksand, Blocks.darksandWater, Blocks.darksandWater, Blocks.water,         Blocks.water,         Blocks.water,     Blocks.deepwater, Blocks.stone,     Blocks.water,     Blocks.water, Blocks.ice,     Blocks.ice}
  };
    
     ObjectMap<Block, Block> dec = ObjectMap.of(
        Blocks.stone, Blocks.boulder,
        Blocks.darksand, Blocks.basaltBoulder,
        Blocks.basalt, Blocks.basaltBoulder,
        Blocks.dacite, Blocks.daciteBoulder
    );
    
     ObjectMap<Block, Block> tars = ObjectMap.of(
        Blocks.dacite, Blocks.shale,
        Blocks.stone, Blocks.shale
    );
    float water = 3f / arr[0].length;

    float rawHeight(Vec3 position){
        position = Tmp.v33.set(position).scl(scl);
        return (Mathf.pow((float)noise.octaveNoise3D(7, 0.5f, 1f/3f, position.x, position.y, position.z), 2.3f) + waterOffset) / (1f + waterOffset);
    }; 
      @Override
      public void generateSector(Sector sector){

        //enemy bases are almost everywhere, and have cores with advanced invasion capabilities
        if(sector.id == 40 || sector.id == 30){
            sector.generateEnemyBase = true;
            return;
        }

        Ptile tile = sector.tile;

        boolean any = false;
        float poles = Math.abs(tile.v.y);
        float noise = Noise.snoise3(tile.v.x, tile.v.y, tile.v.z, 0.001f, 0.58f);

        if(noise + poles/7.1 > 0.12 && poles > 0.23){
            any = true;
        }

        if(noise < 0.16){
            for(Ptile other : tile.tiles){
                var osec = sector.planet.getSector(other);
                {
                    return;
                }
            }
        }

        sector.generateEnemyBase = any;
    };
      Block getBlock(Vec3 position){
        float height = rawHeight(position);
        Tmp.v31.set(position);
        position = Tmp.v33.set(position).scl(scl);
        float rad = scl;
        float temp = Mathf.clamp(Math.abs(position.y * 2f) / (rad));
        float tnoise = (float)noise.octaveNoise3D(7, 0.56, 1f/3f, position.x, position.y + 999f, position.z);
        temp = Mathf.lerp(temp, tnoise, 0.5f);
        height *= 1.2f;
        height = Mathf.clamp(height);

        float tar = (float)noise.octaveNoise3D(4, 0.55f, 1f/2f, position.x, position.y + 999f, position.z) * 0.3f + Tmp.v31.dst(0, 0, 1f) * 0.2f;

        Block res = arr[Mathf.clamp((int)(temp * arr.length), 0, arr[0].length - 1)][Mathf.clamp((int)(height * arr[0].length), 0, arr[0].length - 1)];
        if(tar > 0.5f){
            return tars.get(res, res);
        }else{
            return res;
        }
    }
      
    @Override
    protected float noise(float x, float y, double octaves, double falloff, double scl, double mag){
        Vec3 v = sector.rect.project(x, y).scl(5f);
        return (float)noise.octaveNoise3D(octaves, falloff, 1f / scl, v.x, v.y, v.z) * (float)mag;
    }

    @Override
    protected void generate(){

        class Room{
            int x, y, radius;
            ObjectSet<Room> connected = new ObjectSet<>();

            Room(int x, int y, int radius){
                this.x = x;
                this.y = y;
                this.radius = radius;
                connected.add(this);
            }

            void connect(Room to){
                if(connected.contains(to)) return;

                connected.add(to);
                float nscl = rand.random(20f, 60f);
                int stroke = rand.random(4, 12);
                brush(pathfind(x, y, to.x, to.y, tile -> (tile.solid() ? 5f : 0f) + noise(tile.x, tile.y, 1, 1, 1f / nscl) * 60, Astar.manhattan), stroke);
            }
        }

        cells(4);
        distort(10f, 12f);

        float constraint = 1.3f;
        float radius = width / 2f / Mathf.sqrt3;
        int rooms = rand.random(2, 5);
        Seq<Room> roomseq = new Seq<>();

        for(int i = 0; i < rooms; i++){
            Tmp.v1.trns(rand.random(360f), rand.random(radius / constraint));
            float rx = (width/2f + Tmp.v1.x);
            float ry = (height/2f + Tmp.v1.y);
            float maxrad = radius - Tmp.v1.len();
            float rrad = Math.min(rand.random(9f, maxrad / 2f), 30f);
            roomseq.add(new Room((int)rx, (int)ry, (int)rrad));
        }
    
        for(Room room : roomseq){
            erase(room.x, room.y, room.radius);
        }

        int connections = rand.random(Math.max(rooms - 1, 1), rooms + 3);
        for(int i = 0; i < connections; i++){
            roomseq.random(rand).connect(roomseq.random(rand));
        }

        for(Room room : roomseq){
            spawn.connect(room);
        }

        cells(1);
        distort(10f, 6f);

        inverseFloodFill(tiles.getn(spawn.x, spawn.y));
    
        Seq<Block> ores = Seq.with(Blocks.oreCopper, Blocks.oreLead);
        float poles = Math.abs(sector.tile.v.y);
        float nmag = 0.5f;
        float scl = 1f;
        float addscl = 1.3f;
    
        if(noise.octaveNoise3D(2, 0.5, scl, sector.tile.v.x, sector.tile.v.y, sector.tile.v.z)*nmag + poles > 0.25f*addscl){
            ores.add(Blocks.oreCoal);
        }

        if(noise.octaveNoise3D(2, 0.5, scl, sector.tile.v.x + 1, sector.tile.v.y, sector.tile.v.z)*nmag + poles > 0.5f*addscl){
            ores.add(Blocks.oreTitanium);
        }

        if(noise.octaveNoise3D(2, 0.5, scl, sector.tile.v.x + 2, sector.tile.v.y, sector.tile.v.z)*nmag + poles > 0.7f*addscl){
            ores.add(Blocks.oreThorium);
        }

        if(rand.chance(0.25)){
            ores.add(Blocks.oreScrap);
        }
    
        if(noise.octaveNoise3D(2, 0.5, scl, sector.tile.v.x, sector.tile.v.y, sector.tile.v.z)*nmag + poles > 0.25f*addscl){
            ores.add(InfBlocks.oreMatrix);
        }

        if(noise.octaveNoise3D(2, 0.5, scl, sector.tile.v.x + 1, sector.tile.v.y, sector.tile.v.z)*nmag + poles > 0.5f*addscl){
            ores.add(InfBlocks.oreVector);
        }

        if(rand.chance(0.25)){
            ores.add(InfBlocks.oreScalar);
        }
        pass((x, y) -> {
      float difficulty = sector.threat;
        ints.clear();
        ints.ensureCapacity(width * height / 4);

        int ruinCount = rand.random(-2, 4);
        if(ruinCount > 0){
            int padding = 25;

            //create list of potential positions
            for(int x = padding; x < width - padding; x++){
                for(int y = padding; y < height - padding; y++){
                    Tile tile = tiles.getn(x, y);
                    if(!tile.solid() && (tile.drop() != null || tile.floor().liquidDrop != null)){
                        ints.add(tile.pos());
                    }
                }
            }

            ints.shuffle(rand);

            int placed = 0;
            float diffRange = 0.4f;
            //try each position
            for(int i = 0; i < ints.size && placed < ruinCount; i++){
                int val = ints.items[i];
                int x = Point2.x(val), y = Point2.y(val);

                //do not overwrite player spawn
                if(Mathf.within(x, y, spawn.x, spawn.y, 18f)){
                    continue;
                }

                float range = difficulty + rand.random(diffRange);

                Tile tile = tiles.getn(x, y);
                BasePart part = null;
                if(tile.overlay().itemDrop != null){
                    part = bases.forResource(tile.drop()).getFrac(range);
                }else if(tile.floor().liquidDrop != null && rand.chance(0.05)){
                    part = bases.forResource(tile.floor().liquidDrop).getFrac(range);
                }else if(rand.chance(0.05)){ //ore-less parts are less likely to occur.
                    part = bases.parts.getFrac(range);
                }
        //actually place the part
                if(part != null && BaseGenerator.tryPlace(part, x, y, Team.derelict, (cx, cy) -> {
                    Tile other = tiles.getn(cx, cy);
                    other.setOverlay(Blocks.oreScrap);
                    for(int j = 1; j <= 2; j++){
                        for(Point2 p : Geometry.d8){
                            Tile t = tiles.get(cx + p.x*j, cy + p.y*j);
                            if(t != null && t.floor().hasSurface() && rand.chance(j == 1 ? 0.4 : 0.2)){
                                t.setOverlay(Blocks.oreScrap);
                            }
                        }
                    }
                })){
                    placed ++;

                    int debrisRadius = Math.max(part.schematic.width, part.schematic.height)/2 + 3;
                    Geometry.circle(x, y, tiles.width, tiles.height, debrisRadius, (cx, cy) -> {
                        float dst = Mathf.dst(cx, cy, x, y);
                        float removeChance = Mathf.lerp(0.05f, 0.5f, dst / debrisRadius);

                        Tile other = tiles.getn(cx, cy);
                        if(other.build != null && other.isCenter()){
                            if(other.team() == Team.derelict && rand.chance(removeChance)){
                                other.remove();
                            }else if(rand.chance(0.5)){
                                other.build.health = other.build.health - rand.random(other.build.health * 0.9f);
                            }
                        }
                    });
                }
            }
        }

        Schematics.placeLaunchLoadout(spawn.x, spawn.y);

        for(Room espawn : enemies){
            tiles.getn(espawn.x, espawn.y).setOverlay(Blocks.spawn);
        }

        if(sector.hasEnemyBase()){
            basegen.generate(tiles, enemies.map(r -> tiles.getn(r.x, r.y)), tiles.get(spawn.x, spawn.y), state.rules.waveTeam, sector, difficulty);

            state.rules.attackMode = sector.info.attack = true;
        }else{
            state.rules.winWave = sector.info.winWave = 10 + 5 * (int)Math.max(difficulty * 10, 1);
        }

        float waveTimeDec = 0.4f;

        state.rules.waveSpacing = Mathf.lerp(60 * 65 * 2, 60f * 60f * 1f, Math.max(difficulty - waveTimeDec, 0f) / 0.8f);
        state.rules.waves = sector.info.waves = true;
        state.rules.enemyCoreBuildRadius = 600f;

        state.rules.spawns = Waves.generate(difficulty, new Rand(), state.rules.attackMode);
    }
        };
       @Override
       public void postGenerate(Tiles tiles){
        if(sector.hasEnemyBase()){
            basegen.postGenerate();
        }      ;
      };
    };
  };
};
