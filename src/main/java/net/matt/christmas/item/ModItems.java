package net.matt.christmas.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.matt.christmas.Christmas;
import net.matt.christmas.item.custom.EggnogItem;
import net.matt.christmas.item.custom.FrostSummonItem;
import net.matt.christmas.item.custom.HotCocoaItem;
import net.matt.christmas.item.custom.PresentItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // items
    public static final Item CANDY_CANE = registerItem("candy_cane", new Item(new Item.Settings()));

    // custom items
    public static final Item FROST_SUMMON = registerItem("frost_summon", new FrostSummonItem(new Item.Settings().maxDamage(1)));
    public static final Item PRESENT = registerItem("present", new PresentItem(new Item.Settings()));

    // food
    public static final Item EGGNOG = registerItem("eggnog", new EggnogItem(new Item.Settings().food(ModFoodComponents.EGGNOG)));
    public static final Item HOT_COCOA = registerItem("hot_cocoa", new HotCocoaItem(new Item.Settings().food(ModFoodComponents.HOT_COCOA)));
    public static final Item COLD_COCOA = registerItem("cold_cocoa", new Item(new Item.Settings()));

    // helper method to define items
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(Christmas.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Christmas.LOGGER.info("Registering Mod Items for " + Christmas.MOD_ID);

        // adds to creative menu
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PRESENT);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(CANDY_CANE);
        });
    }
}
