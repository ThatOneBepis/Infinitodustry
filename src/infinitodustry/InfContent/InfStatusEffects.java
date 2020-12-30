package infinitodustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.content.*;

public class infinitodustryStatusEffects implements ContentList{
    public static evaporation, inked, lemonned, lag;
                
    @Override
    public void load(){
        evaporation = new StatusEffect("evaporation"){{
         color = Colors.cyan;
         effect = Fx.melting;
         damage = 0.5f;
         speedMultiplier = 0.9f;
         healthMultiplier = 0.7f;
         damageMultiplier = 0.9f;
         reloadMultiplier = 0.7f;  
         init(() -> {
            oppsite(StatusEffects.muddy, StatusEffects.sporeSlowed, ((unit, time, newTime, result) -> {
             result.set(this, Math.min(time - newTime, 200f));
            }));  
          });
        });
      
        }};
        inked = new StatusEffect("inked"){{
           speedMultiplier = 0.6f;
           effect = Fx.oily;
           color = Color.valueOf("16264c");
           init(() -> {
           oppsite(wet, tarred);
           trans(melting, ((unit, time, newTime, result) -> result.set(melting, newTime + time)));
             });
        }};
      
        lemonned = extends(StatusEffects.melting){{
           color = Color.valueOf("fffa8b");
          }};
      
        lag = new StatusEffect("l-a-g"){{
        speedMultiplier = 0;
        healthMultiplier = 0;
        damageMultiplier = 0;
        reloadMultiplier = 0;
        damage = 1;
        effect = Fx.unitDespawn;
        color = Color.valueOf("ffffff");
          }};                
   }
}
