package net.JJ.mutminecraft.entity;

import net.JJ.mutminecraft.MutantMinecraft;
import net.JJ.mutminecraft.entity.custom.DirewolfEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MutantMinecraft.MOD_ID);

    public static final RegistryObject<EntityType<DirewolfEntity>> DIREWOLF =
            ENTITY_TYPE.register("direwolf", () -> EntityType.Builder.of(DirewolfEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("direwolf"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPE.register(eventBus);
    }
}
