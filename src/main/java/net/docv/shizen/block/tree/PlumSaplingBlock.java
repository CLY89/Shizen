package net.docv.shizen.block.tree;

import net.docv.shizen.tree.PlumTree;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PlumSaplingBlock extends SaplingBlock {
	public PlumSaplingBlock() {
		super(new PlumTree(),
			  AbstractBlock.Properties
						   .create(Material.PLANTS)
						   .doesNotBlockMovement()
						   .tickRandomly()
						   .zeroHardnessAndResistance()
						   .sound(SoundType.PLANT));
	}
}
