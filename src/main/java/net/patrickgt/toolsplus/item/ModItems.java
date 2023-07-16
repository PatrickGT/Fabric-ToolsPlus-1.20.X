package net.patrickgt.toolsplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.patrickgt.toolsplus.ToolsPlus;
import net.patrickgt.toolsplus.item.custom.ModAxeItem;
import net.patrickgt.toolsplus.item.custom.ModHoeItem;
import net.patrickgt.toolsplus.item.custom.ModMagicRingItem;
import net.patrickgt.toolsplus.item.custom.ModPickaxeItem;

import static net.minecraft.item.Items.COMMAND_BLOCK;

//Helper for registration of items
public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item MAGIC_RING = registerItem("magic_ring", new ModMagicRingItem(new FabricItemSettings()));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", (Item)new ModPickaxeItem(ModToolMaterial.RUBY, 4, -2.8f, new FabricItemSettings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword", (Item)new SwordItem(ModToolMaterial.RUBY, 6, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", (Item)new ModAxeItem(ModToolMaterial.RUBY, 3, -2.1f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", (Item)new ModHoeItem(ModToolMaterial.RUBY, 1, -2.1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", (Item)new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));

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
