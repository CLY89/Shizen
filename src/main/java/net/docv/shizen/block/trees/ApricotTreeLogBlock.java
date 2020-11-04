package net.docv.shizen.block.trees;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class ApricotTreeLogBlock extends RotatedPillarBlock {
	public ApricotTreeLogBlock() {
		super(AbstractBlock.Properties
				           .create(Material.WOOD, MaterialColor.WOOD)
				           .hardnessAndResistance(2.0F)
				           .sound(SoundType.WOOD)
				);
	}
}
