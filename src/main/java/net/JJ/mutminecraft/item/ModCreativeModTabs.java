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
    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MUTANTBONE.get()))
                    .title(Component.translatable("creativetab.mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MUTANTBONE.get());
                        pOutput.accept(ModItems.MUTANTBONEMEAL.get());
                        pOutput.accept(ModItems.ECTOPLASM.get());
                        pOutput.accept(ModItems.BESTIARY.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
