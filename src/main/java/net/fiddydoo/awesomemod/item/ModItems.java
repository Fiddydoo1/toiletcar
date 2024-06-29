package net.fiddydoo.awesomemod.item;

import net.fiddydoo.awesomemod.AwesomeMod;
import net.fiddydoo.awesomemod.entity.ModEntities;
import net.fiddydoo.awesomemod.item.custom.IncredibleItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AwesomeMod.MOD_ID);

    static FoodProperties something = new FoodProperties.Builder().alwaysEat().build();


    public static final RegistryObject<Item> CUM = ITEMS.register("cum", () -> new Item(new Item.Properties().food(something)));

    public static final RegistryObject<Item> TOILET_SPAWN_EGG = ITEMS.register("toilet_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.TOILET, 0xffffff, 0x000000, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
