package net.docv.shizen.block.tree;

import net.docv.shizen.tree.OrangeTree;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OrangeSaplingBlock extends SaplingBlock {
	public OrangeSaplingBlock() {
		super(new OrangeTree(),
			  AbstractBlock.Properties
						   .create(Material.PLANTS)
						   .doesNotBlockMovement()
						   .tickRandomly()
						   .zeroHardnessAndResistance()
						   .sound(SoundType.PLANT));
	}
}
