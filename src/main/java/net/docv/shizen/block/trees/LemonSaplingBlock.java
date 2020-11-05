package net.docv.shizen.block.trees;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LemonSaplingBlock extends SaplingBlock {
	public LemonSaplingBlock() {
		super(new ApricotTree(),
			  AbstractBlock.Properties
						   .create(Material.PLANTS)
						   .doesNotBlockMovement()
						   .tickRandomly()
						   .zeroHardnessAndResistance()
						   .sound(SoundType.PLANT));
	}
}