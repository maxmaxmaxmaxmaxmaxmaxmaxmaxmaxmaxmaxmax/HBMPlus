val iron_ingot = <ore:ingotIron>;
val glass_pane = <ore:paneGlass>;
val dirt = <minecraft:dirt>;
val stick = <ore:stickWood>;
val stone = <ore:stone>;
val flint = <ore:itemFlint>;
val glass = <ore:blockGlass>;
val obsidian = <ore:blockObsidian>;

val tita_plate = <ore:plateTitanium>;
val tita_cast_plate = <hbm:item.plate_cast:2200>;

val rubber = <ore:ingotRubber>;
val microchip = <hbm:item.circuit:6>;
val kobold_ingot = <witchery:ingredient:150>;
val glassware = <ore:ntmchemistryset>;
val dense_stone = <hbm:tile.reinforced_stone>;
val dense_stone_stairs = <hbm:tile.reinforced_stone_stairs>;
val weak_orb = <AWWayofTime:weakBloodOrb>;

recipes.addShaped(<hbm:tile.dirt_dead> * 8,
 [[dirt, dirt, dirt],
  [dirt, <AWWayofTime:tennebrae>, dirt],
  [dirt, dirt, dirt]]);
recipes.remove(<minecraft:bucket>);
recipes.addShaped(<minecraft:bucket>,
 [[null, null, null],
  [<hbm:item.plate_iron>, null, <hbm:item.plate_iron>],
  [null, <hbm:item.plate_iron>, null]]);
recipes.remove(<hbm:item.envsuit_helmet>);
recipes.addShaped(<hbm:item.envsuit_helmet>,
 [[tita_plate, microchip, tita_plate],
  [tita_plate, glass_pane, tita_plate],
  [kobold_ingot, kobold_ingot, kobold_ingot]]);

recipes.remove(<hbm:item.envsuit_plate>);
recipes.addShaped(<hbm:item.envsuit_plate>,
 [[tita_plate, null, tita_plate],
  [tita_plate, tita_cast_plate, tita_plate],
  [kobold_ingot, kobold_ingot, kobold_ingot]]);

recipes.remove(<hbm:item.envsuit_legs>);
recipes.addShaped(<hbm:item.envsuit_legs>,
 [[tita_plate, tita_cast_plate, tita_plate],
  [kobold_ingot, null, kobold_ingot],
  [tita_plate, null, tita_plate]]);

recipes.remove(<hbm:item.envsuit_boots>);
recipes.addShaped(<hbm:item.envsuit_boots>,
 [[kobold_ingot, null, kobold_ingot],
  [tita_plate, null, tita_plate],
  [null, null, null]]);

recipes.remove(<AWWayofTime:Altar>);
recipes.addShaped(<AWWayofTime:Altar>,
 [[dense_stone_stairs, null, dense_stone_stairs],
  [dense_stone, iron_ingot, dense_stone],
  [dense_stone, dense_stone, dense_stone]]);

recipes.remove(<AWWayofTime:sacrificialKnife>);
recipes.addShaped(<AWWayofTime:sacrificialKnife>,
 [[null, flint, null],
  [stick, null, null],
  [null, null, null]]);

recipes.remove(<AWWayofTime:blockWritingTable>);
recipes.addShaped(<AWWayofTime:blockWritingTable>,
 [[null, glassware, null],
  [obsidian, weak_orb, obsidian],
  [null, null, null]]);