//general scripts tied to infiar walls
const cooldown = 60;
const fraction = 25;

const wallRegen = extendContent(Wall, "infiar-wall",{});

wallRegen.buildType = () => extendContent(Wall.WallBuild, wallRegen, {
	updateTile() {
		if (this.damaged() & this.timer.get(0, cooldown)) {
            this.heal(this.maxHealth / fraction);
            Fx.healBlockFull.at(this.x, this.y, wallRegen.size, Pal.heal);
        }
	}
});

const wallRegenLarge = extendContent(Wall, "infiar-wall-large", {});

wallRegenLarge.buildType = () => extendContent(Wall.WallBuild, wallRegenLarge, {
	updateTile() {
    	if (this.damaged() & this.timer.get(0, cooldown)) {
            this.heal(this.maxHealth / fraction);
            Fx.healBlockFull.at(this.x, this.y, wallRegenLarge.size, Pal.heal);
        }
    }
});