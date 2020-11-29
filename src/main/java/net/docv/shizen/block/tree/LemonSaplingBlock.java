package net.docv.shizen.block.tree;

import net.docv.shizen.tree.LemonTree;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LemonSaplingBlock extends SaplingBlock {
	public LemonSaplingBlock() {
		super(new LemonTree(),
			  AbstractBlock.Properties
						   .create(Material.PLANTS)
						   .doesNotBlockMovement()
						   .tickRandomly()
						   .zeroHardnessAndResistance()
						   .sound(SoundType.PLANT));
	}
}
