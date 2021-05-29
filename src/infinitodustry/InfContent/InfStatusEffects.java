package infinitodustry.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.content.*;

public class InfStatusEffects implements ContentList{
    public static evaporation, inked, lemonned, lag, defUp, atkUp/*, ldrUp, verified, shrouded*/;
                
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
           oppsite(StatusEffects.wet, StatusEffects.tarred);
           affinity(StatusEffects.melting, ((unit, time, newTime, result) -> result.set(StatusEffects.melting, newTime + time)));
             });
        }};
      
        lemonned = extends(StatusEffects.melting){{
           color = Color.valueOf("fffa8b");
          }};
      
        lag = new StatusEffect("l-a-g"){{
            speedMultiplier = 0f;
            healthMultiplier = 0f;
            damageMultiplier = 0f;
            reloadMultiplier = 0f;
            damage = 1;
            effect = Fx.unitDespawn;
            color = Color.valueOf("ffffff");
        }};
      
        defUp = new StatusEffect("def-up"){{
            healthMultiplier = 3.5f;
            effect = Fx.none;
        }};

        atkUp = new StatusEffect("atk-up"){{
            damageMultiplier = 2.5f;
            effect = Fx.none;
        }};

        /*ldrUp = new StatusEffect("ldr-up"){{
            effect = Fx.none;
            speedMultiplier = 1.5f;
            healthMultiplier = 1.5f;
            damageMultiplier = 1.5f;
            reloadMultiplier = 1.5f;
            init(() -> {
                opposite(StatusEffect, ignore(atkUp, defUp, cloak, StatusEffects.overclock, StatusEffects.boss);
                });
        }};
         */

        /*verified = new StatusEffect("verified"){{
        //le stuff that overrides the invisibility thing

        }};
        */
        //shroud = new StatusEffect("shroud"){{}}; non-existence but its communisn and getting ridden when shoot
   }
}
