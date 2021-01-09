package com.shreyas.redruby.registry;

import com.shreyas.redruby.TheRedRuby;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(TheRedRuby.ITEM_GROUP));

    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK,
            new Item.Settings().group(TheRedRuby.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(TheRedRuby.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(TheRedRuby.MOD_ID, "ruby_block"),
                RUBY_BLOCK);
    }

}
