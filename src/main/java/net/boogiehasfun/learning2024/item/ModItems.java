package net.boogiehasfun.learning2024.item;

import net.boogiehasfun.learning2024.Learning2024;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FILAMENT = registerItem("filament", new Item(new FabricItemSettings()));
    public static final Item FILAMENT_ROLL = registerItem("filament_roll", new Item(new FabricItemSettings()));
    public static final Item NATURAL_ABS_PELLETS = registerItem("natural_abs_pellets", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(FILAMENT);
        entries.add(FILAMENT_ROLL);
        entries.add(NATURAL_ABS_PELLETS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Learning2024.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Learning2024.LOGGER.info("Registering items for" + Learning2024.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
