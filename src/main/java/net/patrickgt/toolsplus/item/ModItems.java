package net.patrickgt.toolsplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.patrickgt.toolsplus.ToolsPlus;

import static net.minecraft.item.Items.COMMAND_BLOCK;

//Helper for registration of items
public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final ToolItem RUBY_PICKAXE = new ToolsPlusPickaxeItem(ModToolMaterial.RUBY, 5, 4, new FabricItemSettings());

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }
    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries) {
        entries.add(COMMAND_BLOCK);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ToolsPlus.MOD_ID, name), item);
    }

public static void RegisterModItems() {
    ToolsPlus.LOGGER.info("Registering Mod Items for " + ToolsPlus.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems ::addItemsToRedstoneItemGroup);
    }
}
