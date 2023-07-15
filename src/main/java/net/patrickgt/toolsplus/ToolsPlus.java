package net.patrickgt.toolsplus;

import net.fabricmc.api.ModInitializer;

import net.patrickgt.toolsplus.item.ModItemGroups;
import net.patrickgt.toolsplus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolsPlus implements ModInitializer {
    public static final String MOD_ID = "toolsplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.RegisterModItems();
	}
}