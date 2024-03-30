package net.JJ.mutminecraft.event;

import net.JJ.mutminecraft.MutantMinecraft;
import net.JJ.mutminecraft.entity.client.DirewolfModel;
import net.JJ.mutminecraft.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MutantMinecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.DIREWOLF_LAYER, DirewolfModel::createBodyLayer);
    }
}
