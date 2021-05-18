package net.ludocrypt.nbexpand;

import com.chocohead.mm.Asm;
import com.chocohead.mm.api.ClassTinkerers;
import com.chocohead.mm.api.EnumAdder;

@Asm
public class NoteblockEarlyRisers implements Runnable {

	@Override
	public void run() {
		EnumAdder adder = ClassTinkerers.enumBuilder("net.minecraft.state.properties.NoteBlockInstrument", String.class, "Lnet/minecraft/util/SoundEvent;");
		adder.addEnum("MUSIC_BOX", () -> new Object[] { "music_box", NoteblockSounds.MUSIC_BOX });
		adder.addEnum("PIANO", () -> new Object[] { "piano", NoteblockSounds.PIANO });
		adder.addEnum("SITAR", () -> new Object[] { "sitar", NoteblockSounds.SITAR });
		adder.addEnum("VIBRAPHONE", () -> new Object[] { "vibraphone", NoteblockSounds.VIBRAPHONE });
		adder.addEnum("BASSDRUM", () -> new Object[] { "bassdrum", NoteblockSounds.BASSDRUM });
		adder.addEnum("CELESTA", () -> new Object[] { "celesta", NoteblockSounds.CELESTA });
		adder.addEnum("GLOCKENSPIEL", () -> new Object[] { "glockenspiel", NoteblockSounds.GLOCKENSPIEL });
		adder.addEnum("HARPSICHORD", () -> new Object[] { "harpsichord", NoteblockSounds.HARPSICHORD });
		adder.addEnum("HIGHDRUM", () -> new Object[] { "highdrum", NoteblockSounds.HIGHDRUM });
		adder.addEnum("MARIMBA", () -> new Object[] { "marimba", NoteblockSounds.MARIMBA });
		adder.addEnum("STEELDRUMS", () -> new Object[] { "steeldrums", NoteblockSounds.STEELDRUMS });
		adder.addEnum("TIMPANI", () -> new Object[] { "timpani", NoteblockSounds.TIMPANI });
		adder.addEnum("WOODBLOCKS", () -> new Object[] { "woodblocks", NoteblockSounds.WOODBLOCKS });
		adder.addEnum("PLUCK", () -> new Object[] { "pluck", NoteblockSounds.PLUCK });
		adder.addEnum("CHINESE_PIK", () -> new Object[] { "chinese_pik", NoteblockSounds.CHINESE_PIK });
		adder.build();
	}

}
