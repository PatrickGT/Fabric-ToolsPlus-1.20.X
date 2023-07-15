package net.patrickgt.toolsplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.patrickgt.toolsplus.ToolsPlus;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ToolsPlus.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY);

                        entries.add(Items.DIAMOND);
                        entries.add(Items.BARREL);
                    }).build());
    public static void registerItemGroups() {
        ToolsPlus.LOGGER.info("Registering item groups for " + ToolsPlus.MOD_ID);
    }
}
