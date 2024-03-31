package net.JJ.mutminecraft.util;

import net.JJ.mutminecraft.MutantMinecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> TREAT_USABLE_MEATS = tag("treat_usable_meats");
        public static final TagKey<Item> MUTANT_BONE = tag("mutant_bone");
        public static final TagKey<Item> DIREWOLF_TREAT = tag("direwolf_treat");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MutantMinecraft.MOD_ID, name));
        }
    }

    public static class Blocks {

    }
}
