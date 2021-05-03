package infinitodustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.content.*;
import infinitodustry.content.*;

public class InfLiquids implements ContentList{
    public static Liquid ion, ink, lemonade, darkMatter, errorLiquid;

    @Override
    public void load(){

        ion = new Liquid("ion-matter", Color.cyan){{
            lightColor = Color.cyan;
            temperature = 10f;
            heatCapacity = 1.5f;
            viscosity = 0f;
            explosiveness = 0f;
            effect = InfStatusEffects.evaporation;
        }};

        ink = new Liquid("ink", Color.valueOf("16264c")){{
            temperature = 0.6f;
            viscosity = 0.6f;
            flamability = 0.5f;
            explosiveness = 0.5f;
            statusDuration = 240f;
            effect = InfStatusEffects.inked;
        }};
      
        lemonade = new Liquid("lemon-acid", Color.valueOf("fffa8b")){{
            temperature = 0.5f;
            viscosity = 0.5f;
            statusDuration = 115f;
            effect = InfStatusEffects.lemonned;
        }};
      
        darkMatter = new Liquid("dark-matter", Color.valueOf("0b020d")){{
            temperature = 0.0001f;
            viscosity = 2f;
            flamability = -15f;
            explosiveness = 1.25f;
            heatCapacity = 0.1f;
        }};
      
        errorLiquid = new Liquid("error-liquid", Color.white){{
            temperature = 0.0001f;
            viscosity = flamability = explosiveness = 6.66666666666666666666666666666666666666666666666666f;
            heatCapacity = 0f;
            effect = InfStatusEffect.errorStatus;
          }};      
    }
}
