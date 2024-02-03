package net.betterores.block;

import net.betterores.BetterOres;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ISMANITE_ORE 

    private static Block registerBlock(String  name, Block block) {
      registerBlockItem(name, Block);
      return Registry.register(Registries.BLOCK, new Identifier(BetterOres.MOD_ID, name ),  block);

    }

    private static Item registerBlockItem(String name, Block block ){
        return Registry.register(Registries.ITEM, new Identifier(BetterOres.MOD_ID, name ),
              new BlockItem(Block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        BetterOres.LOGGER.info("Registering ModBlocks For " + BetterOres.MOD_ID );

    }

}
