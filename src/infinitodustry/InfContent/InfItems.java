package infinitodustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class InfItems implements ContentList{
  public static Item infiar, tenor, matrix, vector, scalar, copperSeptoxide, tauPlate, blastFabric, opticGlass, lemonPod, snowball, snowball2, stone, coins, ErrorItem; 

  @Override
    public void load(){
         infiar = new Item("infiar", Color.valueOf("57f1fe")){{
            hardness = 10;
            cost = 6f;
        }};

        tensor = new Item("tensor", Color.valueOf("ffb02f")){{
            hardness = 8;
            cost = 4.8f;
            flammability = 0.9f;
            exploiveness = 0.7f;
            radioactivity = 0.6f;
        }};

        matrix = new Item("matrix", Color.valueOf("fb76ff")){{
            hardness = 6;
            cost = 3.6f;
            flammability = 1.15f;
            exploiveness = 0.35f;
            radioactivity = 0.1f;
        }};

        vector = new Item("vector", Color.valueOf("5d5de2")){{
            hardness = 5;
            cost = 3f;
            radioactivity = 1.1f;
        }};

        scalar = new Item("scalar", Color.valueOf("50d63f")){{
            cost = 2.4f;
            hardness = 4;
        }};

        copperSeptoxide = new Item("toughitinum", Color.valueOf("66a00d")){{
            cost = 3.5f;
        }};

        tauPlate = new Item("tau-plate", Color.valueOf("e1b75e")){{
            cost = 3f;
        }};

        blastFabric = new Item("blast-fabric", Color.valueOf("3a3a3a")){{
            cost = 2f;
            flammability = 1f;
            exploiveness = -0.5f;
        }};

        opticGlass = new Item("visionary-glass", Color.valueOf("369928")){{
            cost = 3f;
        }};
      
        snowball = new Item("snowball", Color.valueOf("dbdbdb")){{}};  
          
        snowball2 = new Item("snowball-but-colder", Color.valueOf("67c1e1")){{}};
      
        stone = new Item("stone", Color.valueOf("494949")){{
            hardness = 3;
        }};
      
        lemonPod = new Item("lemon", Color.valueOf("fff44f")){{}};  
          
        coins = new Item("stonks", Color.valueOf("FFD700")){{}};    
      
        errorItem = new Item("error-item", Color.white){{
            hardness = 15;
            flammability = exploiveness = radioactivity = 6.66666666666666666666666666666666666666666666666666f;
        }};          
    }
}
