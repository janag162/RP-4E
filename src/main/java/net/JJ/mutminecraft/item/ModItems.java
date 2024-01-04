package net.JJ.mutminecraft.item;

import net.JJ.mutminecraft.MutantMinecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MutantMinecraft.MOD_ID);

    // Barebones object
    public static final RegistryObject<Item> MUTANTBONE = ITEMS.register("mutantbone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUTANTBONEMEAL = ITEMS.register("mutantbonemeal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
