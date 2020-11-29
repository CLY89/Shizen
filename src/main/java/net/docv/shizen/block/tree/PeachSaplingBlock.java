package net.docv.shizen.block.tree;

import net.docv.shizen.tree.PeachTree;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PeachSaplingBlock extends SaplingBlock {
	public PeachSaplingBlock() {
		super(new PeachTree(),
			  AbstractBlock.Properties
						   .create(Material.PLANTS)
						   .doesNotBlockMovement()
						   .tickRandomly()
						   .zeroHardnessAndResistance()
						   .sound(SoundType.PLANT));
	}
}
