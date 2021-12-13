package com.ordana.raw_gemstones;

import com.ordana.raw_gemstones.core.init.ModBlocks;
import com.ordana.raw_gemstones.core.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RawGemstones.MODID)
public class RawGemstones {
    public static final String MODID = "raw_gemstones";

    public RawGemstones() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }
}
