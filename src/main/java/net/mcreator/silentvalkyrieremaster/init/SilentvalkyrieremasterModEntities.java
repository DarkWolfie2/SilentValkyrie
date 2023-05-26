
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silentvalkyrieremaster.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.silentvalkyrieremaster.entity.TheOneEntity;
import net.mcreator.silentvalkyrieremaster.entity.SilentValkyrieEntity;
import net.mcreator.silentvalkyrieremaster.entity.SalemEntity;
import net.mcreator.silentvalkyrieremaster.entity.PlutoEntity;
import net.mcreator.silentvalkyrieremaster.entity.DistortedCreeperEntity;
import net.mcreator.silentvalkyrieremaster.entity.DistortedCowEntity;
import net.mcreator.silentvalkyrieremaster.entity.AshCreeper10Entity;
import net.mcreator.silentvalkyrieremaster.SilentvalkyrieremasterMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SilentvalkyrieremasterModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, SilentvalkyrieremasterMod.MODID);
	public static final RegistryObject<EntityType<SilentValkyrieEntity>> SILENT_VALKYRIE = register("silent_valkyrie",
			EntityType.Builder.<SilentValkyrieEntity>of(SilentValkyrieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SilentValkyrieEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PlutoEntity>> PLUTO = register("pluto",
			EntityType.Builder.<PlutoEntity>of(PlutoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PlutoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheOneEntity>> THE_ONE = register("the_one",
			EntityType.Builder.<TheOneEntity>of(TheOneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(TheOneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DistortedCreeperEntity>> DISTORTED_CREEPER = register("distorted_creeper",
			EntityType.Builder.<DistortedCreeperEntity>of(DistortedCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DistortedCreeperEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<DistortedCowEntity>> DISTORTED_COW = register("distorted_cow",
			EntityType.Builder.<DistortedCowEntity>of(DistortedCowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DistortedCowEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<AshCreeper10Entity>> ASH_CREEPER_10 = register("ash_creeper_10",
			EntityType.Builder.<AshCreeper10Entity>of(AshCreeper10Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AshCreeper10Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SalemEntity>> SALEM = register("salem",
			EntityType.Builder.<SalemEntity>of(SalemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SalemEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SilentValkyrieEntity.init();
			PlutoEntity.init();
			TheOneEntity.init();
			DistortedCreeperEntity.init();
			DistortedCowEntity.init();
			AshCreeper10Entity.init();
			SalemEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SILENT_VALKYRIE.get(), SilentValkyrieEntity.createAttributes().build());
		event.put(PLUTO.get(), PlutoEntity.createAttributes().build());
		event.put(THE_ONE.get(), TheOneEntity.createAttributes().build());
		event.put(DISTORTED_CREEPER.get(), DistortedCreeperEntity.createAttributes().build());
		event.put(DISTORTED_COW.get(), DistortedCowEntity.createAttributes().build());
		event.put(ASH_CREEPER_10.get(), AshCreeper10Entity.createAttributes().build());
		event.put(SALEM.get(), SalemEntity.createAttributes().build());
	}
}
