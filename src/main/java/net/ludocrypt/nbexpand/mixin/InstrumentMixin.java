package net.ludocrypt.nbexpand.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.NoteBlockInstrument;
import net.minecraft.tags.BlockTags;

@Mixin(NoteBlockInstrument.class)
public class InstrumentMixin {

	@Inject(method = "byState", at = @At("HEAD"), cancellable = true)
	private static void NBEXPAND_byState(BlockState state, CallbackInfoReturnable<NoteBlockInstrument> ci) {
		if (state.isIn(Blocks.SANDSTONE) || state.isIn(Blocks.RED_SANDSTONE)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("SITAR"));
		} else if (state.isIn(BlockTags.PLANKS)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("PIANO"));
		} else if (state.isIn(Blocks.DIAMOND_BLOCK)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("MUSIC_BOX"));
		} else if (state.isIn(Blocks.BLUE_ICE)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("VIBRAPHONE"));
		} else if (state.isIn(Blocks.BARREL)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("TIMPANI"));
		} else if (state.isIn(Blocks.LOOM)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("HARPSICHORD"));
		} else if (state.isIn(BlockTags.LOGS)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("MARIMBA"));
		} else if (state.isIn(Blocks.IRON_ORE)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("GLOCKENSPIEL"));
		} else if (state.isIn(Blocks.GOLD_ORE)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("CELESTA"));
		} else if (state.isIn(Blocks.DIRT)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("STEELDRUMS"));
		} else if (state.isIn(BlockTags.WOODEN_TRAPDOORS)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("WOODBLOCKS"));
		} else if (state.isIn(Blocks.CHEST)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("BASSDRUM"));
		} else if (state.isIn(Blocks.TRAPPED_CHEST)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("HIGHDRUM"));
		} else if (state.isIn(Blocks.END_STONE)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("CHINESE_PIK"));
		} else if (state.isIn(Blocks.OBSIDIAN)) {
			ci.setReturnValue(NoteBlockInstrument.valueOf("PLUCK"));
		}
	}

}
