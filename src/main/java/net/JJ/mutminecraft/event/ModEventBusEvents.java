package net.JJ.mutminecraft.event;

import net.JJ.mutminecraft.MutantMinecraft;
import net.JJ.mutminecraft.entity.ModEntities;
import net.JJ.mutminecraft.entity.custom.DirewolfEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MutantMinecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.DIREWOLF.get(), DirewolfEntity.createAttributes().build());
    }
}
