package net.docv.shizen.block.tree;

import net.docv.shizen.tree.ApricotTree;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PearSaplingBlock extends SaplingBlock {
	public PearSaplingBlock() {
		super(new ApricotTree(),
			  AbstractBlock.Properties
						   .create(Material.PLANTS)
						   .doesNotBlockMovement()
						   .tickRandomly()
						   .zeroHardnessAndResistance()
						   .sound(SoundType.PLANT));
	}
}
