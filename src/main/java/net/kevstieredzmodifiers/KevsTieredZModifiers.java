package net.kevstieredzmodifiers;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KevsTieredZModifiers implements ModInitializer {
	public static String MOD_ID = "kevstieredzmodifiers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello from " + MOD_ID + "!");
	}
}