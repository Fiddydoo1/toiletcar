package net.fiddydoo.awesomemod.event;


import net.fiddydoo.awesomemod.AwesomeMod;
import net.fiddydoo.awesomemod.entity.ModEntities;
import net.fiddydoo.awesomemod.entity.custom.ToiletEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AwesomeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TOILET.get(), ToiletEntity.createAttributes().build());
    }

}
