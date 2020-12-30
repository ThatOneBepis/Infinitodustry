package infinitodustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.content.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;
import infinitodustry.maps.planet.*;

public class InfinitodustryPlanets implements ContentList{
    public static Planet
    //region ainamelzung's planetary region
    ainamelzung,
    ainamelzungSatelite1, ainamelzungSatelite2, ainamelzungSatelite3, ainamelzungSatelite4, ainamelzungSatelite5, ainamelzungSatelite6, ainamelzungSatelite7;
    //endregion
    @Override
    public void load(){
    //region stars
    
    //endregion
    //region large planets
    
    ainamelzung = new Planet("ainamelzung", Planets.sun, 5, 1.35){{
        bloom = false;
        generator = new AinamelzungPlanetGenerator();
        atmosphereColor = Pal.heal;
        atmosphereRadIn = 0.2f;
        atmosphereRadOut = 1f;
        mesh = new HexMesh(this, 10);
        startSector = 40;
      }};
    
    //endregion
    //region standard-sized planets
    
    //endregion
    //region dwarfs
    
    //endregion
    //region natural satelites
    
    //endregion
    //region asteroids of higher importance
      
    ainamelzungSatelite1 = new Planet("ainamelzung-satelite-1", ainamelzung, 4, 0.3){{
          generator = new AsteroidGenerator();
          meshLoader = () -> new HexMesh(this, 1);
          hasAtmosphere = false;
          startSector = 2;
    }};
      
    ainamelzungSatelite2 = new Planet("ainamelzung-satelite-2", ainamelzung, 4, 0.3){{
          generator = new AsteroidGenerator();
          meshLoader = () -> new HexMesh(this, 1);
          hasAtmosphere = false;
          startSector = 4;
    }};
      
    ainamelzungSatelite3 = new Planet("ainamelzung-satelite-3", ainamelzung, 4, 0.3){{
          generator = new AsteroidGenerator();
          meshLoader = () -> new HexMesh(this, 1);
          hasAtmosphere = false;
          startSector = 8;
    }};
      
    ainamelzungSatelite4 = new Planet("ainamelzung-satelite-4", ainamelzung, 4, 0.3){{
          generator = new AsteroidGenerator();
          meshLoader = () -> new HexMesh(this, 1);
          hasAtmosphere = false;
          startSector = 6;
    }};
    
    ainamelzungSatelite5 = new Planet("ainamelzung-satelite-5", ainamelzung, 4, 0.3){{
          generator = new AsteroidGenerator();
          meshLoader = () -> new HexMesh(this, 1);
          hasAtmosphere = false;
          startSector = 8;
    }};
      
    ainamelzungSatelite6 = new Planet("ainamelzung-satelite-6", ainamelzung, 4, 0.3){{
          generator = new AsteroidGenerator();
          meshLoader = () -> new HexMesh(this, 1);
          hasAtmosphere = false;
          startSector = 3;
    }};
      
    ainamelzungSatelite7 = new Planet("ainamelzung-satelite-7", ainamelzung, 4, 0.3){{
          generator = new AsteroidGenerator();
          meshLoader = () -> new HexMesh(this, 1);
          hasAtmosphere = false;
          startSector = 26;
    }};
      
    //endregion
    //region other
    
    //bunchOfRocks
    
    //endregion  
    };
};
