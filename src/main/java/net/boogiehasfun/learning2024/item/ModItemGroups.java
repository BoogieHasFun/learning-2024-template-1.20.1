package net.boogiehasfun.learning2024.item;

import net.boogiehasfun.learning2024.Learning2024;
import net.boogiehasfun.learning2024.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FILAMENT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Learning2024.MOD_ID, "filament"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.filament"))
            .icon(() -> new ItemStack(ModItems.FILAMENT)).entries(((displayContext, entries) -> {
                entries.add(ModItems.FILAMENT);
                entries.add(ModItems.FILAMENT_ROLL);
                entries.add(ModItems.NATURAL_ABS_PELLETS);

                entries.add(ModBlocks.NATURAL_ABS_ORE);

            })).build());
    public static void registerItemGroups() {
        Learning2024.LOGGER.info(Learning2024.MOD_ID + " is Registering Item Groups");
    }
}
