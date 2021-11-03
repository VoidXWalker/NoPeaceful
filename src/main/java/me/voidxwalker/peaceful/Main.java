package me.voidxwalker.peaceful;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
    private static final ModContainer mod = FabricLoader.getInstance().getModContainer("nopeaceful").orElseThrow(NullPointerException::new);
    public static String MOD_VERSION = mod.getMetadata().getVersion().getFriendlyString();
    public static String MOD_NAME = mod.getMetadata().getName();
    private static final Logger LOGGER=LogManager.getLogger();

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME +MOD_VERSION+ "] " + message);
    }

    public void onInitialize() {
        log(Level.INFO,"Starting");

    }
}
