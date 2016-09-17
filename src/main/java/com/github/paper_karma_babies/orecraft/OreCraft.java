package com.github.paper_karma_babies.orecraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Main entry point for OreCraft.
 */
@Mod(modid = OreCraft.MODID,
    name = OreCraft.MOD_NAME,
    version = OreCraft.VERSION,
    acceptedMinecraftVersions = "*",
    dependencies = "required-after:Forge",
    updateJSON = "@UPDATE_URL@")
public class OreCraft
{
    public static final String MOD_NAME = "OreCraft";
    public static final String MODID = "orecraft";
    public static final String VERSION = "@VERSION@";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println(MOD_NAME + " is alive!");
    }
}
