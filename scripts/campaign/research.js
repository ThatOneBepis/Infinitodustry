
const tau = extendContent(Block, "tau-branch", {
  researchRequirements(){
        var out = ItemStack.with(moni, 20000);
        return out;
    },
  //setStats(){BlockType.core.unitCapModifier = "unitCapModifier"*1.1}, 
  canPlaceOn(){return false},
  isHidden(){return true}
});

const infiarDrill = extendContent(Drill, "infiar-drill",{
    load: function(){
        this.region = Core.atlas.find("clear");
        this.rimRegion = Core.atlas.find("clear");
        this.topRegion = Core.atlas.find(this.name);
        this.rotatorRegion = Core.atlas.find(this.name + "-rotator");
    },
    generateIcons: function(){
    return [
        Core.atlas.find(this.name),
    ];},
});

const tensorDrill = extendContent(Drill, "tensor-drill",{
    load: function(){
        this.region = Core.atlas.find("clear");
        this.rimRegion = Core.atlas.find("clear");
        this.topRegion = Core.atlas.find(this.name);
        this.rotatorRegion = Core.atlas.find(this.name + "-rotator");
    },
    /*draw(tile){
        Draw.rect(Core.atlas.find(this.name), tile.drawx(), tile.drawy());
        Draw.rect(Core.atlas.find("infinitodustry-tensor-drill-rotator"), tile.drawx()-10, tile.drawy()-10, Time.time()*5*this.efficiency);
        Draw.rect(Core.atlas.find("infinitodustry-tensor-drill-rotator"), tile.drawx()+10, tile.drawy()-10, Time.time()*5*this.efficiency);
    },*/
    generateIcons: function(){
    return [
        Core.atlas.find(this.name),
    ];},
});

const matrixDrill = extendContent(Drill, "matrix-drill",{
    load: function(){
        this.region = Core.atlas.find("clear");
        this.rimRegion = Core.atlas.find("clear");
        this.topRegion = Core.atlas.find(this.name);
        this.rotatorRegion = Core.atlas.find(this.name + "-rotator");
    },
    /*draw(tile){
        Draw.rect(Core.atlas.find(this.name), tile.drawx(), tile.drawy());
        Draw.rect(Core.atlas.find("infinitodustry-matrix-drill-rotator"), tile.drawx()-10, tile.drawy()-10, Time.time()*5*this.efficiency);
        Draw.rect(Core.atlas.find("infinitodustry-matrix-drill-rotator"), tile.drawx()+10, tile.drawy()-10, Time.time()*5*this.efficiency);
    },*/
    generateIcons: function(){
    return [
        Core.atlas.find(this.name),
    ];},
});

const vectorDrill = extendContent(Drill, "vector-drill",{
    load: function(){
        this.region = Core.atlas.find("clear");
        this.rimRegion = Core.atlas.find("clear");
        this.topRegion = Core.atlas.find(this.name);
        this.rotatorRegion = Core.atlas.find(this.name + "-rotator");
    },
    /*draw(tile){
        Draw.rect(Core.atlas.find(this.name), tile.drawx(), tile.drawy());
        Draw.rect(Core.atlas.find("infinitodustry-vector-drill-rotator"), tile.drawx()-10, tile.drawy()-10, Time.time()*5*this.efficiency);
        Draw.rect(Core.atlas.find("infinitodustry-vector-drill-rotator"), tile.drawx()+10, tile.drawy()-10, Time.time()*5*this.efficiency);
    },*/
    generateIcons: function(){
    return [
        Core.atlas.find(this.name),
    ];},
});

const scalarDrill = extendContent(Drill, "scalar-drill",{
    load: function(){
        this.region = Core.atlas.find("clear");
        this.rimRegion = Core.atlas.find("clear");
        this.topRegion = Core.atlas.find(this.name);
        this.rotatorRegion = Core.atlas.find(this.name + "-rotator");
    },
     /*draw(tile){
        Draw.rect(Core.atlas.find(this.name), tile.drawx(), tile.drawy());
        Draw.rect(Core.atlas.find("infinitodustry-scalar-drill-rotator"), tile.drawx()-10, tile.drawy()-10, Time.time()*5*this.efficiency);
        Draw.rect(Core.atlas.find("infinitodustry-scalar-drill-rotator"), tile.drawx()+10, tile.drawy()-10, Time.time()*5*this.efficiency);
    },*/
    generateIcons: function(){
    return [
        Core.atlas.find(this.name),
    ];},
});
/*
const rubber2 = extendContent(Block, "rubber-improvement-health", {
  researchRequirements(){
        var out = ItemStack.with(moni, 30000, rubber1, 12000);
        return out;
    },
  setStats(){*//* uncertain which stat to modify*//*},
  canPlaceOn(){return false},
  isHidden(){return true}
});

const rubber3 = extendContent(Block, "rubber-improvement-explosion", {
  researchRequirements(){
        var out = ItemStack.with(moni, 50000, rubber1, 15000, tensor, 10000);
        return out;
    },
  setStats(){*//* uncertain which stat to modify*//*},
  canPlaceOn(){return false},
  isHidden(){return true}
});

const rubber4 = extendContent(Block, "rubber-improvement-flame, {
  researchRequirements(){
        var out = ItemStack.with(moni, 70000, infiar1, 25000, Items.pyratite, 25000);
        return out;
    },
  setStats(){*//* uncertain which stat to modify*//*},
  canPlaceOn(){return false},
  isHidden(){return true}
});

const infiar2 = extendContent(Block, "digital-boost-health", {
  researchRequirements(){
        var out = ItemStack.with(moni, 80000, infiar1, 8000, Items.thorium, 12000);
        return out;
    },
  setStats(){*//* uncertain which stat to modify*//*},
  canPlaceOn(){return false},
  isHidden(){return true}
});

const infiar3 = extendContent(Block, "digital-boost-regen", {
  researchRequirements(){
        var out = ItemStack.with(moni, 100000, infiar1, 10000, copperVectoxide, 10500);
        return out;
    },
  setStats(){*//* uncertain which stat to modify*//*},
  canPlaceOn(){return false},
  isHidden(){return true}
});
*/
infiarDrill.drawMineItem = true;
tensorDrill.drawMineItem = true;
matrixDrill.drawMineItem = true;
vectorDrill.drawMineItem = true;
scalarDrill.drawMineItem = true;