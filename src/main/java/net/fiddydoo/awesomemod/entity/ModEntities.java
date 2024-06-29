package net.fiddydoo.awesomemod.entity;

import net.fiddydoo.awesomemod.AwesomeMod;
import net.fiddydoo.awesomemod.entity.custom.ToiletEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AwesomeMod.MOD_ID);

    public static final RegistryObject<EntityType<ToiletEntity>> TOILET =
            ENTITY_TYPES.register("toilet", () -> EntityType.Builder.of(ToiletEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f)
                    .build("toilet"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
