package spookfu.journeys.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import spookfu.journeys.Journeys;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item BLANK_SLATE = registerItem("blank_slate", new Item(new Item.Settings()));
    public static final Item RELIC_DUST = registerItem("relic_dust", new Item(new Item.Settings()));
    public static final Item ORB_OF_EXPERIENCE = registerItem("orb_of_experience", new Item(new Item.Settings()));
    public static final Item BOOK_OF_ENCHANTMENTS = registerItem("book_of_enchantments", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Journeys.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Journeys.LOGGER.info("Registering Mod Items " + Journeys.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(BLANK_SLATE);
            fabricItemGroupEntries.add(RELIC_DUST);
            fabricItemGroupEntries.add(ORB_OF_EXPERIENCE);
            fabricItemGroupEntries.add(BOOK_OF_ENCHANTMENTS);
        });

    }
}
