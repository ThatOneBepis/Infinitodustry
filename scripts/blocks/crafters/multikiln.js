//mechanics part made by younggam
const multiLib=require("infinitodustry/mechanics/multi-lib");
const multikiln=multiLib.MultiCrafter(GenericSmelter,GenericSmelter.SmelterBuild,"multikiln",[
{
  input:{
    items:["sand/8"],
    liquids:["slag/10"],
    power:4.5,
  },
  output:{
    items:["metaglass/5"],
  },
  craftTime:48
},
{
  input:{
    items:["sand/8"],
    liquids:["slag/14"],
    power:4.5,
  },
  output:{
    items:["infinitodustry-visionary-glass/5"],
  },
  craftTime:48
}
],{},
function Extra(){});
multikiln.itemCapacity= 15
multikiln.liquidCapacity= 20;
multikiln.size= 3;
multikiln.health= 150;
multikiln.dumpToggle = true;