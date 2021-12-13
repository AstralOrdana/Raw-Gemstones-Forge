package com.ordana.raw_gemstones.core.init;

import com.ordana.raw_gemstones.RawGemstones;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {

    private ModBlocks() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RawGemstones.MODID);

    public static final RegistryObject<Block> RAW_DIAMOND_BLOCK = BLOCKS.register("raw_diamond_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).strength(5.0f, 6.0f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_EMERALD_BLOCK = BLOCKS.register("raw_emerald_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).strength(5.0f, 6.0f).requiresCorrectToolForDrops()));
}
