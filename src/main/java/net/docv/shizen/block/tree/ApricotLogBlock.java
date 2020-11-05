package net.docv.shizen.block.tree;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class ApricotLogBlock extends RotatedPillarBlock {
	public ApricotLogBlock() {
		super(AbstractBlock.Properties
				           .create(Material.WOOD, MaterialColor.WOOD)
				           .hardnessAndResistance(2.0F)
				           .sound(SoundType.WOOD)
				);
	}
}
