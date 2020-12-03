//mechanics part made by younggam
const multiLib=require("infinitodustry/mechanics/multi-lib");
//you can use GenericSmelter instead GenericCrafter
//also GenericSmelter.SmelterBuild instead GenericCrafter.GenericCrafterBuild
//                                                                          	 ▼this has to be same with .json file name
//
const recycle=multiLib.MultiCrafter(GenericCrafter,GenericCrafter.GenericCrafterBuild,"recycle",[
    /*default form for each recipes. You can change values.
    Stuff naming guidelines
	Modded Item:  "mod-name-item-name/amount", Vanilla Item: "item-name/amount"
	Modded Liquid:  "mod-name-liquid-name/amount",  Vanilla liquid: "liquid-name/amount"
    */
{
  input:{
	items:["scrap/1"],    
    power:0.7,
        },
  output:{
    items:["sand/1"]
        },
        craftTime:12,
    },
    {
  input:{
    items:["infinitodustry-stone/1"],
    power:0.7,
  },
  output:{
    items:["sand/1"],
  },
  craftTime:12
},
{
  input:{
    items:["infinitodustry-scalar/1"],
    power:0.9,
  },
  output:{
    items:["scrap/2"],
  },
  craftTime:30
},
{
  input:{
    items:["infinitodustry-scalar/1"],
    power:0.9,
  },
  output:{
    items:["infinitodustry-stone/2"],
  },
  craftTime:30
},
{
  input:{
    items:["infinitodustry-vector/1"],
    power:1.2,
  },
  output:{
    items:["infinitodustry-scalar/2"],
  },
  craftTime:50
},
{
  input:{
    items:["infinitodustry-matrix/1"],
    power:1.5,
  },
  output:{
    items:["infinitodustry-vector/2"],
  },
  craftTime:64
},
{
  input:{
    items:["infinitodustry-tensor/1"],
    power:1.8,
  },
  output:{
    items:["infinitodustry-matrix/2"],
  },
  craftTime:82
},
{
  input:{
    items:["infinitodustry-infiar/1"],
    power:2.15,
  },
  output:{
    items:["infinitodustry-tensor/2"],
  },
  craftTime:99
}],{
    /*
    you can customize block here. ex) load()
    not used here as it isn't needed
    */
},
/*this is Object constructor. This way is much better than literal way{a:123}
you can replace this with {} if you don't want to modify entity*/
function Extra(){
    /*you can use customUpdate=function(){}. this function excuted before update()
    also this.draw=function(){}
    you can customize entity here.
    ex)
    this._myProp=0;
    this.getMyProp=function(){
        return this._myProp;
    };
    this.setMyProp=function(a){
        this._myProp=a;
    };*/
});
/*
YOU MUST NOT MODIFY VALUE OF THESE
configurable
outputsPower
hasItems
hasLiquids
hasPower
*/
recycle.itemCapacity = 30;
recycle.size = 3;
recycle.health = 150;
recycle.craftEffect = Fx.pulverizeMedium;
recycle.updateEffect = Fx.none;
/*true: dump items and liquids of output according to button
false: dump items and liquids of output unconditionally*/
recycle.dumpToggle = true;