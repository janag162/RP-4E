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

    // Barebones objects
    public static final RegistryObject<Item> MUTANT_BONE = ITEMS.register("mutant_bone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUTANT_BONEMEAL = ITEMS.register("mutant_bonemeal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ECTOPLASM = ITEMS.register("ectoplasm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BESTIARY = ITEMS.register("bestiary",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MEAT = ITEMS.register("raw_meat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_MEAT = ITEMS.register("cooked_meat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIREWOLF_FANG = ITEMS.register("direwolf_fang",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FANG_SHARD = ITEMS.register("fang_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIREWOLF_FUR = ITEMS.register("direwolf_fur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIREWOLF_PELT = ITEMS.register("direwolf_pelt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUD = ITEMS.register("bud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FILLED_BUD = ITEMS.register("filled_bud",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TREAT = ITEMS.register("treat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLASMIC_TREAT = ITEMS.register("plasmic_treat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SEEDLING = ITEMS.register("seedling",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL = ITEMS.register("soul",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
