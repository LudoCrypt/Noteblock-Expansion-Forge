package net.ludocrypt.nbexpand;

import java.util.LinkedHashMap;
import java.util.Map;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NoteblockSounds {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NoteblockExpansion.id("").getNamespace());
	public static final Map<ResourceLocation, SoundEvent> SOUND_EVENTS = new LinkedHashMap<>();

	public static final SoundEvent MUSIC_BOX = add("noteblock.new.note.music_box");
	public static final SoundEvent PIANO = add("noteblock.new.note.piano");
	public static final SoundEvent SITAR = add("noteblock.new.note.sitar");
	public static final SoundEvent VIBRAPHONE = add("noteblock.new.note.vibraphone");
	public static final SoundEvent BASSDRUM = add("noteblock.new.note.bassdrum");
	public static final SoundEvent CELESTA = add("noteblock.new.note.celesta");
	public static final SoundEvent GLOCKENSPIEL = add("noteblock.new.note.glockenspiel");
	public static final SoundEvent HARPSICHORD = add("noteblock.new.note.harpsichord");
	public static final SoundEvent HIGHDRUM = add("noteblock.new.note.highdrum");
	public static final SoundEvent MARIMBA = add("noteblock.new.note.marimba");
	public static final SoundEvent STEELDRUMS = add("noteblock.new.note.steeldrums");
	public static final SoundEvent TIMPANI = add("noteblock.new.note.timpani");
	public static final SoundEvent WOODBLOCKS = add("noteblock.new.note.woodblocks");
	public static final SoundEvent CHINESE_PIK = add("noteblock.new.note.chinese_pik");
	public static final SoundEvent PLUCK = add("noteblock.new.note.pluck");

	private static SoundEvent add(String key) {
		ResourceLocation id = NoteblockExpansion.id(key);
		SoundEvent sve = new SoundEvent(id);
		SOUND_EVENTS.put(id, sve);
		return sve;
	}

	public static void init() {
		SOUND_EVENTS.forEach((id, sve) -> {
			SOUNDS.register(id.getPath(), () -> sve);
		});
		SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
