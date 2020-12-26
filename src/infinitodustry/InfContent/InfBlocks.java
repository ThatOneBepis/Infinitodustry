package infinitodustry.content;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.experimental.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
/*
import infinitodustry.world.blocks.defense.*;
import infinitodustry.world.blocks.units.*;
import infinitodustry.world.blocks.distribution.*;
*/ 
import static mindustry.type.ItemStack.*;
                                             
public class InfinitodustryBlocks implements ContentList{
    public static Block

    //environment
  
    //ores
    oreInfiar, oreTensor, oreMatrix, oreVector, oreScalar, 
    orePlastanium, oreError;
    
    //crafting
    
    //sandbox
 
    //defense
    
    //transport
    
    //liquid

    //power

    //production

    //storage

    //turrets

    //units
    
    //logic

    //campaign
    
    @Override
    public void load(){
        // region enviorment
    
        // endregion
        // region ore
        oreError = new OreBlock(InfItems.errorItem){{
            oreDefault = false;
        }};
        oreInfiar = new OreBlock(InfItems.infiar){{
            oreDefault = true;
            oreThreshold = 0.917f;
            oreScale = 25.555555f;
        }};
        oreTensor = new OreBlock(InfItems.tensor){{
            oreDefault = true;
            oreThreshold = 0.903f;
            oreScale = 25.352764;
        }};
        oreMatrix = new OreBlock(InfItems.matrix){{
            oreDefault = true;
            oreThreshold = 0.865f;
            oreScale = 23.975435f;
        }};
        oreVector = new OreBlock(InfItems.vector){{
            oreDefault = true;
            oreThreshold = 0.891f;
            oreScale = 24.863362f;
        }};
        oreScalar = new OreBlock(InfItems.scalar){{
            oreDefault = true;
            oreThreshold = 0.885f;
            oreScale = 24.436374;
        }};
        orePlastanium = new OreBlock(Items.plastanium){{
            oreDefault = true;
        }};
        // endregion
        // region defense

        // endregion
        // region transport

        // endregion
        // region power
        
        // endregion
        // region storage
    
        // endregion
        // region production

        // endregion
        // region turrets

        // endregion
        // region units
        
        // endregion
        // region logic
        
        // endregion
        // region campaign
    
        // endregion
    }
}
