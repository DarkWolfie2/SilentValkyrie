
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silentvalkyrieremaster.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SilentvalkyrieremasterModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "regaliaambient"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "regaliaambient")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "regaliaambient2"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "regaliaambient2")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "regaliastep"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "regaliastep")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "hurt"), new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "hurt")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "death"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "death")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "silentredemption"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "silentredemption")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "redlikeroses"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "redlikeroses")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "bl82"), new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "bl82")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "whatcanyouseeintheireyes"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "whatcanyouseeintheireyes")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "dreammanhunttheme"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "dreammanhunttheme")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "yhwachtheme"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "yhwachtheme")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "sonofabitch"),
				new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "sonofabitch")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "fuck"), new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "fuck")));
		REGISTRY.put(new ResourceLocation("silentvalkyrieremaster", "shit"), new SoundEvent(new ResourceLocation("silentvalkyrieremaster", "shit")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
