package net.JJ.mutminecraft.item;

import net.JJ.mutminecraft.MutantMinecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MutantMinecraft.MOD_ID);

    // Creating a custom tab of the mod + adding items to it
    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BESTIARY.get()))
                    .title(Component.translatable("creativetab.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.BESTIARY.get());
                        pOutput.accept(ModItems.ECTOPLASM.get());
                        pOutput.accept(ModItems.SEEDLING.get());
                        pOutput.accept(ModItems.SOUL.get());
                        pOutput.accept(ModItems.BUD.get());
                        pOutput.accept(ModItems.FILLED_BUD.get());
                        pOutput.accept(ModItems.RAW_MEAT.get());
                        pOutput.accept(ModItems.COOKED_MEAT.get());
                        pOutput.accept(ModItems.MUTANT_BONE.get());
                        pOutput.accept(ModItems.MUTANT_BONEMEAL.get());
                        pOutput.accept(ModItems.LEATHER_STRIPS.get());

                        // Direwolf items
                        pOutput.accept(ModItems.DIREWOLF_SPAWN_EGG.get());
                        pOutput.accept(ModItems.DIREWOLF_FANG.get());
                        pOutput.accept(ModItems.DIREWOLF_FUR.get());
                        pOutput.accept(ModItems.DIREWOLF_PELT.get());
                        pOutput.accept(ModItems.FANG_SHARD.get());
                        pOutput.accept(ModItems.DIREWOLF_TREAT.get());
                        pOutput.accept(ModItems.ECTOPLASM_TREAT.get());
                        pOutput.accept(ModItems.FANG_BLADE.get());
                        pOutput.accept(ModItems.FANG_ARROW.get());
                        pOutput.accept(ModItems.DIREWOLF_CLOAK.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
