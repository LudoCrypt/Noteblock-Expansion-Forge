package net.ludocrypt.nbexpand;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod("nbexpand")
public class NoteblockExpansion {

	public NoteblockExpansion() {
		NoteblockSounds.init();
	}

	public static ResourceLocation id(String id) {
		return new ResourceLocation("nbexpand", id);
	}

}
