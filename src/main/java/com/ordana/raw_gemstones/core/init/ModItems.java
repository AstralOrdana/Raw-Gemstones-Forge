package com.ordana.raw_gemstones.core.init;

import com.ordana.raw_gemstones.RawGemstones;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    private ModItems() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RawGemstones.MODID);

    public static final RegistryObject<Item> RAW_DIAMOND = ITEMS.register("raw_diamond", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> RAW_EMERALD = ITEMS.register("raw_emerald", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    //Block Items
    public static final RegistryObject<BlockItem> RAW_DIAMOND_BLOCK = ITEMS.register("raw_diamond_block", () -> new BlockItem(ModBlocks.RAW_DIAMOND_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> RAW_EMERALD_BLOCK = ITEMS.register("raw_emerald_block", () -> new BlockItem(ModBlocks.RAW_EMERALD_BLOCK.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}